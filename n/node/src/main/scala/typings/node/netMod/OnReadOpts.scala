package typings.node.netMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnReadOpts extends js.Object {
  var buffer: Uint8Array | js.Function0[Uint8Array] = js.native
  /**
    * This function is called for every chunk of incoming data.
    * Two arguments are passed to it: the number of bytes written to buffer and a reference to buffer.
    * Return false from this function to implicitly pause() the socket.
    */
  def callback(bytesWritten: Double, buf: Uint8Array): Boolean = js.native
}

object OnReadOpts {
  @scala.inline
  def apply(buffer: Uint8Array | js.Function0[Uint8Array], callback: (Double, Uint8Array) => Boolean): OnReadOpts = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback))
    __obj.asInstanceOf[OnReadOpts]
  }
  @scala.inline
  implicit class OnReadOptsOps[Self <: OnReadOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBufferFunction0(value: () => Uint8Array): Self = this.set("buffer", js.Any.fromFunction0(value))
    @scala.inline
    def setBuffer(value: Uint8Array | js.Function0[Uint8Array]): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: (Double, Uint8Array) => Boolean): Self = this.set("callback", js.Any.fromFunction2(value))
  }
  
}

