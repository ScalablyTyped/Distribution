package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectFileOperationsAsync extends js.Object {
  def AddEmptyFile(ObjVer: IObjVer, Title: java.lang.String, Extension: java.lang.String): scala.Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit]
  ): scala.Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    SourcePath: java.lang.String
  ): scala.Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    SourcePath: java.lang.String,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit]
  ): scala.Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    SourcePath: java.lang.String,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    SourcePath: java.lang.String,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CloseUploadSession(UploadID: scala.Double): scala.Unit = js.native
  def CloseUploadSession(UploadID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def CloseUploadSession(
    UploadID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CloseUploadSession(
    UploadID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: scala.Double,
    StoreAsSeparateFile: scala.Boolean,
    OverwriteExistingFile: scala.Boolean,
    PDFA1b: scala.Boolean,
    FailOnUnsupportedSourceFiles: scala.Boolean
  ): scala.Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: scala.Double,
    StoreAsSeparateFile: scala.Boolean,
    OverwriteExistingFile: scala.Boolean,
    PDFA1b: scala.Boolean,
    FailOnUnsupportedSourceFiles: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: scala.Double,
    StoreAsSeparateFile: scala.Boolean,
    OverwriteExistingFile: scala.Boolean,
    PDFA1b: scala.Boolean,
    FailOnUnsupportedSourceFiles: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: scala.Double,
    StoreAsSeparateFile: scala.Boolean,
    OverwriteExistingFile: scala.Boolean,
    PDFA1b: scala.Boolean,
    FailOnUnsupportedSourceFiles: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFile(File: scala.Double, FileVersion: scala.Double, FilePath: java.lang.String): scala.Unit = js.native
  def DownloadFile(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFile(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFile(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileAsDataURI(ObjVer: IObjVer, File: scala.Double, FileVersion: scala.Double): scala.Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat
  ): scala.Unit = js.native
  def DownloadFileEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_Begin(File: scala.Double, FileVersion: scala.Double): scala.Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx(File: scala.Double, FileVersion: scala.Double, FileFormat: mfilesLib.MFilesNs.MFFileFormat): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: scala.Double,
    FileVersion: scala.Double,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(File: scala.Double, FileVersion: scala.Double, FileFormat: mfilesLib.MFilesNs.MFFileFormat): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: scala.Double,
    FileVersion: scala.Double,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: scala.Double,
    FileVersion: scala.Double,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: scala.Double,
    FileVersion: scala.Double,
    FileFormat: mfilesLib.MFilesNs.MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(File: scala.Double, FileVersion: scala.Double): scala.Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: scala.Double,
    FileVersion: scala.Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: scala.Double, BlockSize: scala.Double, Offset: scala.Double): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFileSize(FileVer: IFileVer): scala.Unit = js.native
  def GetFileSize(FileVer: IFileVer, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetFileSize(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFileSize(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFileSize_32bit(FileVer: IFileVer): scala.Unit = js.native
  def GetFileSize_32bit(FileVer: IFileVer, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetFileSize_32bit(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFileSize_32bit(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFiles(ObjVer: IObjVer): scala.Unit = js.native
  def GetFiles(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectFiles, scala.Unit]): scala.Unit = js.native
  def GetFiles(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFiles(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer): scala.Unit = js.native
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectFiles, scala.Unit]): scala.Unit = js.native
  def GetFilesForModificationInEventHandler(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFilesForModificationInEventHandler(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLatestFileVersion(FileID: scala.Double, AllowCheckedOut: scala.Boolean): scala.Unit = js.native
  def GetLatestFileVersion(
    FileID: scala.Double,
    AllowCheckedOut: scala.Boolean,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit]
  ): scala.Unit = js.native
  def GetLatestFileVersion(
    FileID: scala.Double,
    AllowCheckedOut: scala.Boolean,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLatestFileVersion(
    FileID: scala.Double,
    AllowCheckedOut: scala.Boolean,
    successCallback: js.Function1[/* result */ IFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjIDOfFile(FileID: scala.Double): scala.Unit = js.native
  def GetObjIDOfFile(FileID: scala.Double, successCallback: js.Function1[/* result */ IObjID, scala.Unit]): scala.Unit = js.native
  def GetObjIDOfFile(
    FileID: scala.Double,
    successCallback: js.Function1[/* result */ IObjID, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjIDOfFile(
    FileID: scala.Double,
    successCallback: js.Function1[/* result */ IObjID, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    UpdateFromServer: scala.Boolean
  ): scala.Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: scala.Boolean,
    UpdateFromServer: scala.Boolean
  ): scala.Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: scala.Double,
    FileID: scala.Double,
    FileVersion: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: mfilesLib.MFilesNs.MFFileOpenMethod
  ): scala.Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: mfilesLib.MFilesNs.MFFileOpenMethod,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: mfilesLib.MFilesNs.MFFileOpenMethod,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: mfilesLib.MFilesNs.MFFileOpenMethod,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: mfilesLib.MFilesNs.MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: scala.Boolean
  ): scala.Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: mfilesLib.MFilesNs.MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: scala.Boolean,
    successCallback: js.Function1[/* result */ IOCRPageResults, scala.Unit]
  ): scala.Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: mfilesLib.MFilesNs.MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: scala.Boolean,
    successCallback: js.Function1[/* result */ IOCRPageResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: mfilesLib.MFilesNs.MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: scala.Boolean,
    successCallback: js.Function1[/* result */ IOCRPageResults, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveFile(ObjVer: IObjVer, FileVer: IFileVer): scala.Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    UpdateSingleFileDocumentTitle: scala.Boolean
  ): scala.Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    UpdateSingleFileDocumentTitle: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    UpdateSingleFileDocumentTitle: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: java.lang.String,
    Extension: java.lang.String,
    UpdateSingleFileDocumentTitle: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateMetadataInFile(ObjVer: IObjVer, File: scala.Double, FailOnUnsupportedFiles: scala.Boolean): scala.Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: scala.Double,
    FailOnUnsupportedFiles: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: scala.Double,
    FailOnUnsupportedFiles: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: scala.Double,
    FailOnUnsupportedFiles: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFile(File: scala.Double, FileVersion: scala.Double, FilePath: java.lang.String): scala.Unit = js.native
  def UploadFile(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFile(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFile(
    File: scala.Double,
    FileVersion: scala.Double,
    FilePath: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  def UploadFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileBlockBegin(): scala.Unit = js.native
  def UploadFileBlockBegin(successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def UploadFileBlockBegin(
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFileBlockBegin(
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileBlockBegin_32bit(): scala.Unit = js.native
  def UploadFileBlockBegin_32bit(successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def UploadFileBlockBegin_32bit(
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFileBlockBegin_32bit(
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileCommit(UploadID: scala.Double, File: scala.Double, FileVersion: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
  def UploadFileCommit(
    UploadID: scala.Double,
    File: scala.Double,
    FileVersion: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileCommit(
    UploadID: scala.Double,
    File: scala.Double,
    FileVersion: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFileCommit(
    UploadID: scala.Double,
    File: scala.Double,
    FileVersion: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileCommit_32bit(UploadID: scala.Double, File: scala.Double, FileVersion: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: scala.Double,
    File: scala.Double,
    FileVersion: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: scala.Double,
    File: scala.Double,
    FileVersion: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: scala.Double,
    File: scala.Double,
    FileVersion: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFromDataURI(ObjVer: IObjVer, File: scala.Double, FileVersion: scala.Double, DataURI: java.lang.String): scala.Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: scala.Double,
    FileVersion: scala.Double,
    DataURI: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: scala.Double,
    FileVersion: scala.Double,
    DataURI: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: scala.Double,
    FileVersion: scala.Double,
    DataURI: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFile(FilePath: java.lang.String): scala.Unit = js.native
  def UploadTemporaryFile(FilePath: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def UploadTemporaryFile(
    FilePath: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadTemporaryFile(
    FilePath: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin(FileExtension: java.lang.String): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(FileExtension: java.lang.String): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: scala.Double,
    TotalSizeInBytes: scala.Double,
    Offset: scala.Double,
    Block: js.Array[scala.Double],
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileCommit(UploadID: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
  def UploadTemporaryFileCommit(UploadID: scala.Double, LogicalSize: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UploadTemporaryFileCommit_32bit(UploadID: scala.Double, LogicalSize: scala.Double): scala.Unit = js.native
  def UploadTemporaryFileCommit_32bit(UploadID: scala.Double, LogicalSize: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: scala.Double,
    LogicalSize: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

