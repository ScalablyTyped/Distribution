package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

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
  def apply(mutatorType: ADD, value: PrimitiveValue, insertionIndex: Int | Double = null): IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddMutator]
  }
}

