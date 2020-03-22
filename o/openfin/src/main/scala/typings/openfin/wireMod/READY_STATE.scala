package typings.openfin.wireMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait READY_STATE extends js.Object

@JSImport("openfin/_v2/transport/wire", "READY_STATE")
@js.native
object READY_STATE extends js.Object {
  @js.native
  sealed trait CLOSED extends READY_STATE
  
  @js.native
  sealed trait CLOSING extends READY_STATE
  
  @js.native
  sealed trait CONNECTING extends READY_STATE
  
  @js.native
  sealed trait OPEN extends READY_STATE
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[READY_STATE with Double] = js.native
  /* 3 */ @js.native
  object CLOSED extends TopLevel[CLOSED with Double]
  
  /* 2 */ @js.native
  object CLOSING extends TopLevel[CLOSING with Double]
  
  /* 0 */ @js.native
  object CONNECTING extends TopLevel[CONNECTING with Double]
  
  /* 1 */ @js.native
  object OPEN extends TopLevel[OPEN with Double]
  
}

