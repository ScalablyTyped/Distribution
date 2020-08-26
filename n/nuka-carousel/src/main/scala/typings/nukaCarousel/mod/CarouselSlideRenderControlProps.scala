package typings.nukaCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselSlideRenderControlProps extends js.Object {
  /**
    * When displaying more than one slide, sets which position to anchor the current slide to.
    */
  var cellAlign: CarouselCellAlignProp = js.native
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: Double = js.native
  /**
    * Current slide index
    */
  var currentSlide: Double = js.native
  /**
    * Current frame width (px)
    */
  var frameWidth: Double = js.native
  /**
    * Total amount of slides
    */
  var slideCount: Double = js.native
  /**
    * Current slide width (px)
    */
  var slideWidth: Double = js.native
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: CarouselSlidesToScrollProp = js.native
  /**
    * Slides to show at once
    */
  var slidesToShow: Double = js.native
  /**
    * Infinite mode enabled
    */
  var wrapAround: Boolean = js.native
  /**
    * Go to X slide method
    * @param index Slide's index to go
    */
  def goToSlide(index: Double): Unit = js.native
  /**
    * Go to the next slide method
    */
  def nextSlide(): Unit = js.native
  /**
    * Go to the previous slide method
    */
  def previousSlide(): Unit = js.native
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
  @scala.inline
  implicit class CarouselSlideRenderControlPropsOps[Self <: CarouselSlideRenderControlProps] (val x: Self) extends AnyVal {
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
    def setCellAlign(value: CarouselCellAlignProp): Self = this.set("cellAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellSpacing(value: Double): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentSlide(value: Double): Self = this.set("currentSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameWidth(value: Double): Self = this.set("frameWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoToSlide(value: Double => Unit): Self = this.set("goToSlide", js.Any.fromFunction1(value))
    @scala.inline
    def setNextSlide(value: () => Unit): Self = this.set("nextSlide", js.Any.fromFunction0(value))
    @scala.inline
    def setPreviousSlide(value: () => Unit): Self = this.set("previousSlide", js.Any.fromFunction0(value))
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideWidth(value: Double): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlidesToScroll(value: CarouselSlidesToScrollProp): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlidesToShow(value: Double): Self = this.set("slidesToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
  }
  
}

