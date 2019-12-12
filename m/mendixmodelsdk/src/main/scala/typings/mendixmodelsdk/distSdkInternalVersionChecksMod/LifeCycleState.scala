package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import org.scalablytyped.runtime.TopLevel
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.LifeCycleState.AVAILABLE
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.LifeCycleState.REMOVED
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.LifeCycleState.UNAVAILABLE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LifeCycleState with Double] = js.native
  /* 1 */ @js.native
  object AVAILABLE extends TopLevel[AVAILABLE with Double]
  
  /* 2 */ @js.native
  object REMOVED extends TopLevel[REMOVED with Double]
  
  /* 0 */ @js.native
  object UNAVAILABLE extends TopLevel[UNAVAILABLE with Double]
  
}

