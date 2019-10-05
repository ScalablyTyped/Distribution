package typings.ngDashCordova.ngCordova

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
  
  /* 4 */ val DeviceDefaultDark: typings.ngDashCordova.ngCordova.AndroidTheme.DeviceDefaultDark with Double = js.native
  /* 5 */ val DeviceDefaultLight: typings.ngDashCordova.ngCordova.AndroidTheme.DeviceDefaultLight with Double = js.native
  /* 2 */ val HoloDark: typings.ngDashCordova.ngCordova.AndroidTheme.HoloDark with Double = js.native
  /* 3 */ val HoloLight: typings.ngDashCordova.ngCordova.AndroidTheme.HoloLight with Double = js.native
  /* 1 */ val Traditional: typings.ngDashCordova.ngCordova.AndroidTheme.Traditional with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AndroidTheme with Double] = js.native
}

