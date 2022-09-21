package typings.paypalCheckoutServerSdk.mod

import typings.paypalCheckoutServerSdk.ordersLibMod.BaseOrderHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orders {
  
  @JSImport("@paypal/checkout-server-sdk", "orders.AccountTier")
  @js.native
  object AccountTier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.AccountTier & String] = js.native
    
    /* "BUSINESS" */ val BUSINESS: typings.paypalCheckoutServerSdk.ordersLibMod.AccountTier.BUSINESS & String = js.native
    
    /* "PERSONAL" */ val PERSONAL: typings.paypalCheckoutServerSdk.ordersLibMod.AccountTier.PERSONAL & String = js.native
    
    /* "PREMIER" */ val PREMIER: typings.paypalCheckoutServerSdk.ordersLibMod.AccountTier.PREMIER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.AuthenticationStatus")
  @js.native
  object AuthenticationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus & String] = js.native
    
    /* "A" */ val A: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.A & String = js.native
    
    /* "C" */ val C: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.C & String = js.native
    
    /* "D" */ val D: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.D & String = js.native
    
    /* "I" */ val I: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.I & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.N & String = js.native
    
    /* "R" */ val R: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.R & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.U & String = js.native
    
    /* "Y" */ val Y: typings.paypalCheckoutServerSdk.ordersLibMod.AuthenticationStatus.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.BaseOrderRequest")
  @js.native
  open class BaseOrderRequest[H /* <: BaseOrderHeaders */, B] protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.orders.BaseOrderRequest[H, B] {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Category")
  @js.native
  object Category extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Category & String] = js.native
    
    /* "DIGITAL_GOODS" */ val DIGITAL_GOODS: typings.paypalCheckoutServerSdk.ordersLibMod.Category.DIGITAL_GOODS & String = js.native
    
    /* "DONATION" */ val DONATION: typings.paypalCheckoutServerSdk.ordersLibMod.Category.DONATION & String = js.native
    
    /* "PHYSICAL_GOODS" */ val PHYSICAL_GOODS: typings.paypalCheckoutServerSdk.ordersLibMod.Category.PHYSICAL_GOODS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Contingency")
  @js.native
  object Contingency extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Contingency & String] = js.native
    
    /* "3D_SECURE" */ val `3D_SECURE`: typings.paypalCheckoutServerSdk.ordersLibMod.Contingency.`3D_SECURE` & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Enrolled")
  @js.native
  object Enrolled extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled & String] = js.native
    
    /* "B" */ val B: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.B & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.N & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.U & String = js.native
    
    /* "Y" */ val Y: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.EnrollmentStatus")
  @js.native
  object EnrollmentStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.EnrollmentStatus & String] = js.native
    
    /* "B" */ val B: typings.paypalCheckoutServerSdk.ordersLibMod.EnrollmentStatus.B & String = js.native
    
    /* "N" */ val N: typings.paypalCheckoutServerSdk.ordersLibMod.EnrollmentStatus.N & String = js.native
    
    /* "U" */ val U: typings.paypalCheckoutServerSdk.ordersLibMod.EnrollmentStatus.U & String = js.native
    
    /* "Y" */ val Y: typings.paypalCheckoutServerSdk.ordersLibMod.EnrollmentStatus.Y & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.IdentityDocumentType")
  @js.native
  object IdentityDocumentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType & String] = js.native
    
    /* "INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER" */ val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER & String = js.native
    
    /* "NATIONAL_IDENTIFICATION_NUMBER" */ val NATIONAL_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.NATIONAL_IDENTIFICATION_NUMBER & String = js.native
    
    /* "PASSPORT_NUMBER" */ val PASSPORT_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.PASSPORT_NUMBER & String = js.native
    
    /* "SOCIAL_SECURITY_NUMBER" */ val SOCIAL_SECURITY_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.SOCIAL_SECURITY_NUMBER & String = js.native
    
    /* "SSN4" */ val SSN4: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.SSN4 & String = js.native
    
    /* "TAX_IDENTIFICATION_NUMBER" */ val TAX_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Issuer")
  @js.native
  object Issuer extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Issuer & String] = js.native
    
    /* "CARD_ISSUER_INSTALLMENTS" */ val CARD_ISSUER_INSTALLMENTS: typings.paypalCheckoutServerSdk.ordersLibMod.Issuer.CARD_ISSUER_INSTALLMENTS & String = js.native
    
    /* "PAYPAL" */ val PAYPAL: typings.paypalCheckoutServerSdk.ordersLibMod.Issuer.PAYPAL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.LandingPage")
  @js.native
  object LandingPage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.LandingPage & String] = js.native
    
    /* "BILLING" */ val BILLING: typings.paypalCheckoutServerSdk.ordersLibMod.LandingPage.BILLING & String = js.native
    
    /* "LOGIN" */ val LOGIN: typings.paypalCheckoutServerSdk.ordersLibMod.LandingPage.LOGIN & String = js.native
    
    /* "NO_PREFERENCE" */ val NO_PREFERENCE: typings.paypalCheckoutServerSdk.ordersLibMod.LandingPage.NO_PREFERENCE & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.LiabilityShift")
  @js.native
  object LiabilityShift extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.LiabilityShift & String] = js.native
    
    /* "NO" */ val NO: typings.paypalCheckoutServerSdk.ordersLibMod.LiabilityShift.NO & String = js.native
    
    /* "POSSIBLE" */ val POSSIBLE: typings.paypalCheckoutServerSdk.ordersLibMod.LiabilityShift.POSSIBLE & String = js.native
    
    /* "UNKNOWN" */ val UNKNOWN: typings.paypalCheckoutServerSdk.ordersLibMod.LiabilityShift.UNKNOWN & String = js.native
    
    /* "YES" */ val YES: typings.paypalCheckoutServerSdk.ordersLibMod.LiabilityShift.YES & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsCurrencyReceivingType")
  @js.native
  object ModelEnumsCurrencyReceivingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsCurrencyReceivingType & String
      ] = js.native
    
    /* "ACCEPT" */ val ACCEPT: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT & String = js.native
    
    /* "ACCEPT_OPEN" */ val ACCEPT_OPEN: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsCurrencyReceivingType.ACCEPT_OPEN & String = js.native
    
    /* "DENY" */ val DENY: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsCurrencyReceivingType.DENY & String = js.native
    
    /* "HOLD" */ val HOLD: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsCurrencyReceivingType.HOLD & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsDisbursementType")
  @js.native
  object ModelEnumsDisbursementType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsDisbursementType & String] = js.native
    
    /* "DELAYED" */ val DELAYED: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsDisbursementType.DELAYED & String = js.native
    
    /* "INSTANT" */ val INSTANT: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsDisbursementType.INSTANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsFacilitatorType")
  @js.native
  object ModelEnumsFacilitatorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsFacilitatorType & String] = js.native
    
    /* "API_CALLER" */ val API_CALLER: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsFacilitatorType.API_CALLER & String = js.native
    
    /* "INTERNAL" */ val INTERNAL: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsFacilitatorType.INTERNAL & String = js.native
    
    /* "PARTNER" */ val PARTNER: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsFacilitatorType.PARTNER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsLiabilityType")
  @js.native
  object ModelEnumsLiabilityType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsLiabilityType & String] = js.native
    
    /* "FULL" */ val FULL: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsLiabilityType.FULL & String = js.native
    
    /* "PARTIAL" */ val PARTIAL: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsLiabilityType.PARTIAL & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsParticipantType")
  @js.native
  object ModelEnumsParticipantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsParticipantType & String] = js.native
    
    /* "FACILITATOR" */ val FACILITATOR: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsParticipantType.FACILITATOR & String = js.native
    
    /* "RECEIVER" */ val RECEIVER: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsParticipantType.RECEIVER & String = js.native
    
    /* "SENDER" */ val SENDER: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsParticipantType.SENDER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.ModelEnumsPricingType")
  @js.native
  object ModelEnumsPricingType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsPricingType & String] = js.native
    
    /* "BLENDED" */ val BLENDED: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsPricingType.BLENDED & String = js.native
    
    /* "IC_PLUS" */ val IC_PLUS: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsPricingType.IC_PLUS & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Operation")
  @js.native
  object Operation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Operation & String] = js.native
    
    /* "add" */ val ADD: typings.paypalCheckoutServerSdk.ordersLibMod.Operation.ADD & String = js.native
    
    /* "copy" */ val COPY: typings.paypalCheckoutServerSdk.ordersLibMod.Operation.COPY & String = js.native
    
    /* "move" */ val MOVE: typings.paypalCheckoutServerSdk.ordersLibMod.Operation.MOVE & String = js.native
    
    /* "remove" */ val REMOVE: typings.paypalCheckoutServerSdk.ordersLibMod.Operation.REMOVE & String = js.native
    
    /* "replace" */ val REPLACE: typings.paypalCheckoutServerSdk.ordersLibMod.Operation.REPLACE & String = js.native
    
    /* "test" */ val TEST: typings.paypalCheckoutServerSdk.ordersLibMod.Operation.TEST & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersAuthorizeRequest")
  @js.native
  open class OrdersAuthorizeRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersAuthorizeRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersCaptureRequest")
  @js.native
  open class OrdersCaptureRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersCaptureRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersCreateRequest")
  @js.native
  open class OrdersCreateRequest ()
    extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersCreateRequest
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersGetRequest")
  @js.native
  open class OrdersGetRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersGetRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersPatchRequest")
  @js.native
  open class OrdersPatchRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersPatchRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.OrdersValidateRequest")
  @js.native
  open class OrdersValidateRequest protected ()
    extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersValidateRequest {
    def this(orderId: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Orthography")
  @js.native
  object Orthography extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Orthography & String] = js.native
    
    /* "Arab" */ val Arab: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Arab & String = js.native
    
    /* "Armn" */ val Armn: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Armn & String = js.native
    
    /* "Beng" */ val Beng: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Beng & String = js.native
    
    /* "Cans" */ val Cans: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Cans & String = js.native
    
    /* "Cyrl" */ val Cyrl: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Cyrl & String = js.native
    
    /* "Deva" */ val Deva: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Deva & String = js.native
    
    /* "Ethi" */ val Ethi: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Ethi & String = js.native
    
    /* "Geor" */ val Geor: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Geor & String = js.native
    
    /* "Grek" */ val Grek: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Grek & String = js.native
    
    /* "Gujr" */ val Gujr: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Gujr & String = js.native
    
    /* "Guru" */ val Guru: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Guru & String = js.native
    
    /* "Hani" */ val Hani: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Hani & String = js.native
    
    /* "Hebr" */ val Hebr: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Hebr & String = js.native
    
    /* "Java" */ val Java: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Java & String = js.native
    
    /* "Jpan" */ val Jpan: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Jpan & String = js.native
    
    /* "Kana" */ val Kana: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Kana & String = js.native
    
    /* "Khmr" */ val Khmr: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Khmr & String = js.native
    
    /* "Knda" */ val Knda: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Knda & String = js.native
    
    /* "Kore" */ val Kore: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Kore & String = js.native
    
    /* "Laoo" */ val Laoo: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Laoo & String = js.native
    
    /* "Latn" */ val Latn: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Latn & String = js.native
    
    /* "Mlym" */ val Mlym: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Mlym & String = js.native
    
    /* "Mong" */ val Mong: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Mong & String = js.native
    
    /* "Mymr" */ val Mymr: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Mymr & String = js.native
    
    /* "Orya" */ val Orya: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Orya & String = js.native
    
    /* "Sinh" */ val Sinh: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Sinh & String = js.native
    
    /* "Sund" */ val Sund: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Sund & String = js.native
    
    /* "Syrc" */ val Syrc: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Syrc & String = js.native
    
    /* "Taml" */ val Taml: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Taml & String = js.native
    
    /* "Telu" */ val Telu: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Telu & String = js.native
    
    /* "Thaa" */ val Thaa: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Thaa & String = js.native
    
    /* "Thai" */ val Thai: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Thai & String = js.native
    
    /* "Tibt" */ val Tibt: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Tibt & String = js.native
    
    /* "Yiii" */ val Yiii: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Yiii & String = js.native
    
    /* "Zyyy" */ val Zyyy: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Zyyy & String = js.native
    
    /* "Zzzz" */ val Zzzz: typings.paypalCheckoutServerSdk.ordersLibMod.Orthography.Zzzz & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PayeePreferred")
  @js.native
  object PayeePreferred extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.PayeePreferred & String] = js.native
    
    /* "IMMEDIATE_PAYMENT_REQUIRED" */ val IMMEDIATE_PAYMENT_REQUIRED: typings.paypalCheckoutServerSdk.ordersLibMod.PayeePreferred.IMMEDIATE_PAYMENT_REQUIRED & String = js.native
    
    /* "UNRESTRICTED" */ val UNRESTRICTED: typings.paypalCheckoutServerSdk.ordersLibMod.PayeePreferred.UNRESTRICTED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PaymentInitiator")
  @js.native
  object PaymentInitiator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.PaymentInitiator & String] = js.native
    
    /* "CUSTOMER" */ val CUSTOMER: typings.paypalCheckoutServerSdk.ordersLibMod.PaymentInitiator.CUSTOMER & String = js.native
    
    /* "MERCHANT" */ val MERCHANT: typings.paypalCheckoutServerSdk.ordersLibMod.PaymentInitiator.MERCHANT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PaymentType")
  @js.native
  object PaymentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.PaymentType & String] = js.native
    
    /* "ONE_TIME" */ val ONE_TIME: typings.paypalCheckoutServerSdk.ordersLibMod.PaymentType.ONE_TIME & String = js.native
    
    /* "RECURRING" */ val RECURRING: typings.paypalCheckoutServerSdk.ordersLibMod.PaymentType.RECURRING & String = js.native
    
    /* "UNSCHEDULED" */ val UNSCHEDULED: typings.paypalCheckoutServerSdk.ordersLibMod.PaymentType.UNSCHEDULED & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.PhoneType")
  @js.native
  object PhoneType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.PhoneType & String] = js.native
    
    /* "FAX" */ val FAX: typings.paypalCheckoutServerSdk.ordersLibMod.PhoneType.FAX & String = js.native
    
    /* "HOME" */ val HOME: typings.paypalCheckoutServerSdk.ordersLibMod.PhoneType.HOME & String = js.native
    
    /* "MOBILE" */ val MOBILE: typings.paypalCheckoutServerSdk.ordersLibMod.PhoneType.MOBILE & String = js.native
    
    /* "OTHER" */ val OTHER: typings.paypalCheckoutServerSdk.ordersLibMod.PhoneType.OTHER & String = js.native
    
    /* "PAGER" */ val PAGER: typings.paypalCheckoutServerSdk.ordersLibMod.PhoneType.PAGER & String = js.native
    
    /* "WORK" */ val WORK: typings.paypalCheckoutServerSdk.ordersLibMod.PhoneType.WORK & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.StandardEntryClassCode")
  @js.native
  object StandardEntryClassCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.StandardEntryClassCode & String] = js.native
    
    /* "CCD" */ val CCD: typings.paypalCheckoutServerSdk.ordersLibMod.StandardEntryClassCode.CCD & String = js.native
    
    /* "PPD" */ val PP: typings.paypalCheckoutServerSdk.ordersLibMod.StandardEntryClassCode.PP & String = js.native
    
    /* "TEL" */ val TEL: typings.paypalCheckoutServerSdk.ordersLibMod.StandardEntryClassCode.TEL & String = js.native
    
    /* "WEB" */ val WEB: typings.paypalCheckoutServerSdk.ordersLibMod.StandardEntryClassCode.WEB & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Tier")
  @js.native
  object Tier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Tier & String] = js.native
    
    /* "BUSINESS" */ val BUSINESS: typings.paypalCheckoutServerSdk.ordersLibMod.Tier.BUSINESS & String = js.native
    
    /* "PERSONAL" */ val PERSONAL: typings.paypalCheckoutServerSdk.ordersLibMod.Tier.PERSONAL & String = js.native
    
    /* "PREMIER" */ val PREMIER: typings.paypalCheckoutServerSdk.ordersLibMod.Tier.PREMIER & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.Usage")
  @js.native
  object Usage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.Usage & String] = js.native
    
    /* "DERIVED" */ val DERIVED: typings.paypalCheckoutServerSdk.ordersLibMod.Usage.DERIVED & String = js.native
    
    /* "FIRST" */ val FIRST: typings.paypalCheckoutServerSdk.ordersLibMod.Usage.FIRST & String = js.native
    
    /* "SUBSEQUENT" */ val SUBSEQUENT: typings.paypalCheckoutServerSdk.ordersLibMod.Usage.SUBSEQUENT & String = js.native
  }
  
  @JSImport("@paypal/checkout-server-sdk", "orders.business_type")
  @js.native
  object businessType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.paypalCheckoutServerSdk.ordersLibMod.businessType & String] = js.native
    
    /* "ANY_OTHER_BUSINESS_ENTITY" */ val ANY_OTHER_BUSINESS_ENTITY: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.ANY_OTHER_BUSINESS_ENTITY & String = js.native
    
    /* "ASSOCIATION" */ val ASSOCIATION: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.ASSOCIATION & String = js.native
    
    /* "CORPORATION" */ val CORPORATION: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.CORPORATION & String = js.native
    
    /* "GENERAL_PARTNERSHIP" */ val GENERAL_PARTNERSHIP: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.GENERAL_PARTNERSHIP & String = js.native
    
    /* "GOVERNMENT" */ val GOVERNMENT: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.GOVERNMENT & String = js.native
    
    /* "INDIVIDUAL" */ val INDIVIDUAL: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.INDIVIDUAL & String = js.native
    
    /* "LIMITED_LIABILITY_PARTNERSHIP" */ val LIMITED_LIABILITY_PARTNERSHIP: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.LIMITED_LIABILITY_PARTNERSHIP & String = js.native
    
    /* "LIMITED_LIABILITY_PRIVATE_CORPORATION" */ val LIMITED_LIABILITY_PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.LIMITED_LIABILITY_PRIVATE_CORPORATION & String = js.native
    
    /* "LIMITED_LIABILITY_PROPRIETORS" */ val LIMITED_LIABILITY_PROPRIETORS: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.LIMITED_LIABILITY_PROPRIETORS & String = js.native
    
    /* "LIMITED_PARTNERSHIP" */ val LIMITED_PARTNERSHIP: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.LIMITED_PARTNERSHIP & String = js.native
    
    /* "LIMITED_PARTNERSHIP_PRIVATE_CORPORATION" */ val LIMITED_PARTNERSHIP_PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.LIMITED_PARTNERSHIP_PRIVATE_CORPORATION & String = js.native
    
    /* "NONPROFIT" */ val NONPROFIT: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.NONPROFIT & String = js.native
    
    /* "ONLY_BUY_OR_SEND_MONEY" */ val ONLY_BUY_OR_SEND_MONEY: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.ONLY_BUY_OR_SEND_MONEY & String = js.native
    
    /* "OTHER_CORPORATE_BODY" */ val OTHER_CORPORATE_BODY: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.OTHER_CORPORATE_BODY & String = js.native
    
    /* "PARTNERSHIP" */ val PARTNERSHIP: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PARTNERSHIP & String = js.native
    
    /* "PRIVATE_CORPORATION" */ val PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PRIVATE_CORPORATION & String = js.native
    
    /* "PRIVATE_PARTNERSHIP" */ val PRIVATE_PARTNERSHIP: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PRIVATE_PARTNERSHIP & String = js.native
    
    /* "PROPRIETORSHIP" */ val PROPRIETORSHIP: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PROPRIETORSHIP & String = js.native
    
    /* "PROPRIETORSHIP_CRAFTSMAN" */ val PROPRIETORSHIP_CRAFTSMAN: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PROPRIETORSHIP_CRAFTSMAN & String = js.native
    
    /* "PROPRIETORY_COMPANY" */ val PROPRIETORY_COMPANY: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PROPRIETORY_COMPANY & String = js.native
    
    /* "PUBLIC_COMPANY" */ val PUBLIC_COMPANY: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PUBLIC_COMPANY & String = js.native
    
    /* "PUBLIC_CORPORATION" */ val PUBLIC_CORPORATION: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PUBLIC_CORPORATION & String = js.native
    
    /* "PUBLIC_PARTNERSHIP" */ val PUBLIC_PARTNERSHIP: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.PUBLIC_PARTNERSHIP & String = js.native
    
    /* "REGISTERED_COOPERATIVE" */ val REGISTERED_COOPERATIVE: typings.paypalCheckoutServerSdk.ordersLibMod.businessType.REGISTERED_COOPERATIVE & String = js.native
  }
}
