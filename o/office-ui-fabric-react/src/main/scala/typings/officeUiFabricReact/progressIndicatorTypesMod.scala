package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorTypesMod {
  
  trait IProgressIndicatorProps
    extends StObject
       with ClassAttributes[ProgressIndicatorBase] {
    
    /**
      * Text alternative of the progress status, used by screen readers for reading the value of the progress.
      */
    var ariaValueText: js.UndefOr[String] = js.undefined
    
    /**
      * Height of the ProgressIndicator
      * @defaultvalue 2
      */
    var barHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Additional css class to apply to the ProgressIndicator
      * @defaultvalue undefined
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Text describing or supplementing the operation. May be a string or React virtual elements.
      */
    var description: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Label to display above the control. May be a string or React virtual elements.
      */
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * A render override for the progress track.
      */
    var onRenderProgress: js.UndefOr[IRenderFunction[IProgressIndicatorProps]] = js.undefined
    
    /**
      * Percentage of the operation's completeness, numerically between 0 and 1. If this is not set,
      * the indeterminate progress animation will be shown instead.
      */
    var percentComplete: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether or not to hide the progress state.
      */
    var progressHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Deprecated at v0.43.0, to be removed at \>= v0.53.0. Use `label` instead.
      * @deprecated Use `label` instead.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object IProgressIndicatorProps {
    
    inline def apply(): IProgressIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgressIndicatorProps]
    }
    
    extension [Self <: IProgressIndicatorProps](x: Self) {
      
      inline def setAriaValueText(value: String): Self = StObject.set(x, "ariaValueText", value.asInstanceOf[js.Any])
      
      inline def setAriaValueTextUndefined: Self = StObject.set(x, "ariaValueText", js.undefined)
      
      inline def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
      
      inline def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnRenderProgress(
        value: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderProgress", js.Any.fromFunction2(value))
      
      inline def setOnRenderProgressUndefined: Self = StObject.set(x, "onRenderProgress", js.undefined)
      
      inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
      
      inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
      
      inline def setProgressHidden(value: Boolean): Self = StObject.set(x, "progressHidden", value.asInstanceOf[js.Any])
      
      inline def setProgressHiddenUndefined: Self = StObject.set(x, "progressHidden", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IProgressIndicatorStyleProps => DeepPartial[IProgressIndicatorStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IProgressIndicatorStyleProps extends StObject {
    
    var barHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme
  }
  object IProgressIndicatorStyleProps {
    
    inline def apply(theme: ITheme): IProgressIndicatorStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProgressIndicatorStyleProps]
    }
    
    extension [Self <: IProgressIndicatorStyleProps](x: Self) {
      
      inline def setBarHeight(value: Double): Self = StObject.set(x, "barHeight", value.asInstanceOf[js.Any])
      
      inline def setBarHeightUndefined: Self = StObject.set(x, "barHeight", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProgressIndicatorStyles extends StObject {
    
    var itemDescription: IStyle
    
    var itemName: IStyle
    
    var itemProgress: IStyle
    
    var progressBar: IStyle
    
    var progressTrack: IStyle
    
    /**
      * Style for the root element.
      */
    var root: IStyle
  }
  object IProgressIndicatorStyles {
    
    inline def apply(): IProgressIndicatorStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProgressIndicatorStyles]
    }
    
    extension [Self <: IProgressIndicatorStyles](x: Self) {
      
      inline def setItemDescription(value: IStyle): Self = StObject.set(x, "itemDescription", value.asInstanceOf[js.Any])
      
      inline def setItemDescriptionNull: Self = StObject.set(x, "itemDescription", null)
      
      inline def setItemDescriptionUndefined: Self = StObject.set(x, "itemDescription", js.undefined)
      
      inline def setItemName(value: IStyle): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
      
      inline def setItemNameNull: Self = StObject.set(x, "itemName", null)
      
      inline def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
      
      inline def setItemProgress(value: IStyle): Self = StObject.set(x, "itemProgress", value.asInstanceOf[js.Any])
      
      inline def setItemProgressNull: Self = StObject.set(x, "itemProgress", null)
      
      inline def setItemProgressUndefined: Self = StObject.set(x, "itemProgress", js.undefined)
      
      inline def setProgressBar(value: IStyle): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarNull: Self = StObject.set(x, "progressBar", null)
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setProgressTrack(value: IStyle): Self = StObject.set(x, "progressTrack", value.asInstanceOf[js.Any])
      
      inline def setProgressTrackNull: Self = StObject.set(x, "progressTrack", null)
      
      inline def setProgressTrackUndefined: Self = StObject.set(x, "progressTrack", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
