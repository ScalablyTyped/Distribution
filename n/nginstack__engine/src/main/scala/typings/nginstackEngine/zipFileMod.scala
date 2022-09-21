package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipFileMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compress/ZipFile", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ZipFile
  @JSImport("@nginstack/engine/lib/compress/ZipFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ZipFile extends StObject {
    
    def close(): Unit = js.native
    
    def extract(path: String, pathToExtract: String): Unit = js.native
    
    def extractAll(path: String): Unit = js.native
    
    def getFileNames(): js.Array[Any] = js.native
    
    def open(path: String, mode: String): Unit = js.native
    
    def write(paths: String): Unit = js.native
    def write(paths: js.Array[Any]): Unit = js.native
    
    def writeString(string: String, fileName: String): Unit = js.native
  }
}
