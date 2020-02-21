package typings.nukaCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselSlideRenderControlProps extends js.Object {
  /**
    * When displaying more than one slide, sets which position to anchor the current slide to.
    */
  var cellAlign: CarouselCellAlignProp
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: Double
  /**
    * Current slide index
    */
  var currentSlide: Double
  /**
    * Current frame width (px)
    */
  var frameWidth: Double
  /**
    * Total amount of slides
    */
  var slideCount: Double
  /**
    * Current slide width (px)
    */
  var slideWidth: Double
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: CarouselSlidesToScrollProp
  /**
    * Slides to show at once
    */
  var slidesToShow: Double
  /**
    * Infinite mode enabled
    */
  var wrapAround: Boolean
  /**
    * Go to X slide method
    * @param index Slide's index to go
    */
  def goToSlide(index: Double): Unit
  /**
    * Go to the next slide method
    */
  def nextSlide(): Unit
  /**
    * Go to the previous slide method
    */
  def previousSlide(): Unit
}

object CarouselSlideRenderControlProps {
  @scala.inline
  def apply(
    cellAlign: CarouselCellAlignProp,
    cellSpacing: Double,
    currentSlide: Double,
    frameWidth: Double,
    goToSlide: Double => Unit,
    nextSlide: () => Unit,
    previousSlide: () => Unit,
    slideCount: Double,
    slideWidth: Double,
    slidesToScroll: CarouselSlidesToScrollProp,
    slidesToShow: Double,
    wrapAround: Boolean
  ): CarouselSlideRenderControlProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1(goToSlide), nextSlide = js.Any.fromFunction0(nextSlide), previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CarouselSlideRenderControlProps]
  }
}

