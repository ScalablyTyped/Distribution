package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.applicationSlashjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOrderHeaders extends StObject {
  
  var Authorization: String
  
  var `Content-Type`: applicationSlashjson
}
object BaseOrderHeaders {
  
  inline def apply(Authorization: String): BaseOrderHeaders = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.updateDynamic("Content-Type")("application/json")
    __obj.asInstanceOf[BaseOrderHeaders]
  }
  
  extension [Self <: BaseOrderHeaders](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def `setContent-Type`(value: applicationSlashjson): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
  }
}
