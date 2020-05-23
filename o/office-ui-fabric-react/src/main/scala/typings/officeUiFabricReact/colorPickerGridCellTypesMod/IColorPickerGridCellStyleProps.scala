package typings.officeUiFabricReact.colorPickerGridCellTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerGridCellStyleProps extends js.Object {
  /**
    * The width of the border indicating a hovered or selected cell, in pixels.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Whether the svg color element should be rendered as a circle or not.
    */
  var circle: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the component is disabled or not.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The height of this cell, in pixels.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Whether the color being rendered is white or not. If it is white we show a border around it.
    */
  var isWhite: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the cell is currently selected or not.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * Theme to apply to the cell.
    */
  var theme: ITheme
  /**
    * The width of this cell, in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IColorPickerGridCellStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    borderWidth: js.UndefOr[Double] = js.undefined,
    circle: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    isWhite: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): IColorPickerGridCellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isWhite)) __obj.updateDynamic("isWhite")(isWhite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerGridCellStyleProps]
  }
}

