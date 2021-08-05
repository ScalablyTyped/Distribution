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
  
  inline def apply(): GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p1beta1ExplicitContentAnnotation](x: Self) {
    
    inline def setFrames(value: js.Array[GoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: GoogleCloudVideointelligenceV1p1beta1ExplicitContentFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
