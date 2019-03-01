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
    goToSlide: js.Function1[scala.Double, scala.Unit],
    nextSlide: js.Function0[scala.Unit],
    previousSlide: js.Function0[scala.Unit],
    slideCount: scala.Double,
    slideWidth: scala.Double,
    slidesToScroll: scala.Double,
    slidesToShow: scala.Double,
    wrapAround: scala.Boolean
  ): CarouselSlideRenderControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellAlign")(cellAlign)
    __obj.updateDynamic("cellSpacing")(cellSpacing)
    __obj.updateDynamic("currentSlide")(currentSlide)
    __obj.updateDynamic("frameWidth")(frameWidth)
    __obj.updateDynamic("goToSlide")(goToSlide)
    __obj.updateDynamic("nextSlide")(nextSlide)
    __obj.updateDynamic("previousSlide")(previousSlide)
    __obj.updateDynamic("slideCount")(slideCount)
    __obj.updateDynamic("slideWidth")(slideWidth)
    __obj.updateDynamic("slidesToScroll")(slidesToScroll)
    __obj.updateDynamic("slidesToShow")(slidesToShow)
    __obj.updateDynamic("wrapAround")(wrapAround)
    __obj.asInstanceOf[CarouselSlideRenderControlProps]
  }
}

