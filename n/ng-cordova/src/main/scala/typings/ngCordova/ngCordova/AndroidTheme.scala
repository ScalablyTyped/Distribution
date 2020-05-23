package typings.ngCordova.ngCordova

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
  
}

