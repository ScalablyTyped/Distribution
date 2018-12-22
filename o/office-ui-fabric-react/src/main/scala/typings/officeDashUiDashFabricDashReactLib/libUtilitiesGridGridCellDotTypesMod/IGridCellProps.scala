package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesGridGridCellDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGridCellProps[T] extends js.Object {
  /**
       * Optional, the CSS class used for when the cell is disabled
       */
  var cellDisabledStyle: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Optional, the CSS class used for when the cell is selected
       */
  var cellIsSelectedStyle: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Optional, className(s) to apply
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional, if the this option should be diabled
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Method to provide the classnames to style a button.
       * The default value for this prop is the getClassnames func
       * defined in BaseButton.classnames.
       */
  var getClassNames: js.UndefOr[
    js.Function9[
      /* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, 
      /* className */ java.lang.String, 
      /* variantClassName */ java.lang.String, 
      /* iconClassName */ js.UndefOr[java.lang.String], 
      /* menuIconClassName */ js.UndefOr[java.lang.String], 
      /* disabled */ scala.Boolean, 
      /* checked */ scala.Boolean, 
      /* expanded */ scala.Boolean, 
      /* isSplit */ js.UndefOr[scala.Boolean], 
      officeDashUiDashFabricDashReactLib.libComponentsButtonBaseButtonDotClassNamesMod.IButtonClassNames
    ]
  ] = js.undefined
  /**
       * Arbitrary unique string associated with this option
       */
  var id: java.lang.String
  /**
       * Index for this option
       */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
       * The option that will be made available to the user
       */
  var item: T
  /**
       * The label for this item.
       * Visible text if this item is a header,
       * tooltip if is this item is normal
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The on click handler
       */
  var onClick: js.UndefOr[js.Function1[/* item */ T, scala.Unit]] = js.undefined
  /**
       * Optional, the onFocus handler
       */
  var onFocus: js.UndefOr[js.Function1[/* item */ T, scala.Unit]] = js.undefined
  /**
       * Optional, the onHover handler
       */
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], scala.Unit]] = js.undefined
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
       * The accessible role for this option
       */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional, if the cell is currently selected
       */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The render callback to handle rendering the item
       */
  def onRenderItem(item: T): reactLib.reactMod.Global.JSXNs.Element
}

