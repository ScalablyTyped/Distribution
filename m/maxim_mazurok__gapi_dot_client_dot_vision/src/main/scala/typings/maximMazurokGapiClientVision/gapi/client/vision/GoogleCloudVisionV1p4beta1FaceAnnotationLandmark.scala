package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1FaceAnnotationLandmark extends StObject {
  
  /** Face landmark position. */
  var position: js.UndefOr[GoogleCloudVisionV1p4beta1Position] = js.undefined
  
  /** Face landmark type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p4beta1FaceAnnotationLandmark {
  
  inline def apply(): GoogleCloudVisionV1p4beta1FaceAnnotationLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1FaceAnnotationLandmark]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1FaceAnnotationLandmark](x: Self) {
    
    inline def setPosition(value: GoogleCloudVisionV1p4beta1Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
