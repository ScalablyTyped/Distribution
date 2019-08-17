package typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.react.NativeMouseEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerGridCellProps extends js.Object {
  /**
    * Width of the border that indicates a selected/hovered cell, in pixels.
    * If `cellWidth` is less than 24px, then default value is 2px. Otherwise it defaults to 4px.
    * @defaultvalue 2
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Wheter or not colorOption should be rendered as a circle or square.
    */
  var circle: js.UndefOr[Boolean] = js.undefined
  /**
    * The CSS-compatible string to describe the color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Optional, if the this option should be disabled
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of the cell, in pixels
    * @defaultvalue 20
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Arbitrary unique string associated with this option
    */
  var id: String
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * Item to render
    */
  var item: IColorCellProps
  /**
    * The label for this item.
    * Visible text if this item is a header,
    * tooltip if is this item is normal
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The on click handler
    */
  var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.undefined
  /**
    * Optional, the onFocus handler
    */
  var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, Unit]] = js.undefined
  /**
    * Optional, the onHover handler
    */
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], Unit]] = js.undefined
  /**
    * Optional, onkeydown handler
    */
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLButtonElement], Unit]] = js.undefined
  /**
    * Optional, mouseEnter handler.
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
  /**
    * Optional, mouseLeave handler
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
  /**
    * Optional, mouseMove handler
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
  /**
    * Optional, onWheel handler
    */
  var onWheel: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.undefined
  /**
    * Optional, if the cell is currently selected
    */
  var selected: Boolean
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.undefined
  /**
    * The theme object to use for styling.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Width of the cell, in pixels
    * @defaultvalue 20
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IColorPickerGridCellProps {
  @scala.inline
  def apply(
    id: String,
    item: IColorCellProps,
    selected: Boolean,
    borderWidth: Int | Double = null,
    circle: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    index: Int | Double = null,
    label: String = null,
    onClick: /* item */ IColorCellProps => Unit = null,
    onFocus: /* item */ IColorCellProps => Unit = null,
    onHover: /* item */ js.UndefOr[IColorCellProps] => Unit = null,
    onKeyDown: /* ev */ KeyboardEvent[HTMLButtonElement] => Unit = null,
    onMouseEnter: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean = null,
    onMouseLeave: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    onMouseMove: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean = null,
    onWheel: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit = null,
    styles: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles] = null,
    theme: ITheme = null,
    width: Int | Double = null
  ): IColorPickerGridCellProps = {
    val __obj = js.Dynamic.literal(id = id, item = item, selected = selected)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerGridCellProps]
  }
}

