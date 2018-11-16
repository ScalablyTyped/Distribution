package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("msportalfx-test/MsPortalTestFx", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait All
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LogLevel
  
  @js.native
  sealed trait Debug
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LogLevel
  
  @js.native
  sealed trait Info
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LogLevel
  
  @js.native
  sealed trait Off
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LogLevel
  
  @js.native
  sealed trait Severe
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LogLevel
  
  @js.native
  sealed trait Warning
    extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LogLevel
  
}

