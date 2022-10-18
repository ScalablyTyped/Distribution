package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUfsUnionFileSystemMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/ufs/UnionFileSystem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with UnionFileSystem
  @JSImport("@nginstack/engine/lib/ufs/UnionFileSystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/ufs/UnionFileSystem", "FILTER_ALL")
  @js.native
  val FILTER_ALL: Double = js.native
  
  @JSImport("@nginstack/engine/lib/ufs/UnionFileSystem", "FILTER_DIRS")
  @js.native
  val FILTER_DIRS: Double = js.native
  
  @JSImport("@nginstack/engine/lib/ufs/UnionFileSystem", "FILTER_FILES")
  @js.native
  val FILTER_FILES: Double = js.native
  
  inline def getInstance(): UnionFileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[UnionFileSystem]
  
  @js.native
  trait UnionFileSystem extends StObject {
    
    def configureWithLocalSettings(): Unit = js.native
    
    def exists(path: String): Boolean = js.native
    
    def getFileOrigin(path: String): String = js.native
    
    def getLastUpdateTimestamp(path: String): Double = js.native
    
    def isDirectory(path: String): Boolean = js.native
    
    def isFile(path: String): Boolean = js.native
    
    def list(path: String): js.Array[String] = js.native
    def list(path: String, entryFilter: Double): js.Array[String] = js.native
    
    def readFileContent(path: String): String = js.native
  }
}
