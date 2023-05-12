package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaymentOption extends StObject
@JSGlobal("bricks.PaymentOption")
@js.native
object PaymentOption extends StObject {
  
  @js.native
  sealed trait BANK_TRANSFER_FORM
    extends StObject
       with PaymentOption
  
  @js.native
  sealed trait CREDIT_CARD_FORM
    extends StObject
       with PaymentOption
  
  @js.native
  sealed trait DEBIT_CARD_FORM
    extends StObject
       with PaymentOption
  
  @js.native
  sealed trait MERCADO_PAGO_FORM
    extends StObject
       with PaymentOption
  
  @js.native
  sealed trait ONBOARDING_CREDITS_FORM
    extends StObject
       with PaymentOption
  
  @js.native
  sealed trait SAVED_CARD_FORM
    extends StObject
       with PaymentOption
  
  @js.native
  sealed trait TICKET_FORM
    extends StObject
       with PaymentOption
}
