package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeMutator extends Mutator {
  var mutatorType: mendixmodelsdkLib.mendixmodelsdkLibStrings.CHANGE
  var updateIndex: js.UndefOr[scala.Double] = js.undefined
  var value: PrimitiveValue | scala.Null
}

object IChangeMutator {
  @scala.inline
  def apply(
    mutatorType: mendixmodelsdkLib.mendixmodelsdkLibStrings.CHANGE,
    updateIndex: scala.Int | scala.Double = null,
    value: PrimitiveValue = null
  ): IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType)
    if (updateIndex != null) __obj.updateDynamic("updateIndex")(updateIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeMutator]
  }
}

