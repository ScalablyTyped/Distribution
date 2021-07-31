package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoRating extends StObject {
  
  /** Rating of a video. */
  var rating: js.UndefOr[String] = js.undefined
  
  /** The ID that YouTube uses to uniquely identify the video. */
  var videoId: js.UndefOr[String] = js.undefined
}
object VideoRating {
  
  @scala.inline
  def apply(): VideoRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRating]
  }
  
  @scala.inline
  implicit class VideoRatingMutableBuilder[Self <: VideoRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
