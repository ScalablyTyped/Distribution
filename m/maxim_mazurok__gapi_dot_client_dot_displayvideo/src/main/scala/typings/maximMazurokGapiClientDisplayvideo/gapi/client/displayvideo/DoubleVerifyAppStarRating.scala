package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleVerifyAppStarRating extends js.Object {
  
  /** Avoid bidding on apps with insufficient star ratings. */
  var avoidInsufficientStarRating: js.UndefOr[Boolean] = js.native
  
  /** Avoid bidding on apps with the star ratings. */
  var avoidedStarRating: js.UndefOr[String] = js.native
}
object DoubleVerifyAppStarRating {
  
  @scala.inline
  def apply(): DoubleVerifyAppStarRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleVerifyAppStarRating]
  }
  
  @scala.inline
  implicit class DoubleVerifyAppStarRatingOps[Self <: DoubleVerifyAppStarRating] (val x: Self) extends AnyVal {
    
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
    def setAvoidInsufficientStarRating(value: Boolean): Self = this.set("avoidInsufficientStarRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidInsufficientStarRating: Self = this.set("avoidInsufficientStarRating", js.undefined)
    
    @scala.inline
    def setAvoidedStarRating(value: String): Self = this.set("avoidedStarRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidedStarRating: Self = this.set("avoidedStarRating", js.undefined)
  }
}
