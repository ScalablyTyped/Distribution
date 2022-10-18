package typings.paypalCheckoutServerSdk.libLibMod

import typings.paypalCheckoutServerSdk.libOrdersLibMod.BaseOrderHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orders {
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.AccountTier")
  @js.native
  object AccountTier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier & String] = js.native
    
    /* "BUSINESS" */ val BUSINESS: typings.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.BUSINESS & String = js.native
    
    /* "PERSONAL" */ val PERSONAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.PERSONAL & String = js.native
    
    /* "PREMIER" */ val PREMIER: typings.paypalCheckoutServerSdk.libOrdersLibMod.AccountTier.PREMIER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.AuthenticationStatus")
  @js.native
  object AuthenticationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus & String] = js.native
    
    /* "A" */ val A: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.A & String = js.native
    
    /* "C" */ val C: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.C & String = js.native
    
    /* "D" */ val D: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.D & String = js.native
    
    /* "I" */ val I: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.I & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.N & String = js.native
    
    /* "R" */ val R: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.R & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.U & String = js.native
    
    /* "Y" */ val Y: typings.paypalCheckoutServerSdk.libOrdersLibMod.AuthenticationStatus.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.BaseOrderRequest")
  @js.native
  open class BaseOrderRequest[H /* <: BaseOrderHeaders */, B] protected ()
    extends typings.paypalCheckoutServerSdk.libOrdersLibMod.BaseOrderRequest[H, B] {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Category")
  @js.native
  object Category extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Category & String] = js.native
    
    /* "DIGITAL_GOODS" */ val DIGITAL_GOODS: typings.paypalCheckoutServerSdk.libOrdersLibMod.Category.DIGITAL_GOODS & String = js.native
    
    /* "DONATION" */ val DONATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.Category.DONATION & String = js.native
    
    /* "PHYSICAL_GOODS" */ val PHYSICAL_GOODS: typings.paypalCheckoutServerSdk.libOrdersLibMod.Category.PHYSICAL_GOODS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Contingency")
  @js.native
  object Contingency extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Contingency & String] = js.native
    
    /* "3D_SECURE" */ val `3D_SECURE`: typings.paypalCheckoutServerSdk.libOrdersLibMod.Contingency.`3D_SECURE` & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Enrolled")
  @js.native
  object Enrolled extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled & String] = js.native
    
    /* "B" */ val B: typings.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.B & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.N & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.U & String = js.native
    
    /* "Y" */ val Y: typings.paypalCheckoutServerSdk.libOrdersLibMod.Enrolled.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.EnrollmentStatus")
  @js.native
  object EnrollmentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus & String] = js.native
    
    /* "B" */ val B: typings.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.B & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.N & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.U & String = js.native
    
    /* "Y" */ val Y: typings.paypalCheckoutServerSdk.libOrdersLibMod.EnrollmentStatus.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.IdentityDocumentType")
  @js.native
  object IdentityDocumentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType & String] = js.native
    
    /* "INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER" */ val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER & String = js.native
    
    /* "NATIONAL_IDENTIFICATION_NUMBER" */ val NATIONAL_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.NATIONAL_IDENTIFICATION_NUMBER & String = js.native
    
    /* "PASSPORT_NUMBER" */ val PASSPORT_NUMBER: typings.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.PASSPORT_NUMBER & String = js.native
    
    /* "SOCIAL_SECURITY_NUMBER" */ val SOCIAL_SECURITY_NUMBER: typings.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.SOCIAL_SECURITY_NUMBER & String = js.native
    
    /* "SSN4" */ val SSN4: typings.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.SSN4 & String = js.native
    
    /* "TAX_IDENTIFICATION_NUMBER" */ val TAX_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.libOrdersLibMod.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Issuer")
  @js.native
  object Issuer extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Issuer & String] = js.native
    
    /* "CARD_ISSUER_INSTALLMENTS" */ val CARD_ISSUER_INSTALLMENTS: typings.paypalCheckoutServerSdk.libOrdersLibMod.Issuer.CARD_ISSUER_INSTALLMENTS & String = js.native
    
    /* "PAYPAL" */ val PAYPAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.Issuer.PAYPAL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.LandingPage")
  @js.native
  object LandingPage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage & String] = js.native
    
    /* "BILLING" */ val BILLING: typings.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage.BILLING & String = js.native
    
    /* "LOGIN" */ val LOGIN: typings.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage.LOGIN & String = js.native
    
    /* "NO_PREFERENCE" */ val NO_PREFERENCE: typings.paypalCheckoutServerSdk.libOrdersLibMod.LandingPage.NO_PREFERENCE & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.LiabilityShift")
  @js.native
  object LiabilityShift extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift & String] = js.native
    
    /* "NO" */ val NO: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.NO & String = js.native
    
    /* "POSSIBLE" */ val POSSIBLE: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.POSSIBLE & String = js.native
    
    /* "UNKNOWN" */ val UNKNOWN: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.UNKNOWN & String = js.native
    
    /* "YES" */ val YES: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.YES & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.ModelEnumsCurrencyReceivingType")
  @js.native
  object ModelEnumsCurrencyReceivingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType & String
      ] = js.native
    
    /* "ACCEPT" */ val ACCEPT: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT & String = js.native
    
    /* "ACCEPT_OPEN" */ val ACCEPT_OPEN: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT_OPEN & String = js.native
    
    /* "DENY" */ val DENY: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.DENY & String = js.native
    
    /* "HOLD" */ val HOLD: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsCurrencyReceivingType.HOLD & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.ModelEnumsDisbursementType")
  @js.native
  object ModelEnumsDisbursementType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsDisbursementType & String
      ] = js.native
    
    /* "DELAYED" */ val DELAYED: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsDisbursementType.DELAYED & String = js.native
    
    /* "INSTANT" */ val INSTANT: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsDisbursementType.INSTANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.ModelEnumsFacilitatorType")
  @js.native
  object ModelEnumsFacilitatorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType & String
      ] = js.native
    
    /* "API_CALLER" */ val API_CALLER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.API_CALLER & String = js.native
    
    /* "INTERNAL" */ val INTERNAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.INTERNAL & String = js.native
    
    /* "PARTNER" */ val PARTNER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.PARTNER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.ModelEnumsLiabilityType")
  @js.native
  object ModelEnumsLiabilityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsLiabilityType & String] = js.native
    
    /* "FULL" */ val FULL: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsLiabilityType.FULL & String = js.native
    
    /* "PARTIAL" */ val PARTIAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsLiabilityType.PARTIAL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.ModelEnumsParticipantType")
  @js.native
  object ModelEnumsParticipantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType & String
      ] = js.native
    
    /* "FACILITATOR" */ val FACILITATOR: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.FACILITATOR & String = js.native
    
    /* "RECEIVER" */ val RECEIVER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.RECEIVER & String = js.native
    
    /* "SENDER" */ val SENDER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.SENDER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.ModelEnumsPricingType")
  @js.native
  object ModelEnumsPricingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType & String] = js.native
    
    /* "BLENDED" */ val BLENDED: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType.BLENDED & String = js.native
    
    /* "IC_PLUS" */ val IC_PLUS: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsPricingType.IC_PLUS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Operation")
  @js.native
  object Operation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Operation & String] = js.native
    
    /* "add" */ val ADD: typings.paypalCheckoutServerSdk.libOrdersLibMod.Operation.ADD & String = js.native
    
    /* "copy" */ val COPY: typings.paypalCheckoutServerSdk.libOrdersLibMod.Operation.COPY & String = js.native
    
    /* "move" */ val MOVE: typings.paypalCheckoutServerSdk.libOrdersLibMod.Operation.MOVE & String = js.native
    
    /* "remove" */ val REMOVE: typings.paypalCheckoutServerSdk.libOrdersLibMod.Operation.REMOVE & String = js.native
    
    /* "replace" */ val REPLACE: typings.paypalCheckoutServerSdk.libOrdersLibMod.Operation.REPLACE & String = js.native
    
    /* "test" */ val TEST: typings.paypalCheckoutServerSdk.libOrdersLibMod.Operation.TEST & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersAuthorizeRequest")
  @js.native
  open class OrdersAuthorizeRequest protected ()
    extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersAuthorizeRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersCaptureRequest")
  @js.native
  open class OrdersCaptureRequest protected ()
    extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersCaptureRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersCreateRequest")
  @js.native
  open class OrdersCreateRequest ()
    extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersCreateRequest
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersGetRequest")
  @js.native
  open class OrdersGetRequest protected ()
    extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersGetRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersPatchRequest")
  @js.native
  open class OrdersPatchRequest protected ()
    extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersPatchRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersValidateRequest")
  @js.native
  open class OrdersValidateRequest protected ()
    extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersValidateRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Orthography")
  @js.native
  object Orthography extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography & String] = js.native
    
    /* "Arab" */ val Arab: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Arab & String = js.native
    
    /* "Armn" */ val Armn: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Armn & String = js.native
    
    /* "Beng" */ val Beng: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Beng & String = js.native
    
    /* "Cans" */ val Cans: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Cans & String = js.native
    
    /* "Cyrl" */ val Cyrl: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Cyrl & String = js.native
    
    /* "Deva" */ val Deva: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Deva & String = js.native
    
    /* "Ethi" */ val Ethi: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Ethi & String = js.native
    
    /* "Geor" */ val Geor: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Geor & String = js.native
    
    /* "Grek" */ val Grek: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Grek & String = js.native
    
    /* "Gujr" */ val Gujr: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Gujr & String = js.native
    
    /* "Guru" */ val Guru: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Guru & String = js.native
    
    /* "Hani" */ val Hani: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Hani & String = js.native
    
    /* "Hebr" */ val Hebr: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Hebr & String = js.native
    
    /* "Java" */ val Java: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Java & String = js.native
    
    /* "Jpan" */ val Jpan: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Jpan & String = js.native
    
    /* "Kana" */ val Kana: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Kana & String = js.native
    
    /* "Khmr" */ val Khmr: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Khmr & String = js.native
    
    /* "Knda" */ val Knda: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Knda & String = js.native
    
    /* "Kore" */ val Kore: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Kore & String = js.native
    
    /* "Laoo" */ val Laoo: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Laoo & String = js.native
    
    /* "Latn" */ val Latn: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Latn & String = js.native
    
    /* "Mlym" */ val Mlym: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Mlym & String = js.native
    
    /* "Mong" */ val Mong: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Mong & String = js.native
    
    /* "Mymr" */ val Mymr: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Mymr & String = js.native
    
    /* "Orya" */ val Orya: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Orya & String = js.native
    
    /* "Sinh" */ val Sinh: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Sinh & String = js.native
    
    /* "Sund" */ val Sund: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Sund & String = js.native
    
    /* "Syrc" */ val Syrc: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Syrc & String = js.native
    
    /* "Taml" */ val Taml: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Taml & String = js.native
    
    /* "Telu" */ val Telu: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Telu & String = js.native
    
    /* "Thaa" */ val Thaa: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Thaa & String = js.native
    
    /* "Thai" */ val Thai: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Thai & String = js.native
    
    /* "Tibt" */ val Tibt: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Tibt & String = js.native
    
    /* "Yiii" */ val Yiii: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Yiii & String = js.native
    
    /* "Zyyy" */ val Zyyy: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Zyyy & String = js.native
    
    /* "Zzzz" */ val Zzzz: typings.paypalCheckoutServerSdk.libOrdersLibMod.Orthography.Zzzz & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.PayeePreferred")
  @js.native
  object PayeePreferred extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred & String] = js.native
    
    /* "IMMEDIATE_PAYMENT_REQUIRED" */ val IMMEDIATE_PAYMENT_REQUIRED: typings.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred.IMMEDIATE_PAYMENT_REQUIRED & String = js.native
    
    /* "UNRESTRICTED" */ val UNRESTRICTED: typings.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred.UNRESTRICTED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.PaymentInitiator")
  @js.native
  object PaymentInitiator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentInitiator & String] = js.native
    
    /* "CUSTOMER" */ val CUSTOMER: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentInitiator.CUSTOMER & String = js.native
    
    /* "MERCHANT" */ val MERCHANT: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentInitiator.MERCHANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.PaymentType")
  @js.native
  object PaymentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType & String] = js.native
    
    /* "ONE_TIME" */ val ONE_TIME: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.ONE_TIME & String = js.native
    
    /* "RECURRING" */ val RECURRING: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.RECURRING & String = js.native
    
    /* "UNSCHEDULED" */ val UNSCHEDULED: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.UNSCHEDULED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.PhoneType")
  @js.native
  object PhoneType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType & String] = js.native
    
    /* "FAX" */ val FAX: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.FAX & String = js.native
    
    /* "HOME" */ val HOME: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.HOME & String = js.native
    
    /* "MOBILE" */ val MOBILE: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.MOBILE & String = js.native
    
    /* "OTHER" */ val OTHER: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.OTHER & String = js.native
    
    /* "PAGER" */ val PAGER: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.PAGER & String = js.native
    
    /* "WORK" */ val WORK: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.WORK & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.StandardEntryClassCode")
  @js.native
  object StandardEntryClassCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode & String] = js.native
    
    /* "CCD" */ val CCD: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.CCD & String = js.native
    
    /* "PPD" */ val PP: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.PP & String = js.native
    
    /* "TEL" */ val TEL: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.TEL & String = js.native
    
    /* "WEB" */ val WEB: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.WEB & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Tier")
  @js.native
  object Tier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Tier & String] = js.native
    
    /* "BUSINESS" */ val BUSINESS: typings.paypalCheckoutServerSdk.libOrdersLibMod.Tier.BUSINESS & String = js.native
    
    /* "PERSONAL" */ val PERSONAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.Tier.PERSONAL & String = js.native
    
    /* "PREMIER" */ val PREMIER: typings.paypalCheckoutServerSdk.libOrdersLibMod.Tier.PREMIER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.Usage")
  @js.native
  object Usage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.Usage & String] = js.native
    
    /* "DERIVED" */ val DERIVED: typings.paypalCheckoutServerSdk.libOrdersLibMod.Usage.DERIVED & String = js.native
    
    /* "FIRST" */ val FIRST: typings.paypalCheckoutServerSdk.libOrdersLibMod.Usage.FIRST & String = js.native
    
    /* "SUBSEQUENT" */ val SUBSEQUENT: typings.paypalCheckoutServerSdk.libOrdersLibMod.Usage.SUBSEQUENT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.business_type")
  @js.native
  object businessType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType & String] = js.native
    
    /* "ANY_OTHER_BUSINESS_ENTITY" */ val ANY_OTHER_BUSINESS_ENTITY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ANY_OTHER_BUSINESS_ENTITY & String = js.native
    
    /* "ASSOCIATION" */ val ASSOCIATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ASSOCIATION & String = js.native
    
    /* "CORPORATION" */ val CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.CORPORATION & String = js.native
    
    /* "GENERAL_PARTNERSHIP" */ val GENERAL_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.GENERAL_PARTNERSHIP & String = js.native
    
    /* "GOVERNMENT" */ val GOVERNMENT: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.GOVERNMENT & String = js.native
    
    /* "INDIVIDUAL" */ val INDIVIDUAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.INDIVIDUAL & String = js.native
    
    /* "LIMITED_LIABILITY_PARTNERSHIP" */ val LIMITED_LIABILITY_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PARTNERSHIP & String = js.native
    
    /* "LIMITED_LIABILITY_PRIVATE_CORPORATION" */ val LIMITED_LIABILITY_PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PRIVATE_CORPORATION & String = js.native
    
    /* "LIMITED_LIABILITY_PROPRIETORS" */ val LIMITED_LIABILITY_PROPRIETORS: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PROPRIETORS & String = js.native
    
    /* "LIMITED_PARTNERSHIP" */ val LIMITED_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_PARTNERSHIP & String = js.native
    
    /* "LIMITED_PARTNERSHIP_PRIVATE_CORPORATION" */ val LIMITED_PARTNERSHIP_PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_PARTNERSHIP_PRIVATE_CORPORATION & String = js.native
    
    /* "NONPROFIT" */ val NONPROFIT: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.NONPROFIT & String = js.native
    
    /* "ONLY_BUY_OR_SEND_MONEY" */ val ONLY_BUY_OR_SEND_MONEY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ONLY_BUY_OR_SEND_MONEY & String = js.native
    
    /* "OTHER_CORPORATE_BODY" */ val OTHER_CORPORATE_BODY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.OTHER_CORPORATE_BODY & String = js.native
    
    /* "PARTNERSHIP" */ val PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PARTNERSHIP & String = js.native
    
    /* "PRIVATE_CORPORATION" */ val PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PRIVATE_CORPORATION & String = js.native
    
    /* "PRIVATE_PARTNERSHIP" */ val PRIVATE_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PRIVATE_PARTNERSHIP & String = js.native
    
    /* "PROPRIETORSHIP" */ val PROPRIETORSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORSHIP & String = js.native
    
    /* "PROPRIETORSHIP_CRAFTSMAN" */ val PROPRIETORSHIP_CRAFTSMAN: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORSHIP_CRAFTSMAN & String = js.native
    
    /* "PROPRIETORY_COMPANY" */ val PROPRIETORY_COMPANY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORY_COMPANY & String = js.native
    
    /* "PUBLIC_COMPANY" */ val PUBLIC_COMPANY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_COMPANY & String = js.native
    
    /* "PUBLIC_CORPORATION" */ val PUBLIC_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_CORPORATION & String = js.native
    
    /* "PUBLIC_PARTNERSHIP" */ val PUBLIC_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_PARTNERSHIP & String = js.native
    
    /* "REGISTERED_COOPERATIVE" */ val REGISTERED_COOPERATIVE: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.REGISTERED_COOPERATIVE & String = js.native
  }
}
