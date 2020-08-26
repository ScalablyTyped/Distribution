package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Face extends js.Object {
  var group: String = js.native
  var material: js.Any = js.native
  var smoothingGroup: Double = js.native
  var vertices: js.Array[FaceVertex] = js.native
}

object Face {
  @scala.inline
  def apply(group: String, material: js.Any, smoothingGroup: Double, vertices: js.Array[FaceVertex]): Face = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], smoothingGroup = smoothingGroup.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face]
  }
  @scala.inline
  implicit class FaceOps[Self <: Face] (val x: Self) extends AnyVal {
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaterial(value: js.Any): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmoothingGroup(value: Double): Self = this.set("smoothingGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesVarargs(value: FaceVertex*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: js.Array[FaceVertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
  
}

