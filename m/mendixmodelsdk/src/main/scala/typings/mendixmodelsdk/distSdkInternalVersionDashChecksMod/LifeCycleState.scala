package typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LifeCycleState extends js.Object

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "LifeCycleState")
@js.native
object LifeCycleState extends js.Object {
  @js.native
  sealed trait AVAILABLE extends LifeCycleState
  
  @js.native
  sealed trait REMOVED extends LifeCycleState
  
  @js.native
  sealed trait UNAVAILABLE extends LifeCycleState
  
  /* 1 */ val AVAILABLE: typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.LifeCycleState.AVAILABLE with Double = js.native
  /* 2 */ val REMOVED: typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.LifeCycleState.REMOVED with Double = js.native
  /* 0 */ val UNAVAILABLE: typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.LifeCycleState.UNAVAILABLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LifeCycleState with Double] = js.native
}

