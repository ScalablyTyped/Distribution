package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchemasResponse extends StObject {
  
  /** If not empty, indicates that there may be more schemas that match the request; this value should be passed in a new `ListSchemasRequest`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The resulting schemas. */
  var schemas: js.UndefOr[js.Array[Schema]] = js.undefined
}
object ListSchemasResponse {
  
  inline def apply(): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasResponse]
  }
  
  extension [Self <: ListSchemasResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSchemas(value: js.Array[Schema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: Schema*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
