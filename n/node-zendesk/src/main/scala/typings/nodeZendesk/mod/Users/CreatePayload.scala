package typings.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePayload extends StObject {
  
  var user: CreateModel = js.native
}
object CreatePayload {
  
  @scala.inline
  def apply(user: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
  
  @scala.inline
  implicit class CreatePayloadMutableBuilder[Self <: CreatePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: CreateModel): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
