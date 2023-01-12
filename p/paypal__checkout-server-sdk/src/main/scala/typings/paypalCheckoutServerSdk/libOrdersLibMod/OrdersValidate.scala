package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OrdersValidate {
  
  trait RequestHeaders
    extends StObject
       with BaseOrderHeaders {
    
    var `PayPal-Client-Metadata-Id`: js.UndefOr[String] = js.undefined
  }
  object RequestHeaders {
    
    inline def apply(Authorization: String): RequestHeaders = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Content-Type")("application/json")
      __obj.asInstanceOf[RequestHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHeaders] (val x: Self) extends AnyVal {
      
      inline def `setPayPal-Client-Metadata-Id`(value: String): Self = StObject.set(x, "PayPal-Client-Metadata-Id", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Client-Metadata-IdUndefined`: Self = StObject.set(x, "PayPal-Client-Metadata-Id", js.undefined)
    }
  }
}
