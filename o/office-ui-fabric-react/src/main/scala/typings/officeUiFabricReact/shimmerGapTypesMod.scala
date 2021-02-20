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

object shimmerGapTypesMod {
  
  @js.native
  trait IShimmerGap extends StObject
  
  @js.native
  trait IShimmerGapProps extends AllHTMLAttributes[HTMLElement] {
    
    /**
      * Use to set custom styling of the shimmerGap borders.
      * @deprecated Use `styles` prop to leverage mergeStyle API.
      */
    var borderStyle: js.UndefOr[IRawStyle] = js.native
    
    /**
      * Optional callback to access the IShimmerGap interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmerGap]] = js.native
    
    /**
      * Sets the height of the gap.
      * @defaultvalue 16px
      */
    @JSName("height")
    var height_IShimmerGapProps: js.UndefOr[Double] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IShimmerGapProps {
    
    @scala.inline
    def apply(): IShimmerGapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerGapProps]
    }
    
    @scala.inline
    implicit class IShimmerGapPropsMutableBuilder[Self <: IShimmerGapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: IRawStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IShimmerGap]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IShimmerGap | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IShimmerGapStyleProps => DeepPartial[IShimmerGapStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IShimmerGapStyleProps extends StObject {
    
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
  object IShimmerGapStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IShimmerGapStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerGapStyleProps]
    }
    
    @scala.inline
    implicit class IShimmerGapStylePropsMutableBuilder[Self <: IShimmerGapStyleProps] (val x: Self) extends AnyVal {
      
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
  trait IShimmerGapStyles extends StObject {
    
    /**
      * Root of the ShimmerGap component.
      */
    var root: js.UndefOr[IStyle] = js.native
  }
  object IShimmerGapStyles {
    
    @scala.inline
    def apply(): IShimmerGapStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerGapStyles]
    }
    
    @scala.inline
    implicit class IShimmerGapStylesMutableBuilder[Self <: IShimmerGapStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
