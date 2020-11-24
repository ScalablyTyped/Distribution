package typings.nukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ slideAction in nuka-carousel.nuka-carousel.CarouselSlideActions ]:? std.Array<number>} */
@js.native
trait slideActioninCarouselSlid extends js.Object {
  
  var firstSlide: js.UndefOr[js.Array[Double]] = js.native
  
  var lastSlide: js.UndefOr[js.Array[Double]] = js.native
  
  var nextSlide: js.UndefOr[js.Array[Double]] = js.native
  
  var pause: js.UndefOr[js.Array[Double]] = js.native
  
  var previousSlide: js.UndefOr[js.Array[Double]] = js.native
}
object slideActioninCarouselSlid {
  
  @scala.inline
  def apply(): slideActioninCarouselSlid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[slideActioninCarouselSlid]
  }
  
  @scala.inline
  implicit class slideActioninCarouselSlidOps[Self <: slideActioninCarouselSlid] (val x: Self) extends AnyVal {
    
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
    def setFirstSlideVarargs(value: Double*): Self = this.set("firstSlide", js.Array(value :_*))
    
    @scala.inline
    def setFirstSlide(value: js.Array[Double]): Self = this.set("firstSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSlide: Self = this.set("firstSlide", js.undefined)
    
    @scala.inline
    def setLastSlideVarargs(value: Double*): Self = this.set("lastSlide", js.Array(value :_*))
    
    @scala.inline
    def setLastSlide(value: js.Array[Double]): Self = this.set("lastSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSlide: Self = this.set("lastSlide", js.undefined)
    
    @scala.inline
    def setNextSlideVarargs(value: Double*): Self = this.set("nextSlide", js.Array(value :_*))
    
    @scala.inline
    def setNextSlide(value: js.Array[Double]): Self = this.set("nextSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSlide: Self = this.set("nextSlide", js.undefined)
    
    @scala.inline
    def setPauseVarargs(value: Double*): Self = this.set("pause", js.Array(value :_*))
    
    @scala.inline
    def setPause(value: js.Array[Double]): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPreviousSlideVarargs(value: Double*): Self = this.set("previousSlide", js.Array(value :_*))
    
    @scala.inline
    def setPreviousSlide(value: js.Array[Double]): Self = this.set("previousSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousSlide: Self = this.set("previousSlide", js.undefined)
  }
}
