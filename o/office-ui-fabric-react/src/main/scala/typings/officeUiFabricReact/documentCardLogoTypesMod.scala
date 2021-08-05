package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.documentCardLogoBaseMod.DocumentCardLogoBase
import typings.react.mod.ClassAttributes
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardLogoTypesMod {
  
  trait IDocumentCardLogo extends StObject
  
  trait IDocumentCardLogoProps
    extends StObject
       with ClassAttributes[DocumentCardLogoBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardLogo]] = js.undefined
    
    /**
      * Describes DocumentCard Logo badge.
      */
    var logoIcon: String
    
    /**
      * Describe Logo name, optional.
      */
    var logoName: js.UndefOr[String] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDocumentCardLogoProps {
    
    inline def apply(logoIcon: String): IDocumentCardLogoProps = {
      val __obj = js.Dynamic.literal(logoIcon = logoIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardLogoProps]
    }
    
    extension [Self <: IDocumentCardLogoProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardLogo]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardLogo | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setLogoIcon(value: String): Self = StObject.set(x, "logoIcon", value.asInstanceOf[js.Any])
      
      inline def setLogoName(value: String): Self = StObject.set(x, "logoName", value.asInstanceOf[js.Any])
      
      inline def setLogoNameUndefined: Self = StObject.set(x, "logoName", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardLogoStyleProps => DeepPartial[IDocumentCardLogoStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDocumentCardLogoStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardLogoStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardLogoStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardLogoStyleProps]
    }
    
    extension [Self <: IDocumentCardLogoStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardLogoStyles extends StObject {
    
    var root: IStyle
  }
  object IDocumentCardLogoStyles {
    
    inline def apply(): IDocumentCardLogoStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardLogoStyles]
    }
    
    extension [Self <: IDocumentCardLogoStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
