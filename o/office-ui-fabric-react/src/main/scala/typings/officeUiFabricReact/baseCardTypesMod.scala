package typings.officeUiFabricReact

import org.scalablytyped.runtime.TopLevel
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseCardTypesMod {
  
  @js.native
  trait IBaseCardProps[TComponent, TStyles, TStyleProps] extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * Custom overriding props to Callout
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.native
    
    /**
      * Optional callback to access the TComponent interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[TComponent]] = js.native
    
    /**
      * How the element should be positioned
      * @defaultvalue DirectionalHint.bottomLeftEdge
      */
    var directionalHint: js.UndefOr[DirectionalHint] = js.native
    
    /**
      * Make callout content show on the set side
      * @defaultvalue true
      */
    var directionalHintFixed: js.UndefOr[Boolean] = js.native
    
    /**
      * Focus on first element by default on card or not
      */
    var firstFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * The gap between the card and the target
      * @defaultvalue 0
      */
    var gapSpace: js.UndefOr[Double] = js.native
    
    /**
      * Callback upon focus or mouse enter event
      */
    var onEnter: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
    
    /**
      * Callback upon blur or mouse leave event
      */
    var onLeave: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
    
    /**
      *  Item to be returned with onRender functions
      */
    var renderData: js.UndefOr[js.Any] = js.native
    
    /**
      * Custom styles for this component
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[
          TStyleProps, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
      */ typings.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
        ]
      ] = js.native
    
    /**
      * Element to anchor the card to.
      */
    var targetElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Trap focus or not
      */
    var trapFocus: js.UndefOr[Boolean] = js.native
  }
  object IBaseCardProps {
    
    @scala.inline
    def apply[TComponent, TStyles, TStyleProps](): IBaseCardProps[TComponent, TStyles, TStyleProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseCardProps[TComponent, TStyles, TStyleProps]]
    }
    
    @scala.inline
    implicit class IBaseCardPropsMutableBuilder[Self <: IBaseCardProps[_, _, _], TComponent, TStyles, TStyleProps] (val x: Self with (IBaseCardProps[TComponent, TStyles, TStyleProps])) extends AnyVal {
      
      @scala.inline
      def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[TComponent]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ TComponent | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixedUndefined: Self = StObject.set(x, "directionalHintFixed", js.undefined)
      
      @scala.inline
      def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      @scala.inline
      def setFirstFocus(value: Boolean): Self = StObject.set(x, "firstFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFocusUndefined: Self = StObject.set(x, "firstFocus", js.undefined)
      
      @scala.inline
      def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSpaceUndefined: Self = StObject.set(x, "gapSpace", js.undefined)
      
      @scala.inline
      def setOnEnter(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnLeave(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
      
      @scala.inline
      def setRenderData(value: js.Any): Self = StObject.set(x, "renderData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderDataUndefined: Self = StObject.set(x, "renderData", js.undefined)
      
      @scala.inline
      def setStyles(
        value: IStyleFunctionOrObject[
              TStyleProps, 
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
        */ typings.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
            ]
      ): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(
        value: TStyleProps => DeepPartial[
              /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ P in keyof TStyles ]: @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
        */ typings.officeUiFabricReact.officeUiFabricReactStrings.IBaseCardProps with TopLevel[js.Any]
            ]
      ): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    }
  }
  
  @js.native
  trait IBaseCardStyleProps extends StObject {
    
    /**
      * ClassName to inject into wrapper div of the content.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme = js.native
  }
  object IBaseCardStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IBaseCardStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBaseCardStyleProps]
    }
    
    @scala.inline
    implicit class IBaseCardStylePropsMutableBuilder[Self <: IBaseCardStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IBaseCardStyles extends StObject {
    
    /**
      * Style for the root element in the default enabled, non-toggled state.
      */
    var root: js.UndefOr[IStyle] = js.native
  }
  object IBaseCardStyles {
    
    @scala.inline
    def apply(): IBaseCardStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseCardStyles]
    }
    
    @scala.inline
    implicit class IBaseCardStylesMutableBuilder[Self <: IBaseCardStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
