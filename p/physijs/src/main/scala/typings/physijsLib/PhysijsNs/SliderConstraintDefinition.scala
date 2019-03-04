package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderConstraintDefinition extends js.Object {
  var axis: threeLib.threeMod.Vector3
  var id: scala.Double
  var objecta: threeLib.threeMod.Object3D
  var objectb: threeLib.threeMod.Object3D
  var positiona: threeLib.threeMod.Vector3
  var positionb: threeLib.threeMod.Vector3
  var `type`: java.lang.String
}

object SliderConstraintDefinition {
  @scala.inline
  def apply(
    axis: threeLib.threeMod.Vector3,
    id: scala.Double,
    objecta: threeLib.threeMod.Object3D,
    objectb: threeLib.threeMod.Object3D,
    positiona: threeLib.threeMod.Vector3,
    positionb: threeLib.threeMod.Vector3,
    `type`: java.lang.String
  ): SliderConstraintDefinition = {
    val __obj = js.Dynamic.literal(axis = axis, id = id, objecta = objecta, objectb = objectb, positiona = positiona, positionb = positionb)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SliderConstraintDefinition]
  }
}

