package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectOpts extends js.Object {
  /**
    * If specified, incoming data is stored in a single buffer and passed to the supplied callback when data arrives on the socket.
    * Note: this will cause the streaming functionality to not provide any data, however events like 'error', 'end', and 'close' will
    * still be emitted as normal and methods like pause() and resume() will also behave as expected.
    */
  var onread: js.UndefOr[OnReadOpts] = js.native
}

object ConnectOpts {
  @scala.inline
  def apply(): ConnectOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOpts]
  }
  @scala.inline
  implicit class ConnectOptsOps[Self <: ConnectOpts] (val x: Self) extends AnyVal {
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
    def setOnread(value: OnReadOpts): Self = this.set("onread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnread: Self = this.set("onread", js.undefined)
  }
  
}

