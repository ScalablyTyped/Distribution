package typings.msportalfxDashTest.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("msportalfx-test", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait All extends LogLevel
  
  @js.native
  sealed trait Debug extends LogLevel
  
  @js.native
  sealed trait Info extends LogLevel
  
  @js.native
  sealed trait Off extends LogLevel
  
  @js.native
  sealed trait Severe extends LogLevel
  
  @js.native
  sealed trait Warning extends LogLevel
  
  /* 0 */ val All: typings.msportalfxDashTest.msportalfxDashTestMod.LogLevel.All with Double = js.native
  /* 1 */ val Debug: typings.msportalfxDashTest.msportalfxDashTestMod.LogLevel.Debug with Double = js.native
  /* 2 */ val Info: typings.msportalfxDashTest.msportalfxDashTestMod.LogLevel.Info with Double = js.native
  /* 5 */ val Off: typings.msportalfxDashTest.msportalfxDashTestMod.LogLevel.Off with Double = js.native
  /* 4 */ val Severe: typings.msportalfxDashTest.msportalfxDashTestMod.LogLevel.Severe with Double = js.native
  /* 3 */ val Warning: typings.msportalfxDashTest.msportalfxDashTestMod.LogLevel.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
}

