package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AndroidTheme with Double] = js.native
  /* 4 */ @js.native
  object DeviceDefaultDark extends TopLevel[DeviceDefaultDark with Double]
  
  /* 5 */ @js.native
  object DeviceDefaultLight extends TopLevel[DeviceDefaultLight with Double]
  
  /* 2 */ @js.native
  object HoloDark extends TopLevel[HoloDark with Double]
  
  /* 3 */ @js.native
  object HoloLight extends TopLevel[HoloLight with Double]
  
  /* 1 */ @js.native
  object Traditional extends TopLevel[Traditional with Double]
  
}

