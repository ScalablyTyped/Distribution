package typings
package officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
    * Accessibility text to be read by the screen reader when the user's
    * focus enters the command bar. The screen reader will read this text
    * after reading information about the first focusable item in the command
    * bar.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom button to be used as near and far items
    */
  var buttonAs: js.UndefOr[
    atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
    ]
  ] = js.undefined
  /**
    * Optional callback to access the ICommandBar interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ICommandBar]] = js.undefined
  /**
    * Items to render on the right side (or left, in RTL). ICommandBarItemProps extend IContextualMenuItem
    */
  var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
  /**
    * Items to render. ICommandBarItemProps extend IContextualMenuItem
    */
  var items: js.Array[ICommandBarItemProps]
  /**
    * Function callback invoked when data has been grown.
    */
  var onDataGrown: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, scala.Unit]] = js.undefined
  /**
    * Function callback invoked when data has been reduced.
    */
  var onDataReduced: js.UndefOr[js.Function1[/* movedItem */ ICommandBarItemProps, scala.Unit]] = js.undefined
  /**
    * Custom function to grow data if items are too small for the given space.
    * Return `undefined` if no more steps can be taken to avoid infinate loop.
    */
  var onGrowData: js.UndefOr[
    js.Function1[
      /* data */ officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotBaseMod.ICommandBarData, 
      officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotBaseMod.ICommandBarData
    ]
  ] = js.undefined
  /**
    * Custom function to reduce data if items do not fit in given space. Return `undefined`
    * if no more steps can be taken to avoid infinate loop.
    */
  var onReduceData: js.UndefOr[
    js.Function1[
      /* data */ officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotBaseMod.ICommandBarData, 
      officeDashUiDashFabricDashReactLib.libComponentsCommandBarCommandBarDotBaseMod.ICommandBarData
    ]
  ] = js.undefined
  /**
    * Custom button to be used as oveflow button
    */
  var overflowButtonAs: js.UndefOr[
    atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
    ]
  ] = js.undefined
  /**
    * Props to be passed to overflow button.
    * If menuProps are passed through this prop, any items provided will be prepended to the top of the existing menu.
    */
  var overflowButtonProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ] = js.undefined
  /**
    * Default items to have in the overflow menu. ICommandBarItemProps extend IContextualMenuItem
    */
  var overflowItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
  /**
    * When true, items will be 'shifted' off the front of the array when reduced, and unshifted during grow
    */
  var shiftOnReduce: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ICommandBarStyleProps, ICommandBarStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

