package typings.netKeepalive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandle extends js.Object {
  var _handle: AnonFd
}

object AnonHandle {
  @scala.inline
  def apply(_handle: AnonFd): AnonHandle = {
    val __obj = js.Dynamic.literal(_handle = _handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandle]
  }
}

