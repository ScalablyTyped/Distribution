package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.auto
import typings.officeUiFabricReact.officeUiFabricReactStrings.ltr
import typings.officeUiFabricReact.officeUiFabricReactStrings.rtl
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabricTypesMod {
  
  @js.native
  trait IFabricProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Applies the current body background specified in the theme to the root element.
      */
    var applyTheme: js.UndefOr[Boolean] = js.native
    
    /**
      * Applies the current body background specified in the theme to the body element.
      */
    var applyThemeToBody: js.UndefOr[Boolean] = js.native
    
    /**
      * Overrides the root element type, defaults to `div`.
      */
    var as: js.UndefOr[ElementType[_]] = js.native
    
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.native
    
    /**
      * Specifies the direction of the content. Will inject a `dir` attribute, and also ensure that the `rtl` flag of the
      * contextual theme object is set correctly so that css registered with merge-styles can be auto flipped correctly.
      */
    @JSName("dir")
    var dir_IFabricProps: js.UndefOr[rtl | ltr | auto] = js.native
    
    /**
      * Overrides the styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles]] = js.native
    
    /**
      * Injected by the `styled` HOC wrapper.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IFabricProps {
    
    @scala.inline
    def apply(): IFabricProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFabricProps]
    }
    
    @scala.inline
    implicit class IFabricPropsMutableBuilder[Self <: IFabricProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyTheme(value: Boolean): Self = StObject.set(x, "applyTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyThemeToBody(value: Boolean): Self = StObject.set(x, "applyThemeToBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyThemeToBodyUndefined: Self = StObject.set(x, "applyThemeToBody", js.undefined)
      
      @scala.inline
      def setApplyThemeUndefined: Self = StObject.set(x, "applyTheme", js.undefined)
      
      @scala.inline
      def setAs(value: ElementType[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDir(value: rtl | ltr | auto): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IFabricStyleProps => DeepPartial[IFabricStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IFabricStyleProps extends IFabricProps {
    
    @JSName("theme")
    var theme_IFabricStyleProps: ITheme = js.native
  }
  object IFabricStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IFabricStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFabricStyleProps]
    }
    
    @scala.inline
    implicit class IFabricStylePropsMutableBuilder[Self <: IFabricStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFabricStyles extends StObject {
    
    var bodyThemed: IStyle = js.native
    
    var root: IStyle = js.native
  }
  object IFabricStyles {
    
    @scala.inline
    def apply(): IFabricStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFabricStyles]
    }
    
    @scala.inline
    implicit class IFabricStylesMutableBuilder[Self <: IFabricStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyThemed(value: IStyle): Self = StObject.set(x, "bodyThemed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyThemedNull: Self = StObject.set(x, "bodyThemed", null)
      
      @scala.inline
      def setBodyThemedUndefined: Self = StObject.set(x, "bodyThemed", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
