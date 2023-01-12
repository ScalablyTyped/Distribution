package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.PAYPAL
import typings.paypalPaypalJs.paypalPaypalJsStrings.VENDOR
import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.Status
import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.StatusChangedBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  id :string,   status :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.Status,   start_time :string,   status_change_note :string,   status_update_time :string,   status_changed_by :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.StatusChangedBy,   plan_id :string,   quantity :string,   shipping_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   payee :std.Partial<{  email_address :string,   merchant_id :string,   client_id :string,   display_data :std.Partial<{  business_email :string,   business_phone :{  country_code :string,   national_number :string,   extension_number :string | undefined},   brand_name :string}>}>,   subscriber :std.Partial<{  email_address :string,   payer_id :string,   name :std.Partial<{  given_name :string,   surname :string}>,   phone :std.Partial<{  phone_type :string,   phone_number :string}> | undefined,   shipping_address :std.Partial<{  name :{  full_name :string | undefined} | undefined,   type :string | undefined,   options :std.Array<{  id :string,   label :string,   type :@paypal/paypal-js.@paypal/paypal-js/types/apis/shipping.ShippingOptionType | undefined,   amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   selected :boolean}> | undefined,   address :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Address}> | undefined,   payment_source :{  card :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Card> | undefined} | undefined}>,   billing_info :{  outstanding_balance :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   cycle_executions :std.Array<{  tenure_type :string,   sequence :number,   cycles_completed :number,   cycles_remaining :number | undefined,   current_pricing_scheme_version :number | undefined,   amount_payable_per_cycle :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   total_price_per_cycle :{  gross_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   total_item_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   fee_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   shipping_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   tax_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   net_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined} | undefined,   total_cycles :number | undefined}> | undefined,   last_payment :{  status :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.PaymentStatus | undefined,   amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   time :string,   sender_transaction_id :string | undefined,   receiver_transaction_id :string | undefined} | undefined,   next_billing_time :string | undefined,   next_payment :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   final_payment_time :string | undefined,   failed_payments_count :number,   last_failed_payment :{  amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   time :string,   reason_code :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.PaymentFailureReason | undefined,   next_payment_retry_time :string | undefined} | undefined,   total_paid_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined,   price_change_effective_after :number | undefined},   auto_renewal :boolean,   create_time :string,   update_time :string,   preferred_currency_conversion :'PAYPAL' | 'VENDOR',   preferred_funding_source :std.Partial<{  card :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Card>,   bank_account :{  id :string,   last_n_chars :string,   bank_name :string,   account_type :string | undefined,   country_code :string},   credit :{  id :string,   type :string | undefined},   balance :{  id :string | undefined}}>,   client_configuration :std.Partial<{  product_code :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductCode,   product_feature :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductFeature,   api :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.API,   integration_artifact :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.IntegrationArtifact,   experience :std.Partial<{  user_experience_flow :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.UserExperienceFlow,   entry_point :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.Payment,   payment_method :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.Payment | 'PAY_WITH_CRYPTO',   channel :'WEB' | 'MOBILE_WEB' | 'MOBILE_APP' | 'BATCH',   product_flow :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductFlow}>,   initiator :{  product_code :'EXPRESS_CHECKOUT' | 'WEBSITE_PAYMENTS_STANDARD' | undefined}}>,   metadata :string,   custom_id :string,   plan_overridden :boolean,   plan :std.Partial<{  product_id :string,   name :string,   description :string,   billing_cycles :std.Array<{  pricing_scheme :std.Partial<{  version :number,   status :'IN_PROGRESS' | 'ACTIVE' | 'INACTIVE',   fixed_price :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   pricing_model :'VOLUME' | 'TIERED',   tiers :std.Array<{  starting_quantity :string,   ending_quantity :string | undefined,   amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode}>,   create_time :string,   update_time :string}> | undefined,   frequency :{  interval_unit :'DAY' | 'WEEK' | 'SEMI_MONTH' | 'MONTH' | 'YEAR',   interval_count :number},   tenure_type :'REGULAR' | 'TRIAL',   sequence :number,   total_cycles :number | undefined,   taxes :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Taxes | undefined,   shipping_amount :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode | undefined}>,   payment_preferences :std.Partial<{  service_type :'PREPAID' | 'POSTPAID',   auto_bill_outstanding :boolean,   setup_fee :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode,   setup_fee_failure_action :'CONTINUE' | 'CANCEL',   payment_failure_threshold :number}>,   taxes :@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.Taxes,   quantity_supported :boolean,   product :std.Partial<{  name :string,   description :string,   type :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.ProductType,   category :@paypal/paypal-js.@paypal/paypal-js/types/apis/subscriptions/commons.Category,   image_url :string,   home_url :string}>}>,   links :std.Array<{  href :string,   rel :string,   method :'GET' | 'POST' | 'PUT' | 'DELETE' | 'HEAD' | 'CONNECT' | 'OPTIONS' | 'PATCH' | undefined,   title :string | undefined,   encType :string | undefined,   schema :unknown | undefined,   targetSchema :unknown | undefined}>}> */
trait PartialidstringstatusStat extends StObject {
  
  var auto_renewal: js.UndefOr[Boolean] = js.undefined
  
  var billing_info: js.UndefOr[Cycleexecutions] = js.undefined
  
  var client_configuration: js.UndefOr[PartialproductcodeProduct] = js.undefined
  
  var create_time: js.UndefOr[String] = js.undefined
  
  var custom_id: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var links: js.UndefOr[js.Array[EncType]] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var payee: js.UndefOr[PartialemailaddressstringClientid] = js.undefined
  
  var plan: js.UndefOr[Partialproductidstringnam] = js.undefined
  
  var plan_id: js.UndefOr[String] = js.undefined
  
  var plan_overridden: js.UndefOr[Boolean] = js.undefined
  
  var preferred_currency_conversion: js.UndefOr[PAYPAL | VENDOR] = js.undefined
  
  var preferred_funding_source: js.UndefOr[PartialcardPartialCardban] = js.undefined
  
  var quantity: js.UndefOr[String] = js.undefined
  
  var shipping_amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
  
  var start_time: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[Status] = js.undefined
  
  var status_change_note: js.UndefOr[String] = js.undefined
  
  var status_changed_by: js.UndefOr[StatusChangedBy] = js.undefined
  
  var status_update_time: js.UndefOr[String] = js.undefined
  
  var subscriber: js.UndefOr[Partialemailaddressstring] = js.undefined
  
  var update_time: js.UndefOr[String] = js.undefined
}
object PartialidstringstatusStat {
  
  inline def apply(): PartialidstringstatusStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialidstringstatusStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialidstringstatusStat] (val x: Self) extends AnyVal {
    
    inline def setAuto_renewal(value: Boolean): Self = StObject.set(x, "auto_renewal", value.asInstanceOf[js.Any])
    
    inline def setAuto_renewalUndefined: Self = StObject.set(x, "auto_renewal", js.undefined)
    
    inline def setBilling_info(value: Cycleexecutions): Self = StObject.set(x, "billing_info", value.asInstanceOf[js.Any])
    
    inline def setBilling_infoUndefined: Self = StObject.set(x, "billing_info", js.undefined)
    
    inline def setClient_configuration(value: PartialproductcodeProduct): Self = StObject.set(x, "client_configuration", value.asInstanceOf[js.Any])
    
    inline def setClient_configurationUndefined: Self = StObject.set(x, "client_configuration", js.undefined)
    
    inline def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    inline def setCustom_id(value: String): Self = StObject.set(x, "custom_id", value.asInstanceOf[js.Any])
    
    inline def setCustom_idUndefined: Self = StObject.set(x, "custom_id", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLinks(value: js.Array[EncType]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def setLinksVarargs(value: EncType*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPayee(value: PartialemailaddressstringClientid): Self = StObject.set(x, "payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeUndefined: Self = StObject.set(x, "payee", js.undefined)
    
    inline def setPlan(value: Partialproductidstringnam): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    inline def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
    
    inline def setPlan_overridden(value: Boolean): Self = StObject.set(x, "plan_overridden", value.asInstanceOf[js.Any])
    
    inline def setPlan_overriddenUndefined: Self = StObject.set(x, "plan_overridden", js.undefined)
    
    inline def setPreferred_currency_conversion(value: PAYPAL | VENDOR): Self = StObject.set(x, "preferred_currency_conversion", value.asInstanceOf[js.Any])
    
    inline def setPreferred_currency_conversionUndefined: Self = StObject.set(x, "preferred_currency_conversion", js.undefined)
    
    inline def setPreferred_funding_source(value: PartialcardPartialCardban): Self = StObject.set(x, "preferred_funding_source", value.asInstanceOf[js.Any])
    
    inline def setPreferred_funding_sourceUndefined: Self = StObject.set(x, "preferred_funding_source", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setShipping_amount(value: AmountWithCurrencyCode): Self = StObject.set(x, "shipping_amount", value.asInstanceOf[js.Any])
    
    inline def setShipping_amountUndefined: Self = StObject.set(x, "shipping_amount", js.undefined)
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatus_change_note(value: String): Self = StObject.set(x, "status_change_note", value.asInstanceOf[js.Any])
    
    inline def setStatus_change_noteUndefined: Self = StObject.set(x, "status_change_note", js.undefined)
    
    inline def setStatus_changed_by(value: StatusChangedBy): Self = StObject.set(x, "status_changed_by", value.asInstanceOf[js.Any])
    
    inline def setStatus_changed_byUndefined: Self = StObject.set(x, "status_changed_by", js.undefined)
    
    inline def setStatus_update_time(value: String): Self = StObject.set(x, "status_update_time", value.asInstanceOf[js.Any])
    
    inline def setStatus_update_timeUndefined: Self = StObject.set(x, "status_update_time", js.undefined)
    
    inline def setSubscriber(value: Partialemailaddressstring): Self = StObject.set(x, "subscriber", value.asInstanceOf[js.Any])
    
    inline def setSubscriberUndefined: Self = StObject.set(x, "subscriber", js.undefined)
    
    inline def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    inline def setUpdate_timeUndefined: Self = StObject.set(x, "update_time", js.undefined)
  }
}
