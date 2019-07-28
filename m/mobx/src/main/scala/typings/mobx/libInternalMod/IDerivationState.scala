package typings.mobx.libInternalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "IDerivationState")
@js.native
object IDerivationState extends js.Object {
  /* -1 */ val NOT_TRACKING: typings.mobx.libCoreDerivationMod.IDerivationState.NOT_TRACKING with Double = js.native
  /* 1 */ val POSSIBLY_STALE: typings.mobx.libCoreDerivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
  /* 2 */ val STALE: typings.mobx.libCoreDerivationMod.IDerivationState.STALE with Double = js.native
  /* 0 */ val UP_TO_DATE: typings.mobx.libCoreDerivationMod.IDerivationState.UP_TO_DATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.mobx.libCoreDerivationMod.IDerivationState with Double] = js.native
}

