package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnReadOpts extends StObject {
  
  var buffer: js.typedarray.Uint8Array | js.Function0[js.typedarray.Uint8Array]
  
  /**
    * This function is called for every chunk of incoming data.
    * Two arguments are passed to it: the number of bytes written to buffer and a reference to buffer.
    * Return false from this function to implicitly pause() the socket.
    */
  def callback(bytesWritten: Double, buf: js.typedarray.Uint8Array): Boolean
}
object OnReadOpts {
  
  inline def apply(
    buffer: js.typedarray.Uint8Array | js.Function0[js.typedarray.Uint8Array],
    callback: (Double, js.typedarray.Uint8Array) => Boolean
  ): OnReadOpts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback))
    __obj.asInstanceOf[OnReadOpts]
  }
  
  extension [Self <: OnReadOpts](x: Self) {
    
    inline def setBuffer(value: js.typedarray.Uint8Array | js.Function0[js.typedarray.Uint8Array]): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferFunction0(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", js.Any.fromFunction0(value))
    
    inline def setCallback(value: (Double, js.typedarray.Uint8Array) => Boolean): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
  }
}
