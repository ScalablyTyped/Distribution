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

object shimmerLineTypesMod {
  
  trait IShimmerLine extends StObject
  
  trait IShimmerLineProps
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    /**
      * Use to set custom styling of the shimmerLine borders.
      * @deprecated Use `styles` prop to leverage mergeStyle API.
      */
    var borderStyle: js.UndefOr[IRawStyle] = js.undefined
    
    /**
      * Optional callback to access the IShimmerLine interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmerLine]] = js.undefined
    
    /**
      * Sets the height of the rectangle.
      * @defaultvalue 16px
      */
    @JSName("height")
    var height_IShimmerLineProps: js.UndefOr[Double] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerLineStyleProps, IShimmerLineStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IShimmerLineProps {
    
    @scala.inline
    def apply(): IShimmerLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerLineProps]
    }
    
    @scala.inline
    implicit class IShimmerLinePropsMutableBuilder[Self <: IShimmerLineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IShimmerLine]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IShimmerLine | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IShimmerLineStyleProps, IShimmerLineStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IShimmerLineStyleProps => DeepPartial[IShimmerLineStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IShimmerLineStyleProps extends StObject {
    
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
  object IShimmerLineStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IShimmerLineStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerLineStyleProps]
    }
    
    @scala.inline
    implicit class IShimmerLineStylePropsMutableBuilder[Self <: IShimmerLineStyleProps] (val x: Self) extends AnyVal {
      
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
  
  trait IShimmerLineStyles extends StObject {
    
    /**
      * Bottom-left corner SVG of the ShimmerLine component.
      */
    var bottomLeftCorner: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Bottom-right corner SVG of the ShimmerLine component.
      */
    var bottomRightCorner: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Root of the ShimmerLine component.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Top-left corner SVG of the ShimmerLine component.
      */
    var topLeftCorner: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Top-right corner SVG of the ShimmerLine component.
      */
    var topRightCorner: js.UndefOr[IStyle] = js.undefined
  }
  object IShimmerLineStyles {
    
    @scala.inline
    def apply(): IShimmerLineStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerLineStyles]
    }
    
    @scala.inline
    implicit class IShimmerLineStylesMutableBuilder[Self <: IShimmerLineStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomLeftCorner(value: IStyle): Self = StObject.set(x, "bottomLeftCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftCornerNull: Self = StObject.set(x, "bottomLeftCorner", null)
      
      @scala.inline
      def setBottomLeftCornerUndefined: Self = StObject.set(x, "bottomLeftCorner", js.undefined)
      
      @scala.inline
      def setBottomRightCorner(value: IStyle): Self = StObject.set(x, "bottomRightCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightCornerNull: Self = StObject.set(x, "bottomRightCorner", null)
      
      @scala.inline
      def setBottomRightCornerUndefined: Self = StObject.set(x, "bottomRightCorner", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTopLeftCorner(value: IStyle): Self = StObject.set(x, "topLeftCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftCornerNull: Self = StObject.set(x, "topLeftCorner", null)
      
      @scala.inline
      def setTopLeftCornerUndefined: Self = StObject.set(x, "topLeftCorner", js.undefined)
      
      @scala.inline
      def setTopRightCorner(value: IStyle): Self = StObject.set(x, "topRightCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightCornerNull: Self = StObject.set(x, "topRightCorner", null)
      
      @scala.inline
      def setTopRightCornerUndefined: Self = StObject.set(x, "topRightCorner", js.undefined)
    }
  }
}
