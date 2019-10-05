package typings.physijs.Physijs

import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOFConstraintDefinition extends js.Object {
  var axisa: Vector3
  var axisb: Vector3
  var id: Double
  var objecta: Object3D
  var objectb: Object3D
  var positiona: Vector3
  var positionb: Vector3
  var `type`: String
}

object DOFConstraintDefinition {
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
  ): DOFConstraintDefinition = {
    val __obj = js.Dynamic.literal(axisa = axisa, axisb = axisb, id = id, objecta = objecta, objectb = objectb, positiona = positiona, positionb = positionb)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DOFConstraintDefinition]
  }
}

