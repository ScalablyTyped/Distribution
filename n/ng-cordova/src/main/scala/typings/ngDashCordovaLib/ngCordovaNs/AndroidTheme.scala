package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AndroidTheme extends js.Object

@JSGlobal("ngCordova.AndroidTheme")
@js.native
object AndroidTheme extends js.Object {
  @js.native
  sealed trait DeviceDefaultDark
    extends ngDashCordovaLib.ngCordovaNs.AndroidTheme
  
  @js.native
  sealed trait DeviceDefaultLight
    extends ngDashCordovaLib.ngCordovaNs.AndroidTheme
  
  @js.native
  sealed trait HoloDark
    extends ngDashCordovaLib.ngCordovaNs.AndroidTheme
  
  @js.native
  sealed trait HoloLight
    extends ngDashCordovaLib.ngCordovaNs.AndroidTheme
  
  @js.native
  sealed trait Traditional
    extends ngDashCordovaLib.ngCordovaNs.AndroidTheme
  
  /* 4 */ val DeviceDefaultDark: DeviceDefaultDark with scala.Double = js.native
  /* 5 */ val DeviceDefaultLight: DeviceDefaultLight with scala.Double = js.native
  /* 2 */ val HoloDark: HoloDark with scala.Double = js.native
  /* 3 */ val HoloLight: HoloLight with scala.Double = js.native
  /* 1 */ val Traditional: Traditional with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ngDashCordovaLib.ngCordovaNs.AndroidTheme with scala.Double] = js.native
}

