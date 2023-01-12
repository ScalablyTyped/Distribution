package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1WebDetectionWebEntity extends StObject {
  
  /** Canonical description of the entity, in English. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Opaque entity ID. */
  var entityId: js.UndefOr[String] = js.undefined
  
  /** Overall relevancy score for the entity. Not normalized and not comparable across different image queries. */
  var score: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVisionV1p3beta1WebDetectionWebEntity {
  
  inline def apply(): GoogleCloudVisionV1p3beta1WebDetectionWebEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1WebDetectionWebEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVisionV1p3beta1WebDetectionWebEntity] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
