package typings.nukaCarousel.mod

import typings.nukaCarousel.AnonContainerClassName
import typings.nukaCarousel.nukaCarouselStrings.zoom
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  /**
    * Hook to be called after a slide is changed
    * @param prevSlide Index of the previous slide
    */
  var afterSlide: js.UndefOr[js.Function1[/* prevSlide */ Double, Unit]] = js.undefined
  /**
    * Adds a zoom effect on the currently visible slide.
    */
  var animation: js.UndefOr[zoom] = js.undefined
  /**
    * Will generate a style tag to help ensure images are displayed properly
    * @default true
    */
  var autoGenerateStyleTag: js.UndefOr[Boolean] = js.undefined
  /**
    * Autoplay mode active
    * @default false
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * Interval for autoplay iteration (ms)
    * @default 3000
    */
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  /**
    * Autoplay cycles through slide indexes in reverse
    * @default false
    */
  var autoplayReverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Hook to be called before a slide is changed
    * @param currentSlide Index of the current slide
    * @param endSlide Index of the last slide
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentSlide */ Double, /* endSlide */ Double, Unit]] = js.undefined
  /**
    * When displaying more than one slide,
    * sets which position to anchor the current slide to
    */
  var cellAlign: js.UndefOr[CarouselCellAlignProp] = js.undefined
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: js.UndefOr[Double] = js.undefined
  /**
    * Additional className
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * This prop lets you apply custom classes and styles to the default Next, Previous, and Paging Dots controls
    */
  var defaultControlsConfig: js.UndefOr[AnonContainerClassName] = js.undefined
  /**
    * Disable slides animation
    * @default false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable swipe before first slide and after last slide
    * @default false
    */
  var disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable mouse swipe/dragging
    */
  var dragging: js.UndefOr[Boolean] = js.undefined
  /**
    * Animation easing function
    * @see https://github.com/d3/d3-ease
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * Animation easing function when swipe exceeds edge
    * @see https://github.com/d3/d3-ease
    */
  var edgeEasing: js.UndefOr[String] = js.undefined
  /**
    * When set to true, disable keyboard controls
    * @default false
    */
  var enableKeyboardControls: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to set overflow style property on slider frame
    * @default 'hidden'
    */
  var frameOverflow: js.UndefOr[String] = js.undefined
  /**
    * Used to set the margin of the slider frame.
    * Accepts any string dimension value such as "0px 20px" or "500px"
    * @example '0px 20px'
    * @example '500px'
    */
  var framePadding: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to apply styles to the container of a control.
    */
  var getControlContainerStyle: js.UndefOr[js.Function1[/* key */ CarouselControlContainerProp, CSSProperties]] = js.undefined
  /**
    * Used to hardcode the slider height
    * @example '80%'
    * @example '500px'
    */
  var height: js.UndefOr[String] = js.undefined
  /**
    * Change the height of the slides based either on the first slide,
    * the current slide, or the maximum height of all slides.
    */
  var heightMode: js.UndefOr[CarouselHeightModeProp] = js.undefined
  /**
    * Initial height of the slides (px)
    */
  var initialSlideHeight: js.UndefOr[Double] = js.undefined
  /**
    * Initial width of the slides (px)
    */
  var initialSlideWidth: js.UndefOr[Double] = js.undefined
  /**
    * When enableKeyboardControls is enabled, Configure keyCodes for corresponding slide actions as array of keyCodes
    */
  var keyCodeConfig: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slideAction in nuka-carousel.nuka-carousel.CarouselSlideActions ]:? std.Array<number>}
    */ typings.nukaCarousel.nukaCarouselStrings.CarouselProps with js.Any
  ] = js.undefined
  /**
    * optional callback function
    */
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Window onResize callback
    */
  var onResize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Pause autoPlay when mouse is over carousel
    * @default true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Function for rendering aria-live announcement messages
    */
  var renderAnnounceSlideMessage: js.UndefOr[
    js.Function1[/* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps, String]
  ] = js.undefined
  /**
    * Function for rendering bottom center control
    */
  var renderBottomCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering bottom left control
    */
  var renderBottomLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering bottom right control
    */
  var renderBottomRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering center center control
    */
  var renderCenterCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering center left control
    */
  var renderCenterLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering center right control
    */
  var renderCenterRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering top center control
    */
  var renderTopCenterControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering top left control
    */
  var renderTopLeftControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Function for rendering top right control
    */
  var renderTopRightControls: js.UndefOr[CarouselRenderControl | Null] = js.undefined
  /**
    * Manually set the index of the slide to be shown
    */
  var slideIndex: js.UndefOr[Double] = js.undefined
  /**
    * Manually set slideWidth
    * @example '20px'
    * @example 0.8
    */
  var slideWidth: js.UndefOr[CarouselSlideWidthProp] = js.undefined
  /**
    * Slides to scroll at once. Set to "auto"
    * to always scroll the current number of visible slides
    */
  var slidesToScroll: js.UndefOr[CarouselSlidesToScrollProp] = js.undefined
  /**
    * Slides to show at once
    */
  var slidesToShow: js.UndefOr[Double] = js.undefined
  /**
    * Animation duration
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * style object
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Enable touch swipe/dragging
    */
  var swiping: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the way slides transition from one to the next
    */
  var transitionMode: js.UndefOr[CarouselTransitionModeProp] = js.undefined
  /**
    * Enable the slides to transition vertically
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to hardcode the slider width
    * @example '80%'
    * @example '500px'
    */
  var width: js.UndefOr[String] = js.undefined
  /**
    * Used to remove all controls at once. Overwrites the render[Top, Right, Bottom, Left]CenterControls()
    * @default false
    */
  var withoutControls: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets infinite wrapAround mode
    * @default false
    */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    afterSlide: /* prevSlide */ Double => Unit = null,
    animation: zoom = null,
    autoGenerateStyleTag: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: Int | Double = null,
    autoplayReverse: js.UndefOr[Boolean] = js.undefined,
    beforeSlide: (/* currentSlide */ Double, /* endSlide */ Double) => Unit = null,
    cellAlign: CarouselCellAlignProp = null,
    cellSpacing: Int | Double = null,
    className: String = null,
    defaultControlsConfig: AnonContainerClassName = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableEdgeSwiping: js.UndefOr[Boolean] = js.undefined,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeEasing: String = null,
    enableKeyboardControls: js.UndefOr[Boolean] = js.undefined,
    frameOverflow: String = null,
    framePadding: String = null,
    getControlContainerStyle: /* key */ CarouselControlContainerProp => CSSProperties = null,
    height: String = null,
    heightMode: CarouselHeightModeProp = null,
    initialSlideHeight: Int | Double = null,
    initialSlideWidth: Int | Double = null,
    keyCodeConfig: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slideAction in nuka-carousel.nuka-carousel.CarouselSlideActions ]:? std.Array<number>}
    */ typings.nukaCarousel.nukaCarouselStrings.CarouselProps with js.Any = null,
    onDragStart: () => Unit = null,
    onResize: () => Unit = null,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    renderAnnounceSlideMessage: /* hasCurrentSlideSlideCount */ CarouselSlideRenderControlProps => String = null,
    renderBottomCenterControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderBottomLeftControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderBottomRightControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderCenterCenterControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderCenterLeftControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderCenterRightControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderTopCenterControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderTopLeftControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    renderTopRightControls: /* props */ CarouselSlideRenderControlProps => ReactNode = null,
    slideIndex: Int | Double = null,
    slideWidth: CarouselSlideWidthProp = null,
    slidesToScroll: CarouselSlidesToScrollProp = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    style: CSSProperties = null,
    swiping: js.UndefOr[Boolean] = js.undefined,
    transitionMode: CarouselTransitionModeProp = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: String = null,
    withoutControls: js.UndefOr[Boolean] = js.undefined,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGenerateStyleTag)) __obj.updateDynamic("autoGenerateStyleTag")(autoGenerateStyleTag.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayReverse)) __obj.updateDynamic("autoplayReverse")(autoplayReverse.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultControlsConfig != null) __obj.updateDynamic("defaultControlsConfig")(defaultControlsConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEdgeSwiping)) __obj.updateDynamic("disableEdgeSwiping")(disableEdgeSwiping.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardControls)) __obj.updateDynamic("enableKeyboardControls")(enableKeyboardControls.asInstanceOf[js.Any])
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding.asInstanceOf[js.Any])
    if (getControlContainerStyle != null) __obj.updateDynamic("getControlContainerStyle")(js.Any.fromFunction1(getControlContainerStyle))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (heightMode != null) __obj.updateDynamic("heightMode")(heightMode.asInstanceOf[js.Any])
    if (initialSlideHeight != null) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (keyCodeConfig != null) __obj.updateDynamic("keyCodeConfig")(keyCodeConfig.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction0(onResize))
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (renderAnnounceSlideMessage != null) __obj.updateDynamic("renderAnnounceSlideMessage")(js.Any.fromFunction1(renderAnnounceSlideMessage))
    if (renderBottomCenterControls != null) __obj.updateDynamic("renderBottomCenterControls")(js.Any.fromFunction1(renderBottomCenterControls))
    if (renderBottomLeftControls != null) __obj.updateDynamic("renderBottomLeftControls")(js.Any.fromFunction1(renderBottomLeftControls))
    if (renderBottomRightControls != null) __obj.updateDynamic("renderBottomRightControls")(js.Any.fromFunction1(renderBottomRightControls))
    if (renderCenterCenterControls != null) __obj.updateDynamic("renderCenterCenterControls")(js.Any.fromFunction1(renderCenterCenterControls))
    if (renderCenterLeftControls != null) __obj.updateDynamic("renderCenterLeftControls")(js.Any.fromFunction1(renderCenterLeftControls))
    if (renderCenterRightControls != null) __obj.updateDynamic("renderCenterRightControls")(js.Any.fromFunction1(renderCenterRightControls))
    if (renderTopCenterControls != null) __obj.updateDynamic("renderTopCenterControls")(js.Any.fromFunction1(renderTopCenterControls))
    if (renderTopLeftControls != null) __obj.updateDynamic("renderTopLeftControls")(js.Any.fromFunction1(renderTopLeftControls))
    if (renderTopRightControls != null) __obj.updateDynamic("renderTopRightControls")(js.Any.fromFunction1(renderTopRightControls))
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.asInstanceOf[js.Any])
    if (transitionMode != null) __obj.updateDynamic("transitionMode")(transitionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withoutControls)) __obj.updateDynamic("withoutControls")(withoutControls.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

