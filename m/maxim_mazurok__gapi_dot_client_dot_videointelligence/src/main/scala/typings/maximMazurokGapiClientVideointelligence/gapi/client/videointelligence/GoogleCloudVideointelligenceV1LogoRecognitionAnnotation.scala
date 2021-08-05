package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1LogoRecognitionAnnotation extends StObject {
  
  /** Entity category information to specify the logo class that all the logo tracks within this LogoRecognitionAnnotation are recognized as. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1Entity] = js.undefined
  
  /** All video segments where the recognized logo appears. There might be multiple instances of the same logo class appearing in one VideoSegment. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoSegment]] = js.undefined
  
  /** All logo tracks where the recognized logo appears. Each track corresponds to one logo instance appearing in consecutive frames. */
  var tracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1Track]] = js.undefined
}
object GoogleCloudVideointelligenceV1LogoRecognitionAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1LogoRecognitionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1LogoRecognitionAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1LogoRecognitionAnnotation](x: Self) {
    
    inline def setEntity(value: GoogleCloudVideointelligenceV1Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setSegments(value: js.Array[GoogleCloudVideointelligenceV1VideoSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1VideoSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    inline def setTracks(value: js.Array[GoogleCloudVideointelligenceV1Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: GoogleCloudVideointelligenceV1Track*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
