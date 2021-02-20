package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1CelebrityTrack extends StObject {
  
  /** Top N match of the celebrities for the face in this track. */
  var celebrities: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]] = js.native
  
  /** A track of a person's face. */
  var faceTrack: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1Track] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1CelebrityTrack {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1CelebrityTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1CelebrityTrack]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1CelebrityTrackMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1CelebrityTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCelebrities(value: js.Array[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]): Self = StObject.set(x, "celebrities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCelebritiesUndefined: Self = StObject.set(x, "celebrities", js.undefined)
    
    @scala.inline
    def setCelebritiesVarargs(value: GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity*): Self = StObject.set(x, "celebrities", js.Array(value :_*))
    
    @scala.inline
    def setFaceTrack(value: GoogleCloudVideointelligenceV1p3beta1Track): Self = StObject.set(x, "faceTrack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceTrackUndefined: Self = StObject.set(x, "faceTrack", js.undefined)
  }
}
