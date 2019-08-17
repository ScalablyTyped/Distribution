package typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/color/shades", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getBackgroundShade(color: IColor, shade: Shade): IColor | Null = js.native
  def getBackgroundShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  def getContrastRatio(color1: IColor, color2: IColor): Double = js.native
  def getShade(color: IColor, shade: Shade): IColor | Null = js.native
  def getShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  def isDark(color: IColor): Boolean = js.native
  def isValidShade(): Boolean = js.native
  def isValidShade(shade: Shade): Boolean = js.native
}

