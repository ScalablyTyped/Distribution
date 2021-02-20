package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1PersonDetectionAnnotation extends StObject {
  
  /** The detected tracks of a person. */
  var tracks: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1Track]] = js.native
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1PersonDetectionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1PersonDetectionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1PersonDetectionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1PersonDetectionAnnotationMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1PersonDetectionAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: js.Array[GoogleCloudVideointelligenceV1p2beta1Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: GoogleCloudVideointelligenceV1p2beta1Track*): Self = StObject.set(x, "tracks", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
