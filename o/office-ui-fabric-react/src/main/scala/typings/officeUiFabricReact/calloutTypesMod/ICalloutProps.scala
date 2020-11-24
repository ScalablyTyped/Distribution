package typings.officeUiFabricReact.calloutTypesMod

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
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricReactHooks.useTargetMod.Target
import typings.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalloutProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
    * thus making sure the element aligns perfectly with target's alignment edge
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the element id referencing the element containing the description for the callout.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  /**
    * Accessible label text for callout.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    *  Defines the element id referencing the element containing label text for callout.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  /**
    * The background color of the Callout in hex format ie. #ffffff.
    * @defaultvalue $ms-color-white
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * The width of the beak.
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.native
  
  /**
    * The bounding rectangle (or callback that returns a rectangle) for which  the contextual menu can appear in.
    */
  var bounds: js.UndefOr[
    IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ])
  ] = js.native
  
  /**
    * Set max height of callout
    * When not set the callout will expand with contents up to the bottom of the screen
    */
  var calloutMaxHeight: js.UndefOr[Double] = js.native
  
  /**
    * Custom width for callout including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var calloutMaxWidth: js.UndefOr[Double] = js.native
  
  /**
    * Custom width for callout including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var calloutWidth: js.UndefOr[Double] = js.native
  
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.BottomAutoEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * If true the position will not change sides in an attempt to fit the callout within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of the `directionalHint` alignment edge will be used instead.
    * This means that `DirectionalHint.BottomLeft` will change to `DirectionalHint.BottomRight` but
    * `DirectionalHint.LeftAuto` will not change.
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * If true then the callout will dismiss when the target element is clicked
    * @defaultvalue false
    */
  var dismissOnTargetClick: js.UndefOr[Boolean] = js.native
  
  /**
    * If true do not render on a new layer. If false render on a new layer.
    */
  var doNotLayer: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the final height of the content.
    * To be used when expanding the content dynamically so that callout can adjust its position.
    */
  var finalHeight: js.UndefOr[Double] = js.native
  
  /**
    * The gap between the Callout and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  
  /**
    * Manually set OverflowYHidden style prop to true on calloutMain element
    * A variety of callout load animations will need this to hide the scollbar that can appear
    */
  var hideOverflow: js.UndefOr[Boolean] = js.native
  
  /**
    * If true then the beak is visible. If false it will not be shown.
    * @defaultvalue true
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional props to pass to the Layer component hosting the panel.
    */
  var layerProps: js.UndefOr[ILayerProps] = js.native
  
  /**
    * The minimum distance the callout will be away from the edge of the screen.
    *  @defaultvalue 8
    */
  var minPagePadding: js.UndefOr[Double] = js.native
  
  /**
    * Callback when the Callout tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    * Optional callback when the layer content has mounted.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Optional callback that is called once the callout has been correctly positioned.
    * @param positions - Gives the user information about how the callout is positioned such as the
    * final edge of the target that it positioned against, the beak position, and the beaks relationship to the
    * edges of the callout.
    */
  var onPositioned: js.UndefOr[js.Function1[/* positions */ js.UndefOr[ICalloutPositionedInfo], Unit]] = js.native
  
  /**
    * Called when the component is unmounting, and focus needs to be restored.
    * Argument passed down contains two variables, the element that the underlying
    * popup believes focus should go to * and whether or not the popup currently
    * contains focus. If this is provided, focus will not be restored automatically,
    * you'll need to call originalElement.focus()
    */
  var onRestoreFocus: js.UndefOr[js.Function1[/* options */ ContainsFocus, Unit]] = js.native
  
  /**
    * Callback when the Callout body is scrolled.
    */
  @JSName("onScroll")
  var onScroll_ICalloutProps: js.UndefOr[js.Function0[Unit]] = js.native
  
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
  ] = js.native
  
  /**
    * If true then the callout will not dismiss when it loses focus
    * @defaultvalue false
    * @deprecated use preventDismissOnEvent callback instead
    */
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * If true then the callout will not dismiss on resize
    * @defaultvalue false
    * @deprecated use preventDismissOnEvent callback instead
    */
  var preventDismissOnResize: js.UndefOr[Boolean] = js.native
  
  /**
    * If true then the callout will not dismiss on scroll
    * @defaultvalue false
    * @deprecated use preventDismissOnEvent callback instead
    */
  var preventDismissOnScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * If true then the callout will attempt to focus the first focusable element that it contains.
    * If it doesn't find an element, no focus will be set and the method will return false.
    * This means that it's the contents responsibility to either set focus or have
    * focusable items.
    * @returns True if focus was set, false if it was not.
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * If true then the callout will dismiss when the window gets focus
    * @defaultvalue false
    */
  var shouldDismissOnWindowFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, when this component is unmounted, focus will be restored to the element that had focus when the component
    * first mounted.
    * @defaultvalue true
    * @deprecated use onRestoreFocus callback instead
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the component will be updated even when hidden=true.
    * Note that this would consume resources to update even though
    * nothing is being shown to the user.
    * This might be helpful though if your updates are small and you want the
    * callout to be revealed fast to the user when hidden is set to false.
    */
  var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]] = js.native
  
  /**
    * The target that the Callout should try to position itself based on.
    * It can be either an Element a querySelector string of a valid Element
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[Target] = js.native
  
  /**
    * Optional theme for component
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object ICalloutProps {
  
  @scala.inline
  def apply(): ICalloutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalloutProps]
  }
  
  @scala.inline
  implicit class ICalloutPropsOps[Self <: ICalloutProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignTargetEdge(value: Boolean): Self = this.set("alignTargetEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignTargetEdge: Self = this.set("alignTargetEdge", js.undefined)
    
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBeakWidth(value: Double): Self = this.set("beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakWidth: Self = this.set("beakWidth", js.undefined)
    
    @scala.inline
    def setBoundsFunction2(
      value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window]) => js.UndefOr[IRectangle]
    ): Self = this.set("bounds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBounds(
      value: IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window], 
          js.UndefOr[IRectangle]
        ])
    ): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setCalloutMaxHeight(value: Double): Self = this.set("calloutMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutMaxHeight: Self = this.set("calloutMaxHeight", js.undefined)
    
    @scala.inline
    def setCalloutMaxWidth(value: Double): Self = this.set("calloutMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutMaxWidth: Self = this.set("calloutMaxWidth", js.undefined)
    
    @scala.inline
    def setCalloutWidth(value: Double): Self = this.set("calloutWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutWidth: Self = this.set("calloutWidth", js.undefined)
    
    @scala.inline
    def setCoverTarget(value: Boolean): Self = this.set("coverTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverTarget: Self = this.set("coverTarget", js.undefined)
    
    @scala.inline
    def setDirectionalHint(value: DirectionalHint): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHint: Self = this.set("directionalHint", js.undefined)
    
    @scala.inline
    def setDirectionalHintFixed(value: Boolean): Self = this.set("directionalHintFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintFixed: Self = this.set("directionalHintFixed", js.undefined)
    
    @scala.inline
    def setDirectionalHintForRTL(value: DirectionalHint): Self = this.set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintForRTL: Self = this.set("directionalHintForRTL", js.undefined)
    
    @scala.inline
    def setDismissOnTargetClick(value: Boolean): Self = this.set("dismissOnTargetClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissOnTargetClick: Self = this.set("dismissOnTargetClick", js.undefined)
    
    @scala.inline
    def setDoNotLayer(value: Boolean): Self = this.set("doNotLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotLayer: Self = this.set("doNotLayer", js.undefined)
    
    @scala.inline
    def setFinalHeight(value: Double): Self = this.set("finalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalHeight: Self = this.set("finalHeight", js.undefined)
    
    @scala.inline
    def setGapSpace(value: Double): Self = this.set("gapSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapSpace: Self = this.set("gapSpace", js.undefined)
    
    @scala.inline
    def setHideOverflow(value: Boolean): Self = this.set("hideOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOverflow: Self = this.set("hideOverflow", js.undefined)
    
    @scala.inline
    def setIsBeakVisible(value: Boolean): Self = this.set("isBeakVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBeakVisible: Self = this.set("isBeakVisible", js.undefined)
    
    @scala.inline
    def setLayerProps(value: ILayerProps): Self = this.set("layerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerProps: Self = this.set("layerProps", js.undefined)
    
    @scala.inline
    def setMinPagePadding(value: Double): Self = this.set("minPagePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPagePadding: Self = this.set("minPagePadding", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnLayerMounted(value: () => Unit): Self = this.set("onLayerMounted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLayerMounted: Self = this.set("onLayerMounted", js.undefined)
    
    @scala.inline
    def setOnPositioned(value: /* positions */ js.UndefOr[ICalloutPositionedInfo] => Unit): Self = this.set("onPositioned", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPositioned: Self = this.set("onPositioned", js.undefined)
    
    @scala.inline
    def setOnRestoreFocus(value: /* options */ ContainsFocus => Unit): Self = this.set("onRestoreFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRestoreFocus: Self = this.set("onRestoreFocus", js.undefined)
    
    @scala.inline
    def setOnScroll(value: () => Unit): Self = this.set("onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setPreventDismissOnEvent(
      value: /* ev */ Event | FocusEvent[Element] | KeyboardEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) => Boolean
    ): Self = this.set("preventDismissOnEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreventDismissOnEvent: Self = this.set("preventDismissOnEvent", js.undefined)
    
    @scala.inline
    def setPreventDismissOnLostFocus(value: Boolean): Self = this.set("preventDismissOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDismissOnLostFocus: Self = this.set("preventDismissOnLostFocus", js.undefined)
    
    @scala.inline
    def setPreventDismissOnResize(value: Boolean): Self = this.set("preventDismissOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDismissOnResize: Self = this.set("preventDismissOnResize", js.undefined)
    
    @scala.inline
    def setPreventDismissOnScroll(value: Boolean): Self = this.set("preventDismissOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDismissOnScroll: Self = this.set("preventDismissOnScroll", js.undefined)
    
    @scala.inline
    def setSetInitialFocus(value: Boolean): Self = this.set("setInitialFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetInitialFocus: Self = this.set("setInitialFocus", js.undefined)
    
    @scala.inline
    def setShouldDismissOnWindowFocus(value: Boolean): Self = this.set("shouldDismissOnWindowFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldDismissOnWindowFocus: Self = this.set("shouldDismissOnWindowFocus", js.undefined)
    
    @scala.inline
    def setShouldRestoreFocus(value: Boolean): Self = this.set("shouldRestoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRestoreFocus: Self = this.set("shouldRestoreFocus", js.undefined)
    
    @scala.inline
    def setShouldUpdateWhenHidden(value: Boolean): Self = this.set("shouldUpdateWhenHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldUpdateWhenHidden: Self = this.set("shouldUpdateWhenHidden", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ICalloutContentStyleProps => DeepPartial[ICalloutContentStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
