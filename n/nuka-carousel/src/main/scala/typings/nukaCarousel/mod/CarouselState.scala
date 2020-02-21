package typings.nukaCarousel.mod

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
  var slidesToScroll: CarouselSlidesToScrollProp
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
    slidesToScroll: CarouselSlidesToScrollProp,
    top: Double,
    wrapToIndex: Boolean
  ): CarouselState = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], isWrappingAround = isWrappingAround.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pauseOnHover = pauseOnHover.asInstanceOf[js.Any], resetWrapAroundPosition = resetWrapAroundPosition.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], wrapToIndex = wrapToIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CarouselState]
  }
}

