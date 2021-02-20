package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Brandname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payee extends StObject {
  
  var email: String = js.native
  
  var merchant_id: String = js.native
  
  var payee_display_metadata: js.UndefOr[Brandname] = js.native
}
object Payee {
  
  @scala.inline
  def apply(email: String, merchant_id: String): Payee = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], merchant_id = merchant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payee]
  }
  
  @scala.inline
  implicit class PayeeMutableBuilder[Self <: Payee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchant_id(value: String): Self = StObject.set(x, "merchant_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayee_display_metadata(value: Brandname): Self = StObject.set(x, "payee_display_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayee_display_metadataUndefined: Self = StObject.set(x, "payee_display_metadata", js.undefined)
  }
}
