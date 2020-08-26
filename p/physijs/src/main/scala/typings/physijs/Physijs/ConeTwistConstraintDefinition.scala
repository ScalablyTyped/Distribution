package typings.physijs.Physijs

import typings.three.mod.Object3D
import typings.three.mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConeTwistConstraintDefinition extends js.Object {
  var axisa: Vector3 = js.native
  var axisb: Vector3 = js.native
  var id: Double = js.native
  var objecta: Object3D = js.native
  var objectb: Object3D = js.native
  var positiona: Vector3 = js.native
  var positionb: Vector3 = js.native
  var `type`: String = js.native
}

object ConeTwistConstraintDefinition {
  @scala.inline
  def apply(
    axisa: Vector3,
    axisb: Vector3,
    id: Double,
    objecta: Object3D,
    objectb: Object3D,
    positiona: Vector3,
    positionb: Vector3,
    `type`: String
  ): ConeTwistConstraintDefinition = {
    val __obj = js.Dynamic.literal(axisa = axisa.asInstanceOf[js.Any], axisb = axisb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConeTwistConstraintDefinition]
  }
  @scala.inline
  implicit class ConeTwistConstraintDefinitionOps[Self <: ConeTwistConstraintDefinition] (val x: Self) extends AnyVal {
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
    def setAxisa(value: Vector3): Self = this.set("axisa", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisb(value: Vector3): Self = this.set("axisb", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjecta(value: Object3D): Self = this.set("objecta", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectb(value: Object3D): Self = this.set("objectb", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositiona(value: Vector3): Self = this.set("positiona", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionb(value: Vector3): Self = this.set("positionb", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

