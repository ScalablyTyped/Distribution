package typings.mfiles

import typings.mfiles.MFiles.MFFileFormat
import typings.mfiles.MFiles.MFFileOpenMethod
import typings.mfiles.MFiles.MFLatestSpecificBehavior
import typings.mfiles.MFiles.MFOCRZoneRecognitionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultObjectFileOperationsAsync extends StObject {
  
  def AddEmptyFile(ObjVer: IObjVer, Title: String, Extension: String): Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit]
  ): Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddEmptyFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def AddFile(ObjVer: IObjVer, Title: String, Extension: String, SourcePath: String): Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    SourcePath: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit]
  ): Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    SourcePath: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    SourcePath: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    SourcePath: String,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    SourcePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    SourcePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFile(
    ObjVer: IObjVer,
    Title: String,
    Extension: String,
    SourcePath: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def CloseUploadSession(UploadID: Double): Unit = js.native
  def CloseUploadSession(UploadID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def CloseUploadSession(
    UploadID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CloseUploadSession(
    UploadID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CloseUploadSession(
    UploadID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CloseUploadSession(
    UploadID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CloseUploadSession(
    UploadID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CloseUploadSession(UploadID: Double, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean
  ): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ConvertToPDF(
    ObjVer: IObjVer,
    FileID: Double,
    StoreAsSeparateFile: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    FailOnUnsupportedSourceFiles: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFile(File: Double, FileVersion: Double, FilePath: String): Unit = js.native
  def DownloadFile(File: Double, FileVersion: Double, FilePath: String, successCallback: js.Function0[Unit]): Unit = js.native
  def DownloadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileAsDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double): Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileAsDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileEx(File: Double, FileVersion: Double, FilePath: String, FileFormat: MFFileFormat): Unit = js.native
  def DownloadFileEx(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    FileFormat: MFFileFormat,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileEx(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    FileFormat: MFFileFormat,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileEx(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    FileFormat: MFFileFormat,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileEx(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    FileFormat: MFFileFormat,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileEx(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileEx(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileEx(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileInBlocks_Begin(File: Double, FileVersion: Double): Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin(
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileInBlocks_BeginEx(File: Double, FileVersion: Double, FileFormat: MFFileFormat): Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileInBlocks_BeginEx_32bit(File: Double, FileVersion: Double, FileFormat: MFFileFormat): Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_BeginEx_32bit(
    File: Double,
    FileVersion: Double,
    FileFormat: MFFileFormat,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileInBlocks_Begin_32bit(File: Double, FileVersion: Double): Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: Double,
    FileVersion: Double,
    successCallback: js.Function1[/* result */ IFileDownloadSession, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_Begin_32bit(
    File: Double,
    FileVersion: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileInBlocks_ReadBlock(DownloadID: Double, BlockSize: Double, Offset: Double): Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DownloadFileInBlocks_ReadBlock_32bit(DownloadID: Double, BlockSize: Double, Offset: Double): Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DownloadFileInBlocks_ReadBlock_32bit(
    DownloadID: Double,
    BlockSize: Double,
    Offset: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetFileSize(FileVer: IFileVer): Unit = js.native
  def GetFileSize(FileVer: IFileVer, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetFileSize(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFileSize(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFileSize(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFileSize(
    FileVer: IFileVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFileSize(
    FileVer: IFileVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFileSize(FileVer: IFileVer, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetFileSize_32bit(FileVer: IFileVer): Unit = js.native
  def GetFileSize_32bit(FileVer: IFileVer, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetFileSize_32bit(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFileSize_32bit(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFileSize_32bit(
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFileSize_32bit(
    FileVer: IFileVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFileSize_32bit(
    FileVer: IFileVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFileSize_32bit(FileVer: IFileVer, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetFiles(ObjVer: IObjVer): Unit = js.native
  def GetFiles(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectFiles, Unit]): Unit = js.native
  def GetFiles(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFiles(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFiles(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFiles(
    ObjVer: IObjVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFiles(
    ObjVer: IObjVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFiles(ObjVer: IObjVer, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer): Unit = js.native
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectFiles, Unit]): Unit = js.native
  def GetFilesForModificationInEventHandler(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFilesForModificationInEventHandler(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFilesForModificationInEventHandler(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectFiles, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFilesForModificationInEventHandler(
    ObjVer: IObjVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFilesForModificationInEventHandler(
    ObjVer: IObjVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFilesForModificationInEventHandler(ObjVer: IObjVer, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetLatestFileVersion(FileID: Double, AllowCheckedOut: Boolean): Unit = js.native
  def GetLatestFileVersion(
    FileID: Double,
    AllowCheckedOut: Boolean,
    successCallback: js.Function1[/* result */ IFileVer, Unit]
  ): Unit = js.native
  def GetLatestFileVersion(
    FileID: Double,
    AllowCheckedOut: Boolean,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestFileVersion(
    FileID: Double,
    AllowCheckedOut: Boolean,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestFileVersion(
    FileID: Double,
    AllowCheckedOut: Boolean,
    successCallback: js.Function1[/* result */ IFileVer, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestFileVersion(
    FileID: Double,
    AllowCheckedOut: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestFileVersion(
    FileID: Double,
    AllowCheckedOut: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestFileVersion(
    FileID: Double,
    AllowCheckedOut: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetObjIDOfFile(FileID: Double): Unit = js.native
  def GetObjIDOfFile(FileID: Double, successCallback: js.Function1[/* result */ IObjID, Unit]): Unit = js.native
  def GetObjIDOfFile(
    FileID: Double,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjIDOfFile(
    FileID: Double,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDOfFile(
    FileID: Double,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDOfFile(
    FileID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjIDOfFile(
    FileID: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDOfFile(FileID: Double, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean
  ): Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPathInDefaultView(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean
  ): Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPathInDefaultViewEx(
    ObjID: IObjID,
    ObjectVersion: Double,
    FileID: Double,
    FileVersion: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    PreferTraditionalFolderLocation: Boolean,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def OpenFileInDefaultApplication(ParentWindow: Double, ObjVer: IObjVer, FileVer: IFileVer, FileOpenMethod: MFFileOpenMethod): Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: MFFileOpenMethod,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: MFFileOpenMethod,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: MFFileOpenMethod,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: MFFileOpenMethod,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: MFFileOpenMethod,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: MFFileOpenMethod,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def OpenFileInDefaultApplication(
    ParentWindow: Double,
    ObjVer: IObjVer,
    FileVer: IFileVer,
    FileOpenMethod: MFFileOpenMethod,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean
  ): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean,
    successCallback: js.Function1[/* result */ IOCRPageResults, Unit]
  ): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean,
    successCallback: js.Function1[/* result */ IOCRPageResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean,
    successCallback: js.Function1[/* result */ IOCRPageResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean,
    successCallback: js.Function1[/* result */ IOCRPageResults, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def PerformOCROperation(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    OCROptions: IOCROptions,
    ZoneRecognitionMode: MFOCRZoneRecognitionMode,
    ZoneRecognitionPages: IOCRPages,
    ConvertToSearchablePDF: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def RemoveFile(ObjVer: IObjVer, FileVer: IFileVer): Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean
  ): Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RenameFile(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Title: String,
    Extension: String,
    UpdateSingleFileDocumentTitle: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UpdateMetadataInFile(ObjVer: IObjVer, File: Double, FailOnUnsupportedFiles: Boolean): Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: Double,
    FailOnUnsupportedFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: Double,
    FailOnUnsupportedFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: Double,
    FailOnUnsupportedFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: Double,
    FailOnUnsupportedFiles: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: Double,
    FailOnUnsupportedFiles: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: Double,
    FailOnUnsupportedFiles: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateMetadataInFile(
    ObjVer: IObjVer,
    File: Double,
    FailOnUnsupportedFiles: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadFile(File: Double, FileVersion: Double, FilePath: String): Unit = js.native
  def UploadFile(File: Double, FileVersion: Double, FilePath: String, successCallback: js.Function0[Unit]): Unit = js.native
  def UploadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFile(
    File: Double,
    FileVersion: Double,
    FilePath: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadFileBlockBegin(): Unit = js.native
  def UploadFileBlockBegin(successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def UploadFileBlockBegin(
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlockBegin(
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlockBegin(
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlockBegin(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlockBegin(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlockBegin(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def UploadFileBlockBegin_32bit(): Unit = js.native
  def UploadFileBlockBegin_32bit(successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def UploadFileBlockBegin_32bit(
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlockBegin_32bit(
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlockBegin_32bit(
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlockBegin_32bit(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlockBegin_32bit(
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlockBegin_32bit(successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def UploadFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadFileCommit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit = js.native
  def UploadFileCommit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileCommit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileCommit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadFileCommit_32bit(UploadID: Double, File: Double, FileVersion: Double, LogicalSize: Double): Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFileCommit_32bit(
    UploadID: Double,
    File: Double,
    FileVersion: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadFromDataURI(ObjVer: IObjVer, File: Double, FileVersion: Double, DataURI: String): Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    DataURI: String,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    DataURI: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    DataURI: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    DataURI: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    DataURI: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    DataURI: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadFromDataURI(
    ObjVer: IObjVer,
    File: Double,
    FileVersion: Double,
    DataURI: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadTemporaryFile(FilePath: String): Unit = js.native
  def UploadTemporaryFile(FilePath: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def UploadTemporaryFile(
    FilePath: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFile(
    FilePath: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFile(
    FilePath: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFile(
    FilePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFile(
    FilePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFile(FilePath: String, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def UploadTemporaryFileBlock(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadTemporaryFileBlockBegin(FileExtension: String): Unit = js.native
  def UploadTemporaryFileBlockBegin(FileExtension: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin(
    FileExtension: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadTemporaryFileBlockBegin_32bit(FileExtension: String): Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(FileExtension: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlockBegin_32bit(
    FileExtension: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadTemporaryFileBlock_32bit(UploadID: Double, TotalSizeInBytes: Double, Offset: Double, Block: js.Array[Double]): Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileBlock_32bit(
    UploadID: Double,
    TotalSizeInBytes: Double,
    Offset: Double,
    Block: js.Array[Double],
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadTemporaryFileCommit(UploadID: Double, LogicalSize: Double): Unit = js.native
  def UploadTemporaryFileCommit(UploadID: Double, LogicalSize: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UploadTemporaryFileCommit_32bit(UploadID: Double, LogicalSize: Double): Unit = js.native
  def UploadTemporaryFileCommit_32bit(UploadID: Double, LogicalSize: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UploadTemporaryFileCommit_32bit(
    UploadID: Double,
    LogicalSize: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
