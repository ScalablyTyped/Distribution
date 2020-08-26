package typings.mendixmodelsdk.imodelserverclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISendDeltasResult extends js.Object {
  var eventId: Double = js.native
  var firstError: js.Any = js.native
}

object ISendDeltasResult {
  @scala.inline
  def apply(eventId: Double, firstError: js.Any): ISendDeltasResult = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], firstError = firstError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISendDeltasResult]
  }
  @scala.inline
  implicit class ISendDeltasResultOps[Self <: ISendDeltasResult] (val x: Self) extends AnyVal {
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
    def setEventId(value: Double): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstError(value: js.Any): Self = this.set("firstError", value.asInstanceOf[js.Any])
  }
  
}

