package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemoveMutator extends Mutator {
  var mutatorType: REMOVE = js.native
  var removalIndex: Double = js.native
}

object IRemoveMutator {
  @scala.inline
  def apply(mutatorType: REMOVE, removalIndex: Double): IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveMutator]
  }
  @scala.inline
  implicit class IRemoveMutatorOps[Self <: IRemoveMutator] (val x: Self) extends AnyVal {
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
    def setMutatorType(value: REMOVE): Self = this.set("mutatorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovalIndex(value: Double): Self = this.set("removalIndex", value.asInstanceOf[js.Any])
  }
  
}

