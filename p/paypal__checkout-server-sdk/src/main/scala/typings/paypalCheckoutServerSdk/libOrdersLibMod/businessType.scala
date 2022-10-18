package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait businessType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "business_type")
@js.native
object businessType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[businessType & String] = js.native
  
  @js.native
  sealed trait ANY_OTHER_BUSINESS_ENTITY
    extends StObject
       with businessType
  /* "ANY_OTHER_BUSINESS_ENTITY" */ val ANY_OTHER_BUSINESS_ENTITY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ANY_OTHER_BUSINESS_ENTITY & String = js.native
  
  @js.native
  sealed trait ASSOCIATION
    extends StObject
       with businessType
  /* "ASSOCIATION" */ val ASSOCIATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ASSOCIATION & String = js.native
  
  @js.native
  sealed trait CORPORATION
    extends StObject
       with businessType
  /* "CORPORATION" */ val CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.CORPORATION & String = js.native
  
  @js.native
  sealed trait GENERAL_PARTNERSHIP
    extends StObject
       with businessType
  /* "GENERAL_PARTNERSHIP" */ val GENERAL_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.GENERAL_PARTNERSHIP & String = js.native
  
  @js.native
  sealed trait GOVERNMENT
    extends StObject
       with businessType
  /* "GOVERNMENT" */ val GOVERNMENT: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.GOVERNMENT & String = js.native
  
  @js.native
  sealed trait INDIVIDUAL
    extends StObject
       with businessType
  /* "INDIVIDUAL" */ val INDIVIDUAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.INDIVIDUAL & String = js.native
  
  @js.native
  sealed trait LIMITED_LIABILITY_PARTNERSHIP
    extends StObject
       with businessType
  /* "LIMITED_LIABILITY_PARTNERSHIP" */ val LIMITED_LIABILITY_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PARTNERSHIP & String = js.native
  
  @js.native
  sealed trait LIMITED_LIABILITY_PRIVATE_CORPORATION
    extends StObject
       with businessType
  /* "LIMITED_LIABILITY_PRIVATE_CORPORATION" */ val LIMITED_LIABILITY_PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PRIVATE_CORPORATION & String = js.native
  
  @js.native
  sealed trait LIMITED_LIABILITY_PROPRIETORS
    extends StObject
       with businessType
  /* "LIMITED_LIABILITY_PROPRIETORS" */ val LIMITED_LIABILITY_PROPRIETORS: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_LIABILITY_PROPRIETORS & String = js.native
  
  @js.native
  sealed trait LIMITED_PARTNERSHIP
    extends StObject
       with businessType
  /* "LIMITED_PARTNERSHIP" */ val LIMITED_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_PARTNERSHIP & String = js.native
  
  @js.native
  sealed trait LIMITED_PARTNERSHIP_PRIVATE_CORPORATION
    extends StObject
       with businessType
  /* "LIMITED_PARTNERSHIP_PRIVATE_CORPORATION" */ val LIMITED_PARTNERSHIP_PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.LIMITED_PARTNERSHIP_PRIVATE_CORPORATION & String = js.native
  
  @js.native
  sealed trait NONPROFIT
    extends StObject
       with businessType
  /* "NONPROFIT" */ val NONPROFIT: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.NONPROFIT & String = js.native
  
  @js.native
  sealed trait ONLY_BUY_OR_SEND_MONEY
    extends StObject
       with businessType
  /* "ONLY_BUY_OR_SEND_MONEY" */ val ONLY_BUY_OR_SEND_MONEY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.ONLY_BUY_OR_SEND_MONEY & String = js.native
  
  @js.native
  sealed trait OTHER_CORPORATE_BODY
    extends StObject
       with businessType
  /* "OTHER_CORPORATE_BODY" */ val OTHER_CORPORATE_BODY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.OTHER_CORPORATE_BODY & String = js.native
  
  @js.native
  sealed trait PARTNERSHIP
    extends StObject
       with businessType
  /* "PARTNERSHIP" */ val PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PARTNERSHIP & String = js.native
  
  @js.native
  sealed trait PRIVATE_CORPORATION
    extends StObject
       with businessType
  /* "PRIVATE_CORPORATION" */ val PRIVATE_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PRIVATE_CORPORATION & String = js.native
  
  @js.native
  sealed trait PRIVATE_PARTNERSHIP
    extends StObject
       with businessType
  /* "PRIVATE_PARTNERSHIP" */ val PRIVATE_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PRIVATE_PARTNERSHIP & String = js.native
  
  @js.native
  sealed trait PROPRIETORSHIP
    extends StObject
       with businessType
  /* "PROPRIETORSHIP" */ val PROPRIETORSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORSHIP & String = js.native
  
  @js.native
  sealed trait PROPRIETORSHIP_CRAFTSMAN
    extends StObject
       with businessType
  /* "PROPRIETORSHIP_CRAFTSMAN" */ val PROPRIETORSHIP_CRAFTSMAN: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORSHIP_CRAFTSMAN & String = js.native
  
  @js.native
  sealed trait PROPRIETORY_COMPANY
    extends StObject
       with businessType
  /* "PROPRIETORY_COMPANY" */ val PROPRIETORY_COMPANY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PROPRIETORY_COMPANY & String = js.native
  
  @js.native
  sealed trait PUBLIC_COMPANY
    extends StObject
       with businessType
  /* "PUBLIC_COMPANY" */ val PUBLIC_COMPANY: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_COMPANY & String = js.native
  
  @js.native
  sealed trait PUBLIC_CORPORATION
    extends StObject
       with businessType
  /* "PUBLIC_CORPORATION" */ val PUBLIC_CORPORATION: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_CORPORATION & String = js.native
  
  @js.native
  sealed trait PUBLIC_PARTNERSHIP
    extends StObject
       with businessType
  /* "PUBLIC_PARTNERSHIP" */ val PUBLIC_PARTNERSHIP: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.PUBLIC_PARTNERSHIP & String = js.native
  
  @js.native
  sealed trait REGISTERED_COOPERATIVE
    extends StObject
       with businessType
  /* "REGISTERED_COOPERATIVE" */ val REGISTERED_COOPERATIVE: typings.paypalCheckoutServerSdk.libOrdersLibMod.businessType.REGISTERED_COOPERATIVE & String = js.native
}
