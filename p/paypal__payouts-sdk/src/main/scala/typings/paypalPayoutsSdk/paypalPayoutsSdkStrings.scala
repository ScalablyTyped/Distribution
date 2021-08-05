package typings.paypalPayoutsSdk

import typings.paypalPayoutsSdk.mod.RecipientType
import typings.paypalPayoutsSdk.mod.RecipientWallet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paypalPayoutsSdkStrings {
  
  @js.native
  sealed trait BALANCE extends StObject
  inline def BALANCE: BALANCE = "BALANCE".asInstanceOf[BALANCE]
  
  @js.native
  sealed trait BLOCKED extends StObject
  inline def BLOCKED: BLOCKED = "BLOCKED".asInstanceOf[BLOCKED]
  
  @js.native
  sealed trait CANCELED extends StObject
  inline def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  
  @js.native
  sealed trait CONNECT extends StObject
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DENIED extends StObject
  inline def DENIED: DENIED = "DENIED".asInstanceOf[DENIED]
  
  @js.native
  sealed trait EMAIL
    extends StObject
       with RecipientType
  inline def EMAIL: EMAIL = "EMAIL".asInstanceOf[EMAIL]
  
  @js.native
  sealed trait FAILED extends StObject
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD extends StObject
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait ONHOLD extends StObject
  inline def ONHOLD: ONHOLD = "ONHOLD".asInstanceOf[ONHOLD]
  
  @js.native
  sealed trait OPTIONS extends StObject
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH extends StObject
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait PAYPAL
    extends StObject
       with RecipientWallet
  inline def PAYPAL: PAYPAL = "PAYPAL".asInstanceOf[PAYPAL]
  
  @js.native
  sealed trait PAYPAL_ID
    extends StObject
       with RecipientType
  inline def PAYPAL_ID: PAYPAL_ID = "PAYPAL_ID".asInstanceOf[PAYPAL_ID]
  
  @js.native
  sealed trait PENDING extends StObject
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait PHONE
    extends StObject
       with RecipientType
  inline def PHONE: PHONE = "PHONE".asInstanceOf[PHONE]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PROCESSING extends StObject
  inline def PROCESSING: PROCESSING = "PROCESSING".asInstanceOf[PROCESSING]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait REFUNDED extends StObject
  inline def REFUNDED: REFUNDED = "REFUNDED".asInstanceOf[REFUNDED]
  
  @js.native
  sealed trait RETURNED extends StObject
  inline def RETURNED: RETURNED = "RETURNED".asInstanceOf[RETURNED]
  
  @js.native
  sealed trait REVERSED extends StObject
  inline def REVERSED: REVERSED = "REVERSED".asInstanceOf[REVERSED]
  
  @js.native
  sealed trait SUCCESS extends StObject
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait UNCLAIMED extends StObject
  inline def UNCLAIMED: UNCLAIMED = "UNCLAIMED".asInstanceOf[UNCLAIMED]
  
  @js.native
  sealed trait VENMO
    extends StObject
       with RecipientWallet
  inline def VENMO: VENMO = "VENMO".asInstanceOf[VENMO]
}
