package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.`true`
import typings.officeUiFabricReact.officeUiFabricReactStrings.date
import typings.officeUiFabricReact.officeUiFabricReactStrings.location
import typings.officeUiFabricReact.officeUiFabricReactStrings.page
import typings.officeUiFabricReact.officeUiFabricReactStrings.step
import typings.officeUiFabricReact.officeUiFabricReactStrings.time
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navTypesMod {
  
  @js.native
  trait INav extends StObject {
    
    /**
      * Sets focus to the first tabbable item in the zone.
      * @param forceIntoFirstElement - If true, focus will be forced into the first element, even
      * if focus is already in the focus zone.
      * @returns True if focus could be set to an active element, false if no operation was taken.
      */
    def focus(): Boolean = js.native
    def focus(forceIntoFirstElement: Boolean): Boolean = js.native
    
    /**
      * The meta 'key' property of the currently selected NavItem of the Nav. Can return
      * undefined if the currently selected nav item has no populated key property. Be aware
      * that in order for Nav to properly understand which key is selected all NavItems in
      * all groups of the Nav must have populated key properties.
      */
    var selectedKey: js.UndefOr[String] = js.native
  }
  
  trait INavButtonProps
    extends StObject
       with IButtonProps {
    
    /**
      * (Optional) Link to be rendered.
      */
    var link: js.UndefOr[INavLink] = js.undefined
  }
  object INavButtonProps {
    
    inline def apply(): INavButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavButtonProps]
    }
    
    extension [Self <: INavButtonProps](x: Self) {
      
      inline def setLink(value: INavLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  trait INavLink
    extends StObject
       with /**
    * (Optional) Any additional properties to apply to the rendered links.
    */
  /* propertyName */ StringDictionary[js.Any] {
    
    /**
      * Aria-current token for active nav links. Must be a valid token value, and defaults to 'page'.
      */
    var ariaCurrent: js.UndefOr[page | step | location | date | time | `true`] = js.undefined
    
    /**
      * Aria label for nav link. Ignored if `collapseAriaLabel` or `expandAriaLabel` is provided.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The name to use for functional automation tests
      */
    var automationId: js.UndefOr[String] = js.undefined
    
    /**
      * ARIA label when group is collapsed and can be expanded.
      */
    var collapseAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the link is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ARIA label when group is collapsed and can be expanded.
      */
    var expandAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) By default, any link with onClick defined will render as a button.
      * Set this property to true to override that behavior. (Links without onClick defined
      * will render as anchors by default.)
      */
    var forceAnchor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of an icon to render next to the link button.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Deprecated. Use `iconProps.className` instead.
      * @deprecated Use `iconProps.className` instead.
      */
    var iconClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Props for an icon to render next to the link button.
      */
    var iconProps: js.UndefOr[IIconProps] = js.undefined
    
    /**
      * Whether or not the link is in an expanded state
      */
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Unique, stable key for the link, used when rendering the list of links and for tracking
      * the currently selected link.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Child links to this link, if any
      */
    var links: js.UndefOr[js.Array[INavLink]] = js.undefined
    
    /**
      * Text to render for this link
      */
    var name: String
    
    /**
      * Callback invoked when this link is clicked. Providing this callback will cause the link
      * to render as a button (rather than an anchor) unless forceAnchor is set to true.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* item */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Link <a> target.
      */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * Text for title tooltip and ARIA description.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL to navigate to for this link
      */
    var url: String
  }
  object INavLink {
    
    inline def apply(name: String, url: String): INavLink = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavLink]
    }
    
    extension [Self <: INavLink](x: Self) {
      
      inline def setAriaCurrent(value: page | step | location | date | time | `true`): Self = StObject.set(x, "ariaCurrent", value.asInstanceOf[js.Any])
      
      inline def setAriaCurrentUndefined: Self = StObject.set(x, "ariaCurrent", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAutomationId(value: String): Self = StObject.set(x, "automationId", value.asInstanceOf[js.Any])
      
      inline def setAutomationIdUndefined: Self = StObject.set(x, "automationId", js.undefined)
      
      inline def setCollapseAriaLabel(value: String): Self = StObject.set(x, "collapseAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseAriaLabelUndefined: Self = StObject.set(x, "collapseAriaLabel", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandAriaLabel(value: String): Self = StObject.set(x, "expandAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setExpandAriaLabelUndefined: Self = StObject.set(x, "expandAriaLabel", js.undefined)
      
      inline def setForceAnchor(value: Boolean): Self = StObject.set(x, "forceAnchor", value.asInstanceOf[js.Any])
      
      inline def setForceAnchorUndefined: Self = StObject.set(x, "forceAnchor", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      inline def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLinks(value: js.Array[INavLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: INavLink*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[INavLink]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait INavLinkGroup extends StObject {
    
    /**
      * The name to use for functional automation tests
      */
    var automationId: js.UndefOr[String] = js.undefined
    
    /**
      * ARIA label when group is collapsed and can be expanded.
      */
    var collapseAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * If true, the group should render collapsed by default
      */
    var collapseByDefault: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ARIA label when group is collapsed and can be expanded.
      */
    var expandAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) Any additional properties to apply to a group.
      */
    var groupData: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Links to render within this group
      */
    var links: js.Array[INavLink]
    
    /**
      * Text to render as the header of a group
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback invoked when a group header is clicked
      */
    var onHeaderClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* isCollapsing */ js.UndefOr[Boolean], 
          Unit
        ]
      ] = js.undefined
  }
  object INavLinkGroup {
    
    inline def apply(links: js.Array[INavLink]): INavLinkGroup = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavLinkGroup]
    }
    
    extension [Self <: INavLinkGroup](x: Self) {
      
      inline def setAutomationId(value: String): Self = StObject.set(x, "automationId", value.asInstanceOf[js.Any])
      
      inline def setAutomationIdUndefined: Self = StObject.set(x, "automationId", js.undefined)
      
      inline def setCollapseAriaLabel(value: String): Self = StObject.set(x, "collapseAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCollapseAriaLabelUndefined: Self = StObject.set(x, "collapseAriaLabel", js.undefined)
      
      inline def setCollapseByDefault(value: Boolean): Self = StObject.set(x, "collapseByDefault", value.asInstanceOf[js.Any])
      
      inline def setCollapseByDefaultUndefined: Self = StObject.set(x, "collapseByDefault", js.undefined)
      
      inline def setExpandAriaLabel(value: String): Self = StObject.set(x, "expandAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setExpandAriaLabelUndefined: Self = StObject.set(x, "expandAriaLabel", js.undefined)
      
      inline def setGroupData(value: js.Any): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
      
      inline def setGroupDataUndefined: Self = StObject.set(x, "groupData", js.undefined)
      
      inline def setLinks(value: js.Array[INavLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: INavLink*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnHeaderClick(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* isCollapsing */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onHeaderClick", js.Any.fromFunction2(value))
      
      inline def setOnHeaderClickUndefined: Self = StObject.set(x, "onHeaderClick", js.undefined)
    }
  }
  
  trait INavProps extends StObject {
    
    /**
      * (Optional) The nav container aria label.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Additional css class to apply to the Nav
      * @defaultvalue undefined
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the INav interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[INav]] = js.undefined
    
    /**
      * (Optional) The nav container aria label. The link name is prepended to this label.
      * If not provided, the aria label will default to the link name.
      *
      * @deprecated - Use expandAriaLabel and collapseAriaLabel on groups instead
      */
    var expandButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * A collection of link groups to display in the navigation bar
      */
    var groups: js.Array[INavLinkGroup] | Null
    
    /**
      * (Optional) The key of the nav item initially selected.
      */
    var initialSelectedKey: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether the navigation component renders on top of other content in the UI
      */
    var isOnTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Render a custom link in place of the normal one.
      * This replaces the entire button rather than simply button content
      */
    var linkAs: js.UndefOr[IComponentAs[INavButtonProps]] = js.undefined
    
    /**
      * Function callback invoked when a link in the navigation is clicked
      */
    var onLinkClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* item */ js.UndefOr[INavLink], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Function callback invoked when the chevron on a link is clicked
      */
    var onLinkExpandClick: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* item */ js.UndefOr[INavLink], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Used to customize how content inside the group header is rendered
      * @defaultvalue Default group header rendering
      */
    var onRenderGroupHeader: js.UndefOr[IRenderFunction[IRenderGroupHeaderProps]] = js.undefined
    
    /**
      * Used to customize how content inside the link tag is rendered
      * @defaultvalue Default link rendering
      */
    var onRenderLink: js.UndefOr[IRenderFunction[INavLink]] = js.undefined
    
    /**
      * (Deprecated) Use ariaCurrent on links instead
      * @deprecated Use ariaCurrent on links instead
      */
    var selectedAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) The key of the nav item selected by caller.
      */
    var selectedKey: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[INavStyleProps, INavStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object INavProps {
    
    inline def apply(): INavProps = {
      val __obj = js.Dynamic.literal(groups = null)
      __obj.asInstanceOf[INavProps]
    }
    
    extension [Self <: INavProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[INav]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ INav | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setExpandButtonAriaLabel(value: String): Self = StObject.set(x, "expandButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setExpandButtonAriaLabelUndefined: Self = StObject.set(x, "expandButtonAriaLabel", js.undefined)
      
      inline def setGroups(value: js.Array[INavLinkGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsNull: Self = StObject.set(x, "groups", null)
      
      inline def setGroupsVarargs(value: INavLinkGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setInitialSelectedKey(value: String): Self = StObject.set(x, "initialSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedKeyUndefined: Self = StObject.set(x, "initialSelectedKey", js.undefined)
      
      inline def setIsOnTop(value: Boolean): Self = StObject.set(x, "isOnTop", value.asInstanceOf[js.Any])
      
      inline def setIsOnTopUndefined: Self = StObject.set(x, "isOnTop", js.undefined)
      
      inline def setLinkAs(value: IComponentAs[INavButtonProps]): Self = StObject.set(x, "linkAs", value.asInstanceOf[js.Any])
      
      inline def setLinkAsUndefined: Self = StObject.set(x, "linkAs", js.undefined)
      
      inline def setOnLinkClick(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[INavLink]) => Unit
      ): Self = StObject.set(x, "onLinkClick", js.Any.fromFunction2(value))
      
      inline def setOnLinkClickUndefined: Self = StObject.set(x, "onLinkClick", js.undefined)
      
      inline def setOnLinkExpandClick(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[INavLink]) => Unit
      ): Self = StObject.set(x, "onLinkExpandClick", js.Any.fromFunction2(value))
      
      inline def setOnLinkExpandClickUndefined: Self = StObject.set(x, "onLinkExpandClick", js.undefined)
      
      inline def setOnRenderGroupHeader(
        value: (/* props */ js.UndefOr[IRenderGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IRenderGroupHeaderProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderGroupHeader", js.Any.fromFunction2(value))
      
      inline def setOnRenderGroupHeaderUndefined: Self = StObject.set(x, "onRenderGroupHeader", js.undefined)
      
      inline def setOnRenderLink(
        value: (/* props */ js.UndefOr[INavLink], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[INavLink], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderLink", js.Any.fromFunction2(value))
      
      inline def setOnRenderLinkUndefined: Self = StObject.set(x, "onRenderLink", js.undefined)
      
      inline def setSelectedAriaLabel(value: String): Self = StObject.set(x, "selectedAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectedAriaLabelUndefined: Self = StObject.set(x, "selectedAriaLabel", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[INavStyleProps, INavStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: INavStyleProps => DeepPartial[INavStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait INavStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Inherited from INavProps
      * A collection of link groups to display in the navigation bar
      */
    var groups: js.Array[INavLinkGroup] | Null
    
    /**
      * is button
      */
    var isButtonEntry: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is element disabled
      */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is element expanded boolean
      */
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is element a group boolean
      */
    var isGroup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is element a link boolean
      */
    var isLink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is element on top boolean
      */
    var isOnTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * is element selected boolean
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * left padding value
      */
    var leftPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * left padding when expanded value
      */
    var leftPaddingExpanded: js.UndefOr[Double] = js.undefined
    
    /**
      * Nav height value
      */
    var navHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * position value
      */
    var position: js.UndefOr[Double] = js.undefined
    
    /**
      * right padding value
      */
    var rightPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object INavStyleProps {
    
    inline def apply(theme: ITheme): INavStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], groups = null)
      __obj.asInstanceOf[INavStyleProps]
    }
    
    extension [Self <: INavStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setGroups(value: js.Array[INavLinkGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsNull: Self = StObject.set(x, "groups", null)
      
      inline def setGroupsVarargs(value: INavLinkGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setIsButtonEntry(value: Boolean): Self = StObject.set(x, "isButtonEntry", value.asInstanceOf[js.Any])
      
      inline def setIsButtonEntryUndefined: Self = StObject.set(x, "isButtonEntry", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
      
      inline def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
      
      inline def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
      
      inline def setIsOnTop(value: Boolean): Self = StObject.set(x, "isOnTop", value.asInstanceOf[js.Any])
      
      inline def setIsOnTopUndefined: Self = StObject.set(x, "isOnTop", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setLeftPadding(value: Double): Self = StObject.set(x, "leftPadding", value.asInstanceOf[js.Any])
      
      inline def setLeftPaddingExpanded(value: Double): Self = StObject.set(x, "leftPaddingExpanded", value.asInstanceOf[js.Any])
      
      inline def setLeftPaddingExpandedUndefined: Self = StObject.set(x, "leftPaddingExpanded", js.undefined)
      
      inline def setLeftPaddingUndefined: Self = StObject.set(x, "leftPadding", js.undefined)
      
      inline def setNavHeight(value: Double): Self = StObject.set(x, "navHeight", value.asInstanceOf[js.Any])
      
      inline def setNavHeightUndefined: Self = StObject.set(x, "navHeight", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRightPadding(value: Double): Self = StObject.set(x, "rightPadding", value.asInstanceOf[js.Any])
      
      inline def setRightPaddingUndefined: Self = StObject.set(x, "rightPadding", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait INavStyles extends StObject {
    
    /**
      * Style set for the chevron button inside the composite
      * link and group elements.
      */
    var chevronButton: IStyle
    
    /**
      * Style set for the chevron icon inside the composite
      * link and group elements.
      */
    var chevronIcon: IStyle
    
    /**
      * Style set for the composite link container div element
      */
    var compositeLink: IStyle
    
    /**
      * Style set for the group root div.
      */
    var group: IStyle
    
    /**
      * Style set for the group content div inside group.
      */
    var groupContent: IStyle
    
    /**
      * Style set for the link element extending the
      * root style set for ActionButton component.
      */
    var link: IStyle
    
    /**
      * Style set for the link text container div element.
      */
    var linkText: IStyle
    
    /**
      * Style set for the nav links li element.
      */
    var navItem: IStyle
    
    /**
      * Style set for the nav links ul element.
      */
    var navItems: IStyle
    
    /**
      * Style set for the root element.
      */
    var root: IStyle
  }
  object INavStyles {
    
    inline def apply(): INavStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INavStyles]
    }
    
    extension [Self <: INavStyles](x: Self) {
      
      inline def setChevronButton(value: IStyle): Self = StObject.set(x, "chevronButton", value.asInstanceOf[js.Any])
      
      inline def setChevronButtonNull: Self = StObject.set(x, "chevronButton", null)
      
      inline def setChevronButtonUndefined: Self = StObject.set(x, "chevronButton", js.undefined)
      
      inline def setChevronIcon(value: IStyle): Self = StObject.set(x, "chevronIcon", value.asInstanceOf[js.Any])
      
      inline def setChevronIconNull: Self = StObject.set(x, "chevronIcon", null)
      
      inline def setChevronIconUndefined: Self = StObject.set(x, "chevronIcon", js.undefined)
      
      inline def setCompositeLink(value: IStyle): Self = StObject.set(x, "compositeLink", value.asInstanceOf[js.Any])
      
      inline def setCompositeLinkNull: Self = StObject.set(x, "compositeLink", null)
      
      inline def setCompositeLinkUndefined: Self = StObject.set(x, "compositeLink", js.undefined)
      
      inline def setGroup(value: IStyle): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupContent(value: IStyle): Self = StObject.set(x, "groupContent", value.asInstanceOf[js.Any])
      
      inline def setGroupContentNull: Self = StObject.set(x, "groupContent", null)
      
      inline def setGroupContentUndefined: Self = StObject.set(x, "groupContent", js.undefined)
      
      inline def setGroupNull: Self = StObject.set(x, "group", null)
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setLink(value: IStyle): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkNull: Self = StObject.set(x, "link", null)
      
      inline def setLinkText(value: IStyle): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
      
      inline def setLinkTextNull: Self = StObject.set(x, "linkText", null)
      
      inline def setLinkTextUndefined: Self = StObject.set(x, "linkText", js.undefined)
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setNavItem(value: IStyle): Self = StObject.set(x, "navItem", value.asInstanceOf[js.Any])
      
      inline def setNavItemNull: Self = StObject.set(x, "navItem", null)
      
      inline def setNavItemUndefined: Self = StObject.set(x, "navItem", js.undefined)
      
      inline def setNavItems(value: IStyle): Self = StObject.set(x, "navItems", value.asInstanceOf[js.Any])
      
      inline def setNavItemsNull: Self = StObject.set(x, "navItems", null)
      
      inline def setNavItemsUndefined: Self = StObject.set(x, "navItems", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait IRenderGroupHeaderProps
    extends StObject
       with INavLinkGroup {
    
    /**
      * Whether or not the group is presently expanded.
      */
    var isExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object IRenderGroupHeaderProps {
    
    inline def apply(links: js.Array[INavLink]): IRenderGroupHeaderProps = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderGroupHeaderProps]
    }
    
    extension [Self <: IRenderGroupHeaderProps](x: Self) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    }
  }
}
