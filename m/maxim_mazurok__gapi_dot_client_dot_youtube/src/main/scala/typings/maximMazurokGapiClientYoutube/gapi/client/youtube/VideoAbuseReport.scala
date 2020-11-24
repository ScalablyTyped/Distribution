package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAbuseReport extends js.Object {
  
  /** Additional comments regarding the abuse report. */
  var comments: js.UndefOr[String] = js.native
  
  /** The language that the content was viewed in. */
  var language: js.UndefOr[String] = js.native
  
  /** The high-level, or primary, reason that the content is abusive. The value is an abuse report reason ID. */
  var reasonId: js.UndefOr[String] = js.native
  
  /** The specific, or secondary, reason that this content is abusive (if available). The value is an abuse report reason ID that is a valid secondary reason for the primary reason. */
  var secondaryReasonId: js.UndefOr[String] = js.native
  
  /** The ID that YouTube uses to uniquely identify the video. */
  var videoId: js.UndefOr[String] = js.native
}
object VideoAbuseReport {
  
  @scala.inline
  def apply(): VideoAbuseReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoAbuseReport]
  }
  
  @scala.inline
  implicit class VideoAbuseReportOps[Self <: VideoAbuseReport] (val x: Self) extends AnyVal {
    
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
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setReasonId(value: String): Self = this.set("reasonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonId: Self = this.set("reasonId", js.undefined)
    
    @scala.inline
    def setSecondaryReasonId(value: String): Self = this.set("secondaryReasonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryReasonId: Self = this.set("secondaryReasonId", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
}
