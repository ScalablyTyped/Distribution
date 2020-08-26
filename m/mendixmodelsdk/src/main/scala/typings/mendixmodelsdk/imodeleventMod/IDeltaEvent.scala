package typings.mendixmodelsdk.imodeleventMod

import typings.mendixmodelsdk.deltasDeltasMod.Delta
import typings.mendixmodelsdk.mendixmodelsdkStrings.deltas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeltaEvent extends IModelEvent {
  var deltas: js.Array[Delta] = js.native
  var id: Double = js.native
  var `type`: deltas = js.native
}

object IDeltaEvent {
  @scala.inline
  def apply(deltas: js.Array[Delta], id: Double, `type`: deltas): IDeltaEvent = {
    val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeltaEvent]
  }
  @scala.inline
  implicit class IDeltaEventOps[Self <: IDeltaEvent] (val x: Self) extends AnyVal {
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
    def setDeltasVarargs(value: Delta*): Self = this.set("deltas", js.Array(value :_*))
    @scala.inline
    def setDeltas(value: js.Array[Delta]): Self = this.set("deltas", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: deltas): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

