package typings.mendixmodelsdk.versionChecksMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LifeCycleState extends js.Object
@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "LifeCycleState")
@js.native
object LifeCycleState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LifeCycleState with Double] = js.native
  
  @js.native
  sealed trait AVAILABLE extends LifeCycleState
  /* 1 */ @js.native
  object AVAILABLE extends TopLevel[AVAILABLE with Double]
  
  @js.native
  sealed trait REMOVED extends LifeCycleState
  /* 2 */ @js.native
  object REMOVED extends TopLevel[REMOVED with Double]
  
  @js.native
  sealed trait UNAVAILABLE extends LifeCycleState
  /* 0 */ @js.native
  object UNAVAILABLE extends TopLevel[UNAVAILABLE with Double]
}
