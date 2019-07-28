package typings.ngDashCordova.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AndroidTheme extends js.Object

@JSGlobal("ngCordova.AndroidTheme")
@js.native
object AndroidTheme extends js.Object {
  @js.native
  sealed trait DeviceDefaultDark extends AndroidTheme
  
  @js.native
  sealed trait DeviceDefaultLight extends AndroidTheme
  
  @js.native
  sealed trait HoloDark extends AndroidTheme
  
  @js.native
  sealed trait HoloLight extends AndroidTheme
  
  @js.native
  sealed trait Traditional extends AndroidTheme
  
  /* 4 */ val DeviceDefaultDark: typings.ngDashCordova.ngCordovaNs.AndroidTheme.DeviceDefaultDark with Double = js.native
  /* 5 */ val DeviceDefaultLight: typings.ngDashCordova.ngCordovaNs.AndroidTheme.DeviceDefaultLight with Double = js.native
  /* 2 */ val HoloDark: typings.ngDashCordova.ngCordovaNs.AndroidTheme.HoloDark with Double = js.native
  /* 3 */ val HoloLight: typings.ngDashCordova.ngCordovaNs.AndroidTheme.HoloLight with Double = js.native
  /* 1 */ val Traditional: typings.ngDashCordova.ngCordovaNs.AndroidTheme.Traditional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AndroidTheme with Double] = js.native
}

