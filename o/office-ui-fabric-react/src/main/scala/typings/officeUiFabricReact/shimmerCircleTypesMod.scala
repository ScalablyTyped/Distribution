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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerCircleTypesMod {
  
  @js.native
  trait IShimmerCircle extends StObject
  
  @js.native
  trait IShimmerCircleProps extends AllHTMLAttributes[HTMLElement] {
    
    /**
      * Use to set custom styling of the shimmerCircle borders.
      * @deprecated Use `styles` prop to leverage mergeStyle API.
      */
    var borderStyle: js.UndefOr[IRawStyle] = js.native
    
    /**
      * Optional callback to access the IShimmerCircle interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmerCircle]] = js.native
    
    /**
      * Sets the height of the circle.
      * @defaultvalue 24px
      */
    @JSName("height")
    var height_IShimmerCircleProps: js.UndefOr[Double] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerCircleStyleProps, IShimmerCircleStyles]] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IShimmerCircleProps {
    
    @scala.inline
    def apply(): IShimmerCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerCircleProps]
    }
    
    @scala.inline
    implicit class IShimmerCirclePropsMutableBuilder[Self <: IShimmerCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IShimmerCircle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IShimmerCircle | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IShimmerCircleStyleProps, IShimmerCircleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IShimmerCircleStyleProps => DeepPartial[IShimmerCircleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IShimmerCircleStyleProps extends StObject {
    
    /**
      * Styles to override borderStyles with custom ones.
      * @deprecated in favor of mergeStyles API.
      */
    var borderStyle: js.UndefOr[IRawStyle] = js.native
    
    /**
      * Needed to provide a height to the root of the control.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Theme values passed to the component.
      */
    var theme: ITheme = js.native
  }
  object IShimmerCircleStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IShimmerCircleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerCircleStyleProps]
    }
    
    @scala.inline
    implicit class IShimmerCircleStylePropsMutableBuilder[Self <: IShimmerCircleStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IShimmerCircleStyles extends StObject {
    
    /**
      * Root of the ShimmerCircle component.
      */
    var root: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the circle SVG of the ShimmerCircle component.
      */
    var svg: js.UndefOr[IStyle] = js.native
  }
  object IShimmerCircleStyles {
    
    @scala.inline
    def apply(): IShimmerCircleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerCircleStyles]
    }
    
    @scala.inline
    implicit class IShimmerCircleStylesMutableBuilder[Self <: IShimmerCircleStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSvg(value: IStyle): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgNull: Self = StObject.set(x, "svg", null)
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
    }
  }
}
