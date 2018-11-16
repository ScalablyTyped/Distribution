package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/color/colors", JSImport.Namespace)
@js.native
object libUtilitiesColorColorsModMembers extends js.Object {
  val MAX_COLOR_HUE: /* 359 */ scala.Double = js.native
  val MAX_COLOR_RGBA: /* 255 */ scala.Double = js.native
  val MAX_COLOR_SATURATION: /* 100 */ scala.Double = js.native
  val MAX_COLOR_VALUE: /* 100 */ scala.Double = js.native
  def cssColor(color: java.lang.String): js.UndefOr[IRGB] = js.native
  def getColorFromRGBA(rgba: officeDashUiDashFabricDashReactLib.Anon_B): IColor = js.native
  def getColorFromString(inputColor: java.lang.String): js.UndefOr[IColor] = js.native
  def getFullColorString(color: IColor): java.lang.String = js.native
  def hsl2hsv(h: scala.Double, s: scala.Double, l: scala.Double): IHSV = js.native
  def hsl2rgb(h: scala.Double, s: scala.Double, l: scala.Double): IRGB = js.native
  def hsv2hex(h: scala.Double, s: scala.Double, v: scala.Double): java.lang.String = js.native
  def hsv2hsl(h: scala.Double, s: scala.Double, v: scala.Double): officeDashUiDashFabricDashReactLib.Anon_H = js.native
  def hsv2rgb(h: scala.Double, s: scala.Double, v: scala.Double): IRGB = js.native
  def rgb2hex(r: scala.Double, g: scala.Double, b: scala.Double): java.lang.String = js.native
  def rgb2hsv(r: scala.Double, g: scala.Double, b: scala.Double): IHSV = js.native
  def updateA(color: IColor, a: scala.Double): IColor = js.native
  def updateH(color: IColor, h: scala.Double): IColor = js.native
  def updateSV(color: IColor, s: scala.Double, v: scala.Double): IColor = js.native
}

