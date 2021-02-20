package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaypalHeader extends StObject {
  
  var Authorization: String = js.native
}
object PaypalHeader {
  
  @scala.inline
  def apply(Authorization: String): PaypalHeader = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaypalHeader]
  }
  
  @scala.inline
  implicit class PaypalHeaderMutableBuilder[Self <: PaypalHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
  }
}
