package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHeaderResponse extends StObject {
  
  /** The ID of the created header. */
  var headerId: js.UndefOr[String] = js.undefined
}
object CreateHeaderResponse {
  
  inline def apply(): CreateHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHeaderResponse]
  }
  
  extension [Self <: CreateHeaderResponse](x: Self) {
    
    inline def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    inline def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}
