package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputClassName extends js.Object {
  /** Optional pickerInput className */
  var inputClassName: js.UndefOr[String] = js.undefined
  /** Whether text style area is focused */
  var isFocused: js.UndefOr[Boolean] = js.undefined
}

object Anon_InputClassName {
  @scala.inline
  def apply(inputClassName: String = null, isFocused: js.UndefOr[Boolean] = js.undefined): Anon_InputClassName = {
    val __obj = js.Dynamic.literal()
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused)
    __obj.asInstanceOf[Anon_InputClassName]
  }
}

