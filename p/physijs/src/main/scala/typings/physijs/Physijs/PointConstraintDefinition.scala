package typings.physijs.Physijs

import typings.three.mod.Object3D
import typings.three.mod.Vector3
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], objecta = objecta.asInstanceOf[js.Any], objectb = objectb.asInstanceOf[js.Any], positiona = positiona.asInstanceOf[js.Any], positionb = positionb.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointConstraintDefinition]
  }
}

