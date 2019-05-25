package typings
package olLib.geomMultiPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPolygon
  extends olLib.geomSimpleGeometryMod.default {
  def appendPolygon(polygon: olLib.geomPolygonMod.default): scala.Unit = js.native
  def getArea(): scala.Double = js.native
  def getEndss(): js.Array[js.Array[scala.Double]] = js.native
  def getFlatInteriorPoints(): js.Array[scala.Double] = js.native
  def getInteriorPoints(): olLib.geomMultiPointMod.default = js.native
  def getOrientedFlatCoordinates(): js.Array[scala.Double] = js.native
  def getPolygon(index: scala.Double): olLib.geomPolygonMod.default = js.native
  def getPolygons(): js.Array[olLib.geomPolygonMod.default] = js.native
}

