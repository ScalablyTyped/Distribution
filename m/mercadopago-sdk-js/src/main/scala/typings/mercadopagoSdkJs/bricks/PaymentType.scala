package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaymentType extends StObject
@JSGlobal("bricks.PaymentType")
@js.native
object PaymentType extends StObject {
  
  @js.native
  sealed trait ATM
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait ATM_ONLINE
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait BANK_TRANSFER
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait CREDIT_CARD
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait DEBIT_CARD
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait ICKET
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait NONE
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait ONBOARDING_CREDITS
    extends StObject
       with PaymentType
  
  @js.native
  sealed trait WALLET_PURCHASE
    extends StObject
       with PaymentType
}
