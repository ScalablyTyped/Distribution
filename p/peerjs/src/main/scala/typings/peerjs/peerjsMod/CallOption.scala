package typings.peerjs.peerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallOption extends js.Object {
  var metadata: js.UndefOr[js.Any] = js.undefined
  var sdpTransform: js.UndefOr[js.Function] = js.undefined
}

object CallOption {
  @scala.inline
  def apply(metadata: js.Any = null, sdpTransform: js.Function = null): CallOption = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (sdpTransform != null) __obj.updateDynamic("sdpTransform")(sdpTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOption]
  }
}

