package typings.node.netMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnReadOpts extends js.Object {
  var buffer: Uint8Array | js.Function0[Uint8Array]
  /**
    * This function is called for every chunk of incoming data.
    * Two arguments are passed to it: the number of bytes written to buffer and a reference to buffer.
    * Return false from this function to implicitly pause() the socket.
    */
  def callback(bytesWritten: Double, buf: Uint8Array): Boolean
}

object OnReadOpts {
  @scala.inline
  def apply(buffer: Uint8Array | js.Function0[Uint8Array], callback: (Double, Uint8Array) => Boolean): OnReadOpts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback))
  
    __obj.asInstanceOf[OnReadOpts]
  }
}

