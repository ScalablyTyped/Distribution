package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.tooltipBaseMod.TooltipBase
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTypesMod {
  
  @js.native
  sealed trait TooltipDelay extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.types", "TooltipDelay")
  @js.native
  object TooltipDelay extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TooltipDelay & Double] = js.native
    
    /** 500 ms delay before showing the tooltip */
    @js.native
    sealed trait long
      extends StObject
         with TooltipDelay
    /* 2 */ val long: typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay.long & Double = js.native
    
    /** 300 ms delay before showng the tooltip */
    @js.native
    sealed trait medium
      extends StObject
         with TooltipDelay
    /* 1 */ val medium: typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay.medium & Double = js.native
    
    @js.native
    sealed trait zero
      extends StObject
         with TooltipDelay
    /* 0 */ val zero: typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay.zero & Double = js.native
  }
  
  trait ITooltip extends StObject
  
  trait ITooltipProps
    extends StObject
       with HTMLAttributes[HTMLDivElement | TooltipBase] {
    
    /**
      * Properties to pass through for Callout.
      * @defaultvalue `{ isBeakVisible: true, beakWidth: 16, gapSpace: 0, setInitialFocus: true, doNotLayer: false }`
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
    
    /**
      * Optional callback to access the ITooltip interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ITooltip]] = js.undefined
    
    /**
      * Content to be passed to the tooltip
      */
    var content: js.UndefOr[String | Element | js.Array[Element]] = js.undefined
    
    /**
      * Length of delay. Set to `TooltipDelay.zero` if you do not want a delay.
      * @defaultvalue TooltipDelay.medium
      */
    var delay: js.UndefOr[TooltipDelay] = js.undefined
    
    /**
      * How the tooltip should be anchored to its `targetElement`.
      * @defaultvalue DirectionalHint.topCenter
      */
    var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * How the element should be positioned in RTL layouts.
      * If not specified, a mirror of `directionalHint` will be used instead
      */
    var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * Max width of tooltip
      * @defaultvalue 364px
      */
    var maxWidth: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Render function to populate tooltip content.
      */
    var onRenderContent: js.UndefOr[IRenderFunction[ITooltipProps]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ITooltipStyleProps, ITooltipStyles]] = js.undefined
    
    /**
      * Element to anchor the Tooltip to.
      */
    var targetElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Theme provided by higher-order component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object ITooltipProps {
    
    @scala.inline
    def apply(): ITooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipProps]
    }
    
    @scala.inline
    implicit class ITooltipPropsMutableBuilder[Self <: ITooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ITooltip]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ITooltip | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setContent(value: String | Element | js.Array[Element]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: Element*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: TooltipDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      @scala.inline
      def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthNull: Self = StObject.set(x, "maxWidth", null)
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setOnRenderContent(
        value: (/* props */ js.UndefOr[ITooltipProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITooltipProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderContentUndefined: Self = StObject.set(x, "onRenderContent", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ITooltipStyleProps, ITooltipStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ITooltipStyleProps => DeepPartial[ITooltipStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
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
    }
  }
  
  trait ITooltipStyleProps extends StObject {
    
    /**
      * The width of the Callout's beak
      * @defaultvalue 16
      */
    var beakWidth: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Delay before tooltip appears.
      * @deprecated Delay logic moved to TooltipHost vs relying on animation delay.
      */
    var delay: js.UndefOr[TooltipDelay] = js.undefined
    
    /**
      * The gap between the Callout and the target
      * @defaultvalue 0
      */
    var gapSpace: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum width of tooltip.
      */
    var maxWidth: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
  }
  object ITooltipStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ITooltipStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipStyleProps]
    }
    
    @scala.inline
    implicit class ITooltipStylePropsMutableBuilder[Self <: ITooltipStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelay(value: TooltipDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSpaceUndefined: Self = StObject.set(x, "gapSpace", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITooltipStyles extends StObject {
    
    /**
      * Style for the content element.
      */
    var content: IStyle
    
    /**
      * Style for the root element.
      */
    var root: IStyle
    
    /**
      * Style for the subtext element.
      */
    var subText: IStyle
  }
  object ITooltipStyles {
    
    @scala.inline
    def apply(): ITooltipStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipStyles]
    }
    
    @scala.inline
    implicit class ITooltipStylesMutableBuilder[Self <: ITooltipStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSubText(value: IStyle): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTextNull: Self = StObject.set(x, "subText", null)
      
      @scala.inline
      def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
    }
  }
}
