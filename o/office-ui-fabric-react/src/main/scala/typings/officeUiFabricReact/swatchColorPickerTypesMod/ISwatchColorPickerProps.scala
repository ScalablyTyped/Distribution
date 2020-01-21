package typings.officeUiFabricReact.swatchColorPickerTypesMod

import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorCellProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyleProps
import typings.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellStyles
import typings.officeUiFabricReact.officeUiFabricReactStrings.circle
import typings.officeUiFabricReact.officeUiFabricReactStrings.square
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwatchColorPickerProps extends js.Object {
  /**
    * Position this grid is in the parent set (index in a parent menu, for example)
    */
  var ariaPosInSet: js.UndefOr[Double] = js.undefined
  /**
    * Size of the parent set (size of parent menu, for example)
    */
  var ariaSetSize: js.UndefOr[Double] = js.undefined
  /**
    * Width of the border indicating a hovered/selected cell, in pixels
    * @defaultvalue If `cellWidth` is less than 24px, then default value is 2px. Otherwise it defaults to 4px.
    */
  var cellBorderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Height of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellHeight: js.UndefOr[Double] = js.undefined
  /**
    * The distance between cells, in pixels
    * @defaultvalue 10
    */
  var cellMargin: js.UndefOr[Double] = js.undefined
  /**
    * The shape of the color cells.
    * @default 'circle'
    */
  var cellShape: js.UndefOr[circle | square] = js.undefined
  /**
    * Width of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellWidth: js.UndefOr[Double] = js.undefined
  /**
    * Additional class name to provide on the root element
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The color cells that will be made available to the user.
    *
    * Note: When the reference to this prop changes, regardless of how many color cells change,
    * all of the color cells will be re-rendered (potentially bad perf) because we memoize
    * based on this prop's reference.
    */
  var colorCells: js.Array[IColorCellProps]
  /**
    * Number of columns for the swatch color picker
    */
  var columnCount: Double
  /**
    * Whether the control is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If false (the default), the grid is contained inside a FocusZone.
    * If true, a FocusZone is not used.
    * @default false
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to update focus when a cell is hovered.
    * @defaultvalue false
    */
  var focusOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Styles for the grid cells.
    */
  var getColorGridCellStyles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.undefined
  /**
    * ID for the swatch color picker's root element. Also used as a prefix for the IDs of color cells.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the SwatchColorPicker is fully controlled.
    * When true, the component will not set its internal state to track the selected color.
    * Instead, the parent component will be responsible for handling state in the callbacks like
    * `onColorChanged`.
    *
    * NOTE: This property is a temporary workaround to force the component to be fully controllable
    * without breaking existing behavior
    */
  var isControlled: js.UndefOr[Boolean] = js.undefined
  /**
    * Selector to focus on mouse leave. Should only be used in conjunction with `focusOnHover`.
    */
  var mouseLeaveParentSelector: js.UndefOr[String] = js.undefined
  /**
    * Callback for when the user focuses a color cell.
    * If `id` and `color` are unspecified, cells are no longer being focused.
    */
  var onCellFocused: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * Callback for when the user hovers over a color cell.
    * If `id` and `color` are unspecified, cells are no longer being hovered.
    */
  var onCellHovered: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * Callback for when the user changes the color.
    * If `id` and `color` are unspecified, there is no selected cell.
    * (e.g. the user executed the currently selected cell to unselect it)
    */
  var onColorChanged: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * @deprecated Use `ariaPosInSet`
    */
  var positionInSet: js.UndefOr[Double] = js.undefined
  /**
    * The ID of color cell that is currently selected
    */
  var selectedId: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Use `ariaSetSize`
    */
  var setSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
    * Only relevant if `doNotContainWithinFocusZone` is not true.
    * @defaultvalue true
    */
  var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * Styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]] = js.undefined
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ISwatchColorPickerProps {
  @scala.inline
  def apply(
    colorCells: js.Array[IColorCellProps],
    columnCount: Double,
    ariaPosInSet: Int | Double = null,
    ariaSetSize: Int | Double = null,
    cellBorderWidth: Int | Double = null,
    cellHeight: Int | Double = null,
    cellMargin: Int | Double = null,
    cellShape: circle | square = null,
    cellWidth: Int | Double = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    focusOnHover: js.UndefOr[Boolean] = js.undefined,
    getColorGridCellStyles: IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles] = null,
    id: String = null,
    isControlled: js.UndefOr[Boolean] = js.undefined,
    mouseLeaveParentSelector: String = null,
    onCellFocused: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit = null,
    onCellHovered: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit = null,
    onColorChanged: (/* id */ js.UndefOr[String], /* color */ js.UndefOr[String]) => Unit = null,
    positionInSet: Int | Double = null,
    selectedId: String = null,
    setSize: Int | Double = null,
    shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles] = null,
    theme: ITheme = null
  ): ISwatchColorPickerProps = {
    val __obj = js.Dynamic.literal(colorCells = colorCells.asInstanceOf[js.Any], columnCount = columnCount.asInstanceOf[js.Any])
    if (ariaPosInSet != null) __obj.updateDynamic("ariaPosInSet")(ariaPosInSet.asInstanceOf[js.Any])
    if (ariaSetSize != null) __obj.updateDynamic("ariaSetSize")(ariaSetSize.asInstanceOf[js.Any])
    if (cellBorderWidth != null) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.asInstanceOf[js.Any])
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellMargin != null) __obj.updateDynamic("cellMargin")(cellMargin.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotContainWithinFocusZone)) __obj.updateDynamic("doNotContainWithinFocusZone")(doNotContainWithinFocusZone.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnHover)) __obj.updateDynamic("focusOnHover")(focusOnHover.asInstanceOf[js.Any])
    if (getColorGridCellStyles != null) __obj.updateDynamic("getColorGridCellStyles")(getColorGridCellStyles.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled.asInstanceOf[js.Any])
    if (mouseLeaveParentSelector != null) __obj.updateDynamic("mouseLeaveParentSelector")(mouseLeaveParentSelector.asInstanceOf[js.Any])
    if (onCellFocused != null) __obj.updateDynamic("onCellFocused")(js.Any.fromFunction2(onCellFocused))
    if (onCellHovered != null) __obj.updateDynamic("onCellHovered")(js.Any.fromFunction2(onCellHovered))
    if (onColorChanged != null) __obj.updateDynamic("onColorChanged")(js.Any.fromFunction2(onColorChanged))
    if (positionInSet != null) __obj.updateDynamic("positionInSet")(positionInSet.asInstanceOf[js.Any])
    if (selectedId != null) __obj.updateDynamic("selectedId")(selectedId.asInstanceOf[js.Any])
    if (setSize != null) __obj.updateDynamic("setSize")(setSize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusCircularNavigate)) __obj.updateDynamic("shouldFocusCircularNavigate")(shouldFocusCircularNavigate.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISwatchColorPickerProps]
  }
}

