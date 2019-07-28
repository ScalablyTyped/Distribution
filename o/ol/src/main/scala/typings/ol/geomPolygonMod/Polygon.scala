package typings.ol.geomPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon
  extends typings.ol.geomSimpleGeometryMod.default {
  def appendLinearRing(linearRing: typings.ol.geomLinearRingMod.default): Unit = js.native
  def getArea(): Double = js.native
  def getEnds(): js.Array[Double] = js.native
  def getFlatInteriorPoint(): js.Array[Double] = js.native
  def getInteriorPoint(): typings.ol.geomPointMod.default = js.native
  def getLinearRing(index: Double): typings.ol.geomLinearRingMod.default = js.native
  def getLinearRingCount(): Double = js.native
  def getLinearRings(): js.Array[typings.ol.geomLinearRingMod.default] = js.native
  def getOrientedFlatCoordinates(): js.Array[Double] = js.native
}

