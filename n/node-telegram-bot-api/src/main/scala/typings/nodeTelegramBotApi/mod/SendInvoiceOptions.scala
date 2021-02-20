package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendInvoiceOptions extends SendBasicOptions {
  
  var is_flexible: js.UndefOr[Boolean] = js.native
  
  var need_email: js.UndefOr[Boolean] = js.native
  
  var need_name: js.UndefOr[Boolean] = js.native
  
  var need_phone_number: js.UndefOr[Boolean] = js.native
  
  var need_shipping_address: js.UndefOr[Boolean] = js.native
  
  var photo_height: js.UndefOr[Double] = js.native
  
  var photo_size: js.UndefOr[Double] = js.native
  
  var photo_url: js.UndefOr[String] = js.native
  
  var photo_width: js.UndefOr[Double] = js.native
  
  var provider_data: js.UndefOr[String] = js.native
}
object SendInvoiceOptions {
  
  @scala.inline
  def apply(): SendInvoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendInvoiceOptions]
  }
  
  @scala.inline
  implicit class SendInvoiceOptionsMutableBuilder[Self <: SendInvoiceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs_flexible(value: Boolean): Self = StObject.set(x, "is_flexible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_flexibleUndefined: Self = StObject.set(x, "is_flexible", js.undefined)
    
    @scala.inline
    def setNeed_email(value: Boolean): Self = StObject.set(x, "need_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeed_emailUndefined: Self = StObject.set(x, "need_email", js.undefined)
    
    @scala.inline
    def setNeed_name(value: Boolean): Self = StObject.set(x, "need_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeed_nameUndefined: Self = StObject.set(x, "need_name", js.undefined)
    
    @scala.inline
    def setNeed_phone_number(value: Boolean): Self = StObject.set(x, "need_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeed_phone_numberUndefined: Self = StObject.set(x, "need_phone_number", js.undefined)
    
    @scala.inline
    def setNeed_shipping_address(value: Boolean): Self = StObject.set(x, "need_shipping_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeed_shipping_addressUndefined: Self = StObject.set(x, "need_shipping_address", js.undefined)
    
    @scala.inline
    def setPhoto_height(value: Double): Self = StObject.set(x, "photo_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_heightUndefined: Self = StObject.set(x, "photo_height", js.undefined)
    
    @scala.inline
    def setPhoto_size(value: Double): Self = StObject.set(x, "photo_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_sizeUndefined: Self = StObject.set(x, "photo_size", js.undefined)
    
    @scala.inline
    def setPhoto_url(value: String): Self = StObject.set(x, "photo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_urlUndefined: Self = StObject.set(x, "photo_url", js.undefined)
    
    @scala.inline
    def setPhoto_width(value: Double): Self = StObject.set(x, "photo_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_widthUndefined: Self = StObject.set(x, "photo_width", js.undefined)
    
    @scala.inline
    def setProvider_data(value: String): Self = StObject.set(x, "provider_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider_dataUndefined: Self = StObject.set(x, "provider_data", js.undefined)
  }
}
