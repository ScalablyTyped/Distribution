package typings.peerjs.peerjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnswerOption extends js.Object {
  var sdpTransform: js.UndefOr[js.Function] = js.undefined
}

object AnswerOption {
  @scala.inline
  def apply(sdpTransform: js.Function = null): AnswerOption = {
    val __obj = js.Dynamic.literal()
    if (sdpTransform != null) __obj.updateDynamic("sdpTransform")(sdpTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnswerOption]
  }
}

