package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventType extends StObject {
  
  /** Output only. Human friendly description of what the event type is about. For example "Bucket created in Cloud Storage". */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. URI for the event schema. For example "https://github.com/googleapis/google-cloudevents/blob/master/proto/google/events/cloud/storage/v1/events.proto" */
  var eventSchemaUri: js.UndefOr[String] = js.undefined
  
  /** Output only. Filtering attributes for the event type. */
  var filteringAttributes: js.UndefOr[js.Array[FilteringAttribute]] = js.undefined
  
  /**
    * Output only. The full name of the event type (for example, "google.cloud.storage.object.v1.finalized"). In the form of {provider-specific-prefix}.{resource}.{version}.{verb}. Types
    * MUST be versioned and event schemas are guaranteed to remain backward compatible within one version. Note that event type versions and API versions do not need to match.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object EventType {
  
  inline def apply(): EventType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventType]
  }
  
  extension [Self <: EventType](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventSchemaUri(value: String): Self = StObject.set(x, "eventSchemaUri", value.asInstanceOf[js.Any])
    
    inline def setEventSchemaUriUndefined: Self = StObject.set(x, "eventSchemaUri", js.undefined)
    
    inline def setFilteringAttributes(value: js.Array[FilteringAttribute]): Self = StObject.set(x, "filteringAttributes", value.asInstanceOf[js.Any])
    
    inline def setFilteringAttributesUndefined: Self = StObject.set(x, "filteringAttributes", js.undefined)
    
    inline def setFilteringAttributesVarargs(value: FilteringAttribute*): Self = StObject.set(x, "filteringAttributes", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
