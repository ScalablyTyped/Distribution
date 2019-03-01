package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointConstraintDefinition extends js.Object {
  var id: scala.Double
  var objecta: threeLib.threeMod.Object3D
  var objectb: threeLib.threeMod.Object3D
  var positiona: threeLib.threeMod.Vector3
  var positionb: threeLib.threeMod.Vector3
  var `type`: java.lang.String
}

object PointConstraintDefinition {
  @scala.inline
  def apply(
    id: scala.Double,
    objecta: threeLib.threeMod.Object3D,
    objectb: threeLib.threeMod.Object3D,
    positiona: threeLib.threeMod.Vector3,
    positionb: threeLib.threeMod.Vector3,
    `type`: java.lang.String
  ): PointConstraintDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("objecta")(objecta)
    __obj.updateDynamic("objectb")(objectb)
    __obj.updateDynamic("positiona")(positiona)
    __obj.updateDynamic("positionb")(positionb)
    __obj.asInstanceOf[PointConstraintDefinition]
  }
}

