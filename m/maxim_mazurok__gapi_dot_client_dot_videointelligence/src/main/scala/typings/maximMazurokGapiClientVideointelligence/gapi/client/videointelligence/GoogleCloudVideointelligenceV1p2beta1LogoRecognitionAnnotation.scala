package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1LogoRecognitionAnnotation extends StObject {
  
  /** Entity category information to specify the logo class that all the logo tracks within this LogoRecognitionAnnotation are recognized as. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1Entity] = js.native
  
  /** All video segments where the recognized logo appears. There might be multiple instances of the same logo class appearing in one VideoSegment. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1VideoSegment]] = js.native
  
  /** All logo tracks where the recognized logo appears. Each track corresponds to one logo instance appearing in consecutive frames. */
  var tracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1Track]] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1LogoRecognitionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1LogoRecognitionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1LogoRecognitionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1LogoRecognitionAnnotationMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1LogoRecognitionAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: GoogleCloudVideointelligenceV1p2beta1Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1p2beta1VideoSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1p2beta1VideoSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[GoogleCloudVideointelligenceV1p2beta1Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: GoogleCloudVideointelligenceV1p2beta1Track*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
