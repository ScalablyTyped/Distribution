package typings.ol.geomMultiPolygonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPolygon
  extends typings.ol.geomSimpleGeometryMod.default {
  def appendPolygon(polygon: typings.ol.geomPolygonMod.default): Unit = js.native
  def getArea(): Double = js.native
  def getEndss(): js.Array[js.Array[Double]] = js.native
  def getFlatInteriorPoints(): js.Array[Double] = js.native
  def getInteriorPoints(): typings.ol.geomMultiPointMod.default = js.native
  def getOrientedFlatCoordinates(): js.Array[Double] = js.native
  def getPolygon(index: Double): typings.ol.geomPolygonMod.default = js.native
  def getPolygons(): js.Array[typings.ol.geomPolygonMod.default] = js.native
}

