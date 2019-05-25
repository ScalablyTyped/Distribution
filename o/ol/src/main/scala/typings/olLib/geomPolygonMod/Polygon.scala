package typings
package olLib.geomPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon
  extends olLib.geomSimpleGeometryMod.default {
  def appendLinearRing(linearRing: olLib.geomLinearRingMod.default): scala.Unit = js.native
  def getArea(): scala.Double = js.native
  def getEnds(): js.Array[scala.Double] = js.native
  def getFlatInteriorPoint(): js.Array[scala.Double] = js.native
  def getInteriorPoint(): olLib.geomPointMod.default = js.native
  def getLinearRing(index: scala.Double): olLib.geomLinearRingMod.default = js.native
  def getLinearRingCount(): scala.Double = js.native
  def getLinearRings(): js.Array[olLib.geomLinearRingMod.default] = js.native
  def getOrientedFlatCoordinates(): js.Array[scala.Double] = js.native
}

