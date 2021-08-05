package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationResource
  extends StObject
     with Resource {
  
  val reference_id: js.UndefOr[String] = js.undefined
  
  @JSName("update_time")
  val update_time_AuthorizationResource: String
  
  val valid_until: String
}
object AuthorizationResource {
  
  inline def apply(amount: Amount, id: String, update_time: String, valid_until: String): AuthorizationResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResource]
  }
  
  extension [Self <: AuthorizationResource](x: Self) {
    
    inline def setReference_id(value: String): Self = StObject.set(x, "reference_id", value.asInstanceOf[js.Any])
    
    inline def setReference_idUndefined: Self = StObject.set(x, "reference_id", js.undefined)
    
    inline def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    inline def setValid_until(value: String): Self = StObject.set(x, "valid_until", value.asInstanceOf[js.Any])
  }
}
