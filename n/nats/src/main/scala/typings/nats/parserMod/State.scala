package typings.nats.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends StObject
@JSImport("nats/lib/nats-base-client/parser", "State")
@js.native
object State extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State & Double] = js.native
  
  @js.native
  sealed trait INFO_ARG
    extends StObject
       with State
  /* 30 */ val INFO_ARG: typings.nats.parserMod.State.INFO_ARG & Double = js.native
  
  @js.native
  sealed trait MINUS_ERR_ARG
    extends StObject
       with State
  /* 9 */ val MINUS_ERR_ARG: typings.nats.parserMod.State.MINUS_ERR_ARG & Double = js.native
  
  @js.native
  sealed trait MSG_ARG
    extends StObject
       with State
  /* 14 */ val MSG_ARG: typings.nats.parserMod.State.MSG_ARG & Double = js.native
  
  @js.native
  sealed trait MSG_END
    extends StObject
       with State
  /* 16 */ val MSG_END: typings.nats.parserMod.State.MSG_END & Double = js.native
  
  @js.native
  sealed trait MSG_PAYLOAD
    extends StObject
       with State
  /* 15 */ val MSG_PAYLOAD: typings.nats.parserMod.State.MSG_PAYLOAD & Double = js.native
  
  @js.native
  sealed trait OP_H
    extends StObject
       with State
  /* 17 */ val OP_H: typings.nats.parserMod.State.OP_H & Double = js.native
  
  @js.native
  sealed trait OP_I
    extends StObject
       with State
  /* 25 */ val OP_I: typings.nats.parserMod.State.OP_I & Double = js.native
  
  @js.native
  sealed trait OP_IN
    extends StObject
       with State
  /* 26 */ val OP_IN: typings.nats.parserMod.State.OP_IN & Double = js.native
  
  @js.native
  sealed trait OP_INF
    extends StObject
       with State
  /* 27 */ val OP_INF: typings.nats.parserMod.State.OP_INF & Double = js.native
  
  @js.native
  sealed trait OP_INFO
    extends StObject
       with State
  /* 28 */ val OP_INFO: typings.nats.parserMod.State.OP_INFO & Double = js.native
  
  @js.native
  sealed trait OP_INFO_SPC
    extends StObject
       with State
  /* 29 */ val OP_INFO_SPC: typings.nats.parserMod.State.OP_INFO_SPC & Double = js.native
  
  @js.native
  sealed trait OP_M
    extends StObject
       with State
  /* 10 */ val OP_M: typings.nats.parserMod.State.OP_M & Double = js.native
  
  @js.native
  sealed trait OP_MINUS
    extends StObject
       with State
  /* 4 */ val OP_MINUS: typings.nats.parserMod.State.OP_MINUS & Double = js.native
  
  @js.native
  sealed trait OP_MINUS_E
    extends StObject
       with State
  /* 5 */ val OP_MINUS_E: typings.nats.parserMod.State.OP_MINUS_E & Double = js.native
  
  @js.native
  sealed trait OP_MINUS_ER
    extends StObject
       with State
  /* 6 */ val OP_MINUS_ER: typings.nats.parserMod.State.OP_MINUS_ER & Double = js.native
  
  @js.native
  sealed trait OP_MINUS_ERR
    extends StObject
       with State
  /* 7 */ val OP_MINUS_ERR: typings.nats.parserMod.State.OP_MINUS_ERR & Double = js.native
  
  @js.native
  sealed trait OP_MINUS_ERR_SPC
    extends StObject
       with State
  /* 8 */ val OP_MINUS_ERR_SPC: typings.nats.parserMod.State.OP_MINUS_ERR_SPC & Double = js.native
  
  @js.native
  sealed trait OP_MS
    extends StObject
       with State
  /* 11 */ val OP_MS: typings.nats.parserMod.State.OP_MS & Double = js.native
  
  @js.native
  sealed trait OP_MSG
    extends StObject
       with State
  /* 12 */ val OP_MSG: typings.nats.parserMod.State.OP_MSG & Double = js.native
  
  @js.native
  sealed trait OP_MSG_SPC
    extends StObject
       with State
  /* 13 */ val OP_MSG_SPC: typings.nats.parserMod.State.OP_MSG_SPC & Double = js.native
  
  @js.native
  sealed trait OP_P
    extends StObject
       with State
  /* 18 */ val OP_P: typings.nats.parserMod.State.OP_P & Double = js.native
  
  @js.native
  sealed trait OP_PI
    extends StObject
       with State
  /* 19 */ val OP_PI: typings.nats.parserMod.State.OP_PI & Double = js.native
  
  @js.native
  sealed trait OP_PIN
    extends StObject
       with State
  /* 20 */ val OP_PIN: typings.nats.parserMod.State.OP_PIN & Double = js.native
  
  @js.native
  sealed trait OP_PING
    extends StObject
       with State
  /* 21 */ val OP_PING: typings.nats.parserMod.State.OP_PING & Double = js.native
  
  @js.native
  sealed trait OP_PLUS
    extends StObject
       with State
  /* 1 */ val OP_PLUS: typings.nats.parserMod.State.OP_PLUS & Double = js.native
  
  @js.native
  sealed trait OP_PLUS_O
    extends StObject
       with State
  /* 2 */ val OP_PLUS_O: typings.nats.parserMod.State.OP_PLUS_O & Double = js.native
  
  @js.native
  sealed trait OP_PLUS_OK
    extends StObject
       with State
  /* 3 */ val OP_PLUS_OK: typings.nats.parserMod.State.OP_PLUS_OK & Double = js.native
  
  @js.native
  sealed trait OP_PO
    extends StObject
       with State
  /* 22 */ val OP_PO: typings.nats.parserMod.State.OP_PO & Double = js.native
  
  @js.native
  sealed trait OP_PON
    extends StObject
       with State
  /* 23 */ val OP_PON: typings.nats.parserMod.State.OP_PON & Double = js.native
  
  @js.native
  sealed trait OP_PONG
    extends StObject
       with State
  /* 24 */ val OP_PONG: typings.nats.parserMod.State.OP_PONG & Double = js.native
  
  @js.native
  sealed trait OP_START
    extends StObject
       with State
  /* 0 */ val OP_START: typings.nats.parserMod.State.OP_START & Double = js.native
}
