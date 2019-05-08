package typings
package nukaDashCarouselLib.nukaDashCarouselMod

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
  var currentSlide: scala.Double
  /**
    * The total number of slides
    */
  var slideCount: scala.Double
  /**
    * Thte number of slides to scroll
    */
  var slidesToScroll: scala.Double
  /**
    * The number of slides to show
    */
  var slidesToShow: scala.Double
  /**
    * Go to a new slide
    * @param index The slide index to go to
    */
  def goToSlide(index: scala.Double): scala.Unit
}

object PagingDotsProps {
  @scala.inline
  def apply(
    cellAlign: CarouselCellAlignProp,
    currentSlide: scala.Double,
    goToSlide: scala.Double => scala.Unit,
    slideCount: scala.Double,
    slidesToScroll: scala.Double,
    slidesToShow: scala.Double
  ): PagingDotsProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign, currentSlide = currentSlide, goToSlide = js.Any.fromFunction1(goToSlide), slideCount = slideCount, slidesToScroll = slidesToScroll, slidesToShow = slidesToShow)
  
    __obj.asInstanceOf[PagingDotsProps]
  }
}

