package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHoverCardBaseCardDottypesMod {
  
  trait IBaseCardProps[TComponent, TStyles, TStyleProps]
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Custom overriding props to Callout
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
    
    /**
      * Optional callback to access the TComponent interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[TComponent]] = js.undefined
    
    /**
      * How the element should be positioned
      * @defaultvalue DirectionalHint.bottomLeftEdge
      */
    var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * Make callout content show on the set side
      * @defaultvalue true
      */
    var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Focus on first element by default on card or not
      */
    var firstFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The gap between the card and the target
      * @defaultvalue 0
      */
    var gapSpace: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback upon focus or mouse enter event
      */
    var onEnter: js.UndefOr[js.Function1[/* ev */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * Callback upon blur or mouse leave event
      */
    var onLeave: js.UndefOr[js.Function1[/* ev */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      *  Item to be returned with onRender functions
      */
    var renderData: js.UndefOr[Any] = js.undefined
    
    /**
      * Custom styles for this component
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[
          TStyleProps, 
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle} */ js.Any
        ]
      ] = js.undefined
    
    /**
      * Element to anchor the card to.
      */
    var targetElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Trap focus or not
      */
    var trapFocus: js.UndefOr[Boolean] = js.undefined
  }
  object IBaseCardProps {
    
    inline def apply[TComponent, TStyles, TStyleProps](): IBaseCardProps[TComponent, TStyles, TStyleProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseCardProps[TComponent, TStyles, TStyleProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBaseCardProps[?, ?, ?], TComponent, TStyles, TStyleProps] (val x: Self & (IBaseCardProps[TComponent, TStyles, TStyleProps])) extends AnyVal {
      
      inline def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      inline def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      inline def setComponentRef(value: IRefObject[TComponent]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ TComponent | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      inline def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
      
      inline def setDirectionalHintFixedUndefined: Self = StObject.set(x, "directionalHintFixed", js.undefined)
      
      inline def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      inline def setFirstFocus(value: Boolean): Self = StObject.set(x, "firstFocus", value.asInstanceOf[js.Any])
      
      inline def setFirstFocusUndefined: Self = StObject.set(x, "firstFocus", js.undefined)
      
      inline def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
      
      inline def setGapSpaceUndefined: Self = StObject.set(x, "gapSpace", js.undefined)
      
      inline def setOnEnter(value: /* ev */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnLeave(value: /* ev */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction1(value))
      
      inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
      
      inline def setRenderData(value: Any): Self = StObject.set(x, "renderData", value.asInstanceOf[js.Any])
      
      inline def setRenderDataUndefined: Self = StObject.set(x, "renderData", js.undefined)
      
      inline def setStyles(
        value: IStyleFunctionOrObject[
              TStyleProps, 
              /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle} */ js.Any
            ]
      ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(
        value: TStyleProps => DeepPartial[
              /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle} */ js.Any
            ]
      ): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
      
      inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
  
  trait IBaseCardStyleProps extends StObject {
    
    /**
      * ClassName to inject into wrapper div of the content.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme
  }
  object IBaseCardStyleProps {
    
    inline def apply(theme: ITheme): IBaseCardStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseCardStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBaseCardStyleProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBaseCardStyles extends StObject {
    
    /**
      * Style for the root element in the default enabled, non-toggled state.
      */
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IBaseCardStyles {
    
    inline def apply(): IBaseCardStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseCardStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBaseCardStyles] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
