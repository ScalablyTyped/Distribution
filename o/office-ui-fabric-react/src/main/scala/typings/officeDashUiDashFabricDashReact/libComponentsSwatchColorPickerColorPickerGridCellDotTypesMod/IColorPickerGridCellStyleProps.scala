package typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
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
    borderWidth: Int | Double = null,
    circle: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    isWhite: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): IColorPickerGridCellStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isWhite)) __obj.updateDynamic("isWhite")(isWhite.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerGridCellStyleProps]
  }
}

