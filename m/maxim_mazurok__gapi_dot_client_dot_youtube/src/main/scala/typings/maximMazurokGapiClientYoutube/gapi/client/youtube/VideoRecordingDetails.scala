package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoRecordingDetails extends StObject {
  
  /** The geolocation information associated with the video. */
  var location: js.UndefOr[GeoPoint] = js.undefined
  
  /** The text description of the location where the video was recorded. */
  var locationDescription: js.UndefOr[String] = js.undefined
  
  /** The date and time when the video was recorded. */
  var recordingDate: js.UndefOr[String] = js.undefined
}
object VideoRecordingDetails {
  
  inline def apply(): VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRecordingDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoRecordingDetails] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: GeoPoint): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationDescription(value: String): Self = StObject.set(x, "locationDescription", value.asInstanceOf[js.Any])
    
    inline def setLocationDescriptionUndefined: Self = StObject.set(x, "locationDescription", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRecordingDate(value: String): Self = StObject.set(x, "recordingDate", value.asInstanceOf[js.Any])
    
    inline def setRecordingDateUndefined: Self = StObject.set(x, "recordingDate", js.undefined)
  }
}
