package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputClassName extends js.Object {
  /** Optional pickerInput className */
  var inputClassName: js.UndefOr[String] = js.undefined
  /** Whether text style area is focused */
  var isFocused: js.UndefOr[Boolean] = js.undefined
}

object AnonInputClassName {
  @scala.inline
  def apply(inputClassName: String = null, isFocused: js.UndefOr[Boolean] = js.undefined): AnonInputClassName = {
    val __obj = js.Dynamic.literal()
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInputClassName]
  }
}

