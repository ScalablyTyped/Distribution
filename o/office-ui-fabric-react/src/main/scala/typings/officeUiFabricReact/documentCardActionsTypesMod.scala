package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
import typings.react.mod.ClassAttributes
import typings.std.Number
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardActionsTypesMod {
  
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
    
    @scala.inline
    def apply(actions: js.Array[IButtonProps]): IDocumentCardActionsProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActionsProps]
    }
    
    @scala.inline
    implicit class IDocumentCardActionsPropsMutableBuilder[Self <: IDocumentCardActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[IButtonProps]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: IButtonProps*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDocumentCardActions]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDocumentCardActions | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDocumentCardActionsStyleProps => DeepPartial[IDocumentCardActionsStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setViews(value: Number): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
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
    
    @scala.inline
    def apply(theme: ITheme): IDocumentCardActionsStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardActionsStyleProps]
    }
    
    @scala.inline
    implicit class IDocumentCardActionsStylePropsMutableBuilder[Self <: IDocumentCardActionsStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardActionsStyles extends StObject {
    
    var action: IStyle
    
    var root: IStyle
    
    var views: IStyle
    
    var viewsIcon: IStyle
  }
  object IDocumentCardActionsStyles {
    
    @scala.inline
    def apply(): IDocumentCardActionsStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardActionsStyles]
    }
    
    @scala.inline
    implicit class IDocumentCardActionsStylesMutableBuilder[Self <: IDocumentCardActionsStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: IStyle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionNull: Self = StObject.set(x, "action", null)
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setViews(value: IStyle): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsIcon(value: IStyle): Self = StObject.set(x, "viewsIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewsIconNull: Self = StObject.set(x, "viewsIcon", null)
      
      @scala.inline
      def setViewsIconUndefined: Self = StObject.set(x, "viewsIcon", js.undefined)
      
      @scala.inline
      def setViewsNull: Self = StObject.set(x, "views", null)
      
      @scala.inline
      def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
}
