package typings
package officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwatchColorPickerProps extends js.Object {
  /**
    * Width of the border indicating a hovered/selected cell, in pixels
    * @defaultvalue 2
    */
  var cellBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Height of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The distance between cells, in pixels
    * @defaultvalue 10
    */
  var cellMargin: js.UndefOr[scala.Double] = js.undefined
  /**
    * The shape of the color cells, defaults to circle
    */
  var cellShape: js.UndefOr[
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.circle | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.square
  ] = js.undefined
  /**
    * Width of an individual cell, in pixels
    * @defaultvalue 20
    */
  var cellWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Additional class name to provide on the root element
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The color cells that will be made available to the user
    */
  var colorCells: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorCellProps
  ]
  /**
    * the number of columns for the swatch color picker
    */
  var columnCount: scala.Double
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ISwatchColorPicker]] = js.undefined
  /**
    * Is this swatch color picker disabled?
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true do not contain the grid inside of a FocusZone.
    * If false contain the grid inside of a FocusZone.
    */
  var doNotContainWithinFocusZone: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional, whether to update focus when a cell is hovered.
    * @defaultvalue false
    */
  var focusOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional styles for the component.
    */
  var getColorGridCellStyles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[
      officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellStyleProps, 
      officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellStyles
    ]
  ] = js.undefined
  /**
    * The id for the swatch color picker
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Selector to focus on mouseLeave
    * SHOULD ONLY BE USED IN CONJUNCTION WITH focusOnHover
    */
  var mouseLeaveParentSelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback issued when the user focuses a color cell.
    * Note, if no id or color is given, cells are not longer being focused
    */
  var onCellFocused: js.UndefOr[
    js.Function2[
      /* id */ js.UndefOr[java.lang.String], 
      /* color */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback issued when the user hovers over a color cell.
    * Note, if no id or color is given, cells are not longer being hovered
    */
  var onCellHovered: js.UndefOr[
    js.Function2[
      /* id */ js.UndefOr[java.lang.String], 
      /* color */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback issued when the user changes the color.
    * Note, if no id or color is given, there is no selected cell
    * (e.g. the user executed the currently selected cell to unselect it)
    */
  var onColorChanged: js.UndefOr[
    js.Function2[
      /* id */ js.UndefOr[java.lang.String], 
      /* color */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The optional position this grid is in the parent set (index in a parent menu, for example)
    */
  var positionInSet: js.UndefOr[scala.Double] = js.undefined
  /**
    * The id of color cell that is currently selected
    */
  var selectedId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The optional size of the parent set (size of parent menu, for example)
    */
  var setSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should focus cycle to the beginning of once the user navigates past the end (and vice versa).
    * This prop is only relevant if doNotcontainWithinFocusZone is not true
    * @defaultvalue true
    */
  var shouldFocusCircularNavigate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ISwatchColorPickerStyleProps, ISwatchColorPickerStyles]
  ] = js.undefined
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

