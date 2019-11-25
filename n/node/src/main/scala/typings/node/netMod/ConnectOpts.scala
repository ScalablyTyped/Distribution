package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOpts extends js.Object {
  /**
    * If specified, incoming data is stored in a single buffer and passed to the supplied callback when data arrives on the socket.
    * Note: this will cause the streaming functionality to not provide any data, however events like 'error', 'end', and 'close' will
    * still be emitted as normal and methods like pause() and resume() will also behave as expected.
    */
  var onread: js.UndefOr[OnReadOpts] = js.undefined
}

object ConnectOpts {
  @scala.inline
  def apply(onread: OnReadOpts = null): ConnectOpts = {
    val __obj = js.Dynamic.literal()
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOpts]
  }
}

