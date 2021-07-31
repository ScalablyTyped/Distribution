package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation extends StObject {
  
  /** All video frames where explicit content was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame]] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotationMutableBuilder[Self <: GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
