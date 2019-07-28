package typings.openjscad.CSGNs

import typings.openjscad.CSG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG")
@js.native
object ^ extends js.Object {
  var staticTag: Double = js.native
  def IsFloat(n: js.Any): Boolean = js.native
  def cube(options: js.Any): CSG = js.native
  def cylinder(options: js.Any): CSG = js.native
  def fnNumberSort(a: js.Any, b: js.Any): Double = js.native
  def getTag(): Double = js.native
  def interpolateBetween2DPointsForY(point1: Vector2D, point2: Vector2D, y: Double): Double = js.native
  def parseOption(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  def parseOptionAs2DVector(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  def parseOptionAs3DVector(options: js.Any, optionname: js.Any, defaultvalue: js.Any): Vector3D = js.native
  def parseOptionAs3DVectorList(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  def parseOptionAsBool(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  def parseOptionAsFloat(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  def parseOptionAsInt(options: js.Any, optionname: js.Any, defaultvalue: js.Any): js.Any = js.native
  /**
    * polyhedron accepts openscad style arguments. I.e. define face vertices clockwise looking from outside
    */
  def polyhedron(options: js.Any): CSG = js.native
  def reTesselateCoplanarPolygons(sourcepolygons: js.Array[Polygon], destpolygons: js.Array[Polygon]): Unit = js.native
  def roundedCube(options: js.Any): CSG = js.native
  def roundedCylinder(options: js.Any): CSG = js.native
  def solve2Linear(a: js.Any, b: js.Any, c: js.Any, d: js.Any, u: js.Any, v: js.Any): js.Array[Double] = js.native
  def sphere(options: js.Any): CSG = js.native
}

