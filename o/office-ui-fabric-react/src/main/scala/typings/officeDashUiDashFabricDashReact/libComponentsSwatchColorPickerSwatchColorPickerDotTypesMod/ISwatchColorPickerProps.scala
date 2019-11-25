package typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorCellProps
import typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellStyles
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.circle
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwatchColorPickerProps extends js.Object {
  /**
    * Width of the border indicating a hovered/selected cell, in pixels
    * If `cellWidth` is less than 24px, then default value is 2px. Otherwise it defaults to 4px.
    * @defaultvalue 2
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
    * The shape of the color cells, defaults to circle
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
    * Note: When the reference to this prop changes,
    * regardless of how many color cells change, all of the color cells
    * will be re-rendered (potentially bad perf.) because we memoize
    * based on this prop's reference.
    */
  var colorCells: js.Array[IColorCellProps]
  /**
    * the number of columns for the swatch color picker
    */
  var columnCount: Double
  /**
    * Is this swatch color picker disabled?
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If true do not contain the grid inside of a FocusZone.
    * If false contain the grid inside of a FocusZone.
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional, whether to update focus when a cell is hovered.
    * @defaultvalue false
    */
  var focusOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional styles for the component.
    */
  var getColorGridCellStyles: js.UndefOr[
    IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.undefined
  /**
    * The id for the swatch color picker
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the SwatchColorPicker is fully controlled.
    * When true, the component will not set its internal state to track the selected color.
    * Instead, the parent component will be responsible for handling state in the callbacks like
    * onColorChanged.
    *
    * NOTE: This property is a temporary workaround to force the component to be fully controllable
    * without breaking existing behavior
    */
  var isControlled: js.UndefOr[Boolean] = js.undefined
  /**
    * Selector to focus on mouseLeave
    * SHOULD ONLY BE USED IN CONJUNCTION WITH focusOnHover
    */
  var mouseLeaveParentSelector: js.UndefOr[String] = js.undefined
  /**
    * Callback issued when the user focuses a color cell.
    * Note, if no id or color is given, cells are not longer being focused
    */
  var onCellFocused: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * Callback issued when the user hovers over a color cell.
    * Note, if no id or color is given, cells are not longer being hovered
    */
  var onCellHovered: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * Callback issued when the user changes the color.
    * Note, if no id or color is given, there is no selected cell
    * (e.g. the user executed the currently selected cell to unselect it)
    */
  var onColorChanged: js.UndefOr[js.Function2[/* id */ js.UndefOr[String], /* color */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * The optional position this grid is in the parent set (index in a parent menu, for example)
    */
  var positionInSet: js.UndefOr[Double] = js.undefined
  /**
    * The id of color cell that is currently selected
    */
  var selectedId: js.UndefOr[String] = js.undefined
  /**
    * The optional size of the parent set (size of parent menu, for example)
    */
  var setSize: js.UndefOr[Double] = js.undefined
  /**
    * Should focus cycle to the beginning of once the user navigates past the end (and vice versa).
    * This prop is only relevant if doNotcontainWithinFocusZone is not true
    * @defaultvalue true
    */
  var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional styles for the component.
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

