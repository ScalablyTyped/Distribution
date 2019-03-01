package typings
package nodeLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConstructorOpts extends js.Object {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var fd: js.UndefOr[scala.Double] = js.undefined
  var readable: js.UndefOr[scala.Boolean] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object SocketConstructorOpts {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    fd: scala.Int | scala.Double = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): SocketConstructorOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[SocketConstructorOpts]
  }
}

