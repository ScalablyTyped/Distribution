package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultObjectFileOperations")
@js.native
class VaultObjectFileOperations ()
  extends mfilesLib.IVaultObjectFileOperations {
  /* CompleteClass */
  override def AddEmptyFile(ObjVer: mfilesLib.IObjVer, Title: java.lang.String, Extension: java.lang.String): mfilesLib.IFileVer = js.native
  /* CompleteClass */
  override def AddFile(
    ObjVer: mfilesLib.IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    SourcePath: java.lang.String
  ): mfilesLib.IFileVer = js.native
  /* CompleteClass */
  override def CloseUploadSession(UploadID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def ConvertToPDF(
    ObjVer: mfilesLib.IObjVer,
    FileID: scala.Double,
    StoreAsSeparateFile: scala.Boolean,
    OverwriteExistingFile: scala.Boolean,
    PDFA1b: scala.Boolean,
    FailOnUnsupportedSourceFiles: scala.Boolean
  ): mfilesLib.IObjectVersion = js.native
  /* CompleteClass */
  override def DownloadFile(File: scala.Double, FileVersion: scala.Double, FilePath: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def DownloadFileAsDataURI(ObjVer: mfilesLib.IObjVer, File: scala.Double, FileVersion: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def DownloadFileEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    FileFormat: MFFileFormat
  ): scala.Unit = js.native
  /* CompleteClass */
  override def DownloadFileInBlocks_Begin(File: scala.Double, FileVersion: scala.Double): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadFileInBlocks_BeginEx(File: scala.Double, FileVersion: scala.Double, FileFormat: MFFileFormat): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadFileInBlocks_BeginEx_32bit(File: scala.Double, FileVersion: scala.Double, FileFormat: MFFileFormat): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadFileInBlocks_Begin_32bit(File: scala.Double, FileVersion: scala.Double): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadFileInBlocks_ReadBlock(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def GetFileSize(FileVer: mfilesLib.IFileVer): scala.Double = js.native
  /* CompleteClass */
  override def GetFileSize_32bit(FileVer: mfilesLib.IFileVer): scala.Double = js.native
  /* CompleteClass */
  override def GetFiles(ObjVer: mfilesLib.IObjVer): mfilesLib.IObjectFiles = js.native
  /* CompleteClass */
  override def GetFilesForModificationInEventHandler(ObjVer: mfilesLib.IObjVer): mfilesLib.IObjectFiles = js.native
  /* CompleteClass */
  override def GetLatestFileVersion(FileID: scala.Double, AllowCheckedOut: scala.Boolean): mfilesLib.IFileVer = js.native
  /* CompleteClass */
  override def GetObjIDOfFile(FileID: scala.Double): mfilesLib.IObjID = js.native
  /* CompleteClass */
  override def GetPathInDefaultView(
    ObjID: mfilesLib.IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: scala.Boolean
  ): java.lang.String = js.native
  /* CompleteClass */
  override def GetPathInDefaultViewEx(
    ObjID: mfilesLib.IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: scala.Boolean,
    UpdateFromServer: scala.Boolean
  ): java.lang.String = js.native
  /* CompleteClass */
  override def OpenFileInDefaultApplication(
    ParentWindow: scala.Double,
    ObjVer: mfilesLib.IObjVer,
    FileVer: mfilesLib.IFileVer,
    FileOpenMethod: MFFileOpenMethod
  ): scala.Unit = js.native
  /* CompleteClass */
  override def PerformOCROperation(
    ObjVer: mfilesLib.IObjVer,
    FileVer: mfilesLib.IFileVer,
    OCROptions: mfilesLib.IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: mfilesLib.IOCRPages,
    ConvertToSearchablePDF: scala.Boolean
  ): mfilesLib.IOCRPageResults = js.native
  /* CompleteClass */
  override def RemoveFile(ObjVer: mfilesLib.IObjVer, FileVer: mfilesLib.IFileVer): mfilesLib.IObjectVersion = js.native
  /* CompleteClass */
  override def RenameFile(
    ObjVer: mfilesLib.IObjVer,
    FileVer: mfilesLib.IFileVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    UpdateSingleFileDocumentTitle: scala.Boolean
  ): mfilesLib.IObjectVersion = js.native
  /* CompleteClass */
  override def UpdateMetadataInFile(ObjVer: mfilesLib.IObjVer, File: scala.Double, FailOnUnsupportedFiles: scala.Boolean): mfilesLib.IObjectVersion = js.native
  /* CompleteClass */
  override def UploadFile(File: scala.Double, FileVersion: scala.Double, FilePath: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def UploadFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def UploadFileBlockBegin(): scala.Double = js.native
  /* CompleteClass */
  override def UploadFileBlockBegin_32bit(): scala.Double = js.native
  /* CompleteClass */
  override def UploadFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def UploadFileCommit(UploadID: scala.Double, File: scala.Double, FileVersion: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def UploadFileCommit_32bit(UploadID: scala.Double, File: scala.Double, FileVersion: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def UploadFromDataURI(
    ObjVer: mfilesLib.IObjVer,
    File: scala.Double,
    FileVersion: scala.Double,
    DataURI: java.lang.String
  ): scala.Unit = js.native
  /* CompleteClass */
  override def UploadTemporaryFile(FilePath: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def UploadTemporaryFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def UploadTemporaryFileBlockBegin(FileExtension: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def UploadTemporaryFileBlockBegin_32bit(FileExtension: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def UploadTemporaryFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def UploadTemporaryFileCommit(UploadID: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def UploadTemporaryFileCommit_32bit(UploadID: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
}

