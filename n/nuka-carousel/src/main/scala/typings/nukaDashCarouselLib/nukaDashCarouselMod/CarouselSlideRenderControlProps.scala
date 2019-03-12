package typings
package nukaDashCarouselLib.nukaDashCarouselMod

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
  var cellSpacing: scala.Double
  /**
    * Current slide index
    */
  var currentSlide: scala.Double
  /**
    * Current frame width (px)
    */
  var frameWidth: scala.Double
  /**
    * Total amount of slides
    */
  var slideCount: scala.Double
  /**
    * Current slide width (px)
    */
  var slideWidth: scala.Double
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: scala.Double
  /**
    * Slides to show at once
    */
  var slidesToShow: scala.Double
  /**
    * Infinite mode enabled
    */
  var wrapAround: scala.Boolean
  /**
    * Go to X slide method
    * @param index Slide's index to go
    */
  def goToSlide(index: scala.Double): scala.Unit
  /**
    * Go to the next slide method
    */
  def nextSlide(): scala.Unit
  /**
    * Go to the previous slide method
    */
  def previousSlide(): scala.Unit
}

object CarouselSlideRenderControlProps {
  @scala.inline
  def apply(
    cellAlign: CarouselCellAlignProp,
    cellSpacing: scala.Double,
    currentSlide: scala.Double,
    frameWidth: scala.Double,
    goToSlide: scala.Double => scala.Unit,
    nextSlide: () => scala.Unit,
    previousSlide: () => scala.Unit,
    slideCount: scala.Double,
    slideWidth: scala.Double,
    slidesToScroll: scala.Double,
    slidesToShow: scala.Double,
    wrapAround: scala.Boolean
  ): CarouselSlideRenderControlProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign, cellSpacing = cellSpacing, currentSlide = currentSlide, frameWidth = frameWidth, goToSlide = js.Any.fromFunction1(goToSlide), nextSlide = js.Any.fromFunction0(nextSlide), previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount, slideWidth = slideWidth, slidesToScroll = slidesToScroll, slidesToShow = slidesToShow, wrapAround = wrapAround)
  
    __obj.asInstanceOf[CarouselSlideRenderControlProps]
  }
}

