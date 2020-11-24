package typings.mobx.internalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "IDerivationState")
@js.native
object IDerivationState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.mobx.derivationMod.IDerivationState with Double] = js.native
  
  /* -1 */ val NOT_TRACKING: typings.mobx.derivationMod.IDerivationState.NOT_TRACKING with Double = js.native
  
  /* 1 */ val POSSIBLY_STALE: typings.mobx.derivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
  
  /* 2 */ val STALE: typings.mobx.derivationMod.IDerivationState.STALE with Double = js.native
  
  /* 0 */ val UP_TO_DATE: typings.mobx.derivationMod.IDerivationState.UP_TO_DATE with Double = js.native
}
