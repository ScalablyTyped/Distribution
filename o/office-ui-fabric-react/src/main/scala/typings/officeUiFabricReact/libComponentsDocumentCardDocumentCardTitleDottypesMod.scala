package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsDocumentCardDocumentCardTitleDotbaseMod.DocumentCardTitleBase
import typings.react.mod.ClassAttributes
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardTitleDottypesMod {
  
  trait IDocumentCardTitle extends StObject
  
  trait IDocumentCardTitleProps
    extends StObject
       with ClassAttributes[DocumentCardTitleBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardTitle]] = js.undefined
    
    /**
      * Whether we truncate the title to fit within the box. May have a performance impact.
      * @defaultvalue true
      */
    var shouldTruncate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether show as title as secondary title style such as smaller font and lighter color.
      * @defaultvalue false
      */
    var showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Title text.
      * If the card represents more than one document, this should be the title of one document and a "+X" string.
      * For example, a collection of four documents would have a string of "Document.docx +3".
      */
    var title: String
  }
  object IDocumentCardTitleProps {
    
    inline def apply(title: String): IDocumentCardTitleProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardTitleProps]
    }
    
    extension [Self <: IDocumentCardTitleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardTitle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardTitle | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setShouldTruncate(value: Boolean): Self = StObject.set(x, "shouldTruncate", value.asInstanceOf[js.Any])
      
      inline def setShouldTruncateUndefined: Self = StObject.set(x, "shouldTruncate", js.undefined)
      
      inline def setShowAsSecondaryTitle(value: Boolean): Self = StObject.set(x, "showAsSecondaryTitle", value.asInstanceOf[js.Any])
      
      inline def setShowAsSecondaryTitleUndefined: Self = StObject.set(x, "showAsSecondaryTitle", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardTitleStyleProps => DeepPartial[IDocumentCardTitleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardTitleStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Is this a secondary title?
      */
    var showAsSecondaryTitle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardTitleStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardTitleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardTitleStyleProps]
    }
    
    extension [Self <: IDocumentCardTitleStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setShowAsSecondaryTitle(value: Boolean): Self = StObject.set(x, "showAsSecondaryTitle", value.asInstanceOf[js.Any])
      
      inline def setShowAsSecondaryTitleUndefined: Self = StObject.set(x, "showAsSecondaryTitle", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardTitleStyles extends StObject {
    
    var root: IStyle
  }
  object IDocumentCardTitleStyles {
    
    inline def apply(): IDocumentCardTitleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardTitleStyles]
    }
    
    extension [Self <: IDocumentCardTitleStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
