package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
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
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_merge(value: Properties => Properties): Self = this.set("_merge", js.Any.fromFunction1(value))
    @scala.inline
    def set_transform(value: Matrix4x4 => Properties): Self = this.set("_transform", js.Any.fromFunction1(value))
    @scala.inline
    def setCenter(value: js.Any): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setCube(value: Properties): Self = this.set("cube", value.asInstanceOf[js.Any])
    @scala.inline
    def setCylinder(value: Properties): Self = this.set("cylinder", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacecentersVarargs(value: js.Any*): Self = this.set("facecenters", js.Array(value :_*))
    @scala.inline
    def setFacecenters(value: js.Array[_]): Self = this.set("facecenters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacepoint(value: js.Any): Self = this.set("facepoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacepointH(value: js.Any): Self = this.set("facepointH", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacepointH90(value: js.Any): Self = this.set("facepointH90", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedCube(value: Properties): Self = this.set("roundedCube", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundedCylinder(value: js.Any): Self = this.set("roundedCylinder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSphere(value: Properties): Self = this.set("sphere", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

