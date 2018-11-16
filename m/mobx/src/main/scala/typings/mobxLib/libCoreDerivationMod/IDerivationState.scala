package typings
package mobxLib.libCoreDerivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IDerivationState extends js.Object

@JSImport("mobx/lib/core/derivation", "IDerivationState")
@js.native
object IDerivationState extends js.Object {
  @js.native
  sealed trait NOT_TRACKING
    extends mobxLib.libCoreDerivationMod.IDerivationState
  
  @js.native
  sealed trait POSSIBLY_STALE
    extends mobxLib.libCoreDerivationMod.IDerivationState
  
  @js.native
  sealed trait STALE
    extends mobxLib.libCoreDerivationMod.IDerivationState
  
  @js.native
  sealed trait UP_TO_DATE
    extends mobxLib.libCoreDerivationMod.IDerivationState
  
  /* -1 */ val NOT_TRACKING: NOT_TRACKING with scala.Double = js.native
  /* 1 */ val POSSIBLY_STALE: POSSIBLY_STALE with scala.Double = js.native
  /* 2 */ val STALE: STALE with scala.Double = js.native
  /* 0 */ val UP_TO_DATE: UP_TO_DATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mobxLib.libCoreDerivationMod.IDerivationState with scala.Double] = js.native
}

