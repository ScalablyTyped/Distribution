package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragRotateOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.native
  var duration: js.UndefOr[Double] = js.native
}

object DragRotateOptions {
  @scala.inline
  def apply(): DragRotateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragRotateOptions]
  }
  @scala.inline
  implicit class DragRotateOptionsOps[Self <: DragRotateOptions] (val x: Self) extends AnyVal {
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
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("condition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
  
}

