package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ADD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAddMutator extends Mutator {
  var insertionIndex: js.UndefOr[Double] = js.native
  var mutatorType: ADD = js.native
  var value: PrimitiveValue = js.native
}

object IAddMutator {
  @scala.inline
  def apply(mutatorType: ADD, value: PrimitiveValue): IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddMutator]
  }
  @scala.inline
  implicit class IAddMutatorOps[Self <: IAddMutator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMutatorType(value: ADD): Self = this.set("mutatorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: PrimitiveValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertionIndex(value: Double): Self = this.set("insertionIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertionIndex: Self = this.set("insertionIndex", js.undefined)
  }
  
}

