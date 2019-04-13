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
  
  val All: All with java.lang.String = js.native
  val Debug: Debug with java.lang.String = js.native
  val Info: Info with java.lang.String = js.native
  val Off: Off with java.lang.String = js.native
  val Severe: Severe with java.lang.String = js.native
  val Warning: Warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[msportalfxDashTestLib.msportalfxDashTestMod.LogLevel with java.lang.String] = js.native
}

