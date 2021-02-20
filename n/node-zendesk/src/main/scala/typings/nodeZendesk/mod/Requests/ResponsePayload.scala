package typings.nodeZendesk.mod.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsePayload extends StObject {
  
  val request: ResponseModel = js.native
}
object ResponsePayload {
  
  @scala.inline
  def apply(request: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  
  @scala.inline
  implicit class ResponsePayloadMutableBuilder[Self <: ResponsePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: ResponseModel): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
