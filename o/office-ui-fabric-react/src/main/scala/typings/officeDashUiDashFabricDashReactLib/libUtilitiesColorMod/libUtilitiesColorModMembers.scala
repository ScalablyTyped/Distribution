package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/color", JSImport.Namespace)
@js.native
object libUtilitiesColorModMembers extends js.Object {
  val MAX_COLOR_HUE: /* 359 */ scala.Double = js.native
  val MAX_COLOR_RGBA: /* 255 */ scala.Double = js.native
  val MAX_COLOR_SATURATION: /* 100 */ scala.Double = js.native
  val MAX_COLOR_VALUE: /* 100 */ scala.Double = js.native
  def cssColor(color: java.lang.String): js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IRGB] = js.native
  def getBackgroundShade(
    color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor,
    shade: officeDashUiDashFabricDashReactLib.libUtilitiesColorShadesMod.Shade
  ): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor | scala.Null = js.native
  def getBackgroundShade(
    color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor,
    shade: officeDashUiDashFabricDashReactLib.libUtilitiesColorShadesMod.Shade,
    isInverted: scala.Boolean
  ): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor | scala.Null = js.native
  def getColorFromRGBA(rgba: officeDashUiDashFabricDashReactLib.Anon_B): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor = js.native
  def getColorFromString(inputColor: java.lang.String): js.UndefOr[officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor] = js.native
  def getContrastRatio(
    color1: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor,
    color2: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor
  ): scala.Double = js.native
  def getFullColorString(color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor): java.lang.String = js.native
  def getShade(
    color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor,
    shade: officeDashUiDashFabricDashReactLib.libUtilitiesColorShadesMod.Shade
  ): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor | scala.Null = js.native
  def getShade(
    color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor,
    shade: officeDashUiDashFabricDashReactLib.libUtilitiesColorShadesMod.Shade,
    isInverted: scala.Boolean
  ): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor | scala.Null = js.native
  def hsl2hsv(h: scala.Double, s: scala.Double, l: scala.Double): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IHSV = js.native
  def hsl2rgb(h: scala.Double, s: scala.Double, l: scala.Double): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IRGB = js.native
  def hsv2hex(h: scala.Double, s: scala.Double, v: scala.Double): java.lang.String = js.native
  def hsv2hsl(h: scala.Double, s: scala.Double, v: scala.Double): officeDashUiDashFabricDashReactLib.Anon_H = js.native
  def hsv2rgb(h: scala.Double, s: scala.Double, v: scala.Double): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IRGB = js.native
  def isDark(color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor): scala.Boolean = js.native
  def isValidShade(): scala.Boolean = js.native
  def isValidShade(shade: officeDashUiDashFabricDashReactLib.libUtilitiesColorShadesMod.Shade): scala.Boolean = js.native
  def rgb2hex(r: scala.Double, g: scala.Double, b: scala.Double): java.lang.String = js.native
  def rgb2hsv(r: scala.Double, g: scala.Double, b: scala.Double): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IHSV = js.native
  def updateA(color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor, a: scala.Double): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor = js.native
  def updateH(color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor, h: scala.Double): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor = js.native
  def updateSV(
    color: officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor,
    s: scala.Double,
    v: scala.Double
  ): officeDashUiDashFabricDashReactLib.libUtilitiesColorColorsMod.IColor = js.native
}

