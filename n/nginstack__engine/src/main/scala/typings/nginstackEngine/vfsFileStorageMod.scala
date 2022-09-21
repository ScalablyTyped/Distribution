package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vfsFileStorageMod {
  
  inline def apply(directory: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(directory.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/file-storage/VfsFileStorage", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with VfsFileStorage {
    def this(directory: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/file-storage/VfsFileStorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type File = typings.nginstackEngine.fileMod.^
  
  type MemoryStream = typings.nginstackEngine.memoryStreamMod.^
  
  @js.native
  trait VfsFileStorage extends StObject {
    
    def addFile(fileName: String, content: String): Double = js.native
    def addFile(fileName: String, content: File): Double = js.native
    def addFile(fileName: String, content: MemoryStream): Double = js.native
    
    def findFileByName(fileName: String): typings.nginstackEngine.fileInfoMod.^ = js.native
    
    def getExtraFileAttributes(fileKey: Double): Any = js.native
    
    def getFilesSize(fileKeys: js.Array[Double]): Double = js.native
    
    def setExtraFileAttributes(fileKey: Double, attributes: Any): Unit = js.native
    
    /* private */ var targetDirectory_ : Any = js.native
    
    def tryGetFileInfo(fileKey: Double): typings.nginstackEngine.fileInfoMod.^ = js.native
    
    def updateFile(fileKey: Double, content: String): Unit = js.native
    def updateFile(fileKey: Double, content: File): Unit = js.native
    def updateFile(fileKey: Double, content: MemoryStream): Unit = js.native
    
    /* private */ var vfs_ : Any = js.native
    
    /* private */ var virtualFS_ : Any = js.native
  }
}
