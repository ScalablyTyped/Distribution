package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetSocketMod {
  
  inline def apply(remoteHost: String, remotePort: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(remoteHost.asInstanceOf[js.Any], remotePort.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/net/Socket", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Socket {
    def this(remoteHost: String, remotePort: Double) = this()
  }
  @JSImport("@nginstack/engine/lib/net/Socket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Socket extends StObject {
    
    def close(): Unit = js.native
    
    var connected: Boolean = js.native
    
    var localAddress: String = js.native
    
    var localHost: String = js.native
    
    var localPort: Double = js.native
    
    def open(): Unit = js.native
    
    def peek(length: Double): String = js.native
    def peek(length: Double, timeout: Double): String = js.native
    
    def read(length: Double): String = js.native
    def read(length: Double, timeout: Double): String = js.native
    
    def readln(timeout: Double): String = js.native
    
    var remoteAddress: Any = js.native
    
    var remoteHost: Any = js.native
    
    var remotePort: Any = js.native
    
    def write(content: String): Unit = js.native
    def write(content: js.typedarray.ArrayBuffer): Unit = js.native
  }
}
