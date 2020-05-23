package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ADD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddMutator extends Mutator {
  var insertionIndex: js.UndefOr[Double] = js.undefined
  var mutatorType: ADD
  var value: PrimitiveValue
}

object IAddMutator {
  @scala.inline
  def apply(mutatorType: ADD, value: PrimitiveValue, insertionIndex: js.UndefOr[Double] = js.undefined): IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(insertionIndex)) __obj.updateDynamic("insertionIndex")(insertionIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddMutator]
  }
}

