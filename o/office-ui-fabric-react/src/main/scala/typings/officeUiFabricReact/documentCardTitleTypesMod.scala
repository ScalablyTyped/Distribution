package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.documentCardTitleBaseMod.DocumentCardTitleBase
import typings.react.mod.ClassAttributes
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardTitleTypesMod {
  
  @js.native
  trait IDocumentCardTitle extends StObject
  
  @js.native
  trait IDocumentCardTitleProps extends ClassAttributes[DocumentCardTitleBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardTitle]] = js.native
    
    /**
      * Whether we truncate the title to fit within the box. May have a performance impact.
      * @defaultvalue true
      */
    var shouldTruncate: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether show as title as secondary title style such as smaller font and lighter color.
      * @defaultvalue false
      */
    var showAsSecondaryTitle: js.UndefOr[Boolean] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Title text.
      * If the card represents more than one document, this should be the title of one document and a "+X" string.
      * For example, a collection of four documents would have a string of "Document.docx +3".
      */
    var title: String = js.native
  }
  object IDocumentCardTitleProps {
    
    @scala.inline
    def apply(title: String): IDocumentCardTitleProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardTitleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardTitlePropsMutableBuilder[Self <: IDocumentCardTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardTitle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardTitle | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setShouldTruncate(value: Boolean): Self = StObject.set(x, "shouldTruncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldTruncateUndefined: Self = StObject.set(x, "shouldTruncate", js.undefined)
      
      @scala.inline
      def setShowAsSecondaryTitle(value: Boolean): Self = StObject.set(x, "showAsSecondaryTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAsSecondaryTitleUndefined: Self = StObject.set(x, "showAsSecondaryTitle", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardTitleStyleProps => DeepPartial[IDocumentCardTitleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardTitleStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Is this a secondary title?
      */
    var showAsSecondaryTitle: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDocumentCardTitleStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardTitleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardTitleStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardTitleStylePropsMutableBuilder[Self <: IDocumentCardTitleStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setShowAsSecondaryTitle(value: Boolean): Self = StObject.set(x, "showAsSecondaryTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAsSecondaryTitleUndefined: Self = StObject.set(x, "showAsSecondaryTitle", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDocumentCardTitleStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object IDocumentCardTitleStyles {
    
    @scala.inline
    def apply(): IDocumentCardTitleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardTitleStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardTitleStylesMutableBuilder[Self <: IDocumentCardTitleStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
