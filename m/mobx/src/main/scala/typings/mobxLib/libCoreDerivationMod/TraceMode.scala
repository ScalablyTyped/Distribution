package typings
package mobxLib.libCoreDerivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraceMode extends js.Object

@JSImport("mobx/lib/core/derivation", "TraceMode")
@js.native
object TraceMode extends js.Object {
  @js.native
  sealed trait BREAK
    extends mobxLib.libCoreDerivationMod.TraceMode
  
  @js.native
  sealed trait LOG
    extends mobxLib.libCoreDerivationMod.TraceMode
  
  @js.native
  sealed trait NONE
    extends mobxLib.libCoreDerivationMod.TraceMode
  
  /* 2 */ val BREAK: BREAK with scala.Double = js.native
  /* 1 */ val LOG: LOG with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mobxLib.libCoreDerivationMod.TraceMode with scala.Double] = js.native
}

