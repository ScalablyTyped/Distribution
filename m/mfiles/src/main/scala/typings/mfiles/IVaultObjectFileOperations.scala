package typings.mfiles

import typings.mfiles.MFiles.MFFileFormat
import typings.mfiles.MFiles.MFFileOpenMethod
import typings.mfiles.MFiles.MFLatestSpecificBehavior
import typings.mfiles.MFiles.MFOCRZoneRecognitionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultObjectFileOperations extends StObject {
  
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
  
  @scala.inline
  implicit class IVaultObjectFileOperationsMutableBuilder[Self <: IVaultObjectFileOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEmptyFile(value: (IObjVer, String, String) => IFileVer): Self = StObject.set(x, "AddEmptyFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddFile(value: (IObjVer, String, String, String) => IFileVer): Self = StObject.set(x, "AddFile", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCloseUploadSession(value: Double => Unit): Self = StObject.set(x, "CloseUploadSession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertToPDF(value: (IObjVer, Double, Boolean, Boolean, Boolean, Boolean) => IObjectVersion): Self = StObject.set(x, "ConvertToPDF", js.Any.fromFunction6(value))
    
    @scala.inline
    def setDownloadFile(value: (Double, Double, String) => Unit): Self = StObject.set(x, "DownloadFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDownloadFileAsDataURI(value: (IObjVer, Double, Double) => String): Self = StObject.set(x, "DownloadFileAsDataURI", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDownloadFileEx(value: (Double, Double, String, MFFileFormat) => Unit): Self = StObject.set(x, "DownloadFileEx", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDownloadFileInBlocks_Begin(value: (Double, Double) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_Begin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDownloadFileInBlocks_BeginEx(value: (Double, Double, MFFileFormat) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_BeginEx", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDownloadFileInBlocks_BeginEx_32bit(value: (Double, Double, MFFileFormat) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_BeginEx_32bit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDownloadFileInBlocks_Begin_32bit(value: (Double, Double) => IFileDownloadSession): Self = StObject.set(x, "DownloadFileInBlocks_Begin_32bit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDownloadFileInBlocks_ReadBlock(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadFileInBlocks_ReadBlock", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDownloadFileInBlocks_ReadBlock_32bit(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "DownloadFileInBlocks_ReadBlock_32bit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetFileSize(value: IFileVer => Double): Self = StObject.set(x, "GetFileSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFileSize_32bit(value: IFileVer => Double): Self = StObject.set(x, "GetFileSize_32bit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFiles(value: IObjVer => IObjectFiles): Self = StObject.set(x, "GetFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFilesForModificationInEventHandler(value: IObjVer => IObjectFiles): Self = StObject.set(x, "GetFilesForModificationInEventHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLatestFileVersion(value: (Double, Boolean) => IFileVer): Self = StObject.set(x, "GetLatestFileVersion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetObjIDOfFile(value: Double => IObjID): Self = StObject.set(x, "GetObjIDOfFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPathInDefaultView(value: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean) => String): Self = StObject.set(x, "GetPathInDefaultView", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetPathInDefaultViewEx(value: (IObjID, Double, Double, Double, MFLatestSpecificBehavior, Boolean, Boolean) => String): Self = StObject.set(x, "GetPathInDefaultViewEx", js.Any.fromFunction7(value))
    
    @scala.inline
    def setOpenFileInDefaultApplication(value: (Double, IObjVer, IFileVer, MFFileOpenMethod) => Unit): Self = StObject.set(x, "OpenFileInDefaultApplication", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPerformOCROperation(
      value: (IObjVer, IFileVer, IOCROptions, MFOCRZoneRecognitionMode, IOCRPages, Boolean) => IOCRPageResults
    ): Self = StObject.set(x, "PerformOCROperation", js.Any.fromFunction6(value))
    
    @scala.inline
    def setRemoveFile(value: (IObjVer, IFileVer) => IObjectVersion): Self = StObject.set(x, "RemoveFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenameFile(value: (IObjVer, IFileVer, String, String, Boolean) => IObjectVersion): Self = StObject.set(x, "RenameFile", js.Any.fromFunction5(value))
    
    @scala.inline
    def setUpdateMetadataInFile(value: (IObjVer, Double, Boolean) => IObjectVersion): Self = StObject.set(x, "UpdateMetadataInFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUploadFile(value: (Double, Double, String) => Unit): Self = StObject.set(x, "UploadFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUploadFileBlock(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = StObject.set(x, "UploadFileBlock", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadFileBlockBegin(value: () => Double): Self = StObject.set(x, "UploadFileBlockBegin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUploadFileBlockBegin_32bit(value: () => Double): Self = StObject.set(x, "UploadFileBlockBegin_32bit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUploadFileBlock_32bit(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = StObject.set(x, "UploadFileBlock_32bit", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadFileCommit(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "UploadFileCommit", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadFileCommit_32bit(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "UploadFileCommit_32bit", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadFromDataURI(value: (IObjVer, Double, Double, String) => Unit): Self = StObject.set(x, "UploadFromDataURI", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadTemporaryFile(value: String => Double): Self = StObject.set(x, "UploadTemporaryFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUploadTemporaryFileBlock(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = StObject.set(x, "UploadTemporaryFileBlock", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadTemporaryFileBlockBegin(value: String => Double): Self = StObject.set(x, "UploadTemporaryFileBlockBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUploadTemporaryFileBlockBegin_32bit(value: String => Double): Self = StObject.set(x, "UploadTemporaryFileBlockBegin_32bit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUploadTemporaryFileBlock_32bit(value: (Double, Double, Double, js.Array[Double]) => Unit): Self = StObject.set(x, "UploadTemporaryFileBlock_32bit", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadTemporaryFileCommit(value: (Double, Double) => Unit): Self = StObject.set(x, "UploadTemporaryFileCommit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUploadTemporaryFileCommit_32bit(value: (Double, Double) => Unit): Self = StObject.set(x, "UploadTemporaryFileCommit_32bit", js.Any.fromFunction2(value))
  }
}
