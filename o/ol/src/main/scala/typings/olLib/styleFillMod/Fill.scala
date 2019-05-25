package typings
package olLib.styleFillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fill extends js.Object {
  def getChecksum(): java.lang.String = js.native
  def getColor(): olLib.colorMod.Color | olLib.colorlikeMod.ColorLike = js.native
  def setColor(color: olLib.colorMod.Color): scala.Unit = js.native
  def setColor(color: olLib.colorlikeMod.ColorLike): scala.Unit = js.native
}

