package typings
package mobxLib.mobxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "IDerivationState")
@js.native
object IDerivationState extends js.Object {
  /* -1 */ val NOT_TRACKING: mobxLib.libCoreDerivationMod.IDerivationState.NOT_TRACKING with scala.Double = js.native
  /* 1 */ val POSSIBLY_STALE: mobxLib.libCoreDerivationMod.IDerivationState.POSSIBLY_STALE with scala.Double = js.native
  /* 2 */ val STALE: mobxLib.libCoreDerivationMod.IDerivationState.STALE with scala.Double = js.native
  /* 0 */ val UP_TO_DATE: mobxLib.libCoreDerivationMod.IDerivationState.UP_TO_DATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mobxLib.libCoreDerivationMod.IDerivationState with scala.Double] = js.native
}

