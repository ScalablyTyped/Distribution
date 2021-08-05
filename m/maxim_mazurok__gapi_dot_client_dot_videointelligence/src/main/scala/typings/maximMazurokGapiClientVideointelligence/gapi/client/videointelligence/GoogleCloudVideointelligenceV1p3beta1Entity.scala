package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1Entity extends StObject {
  
  /** Textual description, e.g., `Fixed-gear bicycle`. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search API](https://developers.google.com/knowledge-graph/). */
  var entityId: js.UndefOr[String] = js.undefined
  
  /** Language code for `description` in BCP-47 format. */
  var languageCode: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1Entity {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1Entity]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1Entity](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
