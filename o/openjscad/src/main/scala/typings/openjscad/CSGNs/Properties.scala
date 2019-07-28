package typings.openjscad.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Properties")
@js.native
class Properties () extends js.Object {
  var center: js.Any = js.native
  var cube: Properties = js.native
  var cylinder: Properties = js.native
  var end: js.Any = js.native
  var facecenters: js.Array[_] = js.native
  var facepoint: js.Any = js.native
  var facepointH: js.Any = js.native
  var facepointH90: js.Any = js.native
  var roundedCube: Properties = js.native
  var roundedCylinder: js.Any = js.native
  var sphere: Properties = js.native
  var start: js.Any = js.native
  def _merge(otherproperties: Properties): Properties = js.native
  def _transform(matrix4x4: Matrix4x4): Properties = js.native
}

/* static members */
@JSGlobal("CSG.Properties")
@js.native
object Properties extends js.Object {
  def addFrom(result: js.Any, otherproperties: Properties): Unit = js.native
  def cloneObj(source: js.Any, result: js.Any): Unit = js.native
  def transformObj(source: js.Any, result: js.Any, matrix4x4: Matrix4x4): Unit = js.native
}

