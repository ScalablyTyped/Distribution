package typings.peerjs.mod

import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConnectionEvents extends StObject {
  
  /**
    * Emitted when a connection to the PeerServer is established.
    */
  def stream(stream: MediaStream): Unit
}
object MediaConnectionEvents {
  
  inline def apply(stream: MediaStream => Unit): MediaConnectionEvents = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[MediaConnectionEvents]
  }
  
  extension [Self <: MediaConnectionEvents](x: Self) {
    
    inline def setStream(value: MediaStream => Unit): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
