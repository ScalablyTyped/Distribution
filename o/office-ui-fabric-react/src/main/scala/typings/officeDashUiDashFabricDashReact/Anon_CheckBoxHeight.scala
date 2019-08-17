package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckBoxHeight extends js.Object {
  /**
    * Custom height/width for the checkbox.
    * @defaultvalue '18px'
    * @deprecated Use `height`
    */
  var checkBoxHeight: js.UndefOr[String] = js.undefined
  /**
    * Custom height/width for the checkbox.
    * @defaultvalue '18px'
    */
  var height: js.UndefOr[String] = js.undefined
}

object Anon_CheckBoxHeight {
  @scala.inline
  def apply(checkBoxHeight: String = null, height: String = null): Anon_CheckBoxHeight = {
    val __obj = js.Dynamic.literal()
    if (checkBoxHeight != null) __obj.updateDynamic("checkBoxHeight")(checkBoxHeight)
    if (height != null) __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[Anon_CheckBoxHeight]
  }
}

