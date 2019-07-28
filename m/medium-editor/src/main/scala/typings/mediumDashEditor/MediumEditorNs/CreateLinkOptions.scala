package typings.mediumDashEditor.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLinkOptions extends js.Object {
  var buttonClass: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var value: String
}

object CreateLinkOptions {
  @scala.inline
  def apply(value: String, buttonClass: String = null, target: String = null): CreateLinkOptions = {
    val __obj = js.Dynamic.literal(value = value)
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[CreateLinkOptions]
  }
}

