package typings.nodeZendesk.mod.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePayload extends StObject {
  
  val request: UpdateModel
}
object UpdatePayload {
  
  @scala.inline
  def apply(request: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePayload]
  }
  
  @scala.inline
  implicit class UpdatePayloadMutableBuilder[Self <: UpdatePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: UpdateModel): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
