package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChangeMutator extends Mutator {
  var mutatorType: CHANGE = js.native
  var updateIndex: js.UndefOr[Double] = js.native
  var value: PrimitiveValue | Null = js.native
}

object IChangeMutator {
  @scala.inline
  def apply(mutatorType: CHANGE): IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangeMutator]
  }
  @scala.inline
  implicit class IChangeMutatorOps[Self <: IChangeMutator] (val x: Self) extends AnyVal {
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
    def setMutatorType(value: CHANGE): Self = this.set("mutatorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateIndex(value: Double): Self = this.set("updateIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateIndex: Self = this.set("updateIndex", js.undefined)
    @scala.inline
    def setValue(value: PrimitiveValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

