package typings.nginstackEngine

import typings.nginstackEngine.anon.BaseDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualFileSystemMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/vfs/VirtualFileSystem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VirtualFileSystem
  @JSImport("@nginstack/engine/lib/vfs/VirtualFileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): VirtualFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[VirtualFileSystem]
  
  type DBKey = typings.nginstackEngine.dbkeyMod.^
  
  type File = typings.nginstackEngine.fileMod.^
  
  type MemoryStream = typings.nginstackEngine.memoryStreamMod.^
  
  @js.native
  trait VirtualFileSystem extends StObject {
    
    def commitTransaction(): Unit = js.native
    
    def createDirectory(name: String, parent: Double): Double = js.native
    
    def createFile(fileName: String, content: String): Double = js.native
    def createFile(fileName: String, content: String, options: BaseDirectory): Double = js.native
    def createFile(fileName: String, content: File): Double = js.native
    def createFile(fileName: String, content: File, options: BaseDirectory): Double = js.native
    def createFile(fileName: String, content: MemoryStream): Double = js.native
    def createFile(fileName: String, content: MemoryStream, options: BaseDirectory): Double = js.native
    
    def deleteDirectory(key: Double): Unit = js.native
    
    def deleteFile(key: Double): Unit = js.native
    
    def deleteXFileAttributes(fileKey: Double, attributeNames: js.Array[Any]): Unit = js.native
    
    def directoryExists(path: String): Double = js.native
    
    def fileExists(path: String): Double = js.native
    def fileExists(path: String, opt_baseDirectory: Double): Double = js.native
    
    def forceDirectories(path: String): Double = js.native
    
    def formatFilePath(name: String, directory: Double): String = js.native
    def formatFilePath(name: String, directory: DBKey): String = js.native
    
    def getDirectoryPath(key: Double): String = js.native
    
    def getFileContent(key: Double): String = js.native
    def getFileContent(key: Double, allowNullMimeType: Boolean): String = js.native
    
    def getFilePath(key: Double): String = js.native
    def getFilePath(key: DBKey): String = js.native
    
    def getFileSize(key: Double): Double = js.native
    def getFileSize(key: DBKey): Double = js.native
    
    def getXFileAttributes(fileKey: Double): Any = js.native
    
    def moveDirectory(key: Double, newParent: Double): Unit = js.native
    
    def moveFile(key: Double, destinationDir: Double): Unit = js.native
    
    def renameDirectory(key: Double, newName: String): Unit = js.native
    
    def renameFile(key: Double, newName: String): Unit = js.native
    
    def rollbackTransaction(): Unit = js.native
    
    def setFileContent(key: Double, content: String): Unit = js.native
    def setFileContent(key: Double, content: String, opt_contentType: String): Unit = js.native
    def setFileContent(key: Double, content: File): Unit = js.native
    def setFileContent(key: Double, content: File, opt_contentType: String): Unit = js.native
    def setFileContent(key: Double, content: MemoryStream): Unit = js.native
    def setFileContent(key: Double, content: MemoryStream, opt_contentType: String): Unit = js.native
    
    def setXFileAttributes(fileKey: Double, attributes: Any): Unit = js.native
    
    def startTransaction(): Unit = js.native
  }
}
