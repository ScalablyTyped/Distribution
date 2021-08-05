package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerGapTypesMod {
  
  trait IShimmerGap extends StObject
  
  trait IShimmerGapProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * Use to set custom styling of the shimmerGap borders.
      * @deprecated Use `styles` prop to leverage mergeStyle API.
      */
    var borderStyle: js.UndefOr[IRawStyle] = js.undefined
    
    /**
      * Optional callback to access the IShimmerGap interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmerGap]] = js.undefined
    
    /**
      * Sets the height of the gap.
      * @defaultvalue 16px
      */
    @JSName("height")
    var height_IShimmerGapProps: js.UndefOr[Double] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IShimmerGapProps {
    
    inline def apply(): IShimmerGapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerGapProps]
    }
    
    extension [Self <: IShimmerGapProps](x: Self) {
      
      inline def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IShimmerGap]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IShimmerGap | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IShimmerGapStyleProps => DeepPartial[IShimmerGapStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IShimmerGapStyleProps extends StObject {
    
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
  object IShimmerGapStyleProps {
    
    inline def apply(theme: ITheme): IShimmerGapStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerGapStyleProps]
    }
    
    extension [Self <: IShimmerGapStyleProps](x: Self) {
      
      inline def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShimmerGapStyles extends StObject {
    
    /**
      * Root of the ShimmerGap component.
      */
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IShimmerGapStyles {
    
    inline def apply(): IShimmerGapStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerGapStyles]
    }
    
    extension [Self <: IShimmerGapStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
