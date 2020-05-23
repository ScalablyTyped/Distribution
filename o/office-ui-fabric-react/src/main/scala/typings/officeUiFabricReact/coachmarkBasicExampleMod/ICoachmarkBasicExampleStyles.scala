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
  def apply(
    buttonContainer: js.UndefOr[Null | IStyle] = js.undefined,
    dropdownContainer: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): ICoachmarkBasicExampleStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buttonContainer)) __obj.updateDynamic("buttonContainer")(buttonContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(dropdownContainer)) __obj.updateDynamic("dropdownContainer")(dropdownContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkBasicExampleStyles]
  }
}

