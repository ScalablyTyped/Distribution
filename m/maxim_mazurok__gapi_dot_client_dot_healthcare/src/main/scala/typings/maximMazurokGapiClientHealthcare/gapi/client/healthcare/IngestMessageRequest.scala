package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestMessageRequest extends StObject {
  
  /** HL7v2 message to ingest. */
  var message: js.UndefOr[Message] = js.undefined
}
object IngestMessageRequest {
  
  inline def apply(): IngestMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestMessageRequest]
  }
  
  extension [Self <: IngestMessageRequest](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
