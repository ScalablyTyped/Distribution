package typings
package mediumDashEditorLib.MediumEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLinkOptions extends js.Object {
  var buttonClass: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object CreateLinkOptions {
  @scala.inline
  def apply(value: java.lang.String, buttonClass: java.lang.String = null, target: java.lang.String = null): CreateLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (buttonClass != null) __obj.updateDynamic("buttonClass")(buttonClass)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[CreateLinkOptions]
  }
}

