package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryStreamMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(arrayBuffer: js.typedarray.ArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].apply(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/io/MemoryStream", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with MemoryStream {
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
  }
  @JSImport("@nginstack/engine/lib/io/MemoryStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait MemoryStream extends StObject {
    
    def getMemoryBuffer(): Any = js.native
    
    def getSize(): Double = js.native
    
    var position: Any = js.native
    
    def read(): String = js.native
    def read(opt_qty: Double): String = js.native
    
    def write(content: String): Double = js.native
  }
}
