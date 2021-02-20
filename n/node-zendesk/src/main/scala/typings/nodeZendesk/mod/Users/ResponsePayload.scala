package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsePayload extends StObject {
  
  var user: ResponseModel = js.native
}
object ResponsePayload {
  
  @scala.inline
  def apply(user: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsePayload]
  }
  
  @scala.inline
  implicit class ResponsePayloadMutableBuilder[Self <: ResponsePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: ResponseModel): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
