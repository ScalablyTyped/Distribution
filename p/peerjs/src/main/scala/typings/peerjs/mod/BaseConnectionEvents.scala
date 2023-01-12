package typings.peerjs.mod

import typings.std.RTCIceConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseConnectionEvents extends StObject {
  
  /**
    * Emitted when either you or the remote peer closes the connection.
    */
  def close(): Unit
  
  def error(error: js.Error): Unit
  
  def iceStateChanged(state: RTCIceConnectionState): Unit
}
object BaseConnectionEvents {
  
  inline def apply(close: () => Unit, error: js.Error => Unit, iceStateChanged: RTCIceConnectionState => Unit): BaseConnectionEvents = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), error = js.Any.fromFunction1(error), iceStateChanged = js.Any.fromFunction1(iceStateChanged))
    __obj.asInstanceOf[BaseConnectionEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseConnectionEvents] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setIceStateChanged(value: RTCIceConnectionState => Unit): Self = StObject.set(x, "iceStateChanged", js.Any.fromFunction1(value))
  }
}
