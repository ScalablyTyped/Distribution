package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsShimmerShimmerDottypesMod.IShimmerElement
import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShimmerShimmerElementsGroupShimmerElementsGroupDottypesMod {
  
  trait IShimmerElementsGroup extends StObject
  
  trait IShimmerElementsGroupProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * Defines the background color of the space in between and around shimmer elements.
      * @defaultvalue theme.palette.white
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Optional callback to access the IShimmerElementsGroup interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmerElementsGroup]] = js.undefined
    
    /**
      * Optional boolean for enabling flexWrap of the container containing the shimmerElements.
      * @defaultvalue false
      */
    var flexWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional maximum row height of the shimmerElements container.
      */
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Elements to render in one group of the Shimmer.
      */
    var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]
      ] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Optional width for ShimmerElements container.
      */
    @JSName("width")
    var width_IShimmerElementsGroupProps: js.UndefOr[String] = js.undefined
  }
  object IShimmerElementsGroupProps {
    
    inline def apply(): IShimmerElementsGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerElementsGroupProps]
    }
    
    extension [Self <: IShimmerElementsGroupProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IShimmerElementsGroup]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IShimmerElementsGroup | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setFlexWrap(value: Boolean): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setShimmerElements(value: js.Array[IShimmerElement]): Self = StObject.set(x, "shimmerElements", value.asInstanceOf[js.Any])
      
      inline def setShimmerElementsUndefined: Self = StObject.set(x, "shimmerElements", js.undefined)
      
      inline def setShimmerElementsVarargs(value: IShimmerElement*): Self = StObject.set(x, "shimmerElements", js.Array(value*))
      
      inline def setStyles(value: IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IShimmerElementsGroupStyleProps => DeepPartial[IShimmerElementsGroupStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IShimmerElementsGroupStyleProps extends StObject {
    
    /**
      * Boolean flag to notify whether the root element needs to flex wrap.
      */
    var flexWrap: js.UndefOr[Boolean] = js.undefined
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme
  }
  object IShimmerElementsGroupStyleProps {
    
    inline def apply(theme: ITheme): IShimmerElementsGroupStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerElementsGroupStyleProps]
    }
    
    extension [Self <: IShimmerElementsGroupStyleProps](x: Self) {
      
      inline def setFlexWrap(value: Boolean): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShimmerElementsGroupStyles extends StObject {
    
    /**
      * Represents the wrapper root element holding all elements inside.
      */
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IShimmerElementsGroupStyles {
    
    inline def apply(): IShimmerElementsGroupStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerElementsGroupStyles]
    }
    
    extension [Self <: IShimmerElementsGroupStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
