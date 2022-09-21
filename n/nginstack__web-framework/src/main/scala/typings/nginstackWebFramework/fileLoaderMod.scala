package typings.nginstackWebFramework

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileLoaderMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/file-loader/FileLoader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FileLoader
  @JSImport("@nginstack/web-framework/lib/file-loader/FileLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FileInfo extends StObject {
    
    var contentType: String
    
    var filePath: String
    
    var name: String
  }
  object FileInfo {
    
    inline def apply(contentType: String, filePath: String, name: String): FileInfo = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileInfoUpload extends StObject {
    
    var contentType: String
    
    var fileId: String
    
    var lastModified: Double
    
    var name: String
    
    var size: Double
  }
  object FileInfoUpload {
    
    inline def apply(contentType: String, fileId: String, lastModified: Double, name: String, size: Double): FileInfoUpload = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfoUpload]
    }
    
    extension [Self <: FileInfoUpload](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
      
      inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileLoader extends StObject {
    
    def authorizeDownload(files: String, options: typings.nginstackWebFramework.downloadOptionsMod.^): String = js.native
    def authorizeDownload(files: String, options: Record[Any, Any]): String = js.native
    def authorizeDownload(
      files: js.Array[String | Double | typings.nginstackEngine.dbkeyMod.^],
      options: typings.nginstackWebFramework.downloadOptionsMod.^
    ): String = js.native
    def authorizeDownload(files: js.Array[String | Double | typings.nginstackEngine.dbkeyMod.^], options: Record[Any, Any]): String = js.native
    def authorizeDownload(files: Double, options: typings.nginstackWebFramework.downloadOptionsMod.^): String = js.native
    def authorizeDownload(files: Double, options: Record[Any, Any]): String = js.native
    def authorizeDownload(
      files: typings.nginstackEngine.dbkeyMod.^,
      options: typings.nginstackWebFramework.downloadOptionsMod.^
    ): String = js.native
    def authorizeDownload(files: typings.nginstackEngine.dbkeyMod.^, options: Record[Any, Any]): String = js.native
    
    def authorizeUpload(options: typings.nginstackWebFramework.uploadOptionsMod.^): String = js.native
    def authorizeUpload(options: Record[Any, Any]): String = js.native
    
    /* private */ var basePath_ : Any = js.native
    
    /* private */ var createUID_ : Any = js.native
    
    def deleteUploadedFile(uploadId: String, fileId: String): Boolean = js.native
    
    /* private */ var fileLifetime_ : Any = js.native
    
    /* private */ var formatDataFileNameTemp_ : Any = js.native
    
    /* private */ var formatDataFileName_ : Any = js.native
    
    /* private */ var formatFilesDirNameTemp_ : Any = js.native
    
    /* private */ var formatFilesDirName_ : Any = js.native
    
    /* private */ var formatManifestFileName_ : Any = js.native
    
    /* private */ var formatMetadataFileName_ : Any = js.native
    
    /* private */ var getFileInfoFromFilePath_ : Any = js.native
    
    /* private */ var getFileInfoFromLob_ : Any = js.native
    
    /* private */ var getFileInfoFromUfs_ : Any = js.native
    
    /* private */ var getFileInfoFromVfsPath_ : Any = js.native
    
    /* private */ var getFileInfoFromVfs_ : Any = js.native
    
    /* private */ var getFileInfo_ : Any = js.native
    
    def getUploadedFiles(uploadId: String): js.Array[typings.nginstackWebFramework.uploadedFileMod.^] = js.native
    
    def handleUploadRequest(uploadId: String, request: Request): js.Array[FileInfoUpload] = js.native
    
    /* private */ var isAMetadataFile_ : Any = js.native
    
    /* private */ var lobStorage_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    /* private */ var openManifest_ : Any = js.native
    
    def purgeExpiredFiles(): Unit = js.native
    
    /* private */ var saveManifest_ : Any = js.native
    
    def tryGetDownloadFile(downloadId: String): typings.nginstackWebFramework.downloadFileMod.^ = js.native
    
    /* private */ var tryOpenManifest_ : Any = js.native
    
    /* private */ var unionFS_ : Any = js.native
    
    /* private */ var virtualFS_ : Any = js.native
  }
  
  type Request = typings.nginstackEngine.httpRequestMod.^
}
