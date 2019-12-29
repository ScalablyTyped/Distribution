package typings.mobx.libCoreDerivationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IDerivationState extends js.Object

@JSImport("mobx/lib/core/derivation", "IDerivationState")
@js.native
object IDerivationState extends js.Object {
  @js.native
  sealed trait NOT_TRACKING extends IDerivationState
  
  @js.native
  sealed trait POSSIBLY_STALE extends IDerivationState
  
  @js.native
  sealed trait STALE extends IDerivationState
  
  @js.native
  sealed trait UP_TO_DATE extends IDerivationState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IDerivationState with Double] = js.native
  /* -1 */ @js.native
  object NOT_TRACKING extends TopLevel[NOT_TRACKING with Double]
  
  /* 1 */ @js.native
  object POSSIBLY_STALE extends TopLevel[POSSIBLY_STALE with Double]
  
  /* 2 */ @js.native
  object STALE extends TopLevel[STALE with Double]
  
  /* 0 */ @js.native
  object UP_TO_DATE extends TopLevel[UP_TO_DATE with Double]
  
}

