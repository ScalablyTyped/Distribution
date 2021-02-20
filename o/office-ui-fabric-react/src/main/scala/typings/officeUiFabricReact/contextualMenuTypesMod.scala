package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.ContainsFocus
import typings.officeUiFabricReact.anon.PartialIContextualMenuIte
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.contextualMenuClassNamesMod.IContextualMenuClassNames
import typings.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemRenderFunctions
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyleProps
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuRenderItem
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`10`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`11`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`12`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`13`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`4`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`5`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`6`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`7`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`8`
import typings.officeUiFabricReact.officeUiFabricReactNumbers.`9`
import typings.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import typings.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typings.react.mod.CSSProperties
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Window
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricReactHooks.useTargetMod.Target
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuTypesMod {
  
  @js.native
  sealed trait ContextualMenuItemType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "ContextualMenuItemType")
  @js.native
  object ContextualMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContextualMenuItemType with Double] = js.native
    
    @js.native
    sealed trait Divider extends ContextualMenuItemType
    /* 1 */ val Divider: typings.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Divider with Double = js.native
    
    @js.native
    sealed trait Header extends ContextualMenuItemType
    /* 2 */ val Header: typings.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Header with Double = js.native
    
    @js.native
    sealed trait Normal extends ContextualMenuItemType
    /* 0 */ val Normal: typings.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Normal with Double = js.native
    
    @js.native
    sealed trait Section extends ContextualMenuItemType
    /* 3 */ val Section: typings.officeUiFabricReact.contextualMenuTypesMod.ContextualMenuItemType.Section with Double = js.native
  }
  
  object DirectionalHint {
    
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Appear below the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.bottomAutoEdge")
    @js.native
    def bottomAutoEdge: `7` = js.native
    @scala.inline
    def bottomAutoEdge_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.bottomCenter")
    @js.native
    def bottomCenter: `5` = js.native
    @scala.inline
    def bottomCenter_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.bottomLeftEdge")
    @js.native
    def bottomLeftEdge: `4` = js.native
    @scala.inline
    def bottomLeftEdge_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear below the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.bottomRightEdge")
    @js.native
    def bottomRightEdge: `6` = js.native
    @scala.inline
    def bottomRightEdge_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRightEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.leftBottomEdge")
    @js.native
    def leftBottomEdge: `10` = js.native
    @scala.inline
    def leftBottomEdge_=(x: `10`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.leftCenter")
    @js.native
    def leftCenter: `9` = js.native
    @scala.inline
    def leftCenter_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the left of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.leftTopEdge")
    @js.native
    def leftTopEdge: `8` = js.native
    @scala.inline
    def leftTopEdge_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leftTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the bottom edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.rightBottomEdge")
    @js.native
    def rightBottomEdge: `13` = js.native
    @scala.inline
    def rightBottomEdge_=(x: `13`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightBottomEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.rightCenter")
    @js.native
    def rightCenter: `12` = js.native
    @scala.inline
    def rightCenter_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear to the right of the target element, with the top edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.rightTopEdge")
    @js.native
    def rightTopEdge: `11` = js.native
    @scala.inline
    def rightTopEdge_=(x: `11`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rightTopEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, aligning with the target element such that the callout tends toward
      * the center of the screen.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.topAutoEdge")
    @js.native
    def topAutoEdge: `3` = js.native
    @scala.inline
    def topAutoEdge_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topAutoEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the centers of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.topCenter")
    @js.native
    def topCenter: `1` = js.native
    @scala.inline
    def topCenter_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the left edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.topLeftEdge")
    @js.native
    def topLeftEdge: `0` = js.native
    @scala.inline
    def topLeftEdge_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeftEdge")(x.asInstanceOf[js.Any])
    
    /**
      * Appear above the target element, with the right edges of the callout and target aligning.
      */
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "DirectionalHint.topRightEdge")
    @js.native
    def topRightEdge: `2` = js.native
    @scala.inline
    def topRightEdge_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRightEdge")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IContextualMenu extends StObject
  
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
    implicit class IContextualMenuItemMutableBuilder[Self <: IContextualMenuItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setCanCheck(value: Boolean): Self = StObject.set(x, "canCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanCheckUndefined: Self = StObject.set(x, "canCheck", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IContextualMenuRenderItem]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IContextualMenuRenderItem | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setCustomOnRenderListLength(value: Double): Self = StObject.set(x, "customOnRenderListLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomOnRenderListLengthUndefined: Self = StObject.set(x, "customOnRenderListLength", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGetItemClassNames(
        value: (/* theme */ ITheme, /* disabled */ Boolean, /* expanded */ Boolean, /* checked */ Boolean, /* isAnchorLink */ Boolean, /* knownIcon */ Boolean, /* itemClassName */ js.UndefOr[String], /* dividerClassName */ js.UndefOr[String], /* iconClassName */ js.UndefOr[String], /* subMenuClassName */ js.UndefOr[String], /* primaryDisabled */ js.UndefOr[Boolean]) => IMenuItemClassNames
      ): Self = StObject.set(x, "getItemClassNames", js.Any.fromFunction11(value))
      
      @scala.inline
      def setGetItemClassNamesUndefined: Self = StObject.set(x, "getItemClassNames", js.undefined)
      
      @scala.inline
      def setGetSplitButtonVerticalDividerClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = StObject.set(x, "getSplitButtonVerticalDividerClassNames", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSplitButtonVerticalDividerClassNamesUndefined: Self = StObject.set(x, "getSplitButtonVerticalDividerClassNames", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      @scala.inline
      def setItemProps(value: PartialIContextualMenuIte): Self = StObject.set(x, "itemProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropsUndefined: Self = StObject.set(x, "itemProps", js.undefined)
      
      @scala.inline
      def setItemType(value: ContextualMenuItemType): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: (IContextualMenuItem, /* event */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnRender(
        value: (/* item */ js.Any, /* dismissMenu */ js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]) => ReactNode
      ): Self = StObject.set(x, "onRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderContent(
        value: (/* props */ IContextualMenuItemProps, /* defaultRenders */ IContextualMenuItemRenderFunctions) => ReactNode
      ): Self = StObject.set(x, "onRenderContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderContentUndefined: Self = StObject.set(x, "onRenderContent", js.undefined)
      
      @scala.inline
      def setOnRenderIcon(
        value: (/* props */ js.UndefOr[IContextualMenuItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuItemProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderIcon", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderIconUndefined: Self = StObject.set(x, "onRenderIcon", js.undefined)
      
      @scala.inline
      def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      @scala.inline
      def setPrimaryDisabled(value: Boolean): Self = StObject.set(x, "primaryDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryDisabledUndefined: Self = StObject.set(x, "primaryDisabled", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      @scala.inline
      def setSectionProps(value: IContextualMenuSection): Self = StObject.set(x, "sectionProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionPropsUndefined: Self = StObject.set(x, "sectionProps", js.undefined)
      
      @scala.inline
      def setShortCut(value: String): Self = StObject.set(x, "shortCut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortCutUndefined: Self = StObject.set(x, "shortCut", js.undefined)
      
      @scala.inline
      def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubMenuProps(value: IContextualMenuProps): Self = StObject.set(x, "subMenuProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuPropsUndefined: Self = StObject.set(x, "subMenuProps", js.undefined)
      
      @scala.inline
      def setSubmenuIconProps(value: IIconProps): Self = StObject.set(x, "submenuIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmenuIconPropsUndefined: Self = StObject.set(x, "submenuIconProps", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait IContextualMenuItemRenderProps extends IContextualMenuItem {
    
    var focusableElementIndex: Double = js.native
    
    var hasCheckmarks: Boolean = js.native
    
    var hasIcons: Boolean = js.native
    
    var index: Double = js.native
    
    var totalItemCount: Double = js.native
  }
  object IContextualMenuItemRenderProps {
    
    @scala.inline
    def apply(
      focusableElementIndex: Double,
      hasCheckmarks: Boolean,
      hasIcons: Boolean,
      index: Double,
      key: String,
      totalItemCount: Double
    ): IContextualMenuItemRenderProps = {
      val __obj = js.Dynamic.literal(focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], hasCheckmarks = hasCheckmarks.asInstanceOf[js.Any], hasIcons = hasIcons.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuItemRenderProps]
    }
    
    @scala.inline
    implicit class IContextualMenuItemRenderPropsMutableBuilder[Self <: IContextualMenuItemRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusableElementIndex(value: Double): Self = StObject.set(x, "focusableElementIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCheckmarks(value: Boolean): Self = StObject.set(x, "hasCheckmarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasIcons(value: Boolean): Self = StObject.set(x, "hasIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IContextualMenuListProps extends StObject {
    
    def defaultMenuItemRenderer(item: IContextualMenuItemRenderProps): ReactNode = js.native
    
    var hasCheckmarks: Boolean = js.native
    
    var hasIcons: Boolean = js.native
    
    var items: js.Array[IContextualMenuItem] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var totalItemCount: Double = js.native
  }
  object IContextualMenuListProps {
    
    @scala.inline
    def apply(
      defaultMenuItemRenderer: IContextualMenuItemRenderProps => ReactNode,
      hasCheckmarks: Boolean,
      hasIcons: Boolean,
      items: js.Array[IContextualMenuItem],
      totalItemCount: Double
    ): IContextualMenuListProps = {
      val __obj = js.Dynamic.literal(defaultMenuItemRenderer = js.Any.fromFunction1(defaultMenuItemRenderer), hasCheckmarks = hasCheckmarks.asInstanceOf[js.Any], hasIcons = hasIcons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuListProps]
    }
    
    @scala.inline
    implicit class IContextualMenuListPropsMutableBuilder[Self <: IContextualMenuListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMenuItemRenderer(value: IContextualMenuItemRenderProps => ReactNode): Self = StObject.set(x, "defaultMenuItemRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasCheckmarks(value: Boolean): Self = StObject.set(x, "hasCheckmarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasIcons(value: Boolean): Self = StObject.set(x, "hasIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IContextualMenuProps
    extends IBaseProps[IContextualMenu]
       with IWithResponsiveModeState {
    
    /**
      * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
      * thus making sure the element aligns perfectly with target's alignment edge
      */
    var alignTargetEdge: js.UndefOr[Boolean] = js.native
    
    /**
      * Accessible label for the ContextualMenu's root element (inside the callout).
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * The width of the beak.
      * @defaultvalue 16
      */
    var beakWidth: js.UndefOr[Double] = js.native
    
    /**
      * The bounding rectangle (or callback that returns a rectangle) which the contextual menu can appear in.
      */
    var bounds: js.UndefOr[
        IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window], 
          js.UndefOr[IRectangle]
        ])
      ] = js.native
    
    /**
      * Additional custom props for the Callout.
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.native
    
    /**
      * Additional CSS class to apply to the ContextualMenu.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Custom component to use for rendering individual menu items.
      * @defaultvalue ContextualMenuItem
      */
    var contextualMenuItemAs: js.UndefOr[
        (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
      ] = js.native
    
    /**
      * If true, the menu will be positioned to cover the target.
      * If false, it will be positioned next to the target.
      * @defaultvalue false
      */
    var coverTarget: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the contextual menu will not be updated until focus enters the menu via other means.
      * This will only result in different behavior when `shouldFocusOnMount = false`.
      */
    var delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.native
    
    /**
      * How the menu should be positioned
      * @defaultvalue DirectionalHint.bottomAutoEdge
      */
    var directionalHint: js.UndefOr[DirectionalHint] = js.native
    
    /**
      * If true the position will not change sides in an attempt to fit the ContextualMenu within bounds.
      * It will still attempt to align it to whatever bounds are given.
      * @defaultvalue false
      */
    var directionalHintFixed: js.UndefOr[Boolean] = js.native
    
    /**
      * How the menu should be positioned in RTL layouts.
      * If not specified, a mirror of `directionalHint` will be used.
      */
    var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
    
    /**
      * If true do not render on a new layer. If false render on a new layer.
      * @defaultvalue false
      */
    var doNotLayer: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to pass down to the FocusZone.
      * NOTE: the default FocusZoneDirection will be used unless a direction
      * is specified in the focusZoneProps (even if other focusZoneProps are defined)
      * @defaultvalue \{ direction: FocusZoneDirection.vertical \}
      */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
    
    /**
      * The gap between the ContextualMenu and the target
      * @defaultvalue 0
      */
    var gapSpace: js.UndefOr[Double] = js.native
    
    /**
      * Method to provide the classnames to style the contextual menu.
      * @deprecated Use `styles` instead to leverage mergeStyles API.
      */
    var getMenuClassNames: js.UndefOr[
        js.Function2[/* theme */ ITheme, /* className */ js.UndefOr[String], IContextualMenuClassNames]
      ] = js.native
    
    /**
      * If true, renders the ContextualMenu in a hidden state.
      * Use this flag, rather than rendering a ContextualMenu conditionally based on visibility,
      * to improve rendering performance when it becomes visible.
      * Note: When ContextualMenu is hidden its content will not be rendered. It will only render
      * once the ContextualMenu is visible.
      */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * ID for the ContextualMenu's root element (inside the callout).
      * Should be used for `aria-owns` and other such uses, rather than direct reference for programmatic purposes.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * If true then the beak is visible. If false it will not be shown.
      */
    var isBeakVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether this menu is a submenu of another menu.
      */
    var isSubMenu: js.UndefOr[Boolean] = js.native
    
    /**
      * Menu items to display.
      */
    var items: js.Array[IContextualMenuItem] = js.native
    
    /**
      * Used as `aria-labelledby` for the menu element inside the callout.
      */
    var labelElementId: js.UndefOr[String] = js.native
    
    /**
      * Callback when the ContextualMenu tries to close. If `dismissAll` is true then all
      * submenus will be dismissed.
      */
    var onDismiss: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[
            (MouseEvent[typings.std.Element, NativeMouseEvent]) | KeyboardEvent[typings.std.Element]
          ], 
          /* dismissAll */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.native
    
    /**
      * Click handler which is invoked if `onClick` is not passed for individual contextual
      * menu item.
      * Returning true will dismiss the menu even if `ev.preventDefault()` was called.
      */
    var onItemClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
          /* item */ js.UndefOr[IContextualMenuItem], 
          Boolean | Unit
        ]
      ] = js.native
    
    /**
      * Callback for when the menu is being closed (removing from the DOM).
      */
    var onMenuDismissed: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[this.type], Unit]] = js.native
    
    /**
      * Callback for when the menu has been opened.
      */
    var onMenuOpened: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[this.type], Unit]] = js.native
    
    /**
      * Method to override the render of the list of menu items.
      */
    var onRenderMenuList: js.UndefOr[IRenderFunction[IContextualMenuListProps]] = js.native
    
    /** Custom render function for a submenu. */
    var onRenderSubMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.native
    
    /**
      * Called when the component is unmounting, and focus needs to be restored.
      * Argument passed down contains two variables, the element that the underlying
      * popup believes focus should go to and whether or not the popup currently
      * contains focus. If this prop is provided, focus will not be restored automatically,
      * you'll need to call originalElement.focus()
      */
    var onRestoreFocus: js.UndefOr[js.Function1[/* options */ ContainsFocus, Unit]] = js.native
    
    /**
      * Whether to focus on the contextual menu container (as opposed to the first menu item).
      */
    var shouldFocusOnContainer: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to focus on the menu when mounted.
      * @defaultvalue true
      */
    var shouldFocusOnMount: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, the menu will be updated even when `hidden=true`. Note that this will consume
      * resources to update even when nothing is being shown to the user. This might be helpful if
      * your updates are small and you want the menu to display quickly when `hidden` is set to false.
      */
    var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]] = js.native
    
    /**
      * Delay (in milliseconds) to wait before expanding / dismissing a submenu on mouseEnter or mouseLeave
      */
    var subMenuHoverDelay: js.UndefOr[Double] = js.native
    
    /**
      * The target that the ContextualMenu should try to position itself based on.
      * It can be either an element, a query selector string resolving to a valid element,
      * or a MouseEvent. If a MouseEvent is given, the origin point of the event will be used.
      */
    var target: js.UndefOr[Target] = js.native
    
    /**
      * Theme provided by higher-order component.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Title to be displayed at the top of the menu, above the items.
      */
    var title: js.UndefOr[String] = js.native
    
    /**
      * If true the context menu will have a minimum width equal to the width of the target element
      * @defaultvalue false
      */
    var useTargetAsMinWidth: js.UndefOr[Boolean] = js.native
    
    /**
      * If true the context menu will render as the same width as the target element
      * @defaultvalue false
      */
    var useTargetWidth: js.UndefOr[Boolean] = js.native
  }
  object IContextualMenuProps {
    
    @scala.inline
    def apply(items: js.Array[IContextualMenuItem]): IContextualMenuProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuProps]
    }
    
    @scala.inline
    implicit class IContextualMenuPropsMutableBuilder[Self <: IContextualMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignTargetEdge(value: Boolean): Self = StObject.set(x, "alignTargetEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTargetEdgeUndefined: Self = StObject.set(x, "alignTargetEdge", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
      
      @scala.inline
      def setBounds(
        value: IRectangle | (js.Function2[
              /* target */ js.UndefOr[Target], 
              /* targetWindow */ js.UndefOr[Window], 
              js.UndefOr[IRectangle]
            ])
      ): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsFunction2(
        value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window]) => js.UndefOr[IRectangle]
      ): Self = StObject.set(x, "bounds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContextualMenuItemAs(
        value: (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
      ): Self = StObject.set(x, "contextualMenuItemAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextualMenuItemAsUndefined: Self = StObject.set(x, "contextualMenuItemAs", js.undefined)
      
      @scala.inline
      def setCoverTarget(value: Boolean): Self = StObject.set(x, "coverTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverTargetUndefined: Self = StObject.set(x, "coverTarget", js.undefined)
      
      @scala.inline
      def setDelayUpdateFocusOnHover(value: Boolean): Self = StObject.set(x, "delayUpdateFocusOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUpdateFocusOnHoverUndefined: Self = StObject.set(x, "delayUpdateFocusOnHover", js.undefined)
      
      @scala.inline
      def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixedUndefined: Self = StObject.set(x, "directionalHintFixed", js.undefined)
      
      @scala.inline
      def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      @scala.inline
      def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      @scala.inline
      def setDoNotLayer(value: Boolean): Self = StObject.set(x, "doNotLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotLayerUndefined: Self = StObject.set(x, "doNotLayer", js.undefined)
      
      @scala.inline
      def setFocusZoneProps(value: IFocusZoneProps): Self = StObject.set(x, "focusZoneProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusZonePropsUndefined: Self = StObject.set(x, "focusZoneProps", js.undefined)
      
      @scala.inline
      def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSpaceUndefined: Self = StObject.set(x, "gapSpace", js.undefined)
      
      @scala.inline
      def setGetMenuClassNames(value: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => IContextualMenuClassNames): Self = StObject.set(x, "getMenuClassNames", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetMenuClassNamesUndefined: Self = StObject.set(x, "getMenuClassNames", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsBeakVisible(value: Boolean): Self = StObject.set(x, "isBeakVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeakVisibleUndefined: Self = StObject.set(x, "isBeakVisible", js.undefined)
      
      @scala.inline
      def setIsSubMenu(value: Boolean): Self = StObject.set(x, "isSubMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSubMenuUndefined: Self = StObject.set(x, "isSubMenu", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabelElementId(value: String): Self = StObject.set(x, "labelElementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelElementIdUndefined: Self = StObject.set(x, "labelElementId", js.undefined)
      
      @scala.inline
      def setOnDismiss(
        value: (/* ev */ js.UndefOr[
              (MouseEvent[typings.std.Element, NativeMouseEvent]) | KeyboardEvent[typings.std.Element]
            ], /* dismissAll */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onDismiss", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnItemClick(
        value: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOnMenuDismissed(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): Self = StObject.set(x, "onMenuDismissed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuDismissedUndefined: Self = StObject.set(x, "onMenuDismissed", js.undefined)
      
      @scala.inline
      def setOnMenuOpened(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): Self = StObject.set(x, "onMenuOpened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuOpenedUndefined: Self = StObject.set(x, "onMenuOpened", js.undefined)
      
      @scala.inline
      def setOnRenderMenuList(
        value: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuListProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderMenuList", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderMenuListUndefined: Self = StObject.set(x, "onRenderMenuList", js.undefined)
      
      @scala.inline
      def setOnRenderSubMenu(
        value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderSubMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderSubMenuUndefined: Self = StObject.set(x, "onRenderSubMenu", js.undefined)
      
      @scala.inline
      def setOnRestoreFocus(value: /* options */ ContainsFocus => Unit): Self = StObject.set(x, "onRestoreFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRestoreFocusUndefined: Self = StObject.set(x, "onRestoreFocus", js.undefined)
      
      @scala.inline
      def setShouldFocusOnContainer(value: Boolean): Self = StObject.set(x, "shouldFocusOnContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFocusOnContainerUndefined: Self = StObject.set(x, "shouldFocusOnContainer", js.undefined)
      
      @scala.inline
      def setShouldFocusOnMount(value: Boolean): Self = StObject.set(x, "shouldFocusOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFocusOnMountUndefined: Self = StObject.set(x, "shouldFocusOnMount", js.undefined)
      
      @scala.inline
      def setShouldUpdateWhenHidden(value: Boolean): Self = StObject.set(x, "shouldUpdateWhenHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdateWhenHiddenUndefined: Self = StObject.set(x, "shouldUpdateWhenHidden", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IContextualMenuStyleProps => DeepPartial[IContextualMenuStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSubMenuHoverDelay(value: Double): Self = StObject.set(x, "subMenuHoverDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuHoverDelayUndefined: Self = StObject.set(x, "subMenuHoverDelay", js.undefined)
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUseTargetAsMinWidth(value: Boolean): Self = StObject.set(x, "useTargetAsMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTargetAsMinWidthUndefined: Self = StObject.set(x, "useTargetAsMinWidth", js.undefined)
      
      @scala.inline
      def setUseTargetWidth(value: Boolean): Self = StObject.set(x, "useTargetWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTargetWidthUndefined: Self = StObject.set(x, "useTargetWidth", js.undefined)
    }
  }
  
  @js.native
  trait IContextualMenuSection
    extends ClassAttributes[js.Any] {
    
    /**
      * If set to true, the section will display a divider at the bottom of the section.
      */
    var bottomDivider: js.UndefOr[Boolean] = js.native
    
    /**
      * The items to include inside the section.
      */
    var items: js.Array[IContextualMenuItem] = js.native
    
    /**
      * The optional section title.
      */
    var title: js.UndefOr[String | IContextualMenuItem] = js.native
    
    /**
      * If set to true, the section will display a divider at the top of the section.
      */
    var topDivider: js.UndefOr[Boolean] = js.native
  }
  object IContextualMenuSection {
    
    @scala.inline
    def apply(items: js.Array[IContextualMenuItem]): IContextualMenuSection = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuSection]
    }
    
    @scala.inline
    implicit class IContextualMenuSectionMutableBuilder[Self <: IContextualMenuSection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomDivider(value: Boolean): Self = StObject.set(x, "bottomDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomDividerUndefined: Self = StObject.set(x, "bottomDivider", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String | IContextualMenuItem): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTopDivider(value: Boolean): Self = StObject.set(x, "topDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopDividerUndefined: Self = StObject.set(x, "topDivider", js.undefined)
    }
  }
  
  @js.native
  trait IContextualMenuStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object IContextualMenuStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IContextualMenuStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuStyleProps]
    }
    
    @scala.inline
    implicit class IContextualMenuStylePropsMutableBuilder[Self <: IContextualMenuStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IContextualMenuStyles extends StObject {
    
    /**
      * Style for the container which parents all menu items.
      */
    var container: IStyle = js.native
    
    /**
      * Styles for the header item of a ContextualMenu
      */
    var header: IStyle = js.native
    
    /**
      * Styles for the list that contains all menuItems.
      */
    var list: IStyle = js.native
    
    /**
      * Base styles for the root element of all ContextualMenus.
      */
    var root: IStyle = js.native
    
    /**
      * SubComponent styles.
      */
    var subComponentStyles: IContextualMenuSubComponentStyles = js.native
    
    /**
      * Style override for the contextual menu title.
      */
    var title: IStyle = js.native
  }
  object IContextualMenuStyles {
    
    @scala.inline
    def apply(subComponentStyles: IContextualMenuSubComponentStyles): IContextualMenuStyles = {
      val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuStyles]
    }
    
    @scala.inline
    implicit class IContextualMenuStylesMutableBuilder[Self <: IContextualMenuStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: IStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setHeader(value: IStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNull: Self = StObject.set(x, "header", null)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setList(value: IStyle): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListNull: Self = StObject.set(x, "list", null)
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSubComponentStyles(value: IContextualMenuSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: IStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait IContextualMenuSubComponentStyles extends StObject {
    
    /** Styles for the callout that hosts the ContextualMenu options. */
    var callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _] = js.native
    
    /** Styles for each menu item. */
    var menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _] = js.native
  }
  object IContextualMenuSubComponentStyles {
    
    @scala.inline
    def apply(
      callout: IStyleFunctionOrObject[ICalloutContentStyleProps, _],
      menuItem: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]
    ): IContextualMenuSubComponentStyles = {
      val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], menuItem = menuItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuSubComponentStyles]
    }
    
    @scala.inline
    implicit class IContextualMenuSubComponentStylesMutableBuilder[Self <: IContextualMenuSubComponentStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallout(value: IStyleFunctionOrObject[ICalloutContentStyleProps, _]): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutFunction1(value: ICalloutContentStyleProps => DeepPartial[_]): Self = StObject.set(x, "callout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuItem(value: IStyleFunctionOrObject[IContextualMenuItemStyleProps, _]): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemFunction1(value: IContextualMenuItemStyleProps => DeepPartial[_]): Self = StObject.set(x, "menuItem", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IMenuItemStyles extends IButtonStyles {
    
    /**
      * Styles for a menu item that is an anchor link.
      */
    var anchorLink: IStyle = js.native
    
    /**
      * Default style for checkmark icons.
      */
    var checkmarkIcon: IStyle = js.native
    
    /**
      * Styles for a divider item of a ConextualMenu.
      */
    var divider: IStyle = js.native
    
    /**
      * Default icon color style for known icons.
      */
    var iconColor: IStyle = js.native
    
    /**
      * Styles for a menu item that is an anchor link.
      */
    var item: IStyle = js.native
    
    /**
      * Styles for the content inside the button/link of the menuItem.
      */
    var linkContent: IStyle = js.native
    
    /**
      * Styles for the submenu icon of a menu item.
      */
    var subMenuIcon: IStyle = js.native
  }
  object IMenuItemStyles {
    
    @scala.inline
    def apply(): IMenuItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuItemStyles]
    }
    
    @scala.inline
    implicit class IMenuItemStylesMutableBuilder[Self <: IMenuItemStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorLink(value: IStyle): Self = StObject.set(x, "anchorLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorLinkNull: Self = StObject.set(x, "anchorLink", null)
      
      @scala.inline
      def setAnchorLinkUndefined: Self = StObject.set(x, "anchorLink", js.undefined)
      
      @scala.inline
      def setCheckmarkIcon(value: IStyle): Self = StObject.set(x, "checkmarkIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckmarkIconNull: Self = StObject.set(x, "checkmarkIcon", null)
      
      @scala.inline
      def setCheckmarkIconUndefined: Self = StObject.set(x, "checkmarkIcon", js.undefined)
      
      @scala.inline
      def setDivider(value: IStyle): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerNull: Self = StObject.set(x, "divider", null)
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setIconColor(value: IStyle): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconColorNull: Self = StObject.set(x, "iconColor", null)
      
      @scala.inline
      def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      @scala.inline
      def setItem(value: IStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemNull: Self = StObject.set(x, "item", null)
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setLinkContent(value: IStyle): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkContentNull: Self = StObject.set(x, "linkContent", null)
      
      @scala.inline
      def setLinkContentUndefined: Self = StObject.set(x, "linkContent", js.undefined)
      
      @scala.inline
      def setSubMenuIcon(value: IStyle): Self = StObject.set(x, "subMenuIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuIconNull: Self = StObject.set(x, "subMenuIcon", null)
      
      @scala.inline
      def setSubMenuIconUndefined: Self = StObject.set(x, "subMenuIcon", js.undefined)
    }
  }
}
