package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelEnumsParticipantType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "ModelEnumsParticipantType")
@js.native
object ModelEnumsParticipantType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModelEnumsParticipantType & String] = js.native
  
  @js.native
  sealed trait FACILITATOR
    extends StObject
       with ModelEnumsParticipantType
  /* "FACILITATOR" */ val FACILITATOR: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.FACILITATOR & String = js.native
  
  @js.native
  sealed trait RECEIVER
    extends StObject
       with ModelEnumsParticipantType
  /* "RECEIVER" */ val RECEIVER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.RECEIVER & String = js.native
  
  @js.native
  sealed trait SENDER
    extends StObject
       with ModelEnumsParticipantType
  /* "SENDER" */ val SENDER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsParticipantType.SENDER & String = js.native
}
