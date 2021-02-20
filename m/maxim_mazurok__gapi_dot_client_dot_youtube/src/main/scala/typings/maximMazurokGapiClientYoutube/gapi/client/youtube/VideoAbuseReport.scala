package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAbuseReport extends StObject {
  
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
  implicit class VideoAbuseReportMutableBuilder[Self <: VideoAbuseReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setReasonId(value: String): Self = StObject.set(x, "reasonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonIdUndefined: Self = StObject.set(x, "reasonId", js.undefined)
    
    @scala.inline
    def setSecondaryReasonId(value: String): Self = StObject.set(x, "secondaryReasonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryReasonIdUndefined: Self = StObject.set(x, "secondaryReasonId", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
