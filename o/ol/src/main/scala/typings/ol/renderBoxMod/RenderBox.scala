package typings.ol.renderBoxMod

import typings.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderBox
  extends typings.ol.disposableMod.default {
  def createOrUpdateGeometry(): Unit = js.native
  def getGeometry(): typings.ol.geomPolygonMod.default = js.native
  def setMap(map: typings.ol.pluggableMapMod.default): Unit = js.native
  def setPixels(startPixel: Pixel, endPixel: Pixel): Unit = js.native
}

