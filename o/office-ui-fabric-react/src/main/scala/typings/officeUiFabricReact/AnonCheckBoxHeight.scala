package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckBoxHeight extends js.Object {
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

object AnonCheckBoxHeight {
  @scala.inline
  def apply(checkBoxHeight: String = null, height: String = null): AnonCheckBoxHeight = {
    val __obj = js.Dynamic.literal()
    if (checkBoxHeight != null) __obj.updateDynamic("checkBoxHeight")(checkBoxHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckBoxHeight]
  }
}

