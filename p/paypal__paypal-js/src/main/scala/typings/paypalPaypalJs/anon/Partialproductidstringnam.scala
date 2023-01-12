package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisCommonsMod.Taxes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  product_id :string,   name :string,   description :string,   billing_cycles :std.Array<{  pricing_scheme :std.Partial<{  version :number,   status :'IN_PROGRESS' | 'ACTIVE' | 'INACTIVE',   fixed_price :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   pricing_model :'VOLUME' | 'TIERED',   tiers :std.Array<{  starting_quantity :string,   ending_quantity :string | undefined,   amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode}>,   create_time :string,   update_time :string}> | undefined,   frequency :{  interval_unit :'DAY' | 'WEEK' | 'SEMI_MONTH' | 'MONTH' | 'YEAR',   interval_count :number},   tenure_type :'REGULAR' | 'TRIAL',   sequence :number,   total_cycles :number | undefined,   taxes :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Taxes | undefined,   shipping_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined}>,   payment_preferences :std.Partial<{  service_type :'PREPAID' | 'POSTPAID',   auto_bill_outstanding :boolean,   setup_fee :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   setup_fee_failure_action :'CONTINUE' | 'CANCEL',   payment_failure_threshold :number}>,   taxes :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Taxes,   quantity_supported :boolean,   product :std.Partial<{  name :string,   description :string,   type :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductType,   category :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.Category,   image_url :string,   home_url :string}>}> */
trait Partialproductidstringnam extends StObject {
  
  var billing_cycles: js.UndefOr[js.Array[Frequency]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var payment_preferences: js.UndefOr[Partial[Autobilloutstanding]] = js.undefined
  
  var product: js.UndefOr[Partial[Category]] = js.undefined
  
  var product_id: js.UndefOr[String] = js.undefined
  
  var quantity_supported: js.UndefOr[Boolean] = js.undefined
  
  var taxes: js.UndefOr[Taxes] = js.undefined
}
object Partialproductidstringnam {
  
  inline def apply(): Partialproductidstringnam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialproductidstringnam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialproductidstringnam] (val x: Self) extends AnyVal {
    
    inline def setBilling_cycles(value: js.Array[Frequency]): Self = StObject.set(x, "billing_cycles", value.asInstanceOf[js.Any])
    
    inline def setBilling_cyclesUndefined: Self = StObject.set(x, "billing_cycles", js.undefined)
    
    inline def setBilling_cyclesVarargs(value: Frequency*): Self = StObject.set(x, "billing_cycles", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayment_preferences(value: Partial[Autobilloutstanding]): Self = StObject.set(x, "payment_preferences", value.asInstanceOf[js.Any])
    
    inline def setPayment_preferencesUndefined: Self = StObject.set(x, "payment_preferences", js.undefined)
    
    inline def setProduct(value: Partial[Category]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setProduct_idUndefined: Self = StObject.set(x, "product_id", js.undefined)
    
    inline def setQuantity_supported(value: Boolean): Self = StObject.set(x, "quantity_supported", value.asInstanceOf[js.Any])
    
    inline def setQuantity_supportedUndefined: Self = StObject.set(x, "quantity_supported", js.undefined)
    
    inline def setTaxes(value: Taxes): Self = StObject.set(x, "taxes", value.asInstanceOf[js.Any])
    
    inline def setTaxesUndefined: Self = StObject.set(x, "taxes", js.undefined)
  }
}
