package typings.paypalPayoutsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaypalHeader extends StObject {
  
  var Authorization: String
}
object PaypalHeader {
  
  inline def apply(Authorization: String): PaypalHeader = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaypalHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaypalHeader] (val x: Self) extends AnyVal {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
  }
}
