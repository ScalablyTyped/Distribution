package typings
package officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItem
  extends /**
  * Any additional properties to use when custom rendering menu items.
  */
/* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the aria-label attribute will contain the item name
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not this menu item can be checked
    * @defaultvalue false
    */
  var canCheck: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not this menu item is currently checked.
    * @defaultvalue false
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional css class to apply to the menu item
    * @defaultvalue undefined
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback to access the IContextualMenuRenderItem interface. This will get passed down to ContextualMenuItem.
    */
  var componentRef: js.UndefOr[
    atUifabricUtilitiesLib.libCreateRefMod.IRefObject[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuRenderItem
    ]
  ] = js.undefined
  /**
    * When rendering a custom component that is passed in, the component might also be a list of
    * elements. We want to keep track of the correct index our menu is using based off of
    * the length of the custom list. It is up to the user to increment the count for their list.
    */
  var customOnRenderListLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Any custom data the developer wishes to associate with the menu item.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether the menu item is disabled
    * @defaultvalue false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Method to provide the classnames to style the individual items inside a menu.
    * Deprecated, use `styles` prop of `IContextualMenuItemProps` to leverage mergeStyles API.
    * @deprecated Use `styles` prop of `IContextualMenuItemProps` to leverage mergeStyles API.
    */
  var getItemClassNames: js.UndefOr[
    js.Function11[
      /* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, 
      /* disabled */ scala.Boolean, 
      /* expanded */ scala.Boolean, 
      /* checked */ scala.Boolean, 
      /* isAnchorLink */ scala.Boolean, 
      /* knownIcon */ scala.Boolean, 
      /* itemClassName */ js.UndefOr[java.lang.String], 
      /* dividerClassName */ js.UndefOr[java.lang.String], 
      /* iconClassName */ js.UndefOr[java.lang.String], 
      /* subMenuClassName */ js.UndefOr[java.lang.String], 
      /* primaryDisabled */ js.UndefOr[scala.Boolean], 
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotClassNamesMod.IMenuItemClassNames
    ]
  ] = js.undefined
  /**
    * Method to provide the classnames to style the Vertical Divider of a split button inside a menu.
    * Default value is the getVerticalDividerClassnames func defined in ContextualMenu.classnames
    * @defaultvalue getSplitButtonVerticalDividerClassNames
    */
  var getSplitButtonVerticalDividerClassNames: js.UndefOr[
    js.Function1[
      /* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, 
      officeDashUiDashFabricDashReactLib.libComponentsDividerVerticalDividerDotTypesMod.IVerticalDividerClassNames
    ]
  ] = js.undefined
  /**
    * An optional URL to navigate to upon selection
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Props that go to the IconComponent
    */
  var iconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
    * This prop is no longer used. All contextual menu items are now focusable when disabled.
    * @deprecated in 6.38.2 will be removed in 7.0.0
    */
  var inactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional IContextualMenuItemProps overrides to customize behaviors such as item styling via `styles`.
    */
  var itemProps: js.UndefOr[
    stdLib.Partial[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
    ]
  ] = js.undefined
  var itemType: js.UndefOr[ContextualMenuItemType] = js.undefined
  /**
    * Unique id to identify the item
    */
  var key: java.lang.String
  /**
    * Keytip for this contextual menu item
    */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
    * Text description for the menu item to display
    * Deprecated, use `text` instead.
    * @deprecated Use `text` instead.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback issued when the menu item is invoked. If ev.preventDefault() is called in onClick, click will not close menu.
    * Returning true will dismiss the menu even if ev.preventDefault() was called.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]
      ], 
      /* item */ js.UndefOr[IContextualMenuItem], 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /**
    * A function to be executed onMouseDown. This is executed before an onClick event and can
    * be used to interrupt native on click events as well. The click event should still handle
    * the commands. This should only be used in special cases when react and non-react are mixed.
    */
  var onMouseDown: js.UndefOr[js.Function2[/* item */ IContextualMenuItem, /* event */ js.Any, scala.Unit]] = js.undefined
  /**
    * Method to custom render this menu item.
    * For keyboard accessibility, the top-level rendered item should be a focusable element
    * (like an anchor or a button) or have the `data-is-focusable` property set to true.
    *
    * The function receives a function that can be called to dismiss the menu as a second argument.
    *  This can be used to make sure that a custom menu item click dismisses the menu.
    * @defaultvalue undefined
    */
  var onRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[scala.Boolean], scala.Unit], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /**
    * Custom render function for the menu item icon
    */
  var onRenderIcon: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
    ]
  ] = js.undefined
  /**
    * If the menu item is a split button, this prop disables purely the primary action of the button.
    * @defaultvalue false
    */
  var primaryDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional rel when using href. If target is _blank rel is defaulted to a value to prevent clickjacking.
    */
  var rel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional override for the role attribute on the menu button. If one is not provided, it will
    * have a value of menuitem or menuitemcheckbox.
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Seconday description for the menu item to display
    */
  var secondaryText: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  Properties to apply to render this item as a section.
    *  This prop is mutually exclusive with subMenuProps.
    */
  var sectionProps: js.UndefOr[IContextualMenuSection] = js.undefined
  /**
    * [TODO] Not Yet Implemented
    */
  var shortCut: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not this menu item is a splitButton.
    * @defaultvalue false
    */
  var split: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional styles to apply to the menu item
    * Deprecated, use `styles` instead.
    * @defaultvalue undefined
    * @deprecated in favor of the `styles` prop to leverage mergeStyles API.
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Properties to apply to a submenu to this item.
    *
    * The ContextualMenu will provide default values for `target`, `onDismiss`, `isSubMenu`,
    * `id`, `shouldFocusOnMount`, `directionalHint`, `className`, and `gapSpace`, all of which
    * can be overridden.
    */
  var subMenuProps: js.UndefOr[IContextualMenuProps] = js.undefined
  /**
    * Props that go to the IconComponent used for the chevron.
    */
  var submenuIconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
    * An optional target when using href
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text description for the menu item to display
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional title for displaying text when hovering over an item.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

