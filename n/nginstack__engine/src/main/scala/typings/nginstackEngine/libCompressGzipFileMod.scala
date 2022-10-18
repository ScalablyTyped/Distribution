package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompressGzipFileMod {
  
  inline def apply(fileName: String, mode: String, level: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(fileName.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compress/GzipFile", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GzipFile {
    def this(fileName: String, mode: String, level: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/compress/GzipFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/compress/GzipFile", "BEST_COMPRESSION")
  @js.native
  val BEST_COMPRESSION: Double = js.native
  
  @JSImport("@nginstack/engine/lib/compress/GzipFile", "BEST_SPEED")
  @js.native
  val BEST_SPEED: Double = js.native
  
  @JSImport("@nginstack/engine/lib/compress/GzipFile", "DEFAULT_COMPRESSION")
  @js.native
  val DEFAULT_COMPRESSION: Double = js.native
  
  @JSImport("@nginstack/engine/lib/compress/GzipFile", "NO_COMPRESSION")
  @js.native
  val NO_COMPRESSION: Double = js.native
  
  @js.native
  trait GzipFile extends StObject {
    
    def clear(): Unit = js.native
    
    def close(): Unit = js.native
    
    def flush(): Unit = js.native
    
    var position: Double = js.native
    
    def read(): String = js.native
    def read(size: Double): String = js.native
    
    def readln(): Unit = js.native
    
    var size: Double = js.native
    
    def write(content: String): Unit = js.native
    
    def writeln(content: String): Unit = js.native
  }
}
