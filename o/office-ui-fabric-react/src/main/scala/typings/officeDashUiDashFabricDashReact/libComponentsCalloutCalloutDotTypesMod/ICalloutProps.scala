package typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutPositionedInfo
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutProps extends HTMLAttributes[HTMLDivElement] {
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
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
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
    * Callback when the Callout body is scrolled.
    */
  @JSName("onScroll")
  var onScroll_ICalloutProps: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If true then the callout will not dismiss when it loses focus
    * @defaultvalue false
    */
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then the callout will not dismiss on resize
    * @defaultvalue false
    */
  var preventDismissOnResize: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then the callout will not dismiss on scroll
    * @defaultvalue false
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
    * If specified, determines whether the underlying "Popup" component should try to restore
    * focus when it is dismissed.  When set to false, the Popup won't try to restore focus to
    * the last focused element.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
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
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    backgroundColor: String = null,
    beakWidth: Int | Double = null,
    bounds: IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ]) = null,
    calloutMaxHeight: Int | Double = null,
    calloutMaxWidth: Int | Double = null,
    calloutWidth: Int | Double = null,
    className: String = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    finalHeight: Int | Double = null,
    gapSpace: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hideOverflow: js.UndefOr[Boolean] = js.undefined,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    layerProps: ILayerProps = null,
    minPagePadding: Int | Double = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onLayerMounted: () => Unit = null,
    onPositioned: /* positions */ js.UndefOr[ICalloutPositionedInfo] => Unit = null,
    onScroll: () => Unit = null,
    preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    preventDismissOnResize: js.UndefOr[Boolean] = js.undefined,
    preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    setInitialFocus: js.UndefOr[Boolean] = js.undefined,
    shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles] = null,
    target: Target = null,
    theme: ITheme = null
  ): ICalloutProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (calloutMaxHeight != null) __obj.updateDynamic("calloutMaxHeight")(calloutMaxHeight.asInstanceOf[js.Any])
    if (calloutMaxWidth != null) __obj.updateDynamic("calloutMaxWidth")(calloutMaxWidth.asInstanceOf[js.Any])
    if (calloutWidth != null) __obj.updateDynamic("calloutWidth")(calloutWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget)
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint)
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed)
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL)
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer)
    if (finalHeight != null) __obj.updateDynamic("finalHeight")(finalHeight.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(hideOverflow)) __obj.updateDynamic("hideOverflow")(hideOverflow)
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible)
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps)
    if (minPagePadding != null) __obj.updateDynamic("minPagePadding")(minPagePadding.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onLayerMounted != null) __obj.updateDynamic("onLayerMounted")(js.Any.fromFunction0(onLayerMounted))
    if (onPositioned != null) __obj.updateDynamic("onPositioned")(js.Any.fromFunction1(onPositioned))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction0(onScroll))
    if (!js.isUndefined(preventDismissOnLostFocus)) __obj.updateDynamic("preventDismissOnLostFocus")(preventDismissOnLostFocus)
    if (!js.isUndefined(preventDismissOnResize)) __obj.updateDynamic("preventDismissOnResize")(preventDismissOnResize)
    if (!js.isUndefined(preventDismissOnScroll)) __obj.updateDynamic("preventDismissOnScroll")(preventDismissOnScroll)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(setInitialFocus)) __obj.updateDynamic("setInitialFocus")(setInitialFocus)
    if (!js.isUndefined(shouldRestoreFocus)) __obj.updateDynamic("shouldRestoreFocus")(shouldRestoreFocus)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ICalloutProps]
  }
}

