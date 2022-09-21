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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabricTypesMod {
  
  trait IFabricProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Applies the current body background specified in the theme to the root element.
      */
    var applyTheme: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Applies the current body background specified in the theme to the body element.
      */
    var applyThemeToBody: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overrides the root element type, defaults to `div`.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
    
    /**
      * Specifies the direction of the content. Will inject a `dir` attribute, and also ensure that the `rtl` flag of the
      * contextual theme object is set correctly so that css registered with merge-styles can be auto flipped correctly.
      */
    @JSName("dir")
    var dir_IFabricProps: js.UndefOr[rtl | ltr | auto] = js.undefined
    
    /**
      * Overrides the styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles]] = js.undefined
    
    /**
      * Injected by the `styled` HOC wrapper.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IFabricProps {
    
    inline def apply(): IFabricProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFabricProps]
    }
    
    extension [Self <: IFabricProps](x: Self) {
      
      inline def setApplyTheme(value: Boolean): Self = StObject.set(x, "applyTheme", value.asInstanceOf[js.Any])
      
      inline def setApplyThemeToBody(value: Boolean): Self = StObject.set(x, "applyThemeToBody", value.asInstanceOf[js.Any])
      
      inline def setApplyThemeToBodyUndefined: Self = StObject.set(x, "applyThemeToBody", js.undefined)
      
      inline def setApplyThemeUndefined: Self = StObject.set(x, "applyTheme", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setComponentRef(value: IRefObject[js.Object]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ js.Object | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDir(value: rtl | ltr | auto): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IFabricStyleProps, IFabricStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IFabricStyleProps => DeepPartial[IFabricStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IFabricStyleProps
    extends StObject
       with IFabricProps {
    
    @JSName("theme")
    var theme_IFabricStyleProps: ITheme
  }
  object IFabricStyleProps {
    
    inline def apply(theme: ITheme): IFabricStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFabricStyleProps]
    }
    
    extension [Self <: IFabricStyleProps](x: Self) {
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFabricStyles extends StObject {
    
    var bodyThemed: IStyle
    
    var root: IStyle
  }
  object IFabricStyles {
    
    inline def apply(): IFabricStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFabricStyles]
    }
    
    extension [Self <: IFabricStyles](x: Self) {
      
      inline def setBodyThemed(value: IStyle): Self = StObject.set(x, "bodyThemed", value.asInstanceOf[js.Any])
      
      inline def setBodyThemedNull: Self = StObject.set(x, "bodyThemed", null)
      
      inline def setBodyThemedUndefined: Self = StObject.set(x, "bodyThemed", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
