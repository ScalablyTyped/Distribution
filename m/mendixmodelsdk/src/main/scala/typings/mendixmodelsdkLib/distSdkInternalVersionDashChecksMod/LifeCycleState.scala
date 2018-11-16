package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LifeCycleState extends js.Object

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "LifeCycleState")
@js.native
object LifeCycleState extends js.Object {
  @js.native
  sealed trait AVAILABLE
    extends mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.LifeCycleState
  
  @js.native
  sealed trait REMOVED
    extends mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.LifeCycleState
  
  @js.native
  sealed trait UNAVAILABLE
    extends mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.LifeCycleState
  
  /* 1 */ val AVAILABLE: AVAILABLE with scala.Double = js.native
  /* 2 */ val REMOVED: REMOVED with scala.Double = js.native
  /* 0 */ val UNAVAILABLE: UNAVAILABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.LifeCycleState with scala.Double
  ] = js.native
}

