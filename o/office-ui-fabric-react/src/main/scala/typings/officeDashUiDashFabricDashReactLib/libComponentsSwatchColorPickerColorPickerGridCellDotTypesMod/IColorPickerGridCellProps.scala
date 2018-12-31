package typings
package officeDashUiDashFabricDashReactLib.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerGridCellProps extends js.Object {
  /**
    * Width of the border that indicates a selected/hovered cell, in pixels
    * @defaultvalue 2
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Wheter or not colorOption should be rendered as a circle or square.
    */
  var circle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The CSS-compatible string to describe the color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional, if the this option should be disabled
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Height of the cell, in pixels
    * @defaultvalue 20
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Arbitrary unique string associated with this option
    */
  var id: java.lang.String
  /**
    * Index for this option
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Item to render
    */
  var item: IColorCellProps
  /**
    * The label for this item.
    * Visible text if this item is a header,
    * tooltip if is this item is normal
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The on click handler
    */
  var onClick: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.undefined
  /**
    * Optional, the onFocus handler
    */
  var onFocus: js.UndefOr[js.Function1[/* item */ IColorCellProps, scala.Unit]] = js.undefined
  /**
    * Optional, the onHover handler
    */
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[IColorCellProps], scala.Unit]] = js.undefined
  /**
    * Optional, onkeydown handler
    */
  var onKeyDown: js.UndefOr[
    js.Function1[
      /* ev */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLButtonElement], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Optional, mouseEnter handler.
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Optional, mouseLeave handler
    */
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Optional, mouseMove handler
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseMove: js.UndefOr[
    js.Function1[
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
    * Optional, onWheel handler
    */
  var onWheel: js.UndefOr[
    js.Function1[
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Optional, if the cell is currently selected
    */
  var selected: scala.Boolean
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IColorPickerGridCellStyleProps, IColorPickerGridCellStyles]
  ] = js.undefined
  /**
    * The theme object to use for styling.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * Width of the cell, in pixels
    * @defaultvalue 20
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

