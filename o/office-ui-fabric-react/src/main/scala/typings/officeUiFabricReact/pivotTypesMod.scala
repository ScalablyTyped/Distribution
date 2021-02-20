package typings.officeUiFabricReact

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotTypesMod {
  
  @js.native
  sealed trait PivotLinkFormat extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkFormat")
  @js.native
  object PivotLinkFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PivotLinkFormat with Double] = js.native
    
    /**
      * Display Pivot Links as links
      */
    @js.native
    sealed trait links extends PivotLinkFormat
    /* 0 */ val links: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.links with Double = js.native
    
    /**
      * Display Pivot Links as Tabs
      */
    @js.native
    sealed trait tabs extends PivotLinkFormat
    /* 1 */ val tabs: typings.officeUiFabricReact.pivotTypesMod.PivotLinkFormat.tabs with Double = js.native
  }
  
  @js.native
  sealed trait PivotLinkSize extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Pivot/Pivot.types", "PivotLinkSize")
  @js.native
  object PivotLinkSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PivotLinkSize with Double] = js.native
    
    /**
      * Display links using large font size
      */
    @js.native
    sealed trait large extends PivotLinkSize
    /* 1 */ val large: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.large with Double = js.native
    
    /**
      * Display Link using normal font size
      */
    @js.native
    sealed trait normal extends PivotLinkSize
    /* 0 */ val normal: typings.officeUiFabricReact.pivotTypesMod.PivotLinkSize.normal with Double = js.native
  }
  
  @js.native
  trait IPivot extends StObject {
    
    /**
      * Sets focus to the first pivot tab.
      */
    def focus(): Unit = js.native
  }
  object IPivot {
    
    @scala.inline
    def apply(focus: () => Unit): IPivot = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IPivot]
    }
    
    @scala.inline
    implicit class IPivotMutableBuilder[Self <: IPivot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IPivotProps
    extends HTMLAttributes[HTMLDivElement]
       with ClassAttributes[PivotBase] {
    
    /**
      * Optional callback to access the IPivot interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IPivot]] = js.native
    
    /**
      * Default selected index for the pivot. Only provide this if the pivot is an uncontrolled component;
      * otherwise, use the `selectedKey` property.
      *
      * This property is also mutually exclusive with `defaultSelectedKey`.
      *
      * @deprecated Use `defaultSelectedKey`
      */
    var defaultSelectedIndex: js.UndefOr[Double] = js.native
    
    /**
      * Default selected key for the pivot. Only provide this if the pivot is an uncontrolled component;
      * otherwise, use the `selectedKey` property.
      *
      * This property is also mutually exclusive with `defaultSelectedIndex`.
      */
    var defaultSelectedKey: js.UndefOr[String] = js.native
    
    /**
      * Callback to customize how IDs are generated for each tab header.
      * Useful if you're rendering content outside and need to connect aria-labelledby.
      */
    var getTabId: js.UndefOr[js.Function2[/* itemKey */ String, /* index */ Double, String]] = js.native
    
    /**
      * Whether to skip rendering the tabpanel with the content of the selected tab.
      * Use this prop if you plan to separately render the tab content
      * and don't want to leave an empty tabpanel in the page that may confuse Screen Readers.
      */
    var headersOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Index of the pivot item initially selected. Mutually exclusive with `initialSelectedKey`.
      * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
      *
      * @deprecated Use `defaultSelectedKey`
      */
    var initialSelectedIndex: js.UndefOr[Double] = js.native
    
    /**
      * Key of the pivot item initially selected. Mutually exclusive with `initialSelectedIndex`.
      * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
      *
      * @deprecated Use `defaultSelectedKey`
      */
    var initialSelectedKey: js.UndefOr[String] = js.native
    
    /**
      * PivotLinkFormat to use (links, tabs)
      */
    var linkFormat: js.UndefOr[PivotLinkFormat] = js.native
    
    /**
      * PivotLinkSize to use (normal, large)
      */
    var linkSize: js.UndefOr[PivotLinkSize] = js.native
    
    /**
      * Callback for when the selected pivot item is changed.
      */
    var onLinkClick: js.UndefOr[
        js.Function2[
          /* item */ js.UndefOr[PivotItem], 
          /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
          Unit
        ]
      ] = js.native
    
    /**
      * Key of the selected pivot item. Updating this will override the Pivot's selected item state.
      * Only provide this if the pivot is a controlled component where you are maintaining the
      * current state; otherwise, use `defaultSelectedKey`.
      */
    var selectedKey: js.UndefOr[String | Null] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IPivotProps {
    
    @scala.inline
    def apply(): IPivotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPivotProps]
    }
    
    @scala.inline
    implicit class IPivotPropsMutableBuilder[Self <: IPivotProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentRef(value: IRefObject[IPivot]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IPivot | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDefaultSelectedIndex(value: Double): Self = StObject.set(x, "defaultSelectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedIndexUndefined: Self = StObject.set(x, "defaultSelectedIndex", js.undefined)
      
      @scala.inline
      def setDefaultSelectedKey(value: String): Self = StObject.set(x, "defaultSelectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedKeyUndefined: Self = StObject.set(x, "defaultSelectedKey", js.undefined)
      
      @scala.inline
      def setGetTabId(value: (/* itemKey */ String, /* index */ Double) => String): Self = StObject.set(x, "getTabId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetTabIdUndefined: Self = StObject.set(x, "getTabId", js.undefined)
      
      @scala.inline
      def setHeadersOnly(value: Boolean): Self = StObject.set(x, "headersOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersOnlyUndefined: Self = StObject.set(x, "headersOnly", js.undefined)
      
      @scala.inline
      def setInitialSelectedIndex(value: Double): Self = StObject.set(x, "initialSelectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedIndexUndefined: Self = StObject.set(x, "initialSelectedIndex", js.undefined)
      
      @scala.inline
      def setInitialSelectedKey(value: String): Self = StObject.set(x, "initialSelectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedKeyUndefined: Self = StObject.set(x, "initialSelectedKey", js.undefined)
      
      @scala.inline
      def setLinkFormat(value: PivotLinkFormat): Self = StObject.set(x, "linkFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkFormatUndefined: Self = StObject.set(x, "linkFormat", js.undefined)
      
      @scala.inline
      def setLinkSize(value: PivotLinkSize): Self = StObject.set(x, "linkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkSizeUndefined: Self = StObject.set(x, "linkSize", js.undefined)
      
      @scala.inline
      def setOnLinkClick(
        value: (/* item */ js.UndefOr[PivotItem], /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]]) => Unit
      ): Self = StObject.set(x, "onLinkClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLinkClickUndefined: Self = StObject.set(x, "onLinkClick", js.undefined)
      
      @scala.inline
      def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeyNull: Self = StObject.set(x, "selectedKey", null)
      
      @scala.inline
      def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IPivotStyleProps => DeepPartial[IPivotStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Pivot/Pivot.types.IPivotProps, 'className'> & {  rootIsLarge :boolean | undefined,   rootIsTabs :boolean | undefined,   linkIsSelected :boolean | undefined} */
  @js.native
  trait IPivotStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether Pivot link is selected.
      * @deprecated Is not populated with valid value. Specify `linkIsSelected` styling instead.
      */
    var linkIsSelected: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether Pivot has large format. */
    var rootIsLarge: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether Pivot has tabbed format. */
    var rootIsTabs: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object IPivotStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IPivotStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPivotStyleProps]
    }
    
    @scala.inline
    implicit class IPivotStylePropsMutableBuilder[Self <: IPivotStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLinkIsSelected(value: Boolean): Self = StObject.set(x, "linkIsSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkIsSelectedUndefined: Self = StObject.set(x, "linkIsSelected", js.undefined)
      
      @scala.inline
      def setRootIsLarge(value: Boolean): Self = StObject.set(x, "rootIsLarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIsLargeUndefined: Self = StObject.set(x, "rootIsLarge", js.undefined)
      
      @scala.inline
      def setRootIsTabs(value: Boolean): Self = StObject.set(x, "rootIsTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIsTabsUndefined: Self = StObject.set(x, "rootIsTabs", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPivotStyles extends StObject {
    
    var count: IStyle = js.native
    
    var icon: IStyle = js.native
    
    var itemContainer: js.UndefOr[IStyle] = js.native
    
    var link: IStyle = js.native
    
    var linkContent: IStyle = js.native
    
    var linkIsSelected: IStyle = js.native
    
    /**
      * Style for the root element.
      */
    var root: IStyle = js.native
    
    var text: IStyle = js.native
  }
  object IPivotStyles {
    
    @scala.inline
    def apply(): IPivotStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPivotStyles]
    }
    
    @scala.inline
    implicit class IPivotStylesMutableBuilder[Self <: IPivotStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: IStyle): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setItemContainer(value: IStyle): Self = StObject.set(x, "itemContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemContainerNull: Self = StObject.set(x, "itemContainer", null)
      
      @scala.inline
      def setItemContainerUndefined: Self = StObject.set(x, "itemContainer", js.undefined)
      
      @scala.inline
      def setLink(value: IStyle): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkContent(value: IStyle): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkContentNull: Self = StObject.set(x, "linkContent", null)
      
      @scala.inline
      def setLinkContentUndefined: Self = StObject.set(x, "linkContent", js.undefined)
      
      @scala.inline
      def setLinkIsSelected(value: IStyle): Self = StObject.set(x, "linkIsSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkIsSelectedNull: Self = StObject.set(x, "linkIsSelected", null)
      
      @scala.inline
      def setLinkIsSelectedUndefined: Self = StObject.set(x, "linkIsSelected", js.undefined)
      
      @scala.inline
      def setLinkNull: Self = StObject.set(x, "link", null)
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setText(value: IStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
