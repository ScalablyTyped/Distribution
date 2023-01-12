package typings.paypalPaypalJs.anon

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  email_address :string,   merchant_id :string,   client_id :string,   display_data :std.Partial<{  business_email :string,   business_phone :{  country_code :string,   national_number :string,   extension_number :string | undefined},   brand_name :string}>}> */
trait PartialemailaddressstringClientid extends StObject {
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var display_data: js.UndefOr[Partial[Brandname]] = js.undefined
  
  var email_address: js.UndefOr[String] = js.undefined
  
  var merchant_id: js.UndefOr[String] = js.undefined
}
object PartialemailaddressstringClientid {
  
  inline def apply(): PartialemailaddressstringClientid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialemailaddressstringClientid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialemailaddressstringClientid] (val x: Self) extends AnyVal {
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setDisplay_data(value: Partial[Brandname]): Self = StObject.set(x, "display_data", value.asInstanceOf[js.Any])
    
    inline def setDisplay_dataUndefined: Self = StObject.set(x, "display_data", js.undefined)
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
    
    inline def setMerchant_id(value: String): Self = StObject.set(x, "merchant_id", value.asInstanceOf[js.Any])
    
    inline def setMerchant_idUndefined: Self = StObject.set(x, "merchant_id", js.undefined)
  }
}
