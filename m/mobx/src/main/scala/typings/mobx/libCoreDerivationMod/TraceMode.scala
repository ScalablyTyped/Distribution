package typings.mobx.libCoreDerivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraceMode extends js.Object

@JSImport("mobx/lib/core/derivation", "TraceMode")
@js.native
object TraceMode extends js.Object {
  @js.native
  sealed trait BREAK extends TraceMode
  
  @js.native
  sealed trait LOG extends TraceMode
  
  @js.native
  sealed trait NONE extends TraceMode
  
  /* 2 */ val BREAK: typings.mobx.libCoreDerivationMod.TraceMode.BREAK with Double = js.native
  /* 1 */ val LOG: typings.mobx.libCoreDerivationMod.TraceMode.LOG with Double = js.native
  /* 0 */ val NONE: typings.mobx.libCoreDerivationMod.TraceMode.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraceMode with Double] = js.native
}

