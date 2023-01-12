package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateMessageRequest extends StObject {
  
  /** The encoding expected for messages */
  var encoding: js.UndefOr[String] = js.undefined
  
  /** Message to validate against the provided `schema_spec`. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Name of the schema against which to validate. Format is `projects/{project}/schemas/{schema}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Ad-hoc schema against which to validate */
  var schema: js.UndefOr[Schema] = js.undefined
}
object ValidateMessageRequest {
  
  inline def apply(): ValidateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
