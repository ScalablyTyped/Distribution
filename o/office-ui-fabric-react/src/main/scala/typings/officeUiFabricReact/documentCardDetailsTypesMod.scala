package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.documentCardDetailsBaseMod.DocumentCardDetailsBase
import typings.react.mod.Props
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardDetailsTypesMod {
  
  @js.native
  trait IDocumentCardDetails extends StObject
  
  @js.native
  trait IDocumentCardDetailsProps extends Props[DocumentCardDetailsBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardDetails]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles]
      ] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IDocumentCardDetailsProps {
    
    @scala.inline
    def apply(): IDocumentCardDetailsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardDetailsProps]
    }
    
    @scala.inline
    implicit class IDocumentCardDetailsPropsMutableBuilder[Self <: IDocumentCardDetailsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardDetails]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardDetails | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardDetailsStyleProps => DeepPartial[IDocumentCardDetailsStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IDocumentCardDetailsStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardDetailsStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardDetailsStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardDetailsStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardDetailsStylePropsMutableBuilder[Self <: IDocumentCardDetailsStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardDetailsStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object IDocumentCardDetailsStyles {
    
    @scala.inline
    def apply(): IDocumentCardDetailsStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardDetailsStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardDetailsStylesMutableBuilder[Self <: IDocumentCardDetailsStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
