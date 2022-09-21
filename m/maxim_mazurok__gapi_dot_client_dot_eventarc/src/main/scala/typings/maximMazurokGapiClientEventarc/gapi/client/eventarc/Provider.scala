package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  /** Output only. Human friendly name for the Provider. For example "Cloud Storage". */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Event types for this provider. */
  var eventTypes: js.UndefOr[js.Array[EventType]] = js.undefined
  
  /** Output only. In `projects/{project}/locations/{location}/providers/{provider_id}` format. */
  var name: js.UndefOr[String] = js.undefined
}
object Provider {
  
  inline def apply(): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEventTypes(value: js.Array[EventType]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    inline def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    inline def setEventTypesVarargs(value: EventType*): Self = StObject.set(x, "eventTypes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
