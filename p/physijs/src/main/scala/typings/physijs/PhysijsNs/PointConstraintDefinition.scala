package typings.physijs.PhysijsNs

import typings.three.threeMod.Object3D
import typings.three.threeMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointConstraintDefinition extends js.Object {
  var id: Double
  var objecta: Object3D
  var objectb: Object3D
  var positiona: Vector3
  var positionb: Vector3
  var `type`: String
}

object PointConstraintDefinition {
  @scala.inline
  def apply(
    id: Double,
    objecta: Object3D,
    objectb: Object3D,
    positiona: Vector3,
    positionb: Vector3,
    `type`: String
  ): PointConstraintDefinition = {
    val __obj = js.Dynamic.literal(id = id, objecta = objecta, objectb = objectb, positiona = positiona, positionb = positionb)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointConstraintDefinition]
  }
}

