package typings
package olLib.styleIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon
  extends olLib.styleImageMod.default {
  @JSName("clone")
  def clone_Icon(): Icon = js.native
  def getColor(): olLib.colorMod.Color = js.native
  def getSrc(): java.lang.String = js.native
  def setAnchor(anchor: js.Array[scala.Double]): scala.Unit = js.native
}

