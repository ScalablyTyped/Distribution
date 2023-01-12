package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentSource extends StObject {
  
  var token: Token
}
object PaymentSource {
  
  inline def apply(token: Token): PaymentSource = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentSource] (val x: Self) extends AnyVal {
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
