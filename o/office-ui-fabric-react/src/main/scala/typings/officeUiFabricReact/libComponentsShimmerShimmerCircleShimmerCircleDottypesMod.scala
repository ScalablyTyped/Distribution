package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIrawstyleMod.IRawStyle
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShimmerShimmerCircleShimmerCircleDottypesMod {
  
  trait IShimmerCircle extends StObject
  
  trait IShimmerCircleProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * Use to set custom styling of the shimmerCircle borders.
      * @deprecated Use `styles` prop to leverage mergeStyle API.
      */
    var borderStyle: js.UndefOr[IRawStyle] = js.undefined
    
    /**
      * Optional callback to access the IShimmerCircle interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmerCircle]] = js.undefined
    
    /**
      * Sets the height of the circle.
      * @defaultvalue 24px
      */
    @JSName("height")
    var height_IShimmerCircleProps: js.UndefOr[Double] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerCircleStyleProps, IShimmerCircleStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IShimmerCircleProps {
    
    inline def apply(): IShimmerCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerCircleProps]
    }
    
    extension [Self <: IShimmerCircleProps](x: Self) {
      
      inline def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IShimmerCircle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IShimmerCircle | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IShimmerCircleStyleProps, IShimmerCircleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IShimmerCircleStyleProps => DeepPartial[IShimmerCircleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IShimmerCircleStyleProps extends StObject {
    
    /**
      * Styles to override borderStyles with custom ones.
      * @deprecated in favor of mergeStyles API.
      */
    var borderStyle: js.UndefOr[IRawStyle] = js.undefined
    
    /**
      * Needed to provide a height to the root of the control.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Theme values passed to the component.
      */
    var theme: ITheme
  }
  object IShimmerCircleStyleProps {
    
    inline def apply(theme: ITheme): IShimmerCircleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerCircleStyleProps]
    }
    
    extension [Self <: IShimmerCircleStyleProps](x: Self) {
      
      inline def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShimmerCircleStyles extends StObject {
    
    /**
      * Root of the ShimmerCircle component.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the circle SVG of the ShimmerCircle component.
      */
    var svg: js.UndefOr[IStyle] = js.undefined
  }
  object IShimmerCircleStyles {
    
    inline def apply(): IShimmerCircleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerCircleStyles]
    }
    
    extension [Self <: IShimmerCircleStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSvg(value: IStyle): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgNull: Self = StObject.set(x, "svg", null)
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
}
