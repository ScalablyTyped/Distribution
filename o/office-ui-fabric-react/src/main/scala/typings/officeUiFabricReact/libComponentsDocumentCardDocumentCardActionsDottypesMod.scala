package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typings.officeUiFabricReact.libComponentsDocumentCardDocumentCardActionsDotbaseMod.DocumentCardActionsBase
import typings.react.mod.ClassAttributes
import typings.std.Number
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardActionsDottypesMod {
  
  trait IDocumentCardActions extends StObject
  
  trait IDocumentCardActionsProps
    extends StObject
       with ClassAttributes[DocumentCardActionsBase] {
    
    /**
      * The actions available for this document.
      */
    var actions: js.Array[IButtonProps]
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardActions]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]
      ] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * The number of views this document has received.
      */
    var views: js.UndefOr[Number] = js.undefined
  }
  object IDocumentCardActionsProps {
    
    inline def apply(actions: js.Array[IButtonProps]): IDocumentCardActionsProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActionsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardActionsProps] (val x: Self) extends AnyVal {
      
      inline def setActions(value: js.Array[IButtonProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: IButtonProps*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardActions]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardActions | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardActionsStyleProps => DeepPartial[IDocumentCardActionsStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setViews(value: Number): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  trait IDocumentCardActionsStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardActionsStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardActionsStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActionsStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardActionsStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardActionsStyles extends StObject {
    
    var action: IStyle
    
    var root: IStyle
    
    var views: IStyle
    
    var viewsIcon: IStyle
  }
  object IDocumentCardActionsStyles {
    
    inline def apply(): IDocumentCardActionsStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardActionsStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentCardActionsStyles] (val x: Self) extends AnyVal {
      
      inline def setAction(value: IStyle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setViews(value: IStyle): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsIcon(value: IStyle): Self = StObject.set(x, "viewsIcon", value.asInstanceOf[js.Any])
      
      inline def setViewsIconNull: Self = StObject.set(x, "viewsIcon", null)
      
      inline def setViewsIconUndefined: Self = StObject.set(x, "viewsIcon", js.undefined)
      
      inline def setViewsNull: Self = StObject.set(x, "views", null)
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
}
