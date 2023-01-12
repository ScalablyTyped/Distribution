package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.anon.AddSticky
import typings.officeUiFabricReact.libComponentsScrollablePaneScrollablePaneDotbaseMod.ScrollablePaneBase
import typings.officeUiFabricReact.officeUiFabricReactStrings.always
import typings.officeUiFabricReact.officeUiFabricReactStrings.auto
import typings.react.mod.Context
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsScrollablePaneScrollablePaneDottypesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.types", "ScrollablePaneContext")
  @js.native
  val ScrollablePaneContext: Context[IScrollablePaneContext] = js.native
  
  /* Inlined {  auto :'auto',   always :'always'}[keyof {  auto :'auto',   always :'always'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactStrings.auto
    - typings.officeUiFabricReact.officeUiFabricReactStrings.always
  */
  trait ScrollbarVisibility extends StObject
  object ScrollbarVisibility {
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.types", "ScrollbarVisibility")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.types", "ScrollbarVisibility.always")
    @js.native
    def always: typings.officeUiFabricReact.officeUiFabricReactStrings.always = js.native
    inline def always_=(x: always): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("always")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/ScrollablePane/ScrollablePane.types", "ScrollbarVisibility.auto")
    @js.native
    def auto: typings.officeUiFabricReact.officeUiFabricReactStrings.auto = js.native
    inline def auto_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
  }
  
  trait IScrollablePane extends StObject {
    
    /** Triggers a layout update for the pane. */
    def forceLayoutUpdate(): Unit
    
    /** Gets the current scroll position of the scrollable pane */
    def getScrollPosition(): Double
  }
  object IScrollablePane {
    
    inline def apply(forceLayoutUpdate: () => Unit, getScrollPosition: () => Double): IScrollablePane = {
      val __obj = js.Dynamic.literal(forceLayoutUpdate = js.Any.fromFunction0(forceLayoutUpdate), getScrollPosition = js.Any.fromFunction0(getScrollPosition))
      __obj.asInstanceOf[IScrollablePane]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollablePane] (val x: Self) extends AnyVal {
      
      inline def setForceLayoutUpdate(value: () => Unit): Self = StObject.set(x, "forceLayoutUpdate", js.Any.fromFunction0(value))
      
      inline def setGetScrollPosition(value: () => Double): Self = StObject.set(x, "getScrollPosition", js.Any.fromFunction0(value))
    }
  }
  
  trait IScrollablePaneContext extends StObject {
    
    var scrollablePane: js.UndefOr[AddSticky] = js.undefined
  }
  object IScrollablePaneContext {
    
    inline def apply(): IScrollablePaneContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollablePaneContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollablePaneContext] (val x: Self) extends AnyVal {
      
      inline def setScrollablePane(value: AddSticky): Self = StObject.set(x, "scrollablePane", value.asInstanceOf[js.Any])
      
      inline def setScrollablePaneUndefined: Self = StObject.set(x, "scrollablePane", js.undefined)
    }
  }
  
  trait IScrollablePaneProps
    extends StObject
       with HTMLAttributes[HTMLElement | ScrollablePaneBase] {
    
    /**
      * Optional callback to access the IScrollablePane interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IScrollablePane]] = js.undefined
    
    /**
      * Sets the initial scroll position of the ScrollablePane
      */
    var initialScrollPosition: js.UndefOr[Double] = js.undefined
    
    var scrollbarVisibility: js.UndefOr[ScrollbarVisibility] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IScrollablePaneProps {
    
    inline def apply(): IScrollablePaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollablePaneProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollablePaneProps] (val x: Self) extends AnyVal {
      
      inline def setComponentRef(value: IRefObject[IScrollablePane]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IScrollablePane | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setInitialScrollPosition(value: Double): Self = StObject.set(x, "initialScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setInitialScrollPositionUndefined: Self = StObject.set(x, "initialScrollPosition", js.undefined)
      
      inline def setScrollbarVisibility(value: ScrollbarVisibility): Self = StObject.set(x, "scrollbarVisibility", value.asInstanceOf[js.Any])
      
      inline def setScrollbarVisibilityUndefined: Self = StObject.set(x, "scrollbarVisibility", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IScrollablePaneStyleProps => DeepPartial[IScrollablePaneStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IScrollablePaneStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    var scrollbarVisibility: js.UndefOr[ScrollbarVisibility] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IScrollablePaneStyleProps {
    
    inline def apply(theme: ITheme): IScrollablePaneStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollablePaneStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollablePaneStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setScrollbarVisibility(value: ScrollbarVisibility): Self = StObject.set(x, "scrollbarVisibility", value.asInstanceOf[js.Any])
      
      inline def setScrollbarVisibilityUndefined: Self = StObject.set(x, "scrollbarVisibility", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScrollablePaneStyles extends StObject {
    
    /**
      * Style set for the contentContainer element.
      */
    var contentContainer: IStyle
    
    /**
      * Style set for the root element.
      */
    var root: IStyle
    
    /**
      * Style set for the stickyAbove element.
      */
    var stickyAbove: IStyle
    
    /**
      * Style set for the stickyBelow element.
      */
    var stickyBelow: IStyle
    
    /**
      * Style set for the stickyBelowItems element.
      */
    var stickyBelowItems: IStyle
  }
  object IScrollablePaneStyles {
    
    inline def apply(): IScrollablePaneStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollablePaneStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScrollablePaneStyles] (val x: Self) extends AnyVal {
      
      inline def setContentContainer(value: IStyle): Self = StObject.set(x, "contentContainer", value.asInstanceOf[js.Any])
      
      inline def setContentContainerNull: Self = StObject.set(x, "contentContainer", null)
      
      inline def setContentContainerUndefined: Self = StObject.set(x, "contentContainer", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setStickyAbove(value: IStyle): Self = StObject.set(x, "stickyAbove", value.asInstanceOf[js.Any])
      
      inline def setStickyAboveNull: Self = StObject.set(x, "stickyAbove", null)
      
      inline def setStickyAboveUndefined: Self = StObject.set(x, "stickyAbove", js.undefined)
      
      inline def setStickyBelow(value: IStyle): Self = StObject.set(x, "stickyBelow", value.asInstanceOf[js.Any])
      
      inline def setStickyBelowItems(value: IStyle): Self = StObject.set(x, "stickyBelowItems", value.asInstanceOf[js.Any])
      
      inline def setStickyBelowItemsNull: Self = StObject.set(x, "stickyBelowItems", null)
      
      inline def setStickyBelowItemsUndefined: Self = StObject.set(x, "stickyBelowItems", js.undefined)
      
      inline def setStickyBelowNull: Self = StObject.set(x, "stickyBelow", null)
      
      inline def setStickyBelowUndefined: Self = StObject.set(x, "stickyBelow", js.undefined)
    }
  }
}
