package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequestInput extends StObject {
  
  /** Payload containing third-party device IDs. */
  var payload: js.UndefOr[QueryRequestPayload] = js.undefined
}
object QueryRequestInput {
  
  inline def apply(): QueryRequestInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequestInput]
  }
  
  extension [Self <: QueryRequestInput](x: Self) {
    
    inline def setPayload(value: QueryRequestPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
