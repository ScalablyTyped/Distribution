package typings.ol.geomMultiLineStringMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLineString
  extends typings.ol.geomSimpleGeometryMod.default {
  def appendLineString(lineString: typings.ol.geomLineStringMod.default): Unit = js.native
  def getCoordinateAtM(m: Double): Coordinate = js.native
  def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
  def getCoordinateAtM(m: Double, opt_extrapolate: Boolean, opt_interpolate: Boolean): Coordinate = js.native
  def getEnds(): js.Array[Double] = js.native
  def getFlatMidpoints(): js.Array[Double] = js.native
  def getLineString(index: Double): typings.ol.geomLineStringMod.default = js.native
  def getLineStrings(): js.Array[typings.ol.geomLineStringMod.default] = js.native
}

