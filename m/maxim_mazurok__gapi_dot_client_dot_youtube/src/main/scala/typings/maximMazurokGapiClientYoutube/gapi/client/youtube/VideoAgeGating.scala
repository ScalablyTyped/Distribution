package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAgeGating extends js.Object {
  
  /** Indicates whether or not the video has alcoholic beverage content. Only users of legal purchasing age in a particular country, as identified by ICAP, can view the content. */
  var alcoholContent: js.UndefOr[Boolean] = js.native
  
  /**
    * Age-restricted trailers. For redband trailers and adult-rated video-games. Only users aged 18+ can view the content. The the field is true the content is restricted to viewers aged
    * 18+. Otherwise The field won't be present.
    */
  var restricted: js.UndefOr[Boolean] = js.native
  
  /** Video game rating, if any. */
  var videoGameRating: js.UndefOr[String] = js.native
}
object VideoAgeGating {
  
  @scala.inline
  def apply(): VideoAgeGating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAgeGating]
  }
  
  @scala.inline
  implicit class VideoAgeGatingOps[Self <: VideoAgeGating] (val x: Self) extends AnyVal {
    
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
    def setAlcoholContent(value: Boolean): Self = this.set("alcoholContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlcoholContent: Self = this.set("alcoholContent", js.undefined)
    
    @scala.inline
    def setRestricted(value: Boolean): Self = this.set("restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestricted: Self = this.set("restricted", js.undefined)
    
    @scala.inline
    def setVideoGameRating(value: String): Self = this.set("videoGameRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoGameRating: Self = this.set("videoGameRating", js.undefined)
  }
}
