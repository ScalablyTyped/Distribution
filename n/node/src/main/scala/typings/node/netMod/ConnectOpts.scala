package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOpts extends StObject {
  
  /**
    * If specified, incoming data is stored in a single buffer and passed to the supplied callback when data arrives on the socket.
    * Note: this will cause the streaming functionality to not provide any data, however events like 'error', 'end', and 'close' will
    * still be emitted as normal and methods like pause() and resume() will also behave as expected.
    */
  var onread: js.UndefOr[OnReadOpts] = js.undefined
}
object ConnectOpts {
  
  inline def apply(): ConnectOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOpts]
  }
  
  extension [Self <: ConnectOpts](x: Self) {
    
    inline def setOnread(value: OnReadOpts): Self = StObject.set(x, "onread", value.asInstanceOf[js.Any])
    
    inline def setOnreadUndefined: Self = StObject.set(x, "onread", js.undefined)
  }
}
