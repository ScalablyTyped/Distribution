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
     * When set to true, disable keyboard controls
     * @default false
     */
  var disableKeyboardControls: js.UndefOr[scala.Boolean] = js.undefined
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
  var renderBottomCenterControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering bottom left control
     */
  var renderBottomLeftControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering bottom right control
     */
  var renderBottomRightControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering center center control
     */
  var renderCenterCenterControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering center left control
     */
  var renderCenterLeftControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering center right control
     */
  var renderCenterRightControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering top center control
     */
  var renderTopCenterControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering top left control
     */
  var renderTopLeftControls: js.UndefOr[CarouselRenderControl] = js.undefined
  /**
     * Function for rendering top right control
     */
  var renderTopRightControls: js.UndefOr[CarouselRenderControl] = js.undefined
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
     * Enable touch swipe/dragging
     */
  var swiping: js.UndefOr[scala.Boolean] = js.undefined
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

