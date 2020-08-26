package typings.mendixmodelsdk.undoManagerMod

import typings.mendixmodelsdk.deltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeltaChange extends js.Object {
  var delta: Delta = js.native
  var reversedDelta: Delta = js.native
}

object IDeltaChange {
  @scala.inline
  def apply(delta: Delta, reversedDelta: Delta): IDeltaChange = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], reversedDelta = reversedDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeltaChange]
  }
  @scala.inline
  implicit class IDeltaChangeOps[Self <: IDeltaChange] (val x: Self) extends AnyVal {
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
    def setDelta(value: Delta): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setReversedDelta(value: Delta): Self = this.set("reversedDelta", value.asInstanceOf[js.Any])
  }
  
}

