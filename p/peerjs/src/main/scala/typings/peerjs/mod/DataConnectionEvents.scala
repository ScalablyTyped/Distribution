package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataConnectionEvents extends StObject {
  
  /**
    * Emitted when data is received from the remote peer.
    */
  def data(data: Any): Unit
  
  /**
    * Emitted when the connection is established and ready-to-use.
    */
  def open(): Unit
}
object DataConnectionEvents {
  
  inline def apply(data: Any => Unit, open: () => Unit): DataConnectionEvents = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction1(data), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DataConnectionEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataConnectionEvents] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any => Unit): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
