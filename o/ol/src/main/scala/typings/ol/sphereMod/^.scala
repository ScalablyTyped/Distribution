package typings.ol.sphereMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.geomGeometryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/sphere", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getArea(geometry: default): Double = js.native
  def getArea(geometry: default, opt_options: SphereMetricOptions): Double = js.native
  def getDistance(c1: js.Array[_], c2: js.Array[_]): Double = js.native
  def getDistance(c1: js.Array[_], c2: js.Array[_], opt_radius: Double): Double = js.native
  def getLength(geometry: default): Double = js.native
  def getLength(geometry: default, opt_options: SphereMetricOptions): Double = js.native
  def offset(c1: Coordinate, distance: Double, bearing: Double): Coordinate = js.native
  def offset(c1: Coordinate, distance: Double, bearing: Double, opt_radius: Double): Coordinate = js.native
}

