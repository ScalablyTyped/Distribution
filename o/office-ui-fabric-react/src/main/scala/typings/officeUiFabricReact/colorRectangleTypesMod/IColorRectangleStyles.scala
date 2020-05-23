package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorRectangleStyles extends js.Object {
  /**
    * Style set for the dark-colored rectangle.
    */
  var dark: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for a hidden detailed description for screen reader users.
    */
  var description: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the light-colored rectangle.
    */
  var light: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Style set for the draggable thumb element.
    */
  var thumb: js.UndefOr[IStyle] = js.undefined
}

object IColorRectangleStyles {
  @scala.inline
  def apply(
    dark: js.UndefOr[Null | IStyle] = js.undefined,
    description: js.UndefOr[Null | IStyle] = js.undefined,
    light: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    thumb: js.UndefOr[Null | IStyle] = js.undefined
  ): IColorRectangleStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dark)) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb)) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorRectangleStyles]
  }
}

