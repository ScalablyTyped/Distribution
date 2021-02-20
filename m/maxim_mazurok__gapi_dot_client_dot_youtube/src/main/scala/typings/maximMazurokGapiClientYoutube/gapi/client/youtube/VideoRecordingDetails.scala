package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoRecordingDetails extends StObject {
  
  /** The geolocation information associated with the video. */
  var location: js.UndefOr[GeoPoint] = js.native
  
  /** The text description of the location where the video was recorded. */
  var locationDescription: js.UndefOr[String] = js.native
  
  /** The date and time when the video was recorded. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format. */
  var recordingDate: js.UndefOr[String] = js.native
}
object VideoRecordingDetails {
  
  @scala.inline
  def apply(): VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRecordingDetails]
  }
  
  @scala.inline
  implicit class VideoRecordingDetailsMutableBuilder[Self <: VideoRecordingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: GeoPoint): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationDescription(value: String): Self = StObject.set(x, "locationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationDescriptionUndefined: Self = StObject.set(x, "locationDescription", js.undefined)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRecordingDate(value: String): Self = StObject.set(x, "recordingDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingDateUndefined: Self = StObject.set(x, "recordingDate", js.undefined)
  }
}
