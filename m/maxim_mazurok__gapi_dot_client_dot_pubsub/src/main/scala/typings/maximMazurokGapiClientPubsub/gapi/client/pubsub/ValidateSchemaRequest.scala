package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSchemaRequest extends StObject {
  
  /** Required. The schema object to validate. */
  var schema: js.UndefOr[Schema] = js.undefined
}
object ValidateSchemaRequest {
  
  inline def apply(): ValidateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateSchemaRequest]
  }
  
  extension [Self <: ValidateSchemaRequest](x: Self) {
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
