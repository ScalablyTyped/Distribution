package typings
package nukaDashCarouselLib.nukaDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  /**
    * Hook to be called after a slide is changed
    * @param prevSlide Index of the previous slide
    */
  var afterSlide: js.UndefOr[js.Function1[/* prevSlide */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Will generate a style tag to help ensure images are displayed properly
    * @default true
    */
  var autoGenerateStyleTag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Autoplay mode active
    * @default false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Interval for autoplay iteration (ms)
    * @default 3000
    */
  var autoplayInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Autoplay cycles through slide indexes in reverse
    * @default false
    */
  var autoplayReverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Hook to be called before a slide is changed
    * @param currentSlide Index of the current slide
    * @param endSlide Index of the last slide
    */
  var beforeSlide: js.UndefOr[
    js.Function2[/* currentSlide */ scala.Double, /* endSlide */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * When displaying more than one slide,
    * sets which position to anchor the current slide to
    */
  var cellAlign: js.UndefOr[CarouselCellAlignProp] = js.undefined
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
    * Additional className
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disable slides animation
    * @default false
    */
  var disableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable mouse swipe/dragging
    */
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Animation easing function
    * @see https://github.com/d3/d3-ease
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Animation easing function when swipe exceeds edge
    * @see https://github.com/d3/d3-ease
    */
  var edgeEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When set to true, disable keyboard controls
    * @default false
    */
  var enableKeyboardControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to set overflow style property on slider frame
    * @default 'hidden'
    */
  var frameOverflow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to set the margin of the slider frame.
    * Accepts any string dimension value such as "0px 20px" or "500px"
    * @example '0px 20px'
    * @example '500px'
    */
  var framePadding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to hardcode the slider height
    * @example '80%'
    * @example '500px'
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Change the height of the slides based either on the first slide,
    * the current slide, or the maximum height of all slides.
    */
  var heightMode: js.UndefOr[CarouselHeightModeProp] = js.undefined
  /**
    * Initial height of the slides (px)
    */
  var initialSlideHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Initial width of the slides (px)
    */
  var initialSlideWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * optional callback function
    */
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Window onResize callback
    */
  var onResize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Pause autoPlay when mouse is over carousel
    * @default true
    */
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Function for rendering bottom center control
    */
  var renderBottomCenterControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering bottom left control
    */
  var renderBottomLeftControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering bottom right control
    */
  var renderBottomRightControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering center center control
    */
  var renderCenterCenterControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering center left control
    */
  var renderCenterLeftControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering center right control
    */
  var renderCenterRightControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering top center control
    */
  var renderTopCenterControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering top left control
    */
  var renderTopLeftControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Function for rendering top right control
    */
  var renderTopRightControls: js.UndefOr[CarouselRenderControl | scala.Null] = js.undefined
  /**
    * Manually set the index of the slide to be shown
    */
  var slideIndex: js.UndefOr[scala.Double] = js.undefined
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
  var slidesToShow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Animation duration
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * style object
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Enable touch swipe/dragging
    */
  var swiping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the way slides transition from one to the next
    */
  var transitionMode: js.UndefOr[CarouselTransitionModeProp] = js.undefined
  /**
    * Enable the slides to transition vertically
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to hardcode the slider width
    * @example '80%'
    * @example '500px'
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to remove all controls at once. Overwrites the render[Top, Right, Bottom, Left]CenterControls()
    * @default false
    */
  var withoutControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets infinite wrapAround mode
    * @default false
    */
  var wrapAround: js.UndefOr[scala.Boolean] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    afterSlide: /* prevSlide */ scala.Double => scala.Unit = null,
    autoGenerateStyleTag: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayInterval: scala.Int | scala.Double = null,
    autoplayReverse: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSlide: (/* currentSlide */ scala.Double, /* endSlide */ scala.Double) => scala.Unit = null,
    cellAlign: CarouselCellAlignProp = null,
    cellSpacing: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    disableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    dragging: js.UndefOr[scala.Boolean] = js.undefined,
    easing: java.lang.String = null,
    edgeEasing: java.lang.String = null,
    enableKeyboardControls: js.UndefOr[scala.Boolean] = js.undefined,
    frameOverflow: java.lang.String = null,
    framePadding: java.lang.String = null,
    height: java.lang.String = null,
    heightMode: CarouselHeightModeProp = null,
    initialSlideHeight: scala.Int | scala.Double = null,
    initialSlideWidth: scala.Int | scala.Double = null,
    onDragStart: () => scala.Unit = null,
    onResize: () => scala.Unit = null,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    renderBottomCenterControls: CarouselRenderControl = null,
    renderBottomLeftControls: CarouselRenderControl = null,
    renderBottomRightControls: CarouselRenderControl = null,
    renderCenterCenterControls: CarouselRenderControl = null,
    renderCenterLeftControls: CarouselRenderControl = null,
    renderCenterRightControls: CarouselRenderControl = null,
    renderTopCenterControls: CarouselRenderControl = null,
    renderTopLeftControls: CarouselRenderControl = null,
    renderTopRightControls: CarouselRenderControl = null,
    slideIndex: scala.Int | scala.Double = null,
    slideWidth: CarouselSlideWidthProp = null,
    slidesToScroll: CarouselSlidesToScrollProp = null,
    slidesToShow: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    style: CSSProperties = null,
    swiping: js.UndefOr[scala.Boolean] = js.undefined,
    transitionMode: CarouselTransitionModeProp = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null,
    withoutControls: js.UndefOr[scala.Boolean] = js.undefined,
    wrapAround: js.UndefOr[scala.Boolean] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (!js.isUndefined(autoGenerateStyleTag)) __obj.updateDynamic("autoGenerateStyleTag")(autoGenerateStyleTag)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayReverse)) __obj.updateDynamic("autoplayReverse")(autoplayReverse)
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign)
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation)
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing)
    if (!js.isUndefined(enableKeyboardControls)) __obj.updateDynamic("enableKeyboardControls")(enableKeyboardControls)
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow)
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding)
    if (height != null) __obj.updateDynamic("height")(height)
    if (heightMode != null) __obj.updateDynamic("heightMode")(heightMode)
    if (initialSlideHeight != null) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction0(onResize))
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (renderBottomCenterControls != null) __obj.updateDynamic("renderBottomCenterControls")(renderBottomCenterControls)
    if (renderBottomLeftControls != null) __obj.updateDynamic("renderBottomLeftControls")(renderBottomLeftControls)
    if (renderBottomRightControls != null) __obj.updateDynamic("renderBottomRightControls")(renderBottomRightControls)
    if (renderCenterCenterControls != null) __obj.updateDynamic("renderCenterCenterControls")(renderCenterCenterControls)
    if (renderCenterLeftControls != null) __obj.updateDynamic("renderCenterLeftControls")(renderCenterLeftControls)
    if (renderCenterRightControls != null) __obj.updateDynamic("renderCenterRightControls")(renderCenterRightControls)
    if (renderTopCenterControls != null) __obj.updateDynamic("renderTopCenterControls")(renderTopCenterControls)
    if (renderTopLeftControls != null) __obj.updateDynamic("renderTopLeftControls")(renderTopLeftControls)
    if (renderTopRightControls != null) __obj.updateDynamic("renderTopRightControls")(renderTopRightControls)
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping)
    if (transitionMode != null) __obj.updateDynamic("transitionMode")(transitionMode)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (width != null) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(withoutControls)) __obj.updateDynamic("withoutControls")(withoutControls)
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround)
    __obj.asInstanceOf[CarouselProps]
  }
}

