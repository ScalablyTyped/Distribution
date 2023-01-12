package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation extends StObject {
  
  /** The tracks detected from the input video, including recognized celebrities and other detected faces in the video. */
  var celebrityTracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1CelebrityTrack]] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1CelebrityRecognitionAnnotation] (val x: Self) extends AnyVal {
    
    inline def setCelebrityTracks(value: js.Array[GoogleCloudVideointelligenceV1p3beta1CelebrityTrack]): Self = StObject.set(x, "celebrityTracks", value.asInstanceOf[js.Any])
    
    inline def setCelebrityTracksUndefined: Self = StObject.set(x, "celebrityTracks", js.undefined)
    
    inline def setCelebrityTracksVarargs(value: GoogleCloudVideointelligenceV1p3beta1CelebrityTrack*): Self = StObject.set(x, "celebrityTracks", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
