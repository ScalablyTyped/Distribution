package typings
package olLib.renderBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderBox
  extends olLib.disposableMod.default {
  def createOrUpdateGeometry(): scala.Unit = js.native
  def getGeometry(): olLib.geomPolygonMod.default = js.native
  def setMap(map: olLib.pluggableMapMod.default): scala.Unit = js.native
  def setPixels(startPixel: olLib.pixelMod.Pixel, endPixel: olLib.pixelMod.Pixel): scala.Unit = js.native
}

