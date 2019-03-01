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
    AddEmptyFile: js.Function3[IObjVer, java.lang.String, java.lang.String, IFileVer],
    AddFile: js.Function4[IObjVer, java.lang.String, java.lang.String, java.lang.String, IFileVer],
    CloseUploadSession: js.Function1[scala.Double, scala.Unit],
    ConvertToPDF: js.Function6[
      IObjVer, 
      scala.Double, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      IObjectVersion
    ],
    DownloadFile: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    DownloadFileAsDataURI: js.Function3[IObjVer, scala.Double, scala.Double, java.lang.String],
    DownloadFileEx: js.Function4[
      scala.Double, 
      scala.Double, 
      java.lang.String, 
      mfilesLib.MFilesNs.MFFileFormat, 
      scala.Unit
    ],
    DownloadFileInBlocks_Begin: js.Function2[scala.Double, scala.Double, IFileDownloadSession],
    DownloadFileInBlocks_BeginEx: js.Function3[scala.Double, scala.Double, mfilesLib.MFilesNs.MFFileFormat, IFileDownloadSession],
    DownloadFileInBlocks_BeginEx_32bit: js.Function3[scala.Double, scala.Double, mfilesLib.MFilesNs.MFFileFormat, IFileDownloadSession],
    DownloadFileInBlocks_Begin_32bit: js.Function2[scala.Double, scala.Double, IFileDownloadSession],
    DownloadFileInBlocks_ReadBlock: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[scala.Double]],
    DownloadFileInBlocks_ReadBlock_32bit: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[scala.Double]],
    GetFileSize: js.Function1[IFileVer, scala.Double],
    GetFileSize_32bit: js.Function1[IFileVer, scala.Double],
    GetFiles: js.Function1[IObjVer, IObjectFiles],
    GetFilesForModificationInEventHandler: js.Function1[IObjVer, IObjectFiles],
    GetLatestFileVersion: js.Function2[scala.Double, scala.Boolean, IFileVer],
    GetObjIDOfFile: js.Function1[scala.Double, IObjID],
    GetPathInDefaultView: js.Function6[
      IObjID, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      mfilesLib.MFilesNs.MFLatestSpecificBehavior, 
      scala.Boolean, 
      java.lang.String
    ],
    GetPathInDefaultViewEx: js.Function7[
      IObjID, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      mfilesLib.MFilesNs.MFLatestSpecificBehavior, 
      scala.Boolean, 
      scala.Boolean, 
      java.lang.String
    ],
    OpenFileInDefaultApplication: js.Function4[scala.Double, IObjVer, IFileVer, mfilesLib.MFilesNs.MFFileOpenMethod, scala.Unit],
    PerformOCROperation: js.Function6[
      IObjVer, 
      IFileVer, 
      IOCROptions, 
      mfilesLib.MFilesNs.MFOCRZoneRecognitionMode, 
      IOCRPages, 
      scala.Boolean, 
      IOCRPageResults
    ],
    RemoveFile: js.Function2[IObjVer, IFileVer, IObjectVersion],
    RenameFile: js.Function5[IObjVer, IFileVer, java.lang.String, java.lang.String, scala.Boolean, IObjectVersion],
    UpdateMetadataInFile: js.Function3[IObjVer, scala.Double, scala.Boolean, IObjectVersion],
    UploadFile: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    UploadFileBlock: js.Function4[scala.Double, scala.Double, scala.Double, js.Array[scala.Double], scala.Unit],
    UploadFileBlockBegin: js.Function0[scala.Double],
    UploadFileBlockBegin_32bit: js.Function0[scala.Double],
    UploadFileBlock_32bit: js.Function4[scala.Double, scala.Double, scala.Double, js.Array[scala.Double], scala.Unit],
    UploadFileCommit: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    UploadFileCommit_32bit: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    UploadFromDataURI: js.Function4[IObjVer, scala.Double, scala.Double, java.lang.String, scala.Unit],
    UploadTemporaryFile: js.Function1[java.lang.String, scala.Double],
    UploadTemporaryFileBlock: js.Function4[scala.Double, scala.Double, scala.Double, js.Array[scala.Double], scala.Unit],
    UploadTemporaryFileBlockBegin: js.Function1[java.lang.String, scala.Double],
    UploadTemporaryFileBlockBegin_32bit: js.Function1[java.lang.String, scala.Double],
    UploadTemporaryFileBlock_32bit: js.Function4[scala.Double, scala.Double, scala.Double, js.Array[scala.Double], scala.Unit],
    UploadTemporaryFileCommit: js.Function2[scala.Double, scala.Double, scala.Unit],
    UploadTemporaryFileCommit_32bit: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): IVaultObjectFileOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddEmptyFile")(AddEmptyFile)
    __obj.updateDynamic("AddFile")(AddFile)
    __obj.updateDynamic("CloseUploadSession")(CloseUploadSession)
    __obj.updateDynamic("ConvertToPDF")(ConvertToPDF)
    __obj.updateDynamic("DownloadFile")(DownloadFile)
    __obj.updateDynamic("DownloadFileAsDataURI")(DownloadFileAsDataURI)
    __obj.updateDynamic("DownloadFileEx")(DownloadFileEx)
    __obj.updateDynamic("DownloadFileInBlocks_Begin")(DownloadFileInBlocks_Begin)
    __obj.updateDynamic("DownloadFileInBlocks_BeginEx")(DownloadFileInBlocks_BeginEx)
    __obj.updateDynamic("DownloadFileInBlocks_BeginEx_32bit")(DownloadFileInBlocks_BeginEx_32bit)
    __obj.updateDynamic("DownloadFileInBlocks_Begin_32bit")(DownloadFileInBlocks_Begin_32bit)
    __obj.updateDynamic("DownloadFileInBlocks_ReadBlock")(DownloadFileInBlocks_ReadBlock)
    __obj.updateDynamic("DownloadFileInBlocks_ReadBlock_32bit")(DownloadFileInBlocks_ReadBlock_32bit)
    __obj.updateDynamic("GetFileSize")(GetFileSize)
    __obj.updateDynamic("GetFileSize_32bit")(GetFileSize_32bit)
    __obj.updateDynamic("GetFiles")(GetFiles)
    __obj.updateDynamic("GetFilesForModificationInEventHandler")(GetFilesForModificationInEventHandler)
    __obj.updateDynamic("GetLatestFileVersion")(GetLatestFileVersion)
    __obj.updateDynamic("GetObjIDOfFile")(GetObjIDOfFile)
    __obj.updateDynamic("GetPathInDefaultView")(GetPathInDefaultView)
    __obj.updateDynamic("GetPathInDefaultViewEx")(GetPathInDefaultViewEx)
    __obj.updateDynamic("OpenFileInDefaultApplication")(OpenFileInDefaultApplication)
    __obj.updateDynamic("PerformOCROperation")(PerformOCROperation)
    __obj.updateDynamic("RemoveFile")(RemoveFile)
    __obj.updateDynamic("RenameFile")(RenameFile)
    __obj.updateDynamic("UpdateMetadataInFile")(UpdateMetadataInFile)
    __obj.updateDynamic("UploadFile")(UploadFile)
    __obj.updateDynamic("UploadFileBlock")(UploadFileBlock)
    __obj.updateDynamic("UploadFileBlockBegin")(UploadFileBlockBegin)
    __obj.updateDynamic("UploadFileBlockBegin_32bit")(UploadFileBlockBegin_32bit)
    __obj.updateDynamic("UploadFileBlock_32bit")(UploadFileBlock_32bit)
    __obj.updateDynamic("UploadFileCommit")(UploadFileCommit)
    __obj.updateDynamic("UploadFileCommit_32bit")(UploadFileCommit_32bit)
    __obj.updateDynamic("UploadFromDataURI")(UploadFromDataURI)
    __obj.updateDynamic("UploadTemporaryFile")(UploadTemporaryFile)
    __obj.updateDynamic("UploadTemporaryFileBlock")(UploadTemporaryFileBlock)
    __obj.updateDynamic("UploadTemporaryFileBlockBegin")(UploadTemporaryFileBlockBegin)
    __obj.updateDynamic("UploadTemporaryFileBlockBegin_32bit")(UploadTemporaryFileBlockBegin_32bit)
    __obj.updateDynamic("UploadTemporaryFileBlock_32bit")(UploadTemporaryFileBlock_32bit)
    __obj.updateDynamic("UploadTemporaryFileCommit")(UploadTemporaryFileCommit)
    __obj.updateDynamic("UploadTemporaryFileCommit_32bit")(UploadTemporaryFileCommit_32bit)
    __obj.asInstanceOf[IVaultObjectFileOperations]
  }
}

