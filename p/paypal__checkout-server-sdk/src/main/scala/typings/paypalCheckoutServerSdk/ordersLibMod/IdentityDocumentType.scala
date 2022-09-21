package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IdentityDocumentType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "IdentityDocumentType")
@js.native
object IdentityDocumentType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IdentityDocumentType & String] = js.native
  
  @js.native
  sealed trait INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER
    extends StObject
       with IdentityDocumentType
  /* "INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER" */ val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER & String = js.native
  
  @js.native
  sealed trait NATIONAL_IDENTIFICATION_NUMBER
    extends StObject
       with IdentityDocumentType
  /* "NATIONAL_IDENTIFICATION_NUMBER" */ val NATIONAL_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.NATIONAL_IDENTIFICATION_NUMBER & String = js.native
  
  @js.native
  sealed trait PASSPORT_NUMBER
    extends StObject
       with IdentityDocumentType
  /* "PASSPORT_NUMBER" */ val PASSPORT_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.PASSPORT_NUMBER & String = js.native
  
  @js.native
  sealed trait SOCIAL_SECURITY_NUMBER
    extends StObject
       with IdentityDocumentType
  /* "SOCIAL_SECURITY_NUMBER" */ val SOCIAL_SECURITY_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.SOCIAL_SECURITY_NUMBER & String = js.native
  
  @js.native
  sealed trait SSN4
    extends StObject
       with IdentityDocumentType
  /* "SSN4" */ val SSN4: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.SSN4 & String = js.native
  
  @js.native
  sealed trait TAX_IDENTIFICATION_NUMBER
    extends StObject
       with IdentityDocumentType
  /* "TAX_IDENTIFICATION_NUMBER" */ val TAX_IDENTIFICATION_NUMBER: typings.paypalCheckoutServerSdk.ordersLibMod.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER & String = js.native
}
