package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesGridGridDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGridProps extends js.Object {
  /**
       * The number of columns
       */
  var columnCount: scala.Double
  /**
       * Gets the component ref.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IGrid]] = js.undefined
  /**
       * Optional, class name for the FocusZone container for the grid
       * @deprecated Use `styles` and `IGridStyles` to define a styling for the focus zone container with
       * focusedContainer property.
       */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true do not contain the grid inside of a FocusZone.
       * If false contain the grid inside of a FocusZone.
       */
  var doNotContainWithinFocusZone: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The items to turn into a grid
       */
  var items: js.Array[_]
  /**
       * Optional, handler for when the grid should blur
       */
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * The optional position this grid is in the parent set (index in a parent menu, for example)
       */
  var positionInSet: js.UndefOr[scala.Double] = js.undefined
  /**
       * The optional size of the parent set (size of parent menu, for example)
       */
  var setSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * Boolean indicating if the focus should support circular navigation.
       * This prop is only relevant if doNotcontainWithinFocusZone is not true
       */
  var shouldFocusCircularNavigate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional styles for the component.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IGridStyleProps, IGridStyles]
  ] = js.undefined
  /**
       * Theme to apply to the component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Custom renderer for the individual items
       */
  def onRenderItem(item: js.Any, index: scala.Double): reactLib.reactMod.Global.JSXNs.Element
}

