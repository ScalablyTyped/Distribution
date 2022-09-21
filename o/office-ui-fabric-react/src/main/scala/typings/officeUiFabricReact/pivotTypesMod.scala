package typings.officeUiFabricReact

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.pivotBaseMod.PivotBase
import typings.officeUiFabricReact.pivotItemMod.PivotItem
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotTypesMod {
  
  @js.native
  sealed trait PivotLinkFormat extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkFormat")
  @js.native
  object PivotLinkFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PivotLinkFormat & Double] = js.native
    
    /**
      * Display Pivot Links as links
      */
    @js.native
    sealed trait links
      extends StObject
         with PivotLinkFormat
    /* 0 */ val links: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.links & Double = js.native
    
    /**
      * Display Pivot Links as Tabs
      */
    @js.native
    sealed trait tabs
      extends StObject
         with PivotLinkFormat
    /* 1 */ val tabs: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.tabs & Double = js.native
  }
  
  @js.native
  sealed trait PivotLinkSize extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkSize")
  @js.native
  object PivotLinkSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PivotLinkSize & Double] = js.native
    
    /**
      * Display links using large font size
      */
    @js.native
    sealed trait large
      extends StObject
         with PivotLinkSize
    /* 1 */ val large: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.large & Double = js.native
    
    /**
      * Display Link using normal font size
      */
    @js.native
    sealed trait normal
      extends StObject
         with PivotLinkSize
    /* 0 */ val normal: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.normal & Double = js.native
  }
  
  trait IPivot extends StObject {
    
    /**
      * Sets focus to the first pivot tab.
      */
    def focus(): Unit
  }
  object IPivot {
    
    inline def apply(focus: () => Unit): IPivot = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IPivot]
    }
    
    extension [Self <: IPivot](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait IPivotProps
    extends StObject
       with ClassAttributes[PivotBase]
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Optional callback to access the IPivot interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IPivot]] = js.undefined
    
    /**
      * Default selected index for the pivot. Only provide this if the pivot is an uncontrolled component;
      * otherwise, use the `selectedKey` property.
      *
      * This property is also mutually exclusive with `defaultSelectedKey`.
      *
      * @deprecated Use `defaultSelectedKey`
      */
    var defaultSelectedIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Default selected key for the pivot. Only provide this if the pivot is an uncontrolled component;
      * otherwise, use the `selectedKey` property.
      *
      * This property is also mutually exclusive with `defaultSelectedIndex`.
      */
    var defaultSelectedKey: js.UndefOr[String] = js.undefined
    
    /**
      * Props passed to the `FocusZone` component used as the root of `Pivot`.
      */
    var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
    
    /**
      * Callback to customize how IDs are generated for each tab header.
      * Useful if you're rendering content outside and need to connect aria-labelledby.
      */
    var getTabId: js.UndefOr[js.Function2[/* itemKey */ String, /* index */ Double, String]] = js.undefined
    
    /**
      * Whether to skip rendering the tabpanel with the content of the selected tab.
      * Use this prop if you plan to separately render the tab content
      * and don't want to leave an empty tabpanel in the page that may confuse Screen Readers.
      */
    var headersOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Index of the pivot item initially selected. Mutually exclusive with `initialSelectedKey`.
      * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
      *
      * @deprecated Use `defaultSelectedKey`
      */
    var initialSelectedIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Key of the pivot item initially selected. Mutually exclusive with `initialSelectedIndex`.
      * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
      *
      * @deprecated Use `defaultSelectedKey`
      */
    var initialSelectedKey: js.UndefOr[String] = js.undefined
    
    /**
      * PivotLinkFormat to use (links, tabs)
      */
    var linkFormat: js.UndefOr[PivotLinkFormat] = js.undefined
    
    /**
      * PivotLinkSize to use (normal, large)
      */
    var linkSize: js.UndefOr[PivotLinkSize] = js.undefined
    
    /**
      * Callback for when the selected pivot item is changed.
      */
    var onLinkClick: js.UndefOr[
        js.Function2[
          /* item */ js.UndefOr[PivotItem], 
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Key of the selected pivot item. Updating this will override the Pivot's selected item state.
      * Only provide this if the pivot is a controlled component where you are maintaining the
      * current state; otherwise, use `defaultSelectedKey`.
      */
    var selectedKey: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IPivotProps {
    
    inline def apply(): IPivotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPivotProps]
    }
    
    extension [Self <: IPivotProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[IPivot]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IPivot | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDefaultSelectedIndex(value: Double): Self = StObject.set(x, "defaultSelectedIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedIndexUndefined: Self = StObject.set(x, "defaultSelectedIndex", js.undefined)
      
      inline def setDefaultSelectedKey(value: String): Self = StObject.set(x, "defaultSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeyUndefined: Self = StObject.set(x, "defaultSelectedKey", js.undefined)
      
      inline def setFocusZoneProps(value: IFocusZoneProps): Self = StObject.set(x, "focusZoneProps", value.asInstanceOf[js.Any])
      
      inline def setFocusZonePropsUndefined: Self = StObject.set(x, "focusZoneProps", js.undefined)
      
      inline def setGetTabId(value: (/* itemKey */ String, /* index */ Double) => String): Self = StObject.set(x, "getTabId", js.Any.fromFunction2(value))
      
      inline def setGetTabIdUndefined: Self = StObject.set(x, "getTabId", js.undefined)
      
      inline def setHeadersOnly(value: Boolean): Self = StObject.set(x, "headersOnly", value.asInstanceOf[js.Any])
      
      inline def setHeadersOnlyUndefined: Self = StObject.set(x, "headersOnly", js.undefined)
      
      inline def setInitialSelectedIndex(value: Double): Self = StObject.set(x, "initialSelectedIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIndexUndefined: Self = StObject.set(x, "initialSelectedIndex", js.undefined)
      
      inline def setInitialSelectedKey(value: String): Self = StObject.set(x, "initialSelectedKey", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedKeyUndefined: Self = StObject.set(x, "initialSelectedKey", js.undefined)
      
      inline def setLinkFormat(value: PivotLinkFormat): Self = StObject.set(x, "linkFormat", value.asInstanceOf[js.Any])
      
      inline def setLinkFormatUndefined: Self = StObject.set(x, "linkFormat", js.undefined)
      
      inline def setLinkSize(value: PivotLinkSize): Self = StObject.set(x, "linkSize", value.asInstanceOf[js.Any])
      
      inline def setLinkSizeUndefined: Self = StObject.set(x, "linkSize", js.undefined)
      
      inline def setOnLinkClick(
        value: (/* item */ js.UndefOr[PivotItem], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit
      ): Self = StObject.set(x, "onLinkClick", js.Any.fromFunction2(value))
      
      inline def setOnLinkClickUndefined: Self = StObject.set(x, "onLinkClick", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyNull: Self = StObject.set(x, "selectedKey", null)
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IPivotStyleProps => DeepPartial[IPivotStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'className'> & {  rootIsLarge :boolean | undefined,   rootIsTabs :boolean | undefined,   linkIsSelected :boolean | undefined} */
  trait IPivotStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates whether Pivot link is selected.
      * @deprecated Is not populated with valid value. Specify `linkIsSelected` styling instead.
      */
    var linkIsSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates whether Pivot has large format. */
    var rootIsLarge: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates whether Pivot has tabbed format. */
    var rootIsTabs: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IPivotStyleProps {
    
    inline def apply(theme: ITheme): IPivotStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPivotStyleProps]
    }
    
    extension [Self <: IPivotStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLinkIsSelected(value: Boolean): Self = StObject.set(x, "linkIsSelected", value.asInstanceOf[js.Any])
      
      inline def setLinkIsSelectedUndefined: Self = StObject.set(x, "linkIsSelected", js.undefined)
      
      inline def setRootIsLarge(value: Boolean): Self = StObject.set(x, "rootIsLarge", value.asInstanceOf[js.Any])
      
      inline def setRootIsLargeUndefined: Self = StObject.set(x, "rootIsLarge", js.undefined)
      
      inline def setRootIsTabs(value: Boolean): Self = StObject.set(x, "rootIsTabs", value.asInstanceOf[js.Any])
      
      inline def setRootIsTabsUndefined: Self = StObject.set(x, "rootIsTabs", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPivotStyles extends StObject {
    
    var count: IStyle
    
    var icon: IStyle
    
    var itemContainer: js.UndefOr[IStyle] = js.undefined
    
    var link: IStyle
    
    var linkContent: IStyle
    
    var linkIsSelected: IStyle
    
    /**
      * Style for the root element.
      */
    var root: IStyle
    
    var text: IStyle
  }
  object IPivotStyles {
    
    inline def apply(): IPivotStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPivotStyles]
    }
    
    extension [Self <: IPivotStyles](x: Self) {
      
      inline def setCount(value: IStyle): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountNull: Self = StObject.set(x, "count", null)
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItemContainer(value: IStyle): Self = StObject.set(x, "itemContainer", value.asInstanceOf[js.Any])
      
      inline def setItemContainerNull: Self = StObject.set(x, "itemContainer", null)
      
      inline def setItemContainerUndefined: Self = StObject.set(x, "itemContainer", js.undefined)
      
      inline def setLink(value: IStyle): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkContent(value: IStyle): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
      
      inline def setLinkContentNull: Self = StObject.set(x, "linkContent", null)
      
      inline def setLinkContentUndefined: Self = StObject.set(x, "linkContent", js.undefined)
      
      inline def setLinkIsSelected(value: IStyle): Self = StObject.set(x, "linkIsSelected", value.asInstanceOf[js.Any])
      
      inline def setLinkIsSelectedNull: Self = StObject.set(x, "linkIsSelected", null)
      
      inline def setLinkIsSelectedUndefined: Self = StObject.set(x, "linkIsSelected", js.undefined)
      
      inline def setLinkNull: Self = StObject.set(x, "link", null)
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setText(value: IStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
