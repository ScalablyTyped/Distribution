package typings.officeUiFabricReact

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.h1
import typings.officeUiFabricReact.officeUiFabricReactStrings.h2
import typings.officeUiFabricReact.officeUiFabricReactStrings.h3
import typings.officeUiFabricReact.officeUiFabricReactStrings.h4
import typings.officeUiFabricReact.officeUiFabricReactStrings.h5
import typings.officeUiFabricReact.officeUiFabricReactStrings.h6
import typings.officeUiFabricReact.tooltipHostTypesMod.ITooltipHostProps
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.HTMLAttributes
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

object breadcrumbTypesMod {
  
  trait IBreadcrumb extends StObject {
    
    /**
      * Sets focus to the first breadcrumb link.
      */
    def focus(): Unit
  }
  object IBreadcrumb {
    
    inline def apply(focus: () => Unit): IBreadcrumb = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IBreadcrumb]
    }
    
    extension [Self <: IBreadcrumb](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait IBreadcrumbData extends StObject {
    
    var props: IBreadcrumbProps
    
    var renderedItems: js.Array[IBreadcrumbItem]
    
    var renderedOverflowItems: js.Array[IBreadcrumbItem]
  }
  object IBreadcrumbData {
    
    inline def apply(
      props: IBreadcrumbProps,
      renderedItems: js.Array[IBreadcrumbItem],
      renderedOverflowItems: js.Array[IBreadcrumbItem]
    ): IBreadcrumbData = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], renderedItems = renderedItems.asInstanceOf[js.Any], renderedOverflowItems = renderedOverflowItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbData]
    }
    
    extension [Self <: IBreadcrumbData](x: Self) {
      
      inline def setProps(value: IBreadcrumbProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setRenderedItems(value: js.Array[IBreadcrumbItem]): Self = StObject.set(x, "renderedItems", value.asInstanceOf[js.Any])
      
      inline def setRenderedItemsVarargs(value: IBreadcrumbItem*): Self = StObject.set(x, "renderedItems", js.Array(value*))
      
      inline def setRenderedOverflowItems(value: js.Array[IBreadcrumbItem]): Self = StObject.set(x, "renderedOverflowItems", value.asInstanceOf[js.Any])
      
      inline def setRenderedOverflowItemsVarargs(value: IBreadcrumbItem*): Self = StObject.set(x, "renderedOverflowItems", js.Array(value*))
    }
  }
  
  trait IBreadcrumbItem
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * Optional prop to render the item as a heading of your choice.
      *
      * You can also use this to force items to render as links instead of buttons (by default,
      * any item with a `href` renders as a link, and any item without a `href` renders as a button).
      * This is not generally recommended because it may prevent activating the link using the keyboard.
      */
    @JSName("as")
    var as_IBreadcrumbItem: js.UndefOr[h1 | h2 | h3 | h4 | h5 | h6 | a] = js.undefined
    
    /**
      * Whether this is the breadcrumb item the user is currently navigated to.
      * If true, `aria-current="page"` will be applied to this breadcrumb item.
      */
    var isCurrentItem: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Arbitrary unique string associated with the breadcrumb item.
      */
    var key: String
    
    /**
      * Callback issued when the breadcrumb item is selected.
      */
    @JSName("onClick")
    var onClick_IBreadcrumbItem: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          /* item */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function to render the outer content of the crumb (the link).
      */
    var onRender: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.undefined
    
    /**
      * A function to render the inner content of the crumb (the text inside the link).
      */
    var onRenderContent: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.undefined
    
    /**
      * Optional role for the breadcrumb item (which renders as a button by default)
      */
    @JSName("role")
    var role_IBreadcrumbItem: js.UndefOr[String] = js.undefined
    
    /**
      * Text to display to the user for the breadcrumb item.
      */
    var text: String
  }
  object IBreadcrumbItem {
    
    inline def apply(key: String, text: String): IBreadcrumbItem = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbItem]
    }
    
    extension [Self <: IBreadcrumbItem](x: Self) {
      
      inline def setAs(value: h1 | h2 | h3 | h4 | h5 | h6 | a): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setIsCurrentItem(value: Boolean): Self = StObject.set(x, "isCurrentItem", value.asInstanceOf[js.Any])
      
      inline def setIsCurrentItemUndefined: Self = StObject.set(x, "isCurrentItem", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[IBreadcrumbItem]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnRender(
        value: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRender", js.Any.fromFunction2(value))
      
      inline def setOnRenderContent(
        value: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderContent", js.Any.fromFunction2(value))
      
      inline def setOnRenderContentUndefined: Self = StObject.set(x, "onRenderContent", js.undefined)
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBreadcrumbProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Aria label for the root element of the breadcrumb (which is a navigation landmark).
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the IBreadcrumb interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IBreadcrumb]] = js.undefined
    
    /**
      * Render a custom divider in place of the default chevron `>`
      */
    var dividerAs: js.UndefOr[IComponentAs[IDividerAsProps]] = js.undefined
    
    /**
      * Extra props for the root FocusZone.
      */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
    
    /**
      * Collection of breadcrumbs to render
      */
    var items: js.Array[IBreadcrumbItem]
    
    /**
      * The maximum number of breadcrumbs to display before coalescing.
      * If not specified, all breadcrumbs will be rendered.
      */
    var maxDisplayedItems: js.UndefOr[Double] = js.undefined
    
    /**
      * Method that determines how to group the length of the breadcrumb.
      * Return undefined to never increase breadcrumb length.
      */
    var onGrowData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.undefined
    
    /**
      * Method that determines how to reduce the length of the breadcrumb.
      * Return undefined to never reduce breadcrumb length.
      */
    var onReduceData: js.UndefOr[js.Function1[/* data */ IBreadcrumbData, js.UndefOr[IBreadcrumbData]]] = js.undefined
    
    /** Custom render function to render each crumb. Default renders as a link. */
    var onRenderItem: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.undefined
    
    /**
      * Custom render function to render the content within a crumb. Default renders the text.
      */
    var onRenderItemContent: js.UndefOr[IRenderFunction[IBreadcrumbItem]] = js.undefined
    
    /**
      * Render a custom overflow icon in place of the default icon `...`
      */
    var onRenderOverflowIcon: js.UndefOr[IRenderFunction[IButtonProps]] = js.undefined
    
    /**
      * Aria label for the overflow button.
      */
    var overflowAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Custom component for the overflow button.
      */
    var overflowButtonAs: js.UndefOr[IComponentAs[IButtonProps]] = js.undefined
    
    /**
      * Optional index where overflow items will be collapsed. Defaults to 0.
      */
    var overflowIndex: js.UndefOr[Double] = js.undefined
    
    var styles: js.UndefOr[IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]] = js.undefined
    
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Extra props for the TooltipHost which wraps each breadcrumb item.
      */
    var tooltipHostProps: js.UndefOr[ITooltipHostProps] = js.undefined
  }
  object IBreadcrumbProps {
    
    inline def apply(items: js.Array[IBreadcrumbItem]): IBreadcrumbProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbProps]
    }
    
    extension [Self <: IBreadcrumbProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IBreadcrumb]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IBreadcrumb | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDividerAs(value: IComponentAs[IDividerAsProps]): Self = StObject.set(x, "dividerAs", value.asInstanceOf[js.Any])
      
      inline def setDividerAsUndefined: Self = StObject.set(x, "dividerAs", js.undefined)
      
      inline def setFocusZoneProps(value: IFocusZoneProps): Self = StObject.set(x, "focusZoneProps", value.asInstanceOf[js.Any])
      
      inline def setFocusZonePropsUndefined: Self = StObject.set(x, "focusZoneProps", js.undefined)
      
      inline def setItems(value: js.Array[IBreadcrumbItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: IBreadcrumbItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxDisplayedItems(value: Double): Self = StObject.set(x, "maxDisplayedItems", value.asInstanceOf[js.Any])
      
      inline def setMaxDisplayedItemsUndefined: Self = StObject.set(x, "maxDisplayedItems", js.undefined)
      
      inline def setOnGrowData(value: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData]): Self = StObject.set(x, "onGrowData", js.Any.fromFunction1(value))
      
      inline def setOnGrowDataUndefined: Self = StObject.set(x, "onGrowData", js.undefined)
      
      inline def setOnReduceData(value: /* data */ IBreadcrumbData => js.UndefOr[IBreadcrumbData]): Self = StObject.set(x, "onReduceData", js.Any.fromFunction1(value))
      
      inline def setOnReduceDataUndefined: Self = StObject.set(x, "onReduceData", js.undefined)
      
      inline def setOnRenderItem(
        value: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction2(value))
      
      inline def setOnRenderItemContent(
        value: (/* props */ js.UndefOr[IBreadcrumbItem], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IBreadcrumbItem], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderItemContent", js.Any.fromFunction2(value))
      
      inline def setOnRenderItemContentUndefined: Self = StObject.set(x, "onRenderItemContent", js.undefined)
      
      inline def setOnRenderItemUndefined: Self = StObject.set(x, "onRenderItem", js.undefined)
      
      inline def setOnRenderOverflowIcon(
        value: (/* props */ js.UndefOr[IButtonProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IButtonProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderOverflowIcon", js.Any.fromFunction2(value))
      
      inline def setOnRenderOverflowIconUndefined: Self = StObject.set(x, "onRenderOverflowIcon", js.undefined)
      
      inline def setOverflowAriaLabel(value: String): Self = StObject.set(x, "overflowAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setOverflowAriaLabelUndefined: Self = StObject.set(x, "overflowAriaLabel", js.undefined)
      
      inline def setOverflowButtonAs(value: IComponentAs[IButtonProps]): Self = StObject.set(x, "overflowButtonAs", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonAsUndefined: Self = StObject.set(x, "overflowButtonAs", js.undefined)
      
      inline def setOverflowIndex(value: Double): Self = StObject.set(x, "overflowIndex", value.asInstanceOf[js.Any])
      
      inline def setOverflowIndexUndefined: Self = StObject.set(x, "overflowIndex", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IBreadcrumbStyleProps, IBreadcrumbStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IBreadcrumbStyleProps => DeepPartial[IBreadcrumbStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltipHostProps(value: ITooltipHostProps): Self = StObject.set(x, "tooltipHostProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipHostPropsUndefined: Self = StObject.set(x, "tooltipHostProps", js.undefined)
    }
  }
  
  trait IBreadcrumbStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
  }
  object IBreadcrumbStyleProps {
    
    inline def apply(theme: ITheme): IBreadcrumbStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBreadcrumbStyleProps]
    }
    
    extension [Self <: IBreadcrumbStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBreadcrumbStyles extends StObject {
    
    var chevron: IStyle
    
    var item: IStyle
    
    var itemLink: IStyle
    
    var list: IStyle
    
    var listItem: IStyle
    
    var overflow: IStyle
    
    var overflowButton: IStyle
    
    var root: IStyle
  }
  object IBreadcrumbStyles {
    
    inline def apply(): IBreadcrumbStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBreadcrumbStyles]
    }
    
    extension [Self <: IBreadcrumbStyles](x: Self) {
      
      inline def setChevron(value: IStyle): Self = StObject.set(x, "chevron", value.asInstanceOf[js.Any])
      
      inline def setChevronNull: Self = StObject.set(x, "chevron", null)
      
      inline def setChevronUndefined: Self = StObject.set(x, "chevron", js.undefined)
      
      inline def setItem(value: IStyle): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemLink(value: IStyle): Self = StObject.set(x, "itemLink", value.asInstanceOf[js.Any])
      
      inline def setItemLinkNull: Self = StObject.set(x, "itemLink", null)
      
      inline def setItemLinkUndefined: Self = StObject.set(x, "itemLink", js.undefined)
      
      inline def setItemNull: Self = StObject.set(x, "item", null)
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setList(value: IStyle): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListItem(value: IStyle): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      inline def setListItemNull: Self = StObject.set(x, "listItem", null)
      
      inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
      
      inline def setListNull: Self = StObject.set(x, "list", null)
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setOverflow(value: IStyle): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowButton(value: IStyle): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonNull: Self = StObject.set(x, "overflowButton", null)
      
      inline def setOverflowButtonUndefined: Self = StObject.set(x, "overflowButton", js.undefined)
      
      inline def setOverflowNull: Self = StObject.set(x, "overflow", null)
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait IDividerAsProps
    extends StObject
       with IIconProps {
    
    /**
      * Breadcrumb item to left of the divider to be passed for custom rendering.
      * For overflowed items, it will be last item in the list.
      */
    var item: js.UndefOr[IBreadcrumbItem] = js.undefined
  }
  object IDividerAsProps {
    
    inline def apply(): IDividerAsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDividerAsProps]
    }
    
    extension [Self <: IDividerAsProps](x: Self) {
      
      inline def setItem(value: IBreadcrumbItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
}
