package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangeMutator extends Mutator {
  var mutatorType: CHANGE
  var updateIndex: js.UndefOr[Double] = js.undefined
  var value: PrimitiveValue | Null
}

object IChangeMutator {
  @scala.inline
  def apply(mutatorType: CHANGE, updateIndex: Int | Double = null, value: PrimitiveValue = null): IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any])
    if (updateIndex != null) __obj.updateDynamic("updateIndex")(updateIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeMutator]
  }
}

