package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/SwatchColorPicker/ColorPickerGridCell.types.IColorPickerGridCellProps> */
trait PartialIColorPickerGridCe extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.undefined
  var circle: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idPrefix: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var item: js.UndefOr[IColorCellProps] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLButtonElement], scala.Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], scala.Unit]
  ] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.undefined
  var onWheel: js.UndefOr[
    js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], scala.Unit]
  ] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialIColorPickerGridCe {
  @scala.inline
  def apply(
    borderWidth: js.UndefOr[Double] = js.undefined,
    circle: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    idPrefix: String = null,
    index: js.UndefOr[Double] = js.undefined,
    item: IColorCellProps = null,
    label: String = null,
    onClick: /* item */ IColorCellProps => scala.Unit = null,
    onFocus: /* item */ IColorCellProps => scala.Unit = null,
    onHover: /* item */ js.UndefOr[IColorCellProps] => scala.Unit = null,
    onKeyDown: /* ev */ KeyboardEvent[HTMLButtonElement] => scala.Unit = null,
    onMouseEnter: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean = null,
    onMouseLeave: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean = null,
    onWheel: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => scala.Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles] = null,
    theme: ITheme = null,
    width: js.UndefOr[Double] = js.undefined
  ): PartialIColorPickerGridCe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIColorPickerGridCe]
  }
}

