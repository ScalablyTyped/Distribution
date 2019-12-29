package typings.mobx.libCoreDerivationMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraceMode with Double] = js.native
  /* 2 */ @js.native
  object BREAK extends TopLevel[BREAK with Double]
  
  /* 1 */ @js.native
  object LOG extends TopLevel[LOG with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
}

