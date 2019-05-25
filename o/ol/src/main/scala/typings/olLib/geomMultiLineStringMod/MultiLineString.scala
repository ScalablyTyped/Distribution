package typings
package olLib.geomMultiLineStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLineString
  extends olLib.geomSimpleGeometryMod.default {
  def appendLineString(lineString: olLib.geomLineStringMod.default): scala.Unit = js.native
  def getCoordinateAtM(m: scala.Double): olLib.coordinateMod.Coordinate = js.native
  def getCoordinateAtM(m: scala.Double, opt_extrapolate: scala.Boolean): olLib.coordinateMod.Coordinate = js.native
  def getCoordinateAtM(m: scala.Double, opt_extrapolate: scala.Boolean, opt_interpolate: scala.Boolean): olLib.coordinateMod.Coordinate = js.native
  def getEnds(): js.Array[scala.Double] = js.native
  def getFlatMidpoints(): js.Array[scala.Double] = js.native
  def getLineString(index: scala.Double): olLib.geomLineStringMod.default = js.native
  def getLineStrings(): js.Array[olLib.geomLineStringMod.default] = js.native
}

