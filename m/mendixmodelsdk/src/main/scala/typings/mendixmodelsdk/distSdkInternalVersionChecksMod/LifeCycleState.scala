package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LifeCycleState extends js.Object

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "LifeCycleState")
@js.native
object LifeCycleState extends js.Object {
  @js.native
  sealed trait AVAILABLE extends LifeCycleState
  
  @js.native
  sealed trait REMOVED extends LifeCycleState
  
  @js.native
  sealed trait UNAVAILABLE extends LifeCycleState
  
  /* 1 */ val AVAILABLE: typings.mendixmodelsdk.distSdkInternalVersionChecksMod.LifeCycleState.AVAILABLE with Double = js.native
  /* 2 */ val REMOVED: typings.mendixmodelsdk.distSdkInternalVersionChecksMod.LifeCycleState.REMOVED with Double = js.native
  /* 0 */ val UNAVAILABLE: typings.mendixmodelsdk.distSdkInternalVersionChecksMod.LifeCycleState.UNAVAILABLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LifeCycleState with Double] = js.native
}

