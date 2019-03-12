package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectFileOperations extends js.Object {
  def AddEmptyFile(ObjVer: IObjVer, Title: java.lang.String, Extension: java.lang.String): IFileVer
  def AddFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    SourcePath: java.lang.String
  ): IFileVer
  def CloseUploadSession(UploadID: scala.Double): scala.Unit
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: scala.Double,
    StoreAsSeparateFile: scala.Boolean,
    OverwriteExistingFile: scala.Boolean,
    PDFA1b: scala.Boolean,
    FailOnUnsupportedSourceFiles: scala.Boolean
  ): IObjectVersion
  def DownloadFile(File: scala.Double, FileVersion: scala.Double, FilePath: java.lang.String): scala.Unit
  def DownloadFileAsDataURI(ObjVer: IObjVer, File: scala.Double, FileVersion: scala.Double): java.lang.String
  def DownloadFileEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat
  ): scala.Unit
  def DownloadFileInBlocks_Begin(File: scala.Double, FileVersion: scala.Double): IFileDownloadSession
  def DownloadFileInBlocks_BeginEx(File: scala.Double, FileVersion: scala.Double, FileFormat: mfilesLib.MFilesNs.MFFileFormat): IFileDownloadSession
  def DownloadFileInBlocks_BeginEx_32bit(File: scala.Double, FileVersion: scala.Double, FileFormat: mfilesLib.MFilesNs.MFFileFormat): IFileDownloadSession
  def DownloadFileInBlocks_Begin_32bit(File: scala.Double, FileVersion: scala.Double): IFileDownloadSession
  def DownloadFileInBlocks_ReadBlock(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double]
  def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double]
  def GetFileSize(FileVer: IFileVer): scala.Double
  def GetFileSize_32bit(FileVer: IFileVer): scala.Double
  def GetFiles(ObjVer: IObjVer): IObjectFiles
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer): IObjectFiles
  def GetLatestFileVersion(FileID: scala.Double, AllowCheckedOut: scala.Boolean): IFileVer
  def GetObjIDOfFile(FileID: scala.Double): IObjID
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    UpdateFromServer: scala.Boolean
  ): java.lang.String
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: scala.Boolean,
    UpdateFromServer: scala.Boolean
  ): java.lang.String
  def OpenFileInDefaultApplication(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: mfilesLib.MFilesNs.MFFileOpenMethod
  ): scala.Unit
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: mfilesLib.MFilesNs.MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: scala.Boolean
  ): IOCRPageResults
  def RemoveFile(ObjVer: IObjVer, FileVer: IFileVer): IObjectVersion
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    UpdateSingleFileDocumentTitle: scala.Boolean
  ): IObjectVersion
  def UpdateMetadataInFile(ObjVer: IObjVer, File: scala.Double, FailOnUnsupportedFiles: scala.Boolean): IObjectVersion
  def UploadFile(File: scala.Double, FileVersion: scala.Double, FilePath: java.lang.String): scala.Unit
  def UploadFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit
  def UploadFileBlockBegin(): scala.Double
  def UploadFileBlockBegin_32bit(): scala.Double
  def UploadFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit
  def UploadFileCommit(UploadID: scala.Double, File: scala.Double, FileVersion: scala.Double, LogicalSize: scala.Double): scala.Unit
  def UploadFileCommit_32bit(UploadID: scala.Double, File: scala.Double, FileVersion: scala.Double, LogicalSize: scala.Double): scala.Unit
  def UploadFromDataURI(ObjVer: IObjVer, File: scala.Double, FileVersion: scala.Double, DataURI: java.lang.String): scala.Unit
  def UploadTemporaryFile(FilePath: java.lang.String): scala.Double
  def UploadTemporaryFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit
  def UploadTemporaryFileBlockBegin(FileExtension: java.lang.String): scala.Double
  def UploadTemporaryFileBlockBegin_32bit(FileExtension: java.lang.String): scala.Double
  def UploadTemporaryFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit
  def UploadTemporaryFileCommit(UploadID: scala.Double, LogicalSize: scala.Double): scala.Unit
  def UploadTemporaryFileCommit_32bit(UploadID: scala.Double, LogicalSize: scala.Double): scala.Unit
}

object IVaultObjectFileOperations {
  @scala.inline
  def apply(
    AddEmptyFile: (IObjVer, java.lang.String, java.lang.String) => IFileVer,
    AddFile: (IObjVer, java.lang.String, java.lang.String, java.lang.String) => IFileVer,
    CloseUploadSession: scala.Double => scala.Unit,
    ConvertToPDF: (IObjVer, scala.Double, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean) => IObjectVersion,
    DownloadFile: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    DownloadFileAsDataURI: (IObjVer, scala.Double, scala.Double) => java.lang.String,
    DownloadFileEx: (scala.Double, scala.Double, java.lang.String, mfilesLib.MFilesNs.MFFileFormat) => scala.Unit,
    DownloadFileInBlocks_Begin: (scala.Double, scala.Double) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx: (scala.Double, scala.Double, mfilesLib.MFilesNs.MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_BeginEx_32bit: (scala.Double, scala.Double, mfilesLib.MFilesNs.MFFileFormat) => IFileDownloadSession,
    DownloadFileInBlocks_Begin_32bit: (scala.Double, scala.Double) => IFileDownloadSession,
    DownloadFileInBlocks_ReadBlock: (scala.Double, scala.Double, scala.Double) => js.Array[scala.Double],
    DownloadFileInBlocks_ReadBlock_32bit: (scala.Double, scala.Double, scala.Double) => js.Array[scala.Double],
    GetFileSize: IFileVer => scala.Double,
    GetFileSize_32bit: IFileVer => scala.Double,
    GetFiles: IObjVer => IObjectFiles,
    GetFilesForModificationInEventHandler: IObjVer => IObjectFiles,
    GetLatestFileVersion: (scala.Double, scala.Boolean) => IFileVer,
    GetObjIDOfFile: scala.Double => IObjID,
    GetPathInDefaultView: (IObjID, scala.Double, scala.Double, scala.Double, mfilesLib.MFilesNs.MFLatestSpecificBehavior, scala.Boolean) => java.lang.String,
    GetPathInDefaultViewEx: (IObjID, scala.Double, scala.Double, scala.Double, mfilesLib.MFilesNs.MFLatestSpecificBehavior, scala.Boolean, scala.Boolean) => java.lang.String,
    OpenFileInDefaultApplication: (scala.Double, IObjVer, IFileVer, mfilesLib.MFilesNs.MFFileOpenMethod) => scala.Unit,
    PerformOCROperation: (IObjVer, IFileVer, IOCROptions, mfilesLib.MFilesNs.MFOCRZoneRecognitionMode, IOCRPages, scala.Boolean) => IOCRPageResults,
    RemoveFile: (IObjVer, IFileVer) => IObjectVersion,
    RenameFile: (IObjVer, IFileVer, java.lang.String, java.lang.String, scala.Boolean) => IObjectVersion,
    UpdateMetadataInFile: (IObjVer, scala.Double, scala.Boolean) => IObjectVersion,
    UploadFile: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    UploadFileBlock: (scala.Double, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Unit,
    UploadFileBlockBegin: () => scala.Double,
    UploadFileBlockBegin_32bit: () => scala.Double,
    UploadFileBlock_32bit: (scala.Double, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Unit,
    UploadFileCommit: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    UploadFileCommit_32bit: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    UploadFromDataURI: (IObjVer, scala.Double, scala.Double, java.lang.String) => scala.Unit,
    UploadTemporaryFile: java.lang.String => scala.Double,
    UploadTemporaryFileBlock: (scala.Double, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Unit,
    UploadTemporaryFileBlockBegin: java.lang.String => scala.Double,
    UploadTemporaryFileBlockBegin_32bit: java.lang.String => scala.Double,
    UploadTemporaryFileBlock_32bit: (scala.Double, scala.Double, scala.Double, js.Array[scala.Double]) => scala.Unit,
    UploadTemporaryFileCommit: (scala.Double, scala.Double) => scala.Unit,
    UploadTemporaryFileCommit_32bit: (scala.Double, scala.Double) => scala.Unit
  ): IVaultObjectFileOperations = {
    val __obj = js.Dynamic.literal(AddEmptyFile = js.Any.fromFunction3(AddEmptyFile), AddFile = js.Any.fromFunction4(AddFile), CloseUploadSession = js.Any.fromFunction1(CloseUploadSession), ConvertToPDF = js.Any.fromFunction6(ConvertToPDF), DownloadFile = js.Any.fromFunction3(DownloadFile), DownloadFileAsDataURI = js.Any.fromFunction3(DownloadFileAsDataURI), DownloadFileEx = js.Any.fromFunction4(DownloadFileEx), DownloadFileInBlocks_Begin = js.Any.fromFunction2(DownloadFileInBlocks_Begin), DownloadFileInBlocks_BeginEx = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx), DownloadFileInBlocks_BeginEx_32bit = js.Any.fromFunction3(DownloadFileInBlocks_BeginEx_32bit), DownloadFileInBlocks_Begin_32bit = js.Any.fromFunction2(DownloadFileInBlocks_Begin_32bit), DownloadFileInBlocks_ReadBlock = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock), DownloadFileInBlocks_ReadBlock_32bit = js.Any.fromFunction3(DownloadFileInBlocks_ReadBlock_32bit), GetFileSize = js.Any.fromFunction1(GetFileSize), GetFileSize_32bit = js.Any.fromFunction1(GetFileSize_32bit), GetFiles = js.Any.fromFunction1(GetFiles), GetFilesForModificationInEventHandler = js.Any.fromFunction1(GetFilesForModificationInEventHandler), GetLatestFileVersion = js.Any.fromFunction2(GetLatestFileVersion), GetObjIDOfFile = js.Any.fromFunction1(GetObjIDOfFile), GetPathInDefaultView = js.Any.fromFunction6(GetPathInDefaultView), GetPathInDefaultViewEx = js.Any.fromFunction7(GetPathInDefaultViewEx), OpenFileInDefaultApplication = js.Any.fromFunction4(OpenFileInDefaultApplication), PerformOCROperation = js.Any.fromFunction6(PerformOCROperation), RemoveFile = js.Any.fromFunction2(RemoveFile), RenameFile = js.Any.fromFunction5(RenameFile), UpdateMetadataInFile = js.Any.fromFunction3(UpdateMetadataInFile), UploadFile = js.Any.fromFunction3(UploadFile), UploadFileBlock = js.Any.fromFunction4(UploadFileBlock), UploadFileBlockBegin = js.Any.fromFunction0(UploadFileBlockBegin), UploadFileBlockBegin_32bit = js.Any.fromFunction0(UploadFileBlockBegin_32bit), UploadFileBlock_32bit = js.Any.fromFunction4(UploadFileBlock_32bit), UploadFileCommit = js.Any.fromFunction4(UploadFileCommit), UploadFileCommit_32bit = js.Any.fromFunction4(UploadFileCommit_32bit), UploadFromDataURI = js.Any.fromFunction4(UploadFromDataURI), UploadTemporaryFile = js.Any.fromFunction1(UploadTemporaryFile), UploadTemporaryFileBlock = js.Any.fromFunction4(UploadTemporaryFileBlock), UploadTemporaryFileBlockBegin = js.Any.fromFunction1(UploadTemporaryFileBlockBegin), UploadTemporaryFileBlockBegin_32bit = js.Any.fromFunction1(UploadTemporaryFileBlockBegin_32bit), UploadTemporaryFileBlock_32bit = js.Any.fromFunction4(UploadTemporaryFileBlock_32bit), UploadTemporaryFileCommit = js.Any.fromFunction2(UploadTemporaryFileCommit), UploadTemporaryFileCommit_32bit = js.Any.fromFunction2(UploadTemporaryFileCommit_32bit))
  
    __obj.asInstanceOf[IVaultObjectFileOperations]
  }
}

