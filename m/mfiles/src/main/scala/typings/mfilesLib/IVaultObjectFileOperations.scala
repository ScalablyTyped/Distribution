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

