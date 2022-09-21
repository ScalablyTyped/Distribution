package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogFooterTypesMod {
  
  trait IDialogFooter extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<DialogFooterBase> * / any */ trait IDialogFooterProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDialogFooter]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDialogFooterStyleProps, IDialogFooterStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDialogFooterProps {
    
    inline def apply(): IDialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogFooterProps]
    }
    
    extension [Self <: IDialogFooterProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDialogFooter]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDialogFooter | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDialogFooterStyleProps, IDialogFooterStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDialogFooterStyleProps => DeepPartial[IDialogFooterStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDialogFooterStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDialogFooterStyleProps {
    
    inline def apply(theme: ITheme): IDialogFooterStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogFooterStyleProps]
    }
    
    extension [Self <: IDialogFooterStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDialogFooterStyles extends StObject {
    
    var action: IStyle
    
    /**
      * Style for the actions element.
      */
    var actions: IStyle
    
    var actionsRight: IStyle
  }
  object IDialogFooterStyles {
    
    inline def apply(): IDialogFooterStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogFooterStyles]
    }
    
    extension [Self <: IDialogFooterStyles](x: Self) {
      
      inline def setAction(value: IStyle): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionNull: Self = StObject.set(x, "action", null)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActions(value: IStyle): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsRight(value: IStyle): Self = StObject.set(x, "actionsRight", value.asInstanceOf[js.Any])
      
      inline def setActionsRightNull: Self = StObject.set(x, "actionsRight", null)
      
      inline def setActionsRightUndefined: Self = StObject.set(x, "actionsRight", js.undefined)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    }
  }
}
