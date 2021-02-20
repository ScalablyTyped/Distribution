package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.shimmerTypesMod.IShimmerElement
import typings.react.mod.AllHTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmerElementsGroupTypesMod {
  
  @js.native
  trait IShimmerElementsGroup extends StObject
  
  @js.native
  trait IShimmerElementsGroupProps extends AllHTMLAttributes[HTMLElement] {
    
    /**
      * Defines the background color of the space in between and around shimmer elements.
      * @defaultvalue theme.palette.white
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IShimmerElementsGroup interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IShimmerElementsGroup]] = js.native
    
    /**
      * Optional boolean for enabling flexWrap of the container containing the shimmerElements.
      * @defaultvalue false
      */
    var flexWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional maximum row height of the shimmerElements container.
      */
    var rowHeight: js.UndefOr[Double] = js.native
    
    /**
      * Elements to render in one group of the Shimmer.
      */
    var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]
      ] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Optional width for ShimmerElements container.
      */
    @JSName("width")
    var width_IShimmerElementsGroupProps: js.UndefOr[String] = js.native
  }
  object IShimmerElementsGroupProps {
    
    @scala.inline
    def apply(): IShimmerElementsGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerElementsGroupProps]
    }
    
    @scala.inline
    implicit class IShimmerElementsGroupPropsMutableBuilder[Self <: IShimmerElementsGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IShimmerElementsGroup]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IShimmerElementsGroup | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setFlexWrap(value: Boolean): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      @scala.inline
      def setShimmerElements(value: js.Array[IShimmerElement]): Self = StObject.set(x, "shimmerElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShimmerElementsUndefined: Self = StObject.set(x, "shimmerElements", js.undefined)
      
      @scala.inline
      def setShimmerElementsVarargs(value: IShimmerElement*): Self = StObject.set(x, "shimmerElements", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IShimmerElementsGroupStyleProps => DeepPartial[IShimmerElementsGroupStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IShimmerElementsGroupStyleProps extends StObject {
    
    /**
      * Boolean flag to notify whether the root element needs to flex wrap.
      */
    var flexWrap: js.UndefOr[Boolean] = js.native
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme = js.native
  }
  object IShimmerElementsGroupStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IShimmerElementsGroupStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShimmerElementsGroupStyleProps]
    }
    
    @scala.inline
    implicit class IShimmerElementsGroupStylePropsMutableBuilder[Self <: IShimmerElementsGroupStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlexWrap(value: Boolean): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IShimmerElementsGroupStyles extends StObject {
    
    /**
      * Represents the wrapper root element holding all elements inside.
      */
    var root: js.UndefOr[IStyle] = js.native
  }
  object IShimmerElementsGroupStyles {
    
    @scala.inline
    def apply(): IShimmerElementsGroupStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IShimmerElementsGroupStyles]
    }
    
    @scala.inline
    implicit class IShimmerElementsGroupStylesMutableBuilder[Self <: IShimmerElementsGroupStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
