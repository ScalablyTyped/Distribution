package typings.nginstackEngine

import typings.nginstackEngine.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileStorageMod {
  
  inline def apply(classKey: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/file-storage/FileStorage", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FileStorage {
    def this(classKey: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/file-storage/FileStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object StorageKind {
    
    @JSImport("@nginstack/engine/lib/file-storage/FileStorage", "StorageKind.LOB")
    @js.native
    val LOB: String = js.native
    
    @JSImport("@nginstack/engine/lib/file-storage/FileStorage", "StorageKind.VFS")
    @js.native
    val VFS: String = js.native
  }
  type StorageKind = String
  
  type DBKey = typings.nginstackEngine.dbkeyMod.^
  
  @js.native
  trait FileStorage extends StObject {
    
    var accept: js.Array[String] = js.native
    
    /* private */ var accept_ : Any = js.native
    
    def addFile(originalFileName: String, content: String, attributes: Any): Double = js.native
    def addFile(originalFileName: String, content: typings.nginstackEngine.fileMod.^, attributes: Any): Double = js.native
    def addFile(originalFileName: String, content: typings.nginstackEngine.memoryStreamMod.^, attributes: Any): Double = js.native
    
    /* private */ var attributeNames_ : Any = js.native
    
    /* private */ var classKey_ : Any = js.native
    
    /* private */ var dataRel_ : Any = js.native
    
    var fileFieldName: String = js.native
    
    /* private */ var fileFieldName_ : Any = js.native
    
    /* private */ var fileInfos_ : Any = js.native
    
    def findFileByName(fileName: String): Any = js.native
    
    def findLinkedFiles(key: Double): js.Array[Any] = js.native
    def findLinkedFiles(key: Double, filters: Any): js.Array[Any] = js.native
    def findLinkedFiles(key: DBKey): js.Array[Any] = js.native
    def findLinkedFiles(key: DBKey, filters: Any): js.Array[Any] = js.native
    
    def formatUniqueFileName(originalFileName: String, attributes: Any): String = js.native
    
    def getExtraFileAttributes(fileKey: Double): Any = js.native
    
    def getFileAttributes(fileKey: Double): Any = js.native
    
    def getFileSize(fileKey: Double): String = js.native
    
    def getLinkedFilesCount(key: Double): Double = js.native
    def getLinkedFilesCount(key: DBKey): Double = js.native
    
    def getLinkedFilesSize(key: Double): Double = js.native
    def getLinkedFilesSize(key: DBKey): Double = js.native
    
    def hasViewPermission(fileKey: Double, userKey: Double): String = js.native
    
    var linkFieldName: String = js.native
    
    /* private */ var linkFieldName_ : Any = js.native
    
    def linkFile(fileKey: Double, recordKey: Double): Unit = js.native
    
    var linkedTableName: String = js.native
    
    /* private */ var linkedTableName_ : Any = js.native
    
    var maxFileSize: Double = js.native
    
    /* private */ var maxFileSize_ : Any = js.native
    
    var maxFiles: Double = js.native
    
    /* private */ var maxFiles_ : Any = js.native
    
    var maxTotalSize: Double = js.native
    
    /* private */ var maxTotalSize_ : Any = js.native
    
    def relationshipExists(fileKey: Double, targetKey: Double): Boolean = js.native
    
    var storageClassKey: Double = js.native
    
    /* private */ var storageClassKey_ : Any = js.native
    
    var storageKind: StorageKind = js.native
    
    /* private */ var storageKind_ : Any = js.native
    
    /* private */ var storage_ : Any = js.native
    
    /* private */ var tryGetFileInfo_ : Any = js.native
    
    def tryGetFileName(fileKey: Double): String = js.native
    
    def tryGetFileUrl(fileKey: Double): String = js.native
    
    def updateExtraFileAttributes(fileKey: Double, attributes: Any): Unit = js.native
    def updateExtraFileAttributes(fileKey: Double, attributes: Any, originalName: String): Unit = js.native
    
    def updateFile(fileKey: Double, content: String): Unit = js.native
    def updateFile(fileKey: Double, content: String, options: Attributes): Unit = js.native
    def updateFile(fileKey: Double, content: typings.nginstackEngine.fileMod.^): Unit = js.native
    def updateFile(fileKey: Double, content: typings.nginstackEngine.fileMod.^, options: Attributes): Unit = js.native
    def updateFile(fileKey: Double, content: typings.nginstackEngine.memoryStreamMod.^): Unit = js.native
    def updateFile(fileKey: Double, content: typings.nginstackEngine.memoryStreamMod.^, options: Attributes): Unit = js.native
    
    def updateFileAttributes(fileKey: Double, attributes: Any): Unit = js.native
    def updateFileAttributes(fileKey: Double, attributes: Any, originalName: String): Unit = js.native
  }
}
