package typings
package olLib.geomSimpleGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleGeometry
  extends olLib.geomGeometryMod.default {
  var flatCoordinates: js.Array[scala.Double] = js.native
  var layout: olLib.geomGeometryLayoutMod.GeometryLayout = js.native
  var stride: scala.Double = js.native
  def getCoordinates(): js.Array[_] = js.native
  def getFirstCoordinate(): olLib.coordinateMod.Coordinate = js.native
  def getFlatCoordinates(): js.Array[scala.Double] = js.native
  def getLastCoordinate(): olLib.coordinateMod.Coordinate = js.native
  def getLayout(): olLib.geomGeometryLayoutMod.GeometryLayout = js.native
  /* protected */ def getSimplifiedGeometryInternal(squaredTolerance: scala.Double): SimpleGeometry = js.native
  def getStride(): scala.Double = js.native
  def setCoordinates(coordinates: js.Array[_]): scala.Unit = js.native
  def setCoordinates(coordinates: js.Array[_], opt_layout: olLib.geomGeometryLayoutMod.GeometryLayout): scala.Unit = js.native
  def setFlatCoordinates(layout: olLib.geomGeometryLayoutMod.GeometryLayout, flatCoordinates: js.Array[scala.Double]): scala.Unit = js.native
  /* protected */ def setLayout(
    layout: olLib.geomGeometryLayoutMod.GeometryLayout,
    coordinates: js.Array[_],
    nesting: scala.Double
  ): scala.Unit = js.native
}

