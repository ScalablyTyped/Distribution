package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationResource extends Resource {
  
  val reference_id: js.UndefOr[String] = js.native
  
  @JSName("update_time")
  val update_time_AuthorizationResource: String = js.native
  
  val valid_until: String = js.native
}
object AuthorizationResource {
  
  @scala.inline
  def apply(amount: Amount, id: String, update_time: String, valid_until: String): AuthorizationResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResource]
  }
  
  @scala.inline
  implicit class AuthorizationResourceMutableBuilder[Self <: AuthorizationResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReference_id(value: String): Self = StObject.set(x, "reference_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference_idUndefined: Self = StObject.set(x, "reference_id", js.undefined)
    
    @scala.inline
    def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid_until(value: String): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
  }
}
