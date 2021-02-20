package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1Entity extends StObject {
  
  /** Textual description, e.g., `Fixed-gear bicycle`. */
  var description: js.UndefOr[String] = js.native
  
  /** Opaque entity ID. Some IDs may be available in [Google Knowledge Graph Search API](https://developers.google.com/knowledge-graph/). */
  var entityId: js.UndefOr[String] = js.native
  
  /** Language code for `description` in BCP-47 format. */
  var languageCode: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1Entity {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1Entity]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1EntityMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1Entity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
