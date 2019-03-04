package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddMutator extends Mutator {
  var insertionIndex: js.UndefOr[scala.Double] = js.undefined
  var mutatorType: mendixmodelsdkLib.mendixmodelsdkLibStrings.ADD
  var value: PrimitiveValue
}

object IAddMutator {
  @scala.inline
  def apply(
    mutatorType: mendixmodelsdkLib.mendixmodelsdkLibStrings.ADD,
    value: PrimitiveValue,
    insertionIndex: scala.Int | scala.Double = null
  ): IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType, value = value.asInstanceOf[js.Any])
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddMutator]
  }
}

