package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("msportalfx-test", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait All
    extends msportalfxDashTestLib.msportalfxDashTestMod.LogLevel
  
  @js.native
  sealed trait Debug
    extends msportalfxDashTestLib.msportalfxDashTestMod.LogLevel
  
  @js.native
  sealed trait Info
    extends msportalfxDashTestLib.msportalfxDashTestMod.LogLevel
  
  @js.native
  sealed trait Off
    extends msportalfxDashTestLib.msportalfxDashTestMod.LogLevel
  
  @js.native
  sealed trait Severe
    extends msportalfxDashTestLib.msportalfxDashTestMod.LogLevel
  
  @js.native
  sealed trait Warning
    extends msportalfxDashTestLib.msportalfxDashTestMod.LogLevel
  
  /* 0 */ val All: All with scala.Double = js.native
  /* 1 */ val Debug: Debug with scala.Double = js.native
  /* 2 */ val Info: Info with scala.Double = js.native
  /* 5 */ val Off: Off with scala.Double = js.native
  /* 4 */ val Severe: Severe with scala.Double = js.native
  /* 3 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[msportalfxDashTestLib.msportalfxDashTestMod.LogLevel with scala.Double] = js.native
}

