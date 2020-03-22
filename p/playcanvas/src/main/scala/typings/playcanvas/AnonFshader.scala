package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFshader extends js.Object {
  var attributes: js.Any
  var fshader: String
  var useTransformFeedback: js.UndefOr[Boolean] = js.undefined
  var vshader: String
}

object AnonFshader {
  @scala.inline
  def apply(
    attributes: js.Any,
    fshader: String,
    vshader: String,
    useTransformFeedback: js.UndefOr[Boolean] = js.undefined
  ): AnonFshader = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fshader = fshader.asInstanceOf[js.Any], vshader = vshader.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransformFeedback)) __obj.updateDynamic("useTransformFeedback")(useTransformFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFshader]
  }
}

