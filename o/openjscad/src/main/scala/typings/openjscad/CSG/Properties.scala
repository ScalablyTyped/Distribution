package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var center: js.Any
  var cube: Properties
  var cylinder: Properties
  var end: js.Any
  var facecenters: js.Array[_]
  var facepoint: js.Any
  var facepointH: js.Any
  var facepointH90: js.Any
  var roundedCube: Properties
  var roundedCylinder: js.Any
  var sphere: Properties
  var start: js.Any
  def _merge(otherproperties: Properties): Properties
  def _transform(matrix4x4: Matrix4x4): Properties
}

object Properties {
  @scala.inline
  def apply(
    _merge: Properties => Properties,
    _transform: Matrix4x4 => Properties,
    center: js.Any,
    cube: Properties,
    cylinder: Properties,
    end: js.Any,
    facecenters: js.Array[_],
    facepoint: js.Any,
    facepointH: js.Any,
    facepointH90: js.Any,
    roundedCube: Properties,
    roundedCylinder: js.Any,
    sphere: Properties,
    start: js.Any
  ): Properties = {
    val __obj = js.Dynamic.literal(_merge = js.Any.fromFunction1(_merge), _transform = js.Any.fromFunction1(_transform), center = center.asInstanceOf[js.Any], cube = cube.asInstanceOf[js.Any], cylinder = cylinder.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], facecenters = facecenters.asInstanceOf[js.Any], facepoint = facepoint.asInstanceOf[js.Any], facepointH = facepointH.asInstanceOf[js.Any], facepointH90 = facepointH90.asInstanceOf[js.Any], roundedCube = roundedCube.asInstanceOf[js.Any], roundedCylinder = roundedCylinder.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

