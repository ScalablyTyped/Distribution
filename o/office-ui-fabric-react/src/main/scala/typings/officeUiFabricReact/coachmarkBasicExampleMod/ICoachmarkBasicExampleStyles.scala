package typings.officeUiFabricReact.coachmarkBasicExampleMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoachmarkBasicExampleStyles extends js.Object {
  /**
    * The example button container
    */
  var buttonContainer: IStyle
  /**
    * The dropdown component container
    */
  var dropdownContainer: IStyle
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object ICoachmarkBasicExampleStyles {
  @scala.inline
  def apply(buttonContainer: IStyle = null, dropdownContainer: IStyle = null, root: IStyle = null): ICoachmarkBasicExampleStyles = {
    val __obj = js.Dynamic.literal()
    if (buttonContainer != null) __obj.updateDynamic("buttonContainer")(buttonContainer.asInstanceOf[js.Any])
    if (dropdownContainer != null) __obj.updateDynamic("dropdownContainer")(dropdownContainer.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkBasicExampleStyles]
  }
}

