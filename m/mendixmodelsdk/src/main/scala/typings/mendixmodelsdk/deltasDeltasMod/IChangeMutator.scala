package typings.mendixmodelsdk.deltasDeltasMod

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
  def apply(mutatorType: CHANGE, updateIndex: js.UndefOr[Double] = js.undefined, value: PrimitiveValue = null): IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(updateIndex)) __obj.updateDynamic("updateIndex")(updateIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeMutator]
  }
}

