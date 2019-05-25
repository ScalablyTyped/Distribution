package typings
package olLib.geomLineStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineString
  extends olLib.geomSimpleGeometryMod.default {
  def appendCoordinate(coordinate: olLib.coordinateMod.Coordinate): scala.Unit = js.native
  def forEachSegment[T, S](
    callback: js.ThisFunction2[
      /* this */ S, 
      /* param1 */ olLib.coordinateMod.Coordinate, 
      /* param2 */ olLib.coordinateMod.Coordinate, 
      T
    ]
  ): T | scala.Boolean = js.native
  def getCoordinateAt(fraction: scala.Double): olLib.coordinateMod.Coordinate = js.native
  def getCoordinateAt(fraction: scala.Double, opt_dest: olLib.coordinateMod.Coordinate): olLib.coordinateMod.Coordinate = js.native
  def getCoordinateAtM(m: scala.Double): olLib.coordinateMod.Coordinate = js.native
  def getCoordinateAtM(m: scala.Double, opt_extrapolate: scala.Boolean): olLib.coordinateMod.Coordinate = js.native
  def getFlatMidpoint(): js.Array[scala.Double] = js.native
  def getLength(): scala.Double = js.native
}

