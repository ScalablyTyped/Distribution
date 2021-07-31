package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.ContainsFocus
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.layerTypesMod.ILayerProps
import typings.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.Window
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricReactHooks.useTargetMod.Target
import typings.uifabricUtilities.irectangleMod.IRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calloutTypesMod {
  
  trait ICalloutContentStyleProps extends StObject {
    
    /**
      * Background color for the beak and callout.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Width of Callout beak
      */
    var beakWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Max width for callout including borders.
      */
    var calloutMaxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Width for callout including borders.
      */
    var calloutWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * CSS class to apply to the callout.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not to clip content of the callout,
      * if it overflows vertically.
      */
    var overflowYHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callout positioning data
      */
    var positions: js.UndefOr[ICalloutPositionedInfo] = js.undefined
    
    /**
      * Theme to apply to the calloutContent.
      */
    var theme: ITheme
  }
  object ICalloutContentStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ICalloutContentStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICalloutContentStyleProps]
    }
    
    @scala.inline
    implicit class ICalloutContentStylePropsMutableBuilder[Self <: ICalloutContentStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
      
      @scala.inline
      def setCalloutMaxWidth(value: Double): Self = StObject.set(x, "calloutMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutMaxWidthUndefined: Self = StObject.set(x, "calloutMaxWidth", js.undefined)
      
      @scala.inline
      def setCalloutWidth(value: Double): Self = StObject.set(x, "calloutWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutWidthUndefined: Self = StObject.set(x, "calloutWidth", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOverflowYHidden(value: Boolean): Self = StObject.set(x, "overflowYHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowYHiddenUndefined: Self = StObject.set(x, "overflowYHidden", js.undefined)
      
      @scala.inline
      def setPositions(value: ICalloutPositionedInfo): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICalloutContentStyles extends StObject {
    
    /**
      * Style for callout beak.
      */
    var beak: IStyle
    
    /**
      * Style for callout beak curtain.
      */
    var beakCurtain: IStyle
    
    /**
      * Style for content component of the callout.
      */
    var calloutMain: IStyle
    
    /**
      * Style for wrapper of Callout component.
      */
    var container: IStyle
    
    /**
      * Style for callout container root element.
      */
    var root: IStyle
  }
  object ICalloutContentStyles {
    
    @scala.inline
    def apply(): ICalloutContentStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalloutContentStyles]
    }
    
    @scala.inline
    implicit class ICalloutContentStylesMutableBuilder[Self <: ICalloutContentStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeak(value: IStyle): Self = StObject.set(x, "beak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakCurtain(value: IStyle): Self = StObject.set(x, "beakCurtain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakCurtainNull: Self = StObject.set(x, "beakCurtain", null)
      
      @scala.inline
      def setBeakCurtainUndefined: Self = StObject.set(x, "beakCurtain", js.undefined)
      
      @scala.inline
      def setBeakNull: Self = StObject.set(x, "beak", null)
      
      @scala.inline
      def setBeakUndefined: Self = StObject.set(x, "beak", js.undefined)
      
      @scala.inline
      def setCalloutMain(value: IStyle): Self = StObject.set(x, "calloutMain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutMainNull: Self = StObject.set(x, "calloutMain", null)
      
      @scala.inline
      def setCalloutMainUndefined: Self = StObject.set(x, "calloutMain", js.undefined)
      
      @scala.inline
      def setContainer(value: IStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait ICalloutProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
      * thus making sure the element aligns perfectly with target's alignment edge
      */
    var alignTargetEdge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the element id referencing the element containing the description for the callout.
      */
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    /**
      * Accessible label text for callout.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      *  Defines the element id referencing the element containing label text for callout.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * The background color of the Callout in hex format ie. #ffffff.
      * @defaultvalue $ms-color-white
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the beak.
      * @defaultvalue 16
      */
    var beakWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The bounding rectangle (or callback that returns a rectangle) for which  the contextual menu can appear in.
      */
    var bounds: js.UndefOr[
        IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window], 
          js.UndefOr[IRectangle]
        ])
      ] = js.undefined
    
    /**
      * Set max height of callout
      * When not set the callout will expand with contents up to the bottom of the screen
      */
    var calloutMaxHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom width for callout including borders. If value is 0, no width is applied.
      * @defaultvalue 0
      */
    var calloutMaxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom width for callout including borders. If value is 0, no width is applied.
      * @defaultvalue 0
      */
    var calloutWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * If true the position returned will have the menu element cover the target.
      * If false then it will position next to the target;
      * @defaultvalue false
      */
    var coverTarget: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How the element should be positioned
      * @defaultvalue DirectionalHint.BottomAutoEdge
      */
    var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * If true the position will not change sides in an attempt to fit the callout within bounds.
      * It will still attempt to align it to whatever bounds are given.
      * @defaultvalue false
      */
    var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How the element should be positioned in RTL layouts.
      * If not specified, a mirror of the `directionalHint` alignment edge will be used instead.
      * This means that `DirectionalHint.BottomLeft` will change to `DirectionalHint.BottomRight` but
      * `DirectionalHint.LeftAuto` will not change.
      */
    var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * If true then the callout will dismiss when the target element is clicked
      * @defaultvalue false
      */
    var dismissOnTargetClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true do not render on a new layer. If false render on a new layer.
      */
    var doNotLayer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the final height of the content.
      * To be used when expanding the content dynamically so that callout can adjust its position.
      */
    var finalHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The gap between the Callout and the target
      * @defaultvalue 0
      */
    var gapSpace: js.UndefOr[Double] = js.undefined
    
    /**
      * Manually set OverflowYHidden style prop to true on calloutMain element
      * A variety of callout load animations will need this to hide the scollbar that can appear
      */
    var hideOverflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true then the beak is visible. If false it will not be shown.
      * @defaultvalue true
      */
    var isBeakVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional props to pass to the Layer component hosting the panel.
      */
    var layerProps: js.UndefOr[ILayerProps] = js.undefined
    
    /**
      * The minimum distance the callout will be away from the edge of the screen.
      *  @defaultvalue 8
      */
    var minPagePadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback when the Callout tries to close.
      */
    var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /**
      * Optional callback when the layer content has mounted.
      */
    var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Optional callback that is called once the callout has been correctly positioned.
      * @param positions - Gives the user information about how the callout is positioned such as the
      * final edge of the target that it positioned against, the beak position, and the beaks relationship to the
      * edges of the callout.
      */
    var onPositioned: js.UndefOr[js.Function1[/* positions */ js.UndefOr[ICalloutPositionedInfo], Unit]] = js.undefined
    
    /**
      * Called when the component is unmounting, and focus needs to be restored.
      * Argument passed down contains two variables, the element that the underlying
      * popup believes focus should go to * and whether or not the popup currently
      * contains focus. If this is provided, focus will not be restored automatically,
      * you'll need to call originalElement.focus()
      */
    var onRestoreFocus: js.UndefOr[js.Function1[/* options */ ContainsFocus, Unit]] = js.undefined
    
    /**
      * Callback when the Callout body is scrolled.
      */
    @JSName("onScroll")
    var onScroll_ICalloutProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If defined, then takes priority over preventDismissOnLostFocus, preventDismissOnResize,
      * and preventDismissOnScroll.
      * If it returns true, then callout will not dismiss for this event.
      * If not defined or returns false, callout can dismiss for this event.
      */
    var preventDismissOnEvent: js.UndefOr[
        js.Function1[
          /* ev */ Event | FocusEvent[Element] | KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]), 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * If true then the callout will not dismiss when it loses focus
      * @defaultvalue false
      * @deprecated use preventDismissOnEvent callback instead
      */
    var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true then the callout will not dismiss on resize
      * @defaultvalue false
      * @deprecated use preventDismissOnEvent callback instead
      */
    var preventDismissOnResize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true then the callout will not dismiss on scroll
      * @defaultvalue false
      * @deprecated use preventDismissOnEvent callback instead
      */
    var preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true then the callout will attempt to focus the first focusable element that it contains.
      * If it doesn't find an element, no focus will be set and the method will return false.
      * This means that it's the contents responsibility to either set focus or have
      * focusable items.
      * @returns True if focus was set, false if it was not.
      */
    var setInitialFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true then the callout will dismiss when the window gets focus
      * @defaultvalue false
      */
    var shouldDismissOnWindowFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, when this component is unmounted, focus will be restored to the element that had focus when the component
      * first mounted.
      * @defaultvalue true
      * @deprecated use onRestoreFocus callback instead
      */
    var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the component will be updated even when hidden=true.
      * Note that this would consume resources to update even though
      * nothing is being shown to the user.
      * This might be helpful though if your updates are small and you want the
      * callout to be revealed fast to the user when hidden is set to false.
      */
    var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional styles for the component.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]] = js.undefined
    
    /**
      * The target that the Callout should try to position itself based on.
      * It can be either an Element a querySelector string of a valid Element
      * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
      */
    var target: js.UndefOr[Target] = js.undefined
    
    /**
      * Optional theme for component
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object ICalloutProps {
    
    @scala.inline
    def apply(): ICalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICalloutProps]
    }
    
    @scala.inline
    implicit class ICalloutPropsMutableBuilder[Self <: ICalloutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignTargetEdge(value: Boolean): Self = StObject.set(x, "alignTargetEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTargetEdgeUndefined: Self = StObject.set(x, "alignTargetEdge", js.undefined)
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBeakWidth(value: Double): Self = StObject.set(x, "beakWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakWidthUndefined: Self = StObject.set(x, "beakWidth", js.undefined)
      
      @scala.inline
      def setBounds(
        value: IRectangle | (js.Function2[
              /* target */ js.UndefOr[Target], 
              /* targetWindow */ js.UndefOr[Window], 
              js.UndefOr[IRectangle]
            ])
      ): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsFunction2(
        value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window]) => js.UndefOr[IRectangle]
      ): Self = StObject.set(x, "bounds", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCalloutMaxHeight(value: Double): Self = StObject.set(x, "calloutMaxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutMaxHeightUndefined: Self = StObject.set(x, "calloutMaxHeight", js.undefined)
      
      @scala.inline
      def setCalloutMaxWidth(value: Double): Self = StObject.set(x, "calloutMaxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutMaxWidthUndefined: Self = StObject.set(x, "calloutMaxWidth", js.undefined)
      
      @scala.inline
      def setCalloutWidth(value: Double): Self = StObject.set(x, "calloutWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutWidthUndefined: Self = StObject.set(x, "calloutWidth", js.undefined)
      
      @scala.inline
      def setCoverTarget(value: Boolean): Self = StObject.set(x, "coverTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverTargetUndefined: Self = StObject.set(x, "coverTarget", js.undefined)
      
      @scala.inline
      def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintFixedUndefined: Self = StObject.set(x, "directionalHintFixed", js.undefined)
      
      @scala.inline
      def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      @scala.inline
      def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      @scala.inline
      def setDismissOnTargetClick(value: Boolean): Self = StObject.set(x, "dismissOnTargetClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissOnTargetClickUndefined: Self = StObject.set(x, "dismissOnTargetClick", js.undefined)
      
      @scala.inline
      def setDoNotLayer(value: Boolean): Self = StObject.set(x, "doNotLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotLayerUndefined: Self = StObject.set(x, "doNotLayer", js.undefined)
      
      @scala.inline
      def setFinalHeight(value: Double): Self = StObject.set(x, "finalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalHeightUndefined: Self = StObject.set(x, "finalHeight", js.undefined)
      
      @scala.inline
      def setGapSpace(value: Double): Self = StObject.set(x, "gapSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSpaceUndefined: Self = StObject.set(x, "gapSpace", js.undefined)
      
      @scala.inline
      def setHideOverflow(value: Boolean): Self = StObject.set(x, "hideOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOverflowUndefined: Self = StObject.set(x, "hideOverflow", js.undefined)
      
      @scala.inline
      def setIsBeakVisible(value: Boolean): Self = StObject.set(x, "isBeakVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBeakVisibleUndefined: Self = StObject.set(x, "isBeakVisible", js.undefined)
      
      @scala.inline
      def setLayerProps(value: ILayerProps): Self = StObject.set(x, "layerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerPropsUndefined: Self = StObject.set(x, "layerProps", js.undefined)
      
      @scala.inline
      def setMinPagePadding(value: Double): Self = StObject.set(x, "minPagePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPagePaddingUndefined: Self = StObject.set(x, "minPagePadding", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOnLayerMounted(value: () => Unit): Self = StObject.set(x, "onLayerMounted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLayerMountedUndefined: Self = StObject.set(x, "onLayerMounted", js.undefined)
      
      @scala.inline
      def setOnPositioned(value: /* positions */ js.UndefOr[ICalloutPositionedInfo] => Unit): Self = StObject.set(x, "onPositioned", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPositionedUndefined: Self = StObject.set(x, "onPositioned", js.undefined)
      
      @scala.inline
      def setOnRestoreFocus(value: /* options */ ContainsFocus => Unit): Self = StObject.set(x, "onRestoreFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRestoreFocusUndefined: Self = StObject.set(x, "onRestoreFocus", js.undefined)
      
      @scala.inline
      def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setPreventDismissOnEvent(
        value: /* ev */ Event | FocusEvent[Element] | KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) => Boolean
      ): Self = StObject.set(x, "preventDismissOnEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreventDismissOnEventUndefined: Self = StObject.set(x, "preventDismissOnEvent", js.undefined)
      
      @scala.inline
      def setPreventDismissOnLostFocus(value: Boolean): Self = StObject.set(x, "preventDismissOnLostFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDismissOnLostFocusUndefined: Self = StObject.set(x, "preventDismissOnLostFocus", js.undefined)
      
      @scala.inline
      def setPreventDismissOnResize(value: Boolean): Self = StObject.set(x, "preventDismissOnResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDismissOnResizeUndefined: Self = StObject.set(x, "preventDismissOnResize", js.undefined)
      
      @scala.inline
      def setPreventDismissOnScroll(value: Boolean): Self = StObject.set(x, "preventDismissOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDismissOnScrollUndefined: Self = StObject.set(x, "preventDismissOnScroll", js.undefined)
      
      @scala.inline
      def setSetInitialFocus(value: Boolean): Self = StObject.set(x, "setInitialFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetInitialFocusUndefined: Self = StObject.set(x, "setInitialFocus", js.undefined)
      
      @scala.inline
      def setShouldDismissOnWindowFocus(value: Boolean): Self = StObject.set(x, "shouldDismissOnWindowFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldDismissOnWindowFocusUndefined: Self = StObject.set(x, "shouldDismissOnWindowFocus", js.undefined)
      
      @scala.inline
      def setShouldRestoreFocus(value: Boolean): Self = StObject.set(x, "shouldRestoreFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldRestoreFocusUndefined: Self = StObject.set(x, "shouldRestoreFocus", js.undefined)
      
      @scala.inline
      def setShouldUpdateWhenHidden(value: Boolean): Self = StObject.set(x, "shouldUpdateWhenHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdateWhenHiddenUndefined: Self = StObject.set(x, "shouldUpdateWhenHidden", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ICalloutContentStyleProps => DeepPartial[ICalloutContentStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
