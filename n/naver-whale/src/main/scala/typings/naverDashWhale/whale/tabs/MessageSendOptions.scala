package typings.naverDashWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSendOptions extends js.Object {
  /** Optional. Send a message to a specific frame identified by frameId instead of all frames in the tab. */
  var frameId: js.UndefOr[Double] = js.undefined
}

object MessageSendOptions {
  @scala.inline
  def apply(frameId: Int | Double = null): MessageSendOptions = {
    val __obj = js.Dynamic.literal()
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSendOptions]
  }
}

