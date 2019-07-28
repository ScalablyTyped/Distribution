package typings.nukaDashCarousel.nukaDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingDotsProps extends js.Object {
  /**
    * The cell alignment
    */
  var cellAlign: CarouselCellAlignProp
  /**
    * The current slide
    */
  var currentSlide: Double
  /**
    * The total number of slides
    */
  var slideCount: Double
  /**
    * Thte number of slides to scroll
    */
  var slidesToScroll: Double
  /**
    * The number of slides to show
    */
  var slidesToShow: Double
  /**
    * Go to a new slide
    * @param index The slide index to go to
    */
  def goToSlide(index: Double): Unit
}

object PagingDotsProps {
  @scala.inline
  def apply(
    cellAlign: CarouselCellAlignProp,
    currentSlide: Double,
    goToSlide: Double => Unit,
    slideCount: Double,
    slidesToScroll: Double,
    slidesToShow: Double
  ): PagingDotsProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign, currentSlide = currentSlide, goToSlide = js.Any.fromFunction1(goToSlide), slideCount = slideCount, slidesToScroll = slidesToScroll, slidesToShow = slidesToShow)
  
    __obj.asInstanceOf[PagingDotsProps]
  }
}

