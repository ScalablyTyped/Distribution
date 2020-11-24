package typings.mobx.derivationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TraceMode extends js.Object
@JSImport("mobx/lib/core/derivation", "TraceMode")
@js.native
object TraceMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraceMode with Double] = js.native
  
  @js.native
  sealed trait BREAK extends TraceMode
  /* 2 */ @js.native
  object BREAK extends TopLevel[BREAK with Double]
  
  @js.native
  sealed trait LOG extends TraceMode
  /* 1 */ @js.native
  object LOG extends TopLevel[LOG with Double]
  
  @js.native
  sealed trait NONE extends TraceMode
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
}
