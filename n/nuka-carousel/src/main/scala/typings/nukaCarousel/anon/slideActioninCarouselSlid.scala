package typings.nukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ slideAction in nuka-carousel.nuka-carousel.CarouselSlideActions ]:? std.Array<number>} */
trait slideActioninCarouselSlid extends js.Object {
  var firstSlide: js.UndefOr[js.Array[Double]] = js.undefined
  var lastSlide: js.UndefOr[js.Array[Double]] = js.undefined
  var nextSlide: js.UndefOr[js.Array[Double]] = js.undefined
  var pause: js.UndefOr[js.Array[Double]] = js.undefined
  var previousSlide: js.UndefOr[js.Array[Double]] = js.undefined
}

object slideActioninCarouselSlid {
  @scala.inline
  def apply(
    firstSlide: js.Array[Double] = null,
    lastSlide: js.Array[Double] = null,
    nextSlide: js.Array[Double] = null,
    pause: js.Array[Double] = null,
    previousSlide: js.Array[Double] = null
  ): slideActioninCarouselSlid = {
    val __obj = js.Dynamic.literal()
    if (firstSlide != null) __obj.updateDynamic("firstSlide")(firstSlide.asInstanceOf[js.Any])
    if (lastSlide != null) __obj.updateDynamic("lastSlide")(lastSlide.asInstanceOf[js.Any])
    if (nextSlide != null) __obj.updateDynamic("nextSlide")(nextSlide.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (previousSlide != null) __obj.updateDynamic("previousSlide")(previousSlide.asInstanceOf[js.Any])
    __obj.asInstanceOf[slideActioninCarouselSlid]
  }
}

