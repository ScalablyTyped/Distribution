package typings
package physijsLib.PhysijsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConeTwistConstraintDefinition extends js.Object {
  var axisa: threeLib.threeMod.Vector3
  var axisb: threeLib.threeMod.Vector3
  var id: scala.Double
  var objecta: threeLib.threeMod.Object3D
  var objectb: threeLib.threeMod.Object3D
  var positiona: threeLib.threeMod.Vector3
  var positionb: threeLib.threeMod.Vector3
  var `type`: java.lang.String
}

object ConeTwistConstraintDefinition {
  @scala.inline
  def apply(
    axisa: threeLib.threeMod.Vector3,
    axisb: threeLib.threeMod.Vector3,
    id: scala.Double,
    objecta: threeLib.threeMod.Object3D,
    objectb: threeLib.threeMod.Object3D,
    positiona: threeLib.threeMod.Vector3,
    positionb: threeLib.threeMod.Vector3,
    `type`: java.lang.String
  ): ConeTwistConstraintDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("axisa")(axisa)
    __obj.updateDynamic("axisb")(axisb)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("objecta")(objecta)
    __obj.updateDynamic("objectb")(objectb)
    __obj.updateDynamic("positiona")(positiona)
    __obj.updateDynamic("positionb")(positionb)
    __obj.asInstanceOf[ConeTwistConstraintDefinition]
  }
}

