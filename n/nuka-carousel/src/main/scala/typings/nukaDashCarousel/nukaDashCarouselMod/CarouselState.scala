package typings.nukaDashCarousel.nukaDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselState extends js.Object {
  /**
    * Current slide index
    */
  var currentSlide: Double
  /**
    * Is dragging enabled
    */
  var dragging: Boolean
  /**
    * Easing function name
    */
  var easing: String
  /**
    * Current frame width
    */
  var frameWidth: Double
  var isWrappingAround: Boolean
  /**
    * Current left value
    */
  var left: Double
  var pauseOnHover: Boolean
  var resetWrapAroundPosition: Boolean
  /**
    * Total amount of slides
    */
  var slideCount: Double
  /**
    * Current slide width
    */
  var slideWidth: CarouselSlideWidthProp
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: Double
  /**
    * Current top value
    */
  var top: Double
  /**
    * Is infinite mode enabled
    */
  var wrapToIndex: Boolean
}

object CarouselState {
  @scala.inline
  def apply(
    currentSlide: Double,
    dragging: Boolean,
    easing: String,
    frameWidth: Double,
    isWrappingAround: Boolean,
    left: Double,
    pauseOnHover: Boolean,
    resetWrapAroundPosition: Boolean,
    slideCount: Double,
    slideWidth: CarouselSlideWidthProp,
    slidesToScroll: Double,
    top: Double,
    wrapToIndex: Boolean
  ): CarouselState = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide, dragging = dragging, easing = easing, frameWidth = frameWidth, isWrappingAround = isWrappingAround, left = left, pauseOnHover = pauseOnHover, resetWrapAroundPosition = resetWrapAroundPosition, slideCount = slideCount, slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll, top = top, wrapToIndex = wrapToIndex)
  
    __obj.asInstanceOf[CarouselState]
  }
}

