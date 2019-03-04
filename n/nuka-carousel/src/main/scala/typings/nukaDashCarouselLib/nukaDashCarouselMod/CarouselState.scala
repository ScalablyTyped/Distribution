package typings
package nukaDashCarouselLib.nukaDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselState extends js.Object {
  /**
    * Current slide index
    */
  var currentSlide: scala.Double
  /**
    * Is dragging enabled
    */
  var dragging: scala.Boolean
  /**
    * Easing function name
    */
  var easing: java.lang.String
  /**
    * Current frame width
    */
  var frameWidth: scala.Double
  var isWrappingAround: scala.Boolean
  /**
    * Current left value
    */
  var left: scala.Double
  var pauseOnHover: scala.Boolean
  var resetWrapAroundPosition: scala.Boolean
  /**
    * Total amount of slides
    */
  var slideCount: scala.Double
  /**
    * Current slide width
    */
  var slideWidth: CarouselSlideWidthProp
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: scala.Double
  /**
    * Current top value
    */
  var top: scala.Double
  /**
    * Is infinite mode enabled
    */
  var wrapToIndex: scala.Boolean
}

object CarouselState {
  @scala.inline
  def apply(
    currentSlide: scala.Double,
    dragging: scala.Boolean,
    easing: java.lang.String,
    frameWidth: scala.Double,
    isWrappingAround: scala.Boolean,
    left: scala.Double,
    pauseOnHover: scala.Boolean,
    resetWrapAroundPosition: scala.Boolean,
    slideCount: scala.Double,
    slideWidth: CarouselSlideWidthProp,
    slidesToScroll: scala.Double,
    top: scala.Double,
    wrapToIndex: scala.Boolean
  ): CarouselState = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide, dragging = dragging, easing = easing, frameWidth = frameWidth, isWrappingAround = isWrappingAround, left = left, pauseOnHover = pauseOnHover, resetWrapAroundPosition = resetWrapAroundPosition, slideCount = slideCount, slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll, top = top, wrapToIndex = wrapToIndex)
  
    __obj.asInstanceOf[CarouselState]
  }
}

