package typings.officeUiFabricReact.contextualMenuTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.PartialIContextualMenuIte
import typings.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemRenderFunctions
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuRenderItem
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualMenuItem
  extends /**
  * (Optional) Any additional properties to apply to the rendered links.
  */
/* propertyName */ StringDictionary[js.Any] {
  
  /**
    * Custom accessible label for the element.
    * If no override is specified, the `aria-label` attribute will contain the item name.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether or not this menu item can be checked
    * @defaultvalue false
    */
  var canCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not this menu item is currently checked.
    * @defaultvalue false
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional CSS class to apply to the menu item.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the IContextualMenuRenderItem interface.
    * This will get passed down to ContextualMenuItem.
    */
  var componentRef: js.UndefOr[IRefObject[IContextualMenuRenderItem]] = js.native
  
  /**
    * When rendering a custom menu component that is passed in, the component might also be a list of
    * elements. We want to keep track of the correct index our menu is using based off of
    * the length of the custom list. It is up to the user to increment the count for their list.
    */
  var customOnRenderListLength: js.UndefOr[Double] = js.native
  
  /**
    * Any custom data the developer wishes to associate with the menu item.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Whether the menu item is disabled
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Method to provide the classnames to style the individual items inside a menu.
    * @deprecated Use `styles` prop of `IContextualMenuItemProps` to leverage mergeStyles API.
    */
  var getItemClassNames: js.UndefOr[
    js.Function11[
      /* theme */ ITheme, 
      /* disabled */ Boolean, 
      /* expanded */ Boolean, 
      /* checked */ Boolean, 
      /* isAnchorLink */ Boolean, 
      /* knownIcon */ Boolean, 
      /* itemClassName */ js.UndefOr[String], 
      /* dividerClassName */ js.UndefOr[String], 
      /* iconClassName */ js.UndefOr[String], 
      /* subMenuClassName */ js.UndefOr[String], 
      /* primaryDisabled */ js.UndefOr[Boolean], 
      IMenuItemClassNames
    ]
  ] = js.native
  
  /**
    * Method to provide the classnames to style the Vertical Divider of a split button inside a menu.
    * Default value is the `getSplitButtonVerticalDividerClassNames` func defined in `ContextualMenu.classnames.ts`.
    * @defaultvalue getSplitButtonVerticalDividerClassNames
    */
  var getSplitButtonVerticalDividerClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.native
  
  /**
    * Navigate to this URL when the menu item is clicked.
    */
  var href: js.UndefOr[String] = js.native
  
  /**
    * Props for an icon to display next to the item.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * This prop is no longer used. All contextual menu items are now focusable when disabled.
    * @deprecated in 6.38.2 will be removed in 7.0.0
    */
  var inactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional IContextualMenuItemProps overrides to customize behaviors such as item styling via `styles`.
    */
  var itemProps: js.UndefOr[PartialIContextualMenuIte] = js.native
  
  var itemType: js.UndefOr[ContextualMenuItemType] = js.native
  
  /**
    * Unique id to identify the item
    */
  var key: String = js.native
  
  /**
    * Keytip for this contextual menu item
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  
  /**
    * Text of the menu item.
    * @deprecated Use `text` instead.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Callback for when the menu item is invoked. If `ev.preventDefault()` is called in `onClick`,
    * the click will not close the menu.
    *
    * Only for ContextualMenu items, returning true will dismiss the menu even if `ev.preventDefault()`
    * was called (does not apply for button or CommandBar sub-menu items).
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      /* item */ js.UndefOr[this.type], 
      Boolean | Unit
    ]
  ] = js.native
  
  /**
    * A function to be executed on mouse down. This is executed before an `onClick` event and can
    * be used to interrupt native on click events as well. The click event should still handle
    * the commands. This should only be used in special cases when react and non-react are mixed.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[/* item */ this.type, /* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  ] = js.native
  
  /**
    * Method to custom render this menu item.
    * For keyboard accessibility, the top-level rendered item should be a focusable element
    * (like an anchor or a button) or have the `data-is-focusable` property set to true.
    *
    * @param item - Item to render. Will typically be of type `IContextualMenuItem`.
    * (When rendering a command bar item, will be `ICommandBarItemProps`.)
    * @param dismissMenu - Function to dismiss the menu. Can be used to ensure that a custom menu
    * item click dismisses the menu. (Will be undefined if rendering a command bar item.)
    */
  var onRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit], 
      ReactNode
    ]
  ] = js.native
  
  /**
    * Method to customize sub-components rendering of this menu item.
    *
    * @param props - Props used to pass into render functions
    * @param defaultRenders - Default render functions that renders default sub-components
    */
  var onRenderContent: js.UndefOr[
    js.Function2[
      /* props */ IContextualMenuItemProps, 
      /* defaultRenders */ IContextualMenuItemRenderFunctions, 
      ReactNode
    ]
  ] = js.native
  
  /**
    * Custom render function for the menu item icon
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IContextualMenuItemProps]] = js.native
  
  /**
    * If the menu item is a split button, this prop disables purely the primary action of the button.
    * @defaultvalue false
    */
  var primaryDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Link relation setting when using `href`.
    * If `target` is `_blank`, `rel` is defaulted to a value to prevent clickjacking.
    */
  var rel: js.UndefOr[String] = js.native
  
  /**
    * Optional override for the menu button's role. Defaults to `menuitem` or `menuitemcheckbox`.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * Seconday description for the menu item to display
    */
  var secondaryText: js.UndefOr[String] = js.native
  
  /**
    * Properties to apply to render this item as a section.
    * This prop is mutually exclusive with `subMenuProps`.
    */
  var sectionProps: js.UndefOr[IContextualMenuSection] = js.native
  
  /**
    * @deprecated Not used
    */
  var shortCut: js.UndefOr[String] = js.native
  
  /**
    * Whether or not this menu item is a splitButton.
    * @defaultvalue false
    */
  var split: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional styles to apply to the menu item
    * @deprecated in favor of the `styles` prop to leverage mergeStyles API.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Properties to apply to a submenu to this item.
    *
    * The ContextualMenu will provide default values for `target`, `onDismiss`, `isSubMenu`,
    * `id`, `shouldFocusOnMount`, `directionalHint`, `className`, and `gapSpace`, all of which
    * can be overridden.
    */
  var subMenuProps: js.UndefOr[IContextualMenuProps] = js.native
  
  /**
    * Props for the Icon used for the chevron.
    */
  var submenuIconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * Target window when using `href`.
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Text of the menu item.
    * If a standard hyphen (-) is passed in, then the item will be rendered as a divider.
    * If a dash must appear as text, use an emdash (—), figuredash (‒), or minus symbol (−) instead.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Title (tooltip) text displayed when hovering over an item.
    */
  var title: js.UndefOr[String] = js.native
}
object IContextualMenuItem {
  
  @scala.inline
  def apply(key: String): IContextualMenuItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItem]
  }
  
  @scala.inline
  implicit class IContextualMenuItemOps[Self <: IContextualMenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setCanCheck(value: Boolean): Self = this.set("canCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCheck: Self = this.set("canCheck", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IContextualMenuRenderItem | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IContextualMenuRenderItem]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setCustomOnRenderListLength(value: Double): Self = this.set("customOnRenderListLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomOnRenderListLength: Self = this.set("customOnRenderListLength", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setGetItemClassNames(
      value: (/* theme */ ITheme, /* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* isAnchorLink */ Boolean, /* knownIcon */ Boolean, /* itemClassName */ js.UndefOr[String], /* dividerClassName */ js.UndefOr[String], /* iconClassName */ js.UndefOr[String], /* subMenuClassName */ js.UndefOr[String], /* primaryDisabled */ js.UndefOr[Boolean]) => IMenuItemClassNames
    ): Self = this.set("getItemClassNames", js.Any.fromFunction11(value))
    
    @scala.inline
    def deleteGetItemClassNames: Self = this.set("getItemClassNames", js.undefined)
    
    @scala.inline
    def setGetSplitButtonVerticalDividerClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = this.set("getSplitButtonVerticalDividerClassNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSplitButtonVerticalDividerClassNames: Self = this.set("getSplitButtonVerticalDividerClassNames", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setIconProps(value: IIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setItemProps(value: PartialIContextualMenuIte): Self = this.set("itemProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemProps: Self = this.set("itemProps", js.undefined)
    
    @scala.inline
    def setItemType(value: ContextualMenuItemType): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: (IContextualMenuItem, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = this.set("onMouseDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnRender(
      value: (/* item */ js.Any, /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]) => ReactNode
    ): Self = this.set("onRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setOnRenderContent(
      value: (/* props */ IContextualMenuItemProps, /* defaultRenders */ IContextualMenuItemRenderFunctions) => ReactNode
    ): Self = this.set("onRenderContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderContent: Self = this.set("onRenderContent", js.undefined)
    
    @scala.inline
    def setOnRenderIcon(
      value: (/* props */ js.UndefOr[IContextualMenuItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuItemProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderIcon", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderIcon: Self = this.set("onRenderIcon", js.undefined)
    
    @scala.inline
    def setPrimaryDisabled(value: Boolean): Self = this.set("primaryDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryDisabled: Self = this.set("primaryDisabled", js.undefined)
    
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSecondaryText(value: String): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    
    @scala.inline
    def setSectionProps(value: IContextualMenuSection): Self = this.set("sectionProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionProps: Self = this.set("sectionProps", js.undefined)
    
    @scala.inline
    def setShortCut(value: String): Self = this.set("shortCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortCut: Self = this.set("shortCut", js.undefined)
    
    @scala.inline
    def setSplit(value: Boolean): Self = this.set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSubMenuProps(value: IContextualMenuProps): Self = this.set("subMenuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuProps: Self = this.set("subMenuProps", js.undefined)
    
    @scala.inline
    def setSubmenuIconProps(value: IIconProps): Self = this.set("submenuIconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenuIconProps: Self = this.set("submenuIconProps", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
