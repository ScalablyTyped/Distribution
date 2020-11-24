package typings.nukaCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselState extends js.Object {
  
  /**
    * Current slide index
    */
  var currentSlide: Double = js.native
  
  /**
    * Is dragging enabled
    */
  var dragging: Boolean = js.native
  
  /**
    * Easing function name
    */
  var easing: String = js.native
  
  /**
    * Current frame width
    */
  var frameWidth: Double = js.native
  
  var isWrappingAround: Boolean = js.native
  
  /**
    * Current left value
    */
  var left: Double = js.native
  
  var pauseOnHover: Boolean = js.native
  
  var resetWrapAroundPosition: Boolean = js.native
  
  /**
    * Total amount of slides
    */
  var slideCount: Double = js.native
  
  /**
    * Current slide width
    */
  var slideWidth: CarouselSlideWidthProp = js.native
  
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: CarouselSlidesToScrollProp = js.native
  
  /**
    * Current top value
    */
  var top: Double = js.native
  
  /**
    * Is infinite mode enabled
    */
  var wrapToIndex: Boolean = js.native
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
  
  @scala.inline
  implicit class CarouselStateOps[Self <: CarouselState] (val x: Self) extends AnyVal {
    
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
    def setCurrentSlide(value: Double): Self = this.set("currentSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidth(value: Double): Self = this.set("frameWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWrappingAround(value: Boolean): Self = this.set("isWrappingAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetWrapAroundPosition(value: Boolean): Self = this.set("resetWrapAroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideWidth(value: CarouselSlideWidthProp): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapToIndex(value: Boolean): Self = this.set("wrapToIndex", value.asInstanceOf[js.Any])
  }
}
