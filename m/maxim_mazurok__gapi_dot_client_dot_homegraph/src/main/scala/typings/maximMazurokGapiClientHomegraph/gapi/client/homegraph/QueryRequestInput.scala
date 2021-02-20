package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequestInput extends StObject {
  
  /** Payload containing third-party device IDs. */
  var payload: js.UndefOr[QueryRequestPayload] = js.native
}
object QueryRequestInput {
  
  @scala.inline
  def apply(): QueryRequestInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequestInput]
  }
  
  @scala.inline
  implicit class QueryRequestInputMutableBuilder[Self <: QueryRequestInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: QueryRequestPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
