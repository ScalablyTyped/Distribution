package typings.nats.parserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Kind extends StObject
@JSImport("nats/lib/nats-base-client/parser", "Kind")
@js.native
object Kind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Kind & Double] = js.native
  
  @js.native
  sealed trait ERR
    extends StObject
       with Kind
  /* 1 */ val ERR: typings.nats.parserMod.Kind.ERR & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with Kind
  /* 3 */ val INFO: typings.nats.parserMod.Kind.INFO & Double = js.native
  
  @js.native
  sealed trait MSG
    extends StObject
       with Kind
  /* 2 */ val MSG: typings.nats.parserMod.Kind.MSG & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with Kind
  /* 0 */ val OK: typings.nats.parserMod.Kind.OK & Double = js.native
  
  @js.native
  sealed trait PING
    extends StObject
       with Kind
  /* 4 */ val PING: typings.nats.parserMod.Kind.PING & Double = js.native
  
  @js.native
  sealed trait PONG
    extends StObject
       with Kind
  /* 5 */ val PONG: typings.nats.parserMod.Kind.PONG & Double = js.native
}
