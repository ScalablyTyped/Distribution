package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributesFshader extends js.Object {
  var attributes: js.Any
  var fshader: String
  var useTransformFeedback: js.UndefOr[Boolean] = js.undefined
  var vshader: String
}

object AnonAttributesFshader {
  @scala.inline
  def apply(
    attributes: js.Any,
    fshader: String,
    vshader: String,
    useTransformFeedback: js.UndefOr[Boolean] = js.undefined
  ): AnonAttributesFshader = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fshader = fshader.asInstanceOf[js.Any], vshader = vshader.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransformFeedback)) __obj.updateDynamic("useTransformFeedback")(useTransformFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributesFshader]
  }
}

