package typings.mfiles

import typings.mfiles.MFiles.MFFileFormat
import typings.mfiles.MFiles.MFFileOpenMethod
import typings.mfiles.MFiles.MFLatestSpecificBehavior
import typings.mfiles.MFiles.MFOCRZoneRecognitionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectFileOperations extends js.Object {
  def AddEmptyFile(ObjVer: IObjVer, Title: String, Extension: String): IFileVer
  def AddFile(ObjVer: IObjVer, Title: String, Extension: String, SourcePath: String): IFileVer
  def CloseUploadSession(UploadID: Double): Unit
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean
  ): IObjectVersion
  def DownloadFile(File: Double, FileVersion: Double, FilePath: String): Unit
  def DownloadFileAsDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double): String
  def DownloadFileEx(File: Double, FileVersion: Double, FilePath: String, FileFormat: MFFileFormat): Unit
  def DownloadFileInBlocks_Begin(File: Double, FileVersion: Double): IFileDownloadSession
  def DownloadFileInBlocks_BeginEx(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession
  def DownloadFileInBlocks_BeginEx_32bit(File: Double, FileVersion: Double, FileFormat: MFFileFormat): IFileDownloadSession
  def DownloadFileInBlocks_Begin_32bit(File: Double, FileVersion: Double): IFileDownloadSession
  def DownloadFileInBlocks_ReadBlock(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double]
  def GetFileSize(FileVer: IFileVer): Double
  def GetFileSize_32bit(FileVer: IFileVer): Double
  def GetFiles(ObjVer: IObjVer): IObjectFiles
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer): IObjectFiles
  def GetLatestFileVersion(FileID: Double, AllowCheckedOut: Boolean): IFileVer
  def GetObjIDOfFile(FileID: Double): IObjID
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean
  ): String
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean
  ): String
  def OpenFileInDefaultApplication(ParentWindow: Double, ObjVer: IObjVer, FileVer: IFileVer, FileOpenMethod: MFFileOpenMethod): Unit
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean
  ): IOCRPageResults
  def RemoveFile(ObjVer: IObjVer, FileVer: IFileVer): IObjectVersion
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean
  ): IObjectVersion
  def UpdateMetadataInFile(ObjVer: IObjVer, File: Double, FailOnUnsupportedFiles: Boolean): IObjectVersion
  def UploadFile(File: Double, FileVersion: Double, FilePath: String): Unit
  def UploadFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadFileBlockBegin(): Double
  def UploadFileBlockBegin_32bit(): Double
  def UploadFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadFileCommit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit
  def UploadFileCommit_32bit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit
  def UploadFromDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double, DataURI: String): Unit
  def UploadTemporaryFile(FilePath: String): Double
  def UploadTemporaryFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadTemporaryFileBlockBegin(FileExtension: String): Double
  def UploadTemporaryFileBlockBegin_32bit(FileExtension: String): Double
  def UploadTemporaryFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit
  def UploadTemporaryFileCommit(UploadID: Double, LogicalSize: Double): Unit
  def UploadTemporaryFileCommit_32bit(UploadID: Double, LogicalSize: Double): Unit
}

object IVaultObjectFileOperations {
  @scala.inline
  def apply(
    AddEmptyFile: (IObjVer, String, String) => IFileVer,
    AddFile: (IObjVer, String, String, String) => IFileVer,
    CloseUploadSession: Double => Unit,
    ConvertToPDF: (IObjVer, Double, Boolean, Boolean, Boolean, Boolean) => IObjectVersion,
    DownloadFile: (Double, Double, String) => Unit,
    DownloadFileAsDataURI: (IObjVer, Double, Double) => String,
    DownloadFileEx: (Double, Double, String, MFFileFormat) => Unit,
    DownloadFileInBlocks_Begin: (Double, Double) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx: (Double, Double, MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx_32bit: (Double, Double, MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_Begin_32bit: (Double, Double) => IFileDownloadSession,
    DownloadFileInBlocks_ReadBlock: (Double, Double, Double) => js.Array[Double],
    DownloadFileInBlocks_ReadBlock_32bit: (Double, Double, Double) => js.Array[Double],
    GetFileSize: IFileVer => Double,
    GetFileSize_32bit: IFileVer => Double,
    GetFiles: IObjVer => IObjectFiles,
    GetFilesForModificationInEventHandler: IObjVer => IObjectFiles,
    GetLatestFileVersion: (Double, Boolean) => IFileVer,
    GetObjIDOfFile: Double => IObjID,
    GetPathInDefaultView: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean) => String,
    GetPathInDefaultViewEx: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean, Boolean) => String,
    OpenFileInDefaultApplication: (Double, IObjVer, IFileVer, MFFileOpenMethod) => Unit,
    PerformOCROperation: (IObjVer, IFileVer, IOCROptions, MFOCRZoneRecognitionMode, IOCRPages, Boolean) => IOCRPageResults,
    RemoveFile: (IObjVer, IFileVer) => IObjectVersion,
    RenameFile: (IObjVer, IFileVer, String, String, Boolean) => IObjectVersion,
    UpdateMetadataInFile: (IObjVer, Double, Boolean) => IObjectVersion,
    UploadFile: (Double, Double, String) => Unit,
    UploadFileBlock: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadFileBlockBegin: () => Double,
    UploadFileBlockBegin_32bit: () => Double,
    UploadFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadFileCommit: (Double, Double, Double, Double) => Unit,
    UploadFileCommit_32bit: (Double, Double, Double, Double) => Unit,
    UploadFromDataURI: (IObjVer, Double, Double, String) => Unit,
    UploadTemporaryFile: String => Double,
    UploadTemporaryFileBlock: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadTemporaryFileBlockBegin: String => Double,
    UploadTemporaryFileBlockBegin_32bit: String => Double,
    UploadTemporaryFileBlock_32bit: (Double, Double, Double, js.Array[Double]) => Unit,
    UploadTemporaryFileCommit: (Double, Double) => Unit,
    UploadTemporaryFileCommit_32bit: (Double, Double) => Unit
  ): IVaultObjectFileOperations = {
    val __obj = js.Dynamic.literal(AddEmptyFile = js.Any.fromFunction3(AddEmptyFile), AddFile = js.Any.fromFunction4(AddFile), CloseUploadSession = js.Any.fromFunction1(CloseUploadSession), ConvertToPDF = js.Any.fromFunction6(ConvertToPDF), DownloadFile = js.Any.fromFunction3(DownloadFile), DownloadFileAsDataURI = js.Any.fromFunction3(DownloadFileAsDataURI), DownloadFileEx = js.Any.fromFunction4(DownloadFileEx), DownloadFileInBlocks_Begin = js.Any.fromFunction2(DownloadFileInBlocks_Begin), DownloadFileInBlocks_BeginEx = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx), DownloadFileInBlocks_BeginEx_32bit = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx_32bit), DownloadFileInBlocks_Begin_32bit = js.Any.fromFunction2(DownloadFileInBlocks_Begin_32bit), DownloadFileInBlocks_ReadBlock = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock), DownloadFileInBlocks_ReadBlock_32bit = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock_32bit), GetFileSize = js.Any.fromFunction1(GetFileSize), GetFileSize_32bit = js.Any.fromFunction1(GetFileSize_32bit), GetFiles = js.Any.fromFunction1(GetFiles), GetFilesForModificationInEventHandler = js.Any.fromFunction1(GetFilesForModificationInEventHandler), GetLatestFileVersion = js.Any.fromFunction2(GetLatestFileVersion), GetObjIDOfFile = js.Any.fromFunction1(GetObjIDOfFile), GetPathInDefaultView = js.Any.fromFunction6(GetPathInDefaultView), GetPathInDefaultViewEx = js.Any.fromFunction7(GetPathInDefaultViewEx), OpenFileInDefaultApplication = js.Any.fromFunction4(OpenFileInDefaultApplication), PerformOCROperation = js.Any.fromFunction6(PerformOCROperation), RemoveFile = js.Any.fromFunction2(RemoveFile), RenameFile = js.Any.fromFunction5(RenameFile), UpdateMetadataInFile = js.Any.fromFunction3(UpdateMetadataInFile), UploadFile = js.Any.fromFunction3(UploadFile), UploadFileBlock = js.Any.fromFunction4(UploadFileBlock), UploadFileBlockBegin = js.Any.fromFunction0(UploadFileBlockBegin), UploadFileBlockBegin_32bit = js.Any.fromFunction0(UploadFileBlockBegin_32bit), UploadFileBlock_32bit = js.Any.fromFunction4(UploadFileBlock_32bit), UploadFileCommit = js.Any.fromFunction4(UploadFileCommit), UploadFileCommit_32bit = js.Any.fromFunction4(UploadFileCommit_32bit), UploadFromDataURI = js.Any.fromFunction4(UploadFromDataURI), UploadTemporaryFile = js.Any.fromFunction1(UploadTemporaryFile), UploadTemporaryFileBlock = js.Any.fromFunction4(UploadTemporaryFileBlock), UploadTemporaryFileBlockBegin = js.Any.fromFunction1(UploadTemporaryFileBlockBegin), UploadTemporaryFileBlockBegin_32bit = js.Any.fromFunction1(UploadTemporaryFileBlockBegin_32bit), UploadTemporaryFileBlock_32bit = js.Any.fromFunction4(UploadTemporaryFileBlock_32bit), UploadTemporaryFileCommit = js.Any.fromFunction2(UploadTemporaryFileCommit), UploadTemporaryFileCommit_32bit = js.Any.fromFunction2(UploadTemporaryFileCommit_32bit))
    __obj.asInstanceOf[IVaultObjectFileOperations]
  }
}

