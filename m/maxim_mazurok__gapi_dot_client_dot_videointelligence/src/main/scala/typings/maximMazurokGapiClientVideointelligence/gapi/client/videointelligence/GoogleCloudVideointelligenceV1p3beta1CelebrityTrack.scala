package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1CelebrityTrack extends StObject {
  
  /** Top N match of the celebrities for the face in this track. */
  var celebrities: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]] = js.undefined
  
  /** A track of a person's face. */
  var faceTrack: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1Track] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1CelebrityTrack {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1CelebrityTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1CelebrityTrack]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1CelebrityTrack](x: Self) {
    
    inline def setCelebrities(value: js.Array[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]): Self = StObject.set(x, "celebrities", value.asInstanceOf[js.Any])
    
    inline def setCelebritiesUndefined: Self = StObject.set(x, "celebrities", js.undefined)
    
    inline def setCelebritiesVarargs(value: GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity*): Self = StObject.set(x, "celebrities", js.Array(value*))
    
    inline def setFaceTrack(value: GoogleCloudVideointelligenceV1p3beta1Track): Self = StObject.set(x, "faceTrack", value.asInstanceOf[js.Any])
    
    inline def setFaceTrackUndefined: Self = StObject.set(x, "faceTrack", js.undefined)
  }
}
