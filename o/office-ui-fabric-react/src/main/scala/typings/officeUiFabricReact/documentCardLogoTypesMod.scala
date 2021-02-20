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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardLogoTypesMod {
  
  @js.native
  trait IDocumentCardLogo extends StObject
  
  @js.native
  trait IDocumentCardLogoProps extends ClassAttributes[DocumentCardLogoBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardLogo]] = js.native
    
    /**
      * Describes DocumentCard Logo badge.
      */
    var logoIcon: String = js.native
    
    /**
      * Describe Logo name, optional.
      */
    var logoName: js.UndefOr[String] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IDocumentCardLogoProps {
    
    @scala.inline
    def apply(logoIcon: String): IDocumentCardLogoProps = {
      val __obj = js.Dynamic.literal(logoIcon = logoIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardLogoProps]
    }
    
    @scala.inline
    implicit class IDocumentCardLogoPropsMutableBuilder[Self <: IDocumentCardLogoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardLogo]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardLogo | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setLogoIcon(value: String): Self = StObject.set(x, "logoIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoName(value: String): Self = StObject.set(x, "logoName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoNameUndefined: Self = StObject.set(x, "logoName", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardLogoStyleProps => DeepPartial[IDocumentCardLogoStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardLogoStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardLogoStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardLogoStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardLogoStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardLogoStylePropsMutableBuilder[Self <: IDocumentCardLogoStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardLogoStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object IDocumentCardLogoStyles {
    
    @scala.inline
    def apply(): IDocumentCardLogoStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardLogoStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardLogoStylesMutableBuilder[Self <: IDocumentCardLogoStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
