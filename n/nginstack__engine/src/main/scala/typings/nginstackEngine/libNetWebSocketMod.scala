package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetWebSocketMod {
  
  inline def apply(origin: String): Unit = ^.asInstanceOf[js.Dynamic].apply(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/net/WebSocket", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with WebSocket {
    def this(origin: String) = this()
  }
  @JSImport("@nginstack/engine/lib/net/WebSocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait WebSocket extends StObject {
    
    def close(code: Double, reason: String): Unit = js.native
    
    var lastError: String = js.native
    
    def open(url: String): Boolean = js.native
    def open(url: String, timeout: Double): Boolean = js.native
    
    def ping(payload: String): js.typedarray.ArrayBuffer = js.native
    def ping(payload: String, timeout: Double): js.typedarray.ArrayBuffer = js.native
    def ping(payload: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = js.native
    def ping(payload: js.typedarray.ArrayBuffer, timeout: Double): js.typedarray.ArrayBuffer = js.native
    
    def receiveMessage(timeout: Double): String | js.typedarray.ArrayBuffer = js.native
    
    def sendBinaryMessage(msg: String): Boolean = js.native
    def sendBinaryMessage(msg: js.typedarray.ArrayBuffer): Boolean = js.native
    
    def sendTextMessage(msg: String): Boolean = js.native
  }
}
