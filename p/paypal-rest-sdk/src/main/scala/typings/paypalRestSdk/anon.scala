package typings.paypalRestSdk

import typings.paypalRestSdk.mod.Currency
import typings.paypalRestSdk.mod.Item
import typings.paypalRestSdk.mod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: typings.paypalRestSdk.mod.Address
    
    var business_name: js.UndefOr[String] = js.undefined
    
    var first_name: String
    
    var last_name: String
  }
  object Address {
    
    @scala.inline
    def apply(address: typings.paypalRestSdk.mod.Address, first_name: String, last_name: String): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: typings.paypalRestSdk.mod.Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusiness_name(value: String): Self = StObject.set(x, "business_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusiness_nameUndefined: Self = StObject.set(x, "business_name", js.undefined)
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Allowedpaymentmethod extends StObject {
    
    var allowed_payment_method: String
  }
  object Allowedpaymentmethod {
    
    @scala.inline
    def apply(allowed_payment_method: String): Allowedpaymentmethod = {
      val __obj = js.Dynamic.literal(allowed_payment_method = allowed_payment_method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Allowedpaymentmethod]
    }
    
    @scala.inline
    implicit class AllowedpaymentmethodMutableBuilder[Self <: Allowedpaymentmethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_payment_method(value: String): Self = StObject.set(x, "allowed_payment_method", value.asInstanceOf[js.Any])
    }
  }
  
  trait Brandname extends StObject {
    
    var brand_name: js.UndefOr[String] = js.undefined
    
    var display_phone: js.UndefOr[Phone] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
  }
  object Brandname {
    
    @scala.inline
    def apply(): Brandname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Brandname]
    }
    
    @scala.inline
    implicit class BrandnameMutableBuilder[Self <: Brandname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrand_name(value: String): Self = StObject.set(x, "brand_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrand_nameUndefined: Self = StObject.set(x, "brand_name", js.undefined)
      
      @scala.inline
      def setDisplay_phone(value: Phone): Self = StObject.set(x, "display_phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_phoneUndefined: Self = StObject.set(x, "display_phone", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    }
  }
  
  trait Cancelledby extends StObject {
    
    var cancelled_by: js.UndefOr[String] = js.undefined
    
    var cancelled_date: js.UndefOr[String] = js.undefined
    
    var created_by: js.UndefOr[String] = js.undefined
    
    var created_date: js.UndefOr[String] = js.undefined
    
    var first_sent_date: js.UndefOr[String] = js.undefined
    
    var last_sent_by: js.UndefOr[String] = js.undefined
    
    var last_sent_date: js.UndefOr[String] = js.undefined
    
    var last_updated_by: js.UndefOr[String] = js.undefined
    
    var last_updated_date: js.UndefOr[String] = js.undefined
    
    var payer_view_url: js.UndefOr[String] = js.undefined
  }
  object Cancelledby {
    
    @scala.inline
    def apply(): Cancelledby = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancelledby]
    }
    
    @scala.inline
    implicit class CancelledbyMutableBuilder[Self <: Cancelledby] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelled_by(value: String): Self = StObject.set(x, "cancelled_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelled_byUndefined: Self = StObject.set(x, "cancelled_by", js.undefined)
      
      @scala.inline
      def setCancelled_date(value: String): Self = StObject.set(x, "cancelled_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelled_dateUndefined: Self = StObject.set(x, "cancelled_date", js.undefined)
      
      @scala.inline
      def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_byUndefined: Self = StObject.set(x, "created_by", js.undefined)
      
      @scala.inline
      def setCreated_date(value: String): Self = StObject.set(x, "created_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_dateUndefined: Self = StObject.set(x, "created_date", js.undefined)
      
      @scala.inline
      def setFirst_sent_date(value: String): Self = StObject.set(x, "first_sent_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_sent_dateUndefined: Self = StObject.set(x, "first_sent_date", js.undefined)
      
      @scala.inline
      def setLast_sent_by(value: String): Self = StObject.set(x, "last_sent_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_sent_byUndefined: Self = StObject.set(x, "last_sent_by", js.undefined)
      
      @scala.inline
      def setLast_sent_date(value: String): Self = StObject.set(x, "last_sent_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_sent_dateUndefined: Self = StObject.set(x, "last_sent_date", js.undefined)
      
      @scala.inline
      def setLast_updated_by(value: String): Self = StObject.set(x, "last_updated_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_updated_byUndefined: Self = StObject.set(x, "last_updated_by", js.undefined)
      
      @scala.inline
      def setLast_updated_date(value: String): Self = StObject.set(x, "last_updated_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_updated_dateUndefined: Self = StObject.set(x, "last_updated_date", js.undefined)
      
      @scala.inline
      def setPayer_view_url(value: String): Self = StObject.set(x, "payer_view_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayer_view_urlUndefined: Self = StObject.set(x, "payer_view_url", js.undefined)
    }
  }
  
  trait Cancelurl extends StObject {
    
    var cancel_url: js.UndefOr[String] = js.undefined
    
    var return_url: js.UndefOr[String] = js.undefined
  }
  object Cancelurl {
    
    @scala.inline
    def apply(): Cancelurl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancelurl]
    }
    
    @scala.inline
    implicit class CancelurlMutableBuilder[Self <: Cancelurl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel_urlUndefined: Self = StObject.set(x, "cancel_url", js.undefined)
      
      @scala.inline
      def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    }
  }
  
  trait Giftwrap extends StObject {
    
    var gift_wrap: js.UndefOr[String] = js.undefined
    
    var handling_fee: js.UndefOr[String] = js.undefined
    
    var insurance: js.UndefOr[String] = js.undefined
    
    var shipping: js.UndefOr[String] = js.undefined
    
    var shipping_discout: js.UndefOr[String] = js.undefined
    
    var subtotal: js.UndefOr[String] = js.undefined
    
    var tax: js.UndefOr[String] = js.undefined
  }
  object Giftwrap {
    
    @scala.inline
    def apply(): Giftwrap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Giftwrap]
    }
    
    @scala.inline
    implicit class GiftwrapMutableBuilder[Self <: Giftwrap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGift_wrap(value: String): Self = StObject.set(x, "gift_wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGift_wrapUndefined: Self = StObject.set(x, "gift_wrap", js.undefined)
      
      @scala.inline
      def setHandling_fee(value: String): Self = StObject.set(x, "handling_fee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandling_feeUndefined: Self = StObject.set(x, "handling_fee", js.undefined)
      
      @scala.inline
      def setInsurance(value: String): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
      
      @scala.inline
      def setShipping(value: String): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
      
      @scala.inline
      def setShipping_discout(value: String): Self = StObject.set(x, "shipping_discout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_discoutUndefined: Self = StObject.set(x, "shipping_discout", js.undefined)
      
      @scala.inline
      def setSubtotal(value: String): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtotalUndefined: Self = StObject.set(x, "subtotal", js.undefined)
      
      @scala.inline
      def setTax(value: String): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[Item]
    
    var shipping_address: js.UndefOr[typings.paypalRestSdk.mod.Address] = js.undefined
    
    var shipping_method: js.UndefOr[String] = js.undefined
    
    var shipping_phone_number: js.UndefOr[String] = js.undefined
  }
  object Items {
    
    @scala.inline
    def apply(items: js.Array[Item]): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setShipping_address(value: typings.paypalRestSdk.mod.Address): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
      
      @scala.inline
      def setShipping_method(value: String): Self = StObject.set(x, "shipping_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_methodUndefined: Self = StObject.set(x, "shipping_method", js.undefined)
      
      @scala.inline
      def setShipping_phone_number(value: String): Self = StObject.set(x, "shipping_phone_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_phone_numberUndefined: Self = StObject.set(x, "shipping_phone_number", js.undefined)
    }
  }
  
  trait Other extends StObject {
    
    var other: Currency
    
    var paypal: Currency
  }
  object Other {
    
    @scala.inline
    def apply(other: Currency, paypal: Currency): Other = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], paypal = paypal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Other]
    }
    
    @scala.inline
    implicit class OtherMutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOther(value: Currency): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaypal(value: Currency): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Paymentmethod extends StObject {
    
    var payment_method: String
  }
  object Paymentmethod {
    
    @scala.inline
    def apply(payment_method: String): Paymentmethod = {
      val __obj = js.Dynamic.literal(payment_method = payment_method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paymentmethod]
    }
    
    @scala.inline
    implicit class PaymentmethodMutableBuilder[Self <: Paymentmethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    }
  }
}
