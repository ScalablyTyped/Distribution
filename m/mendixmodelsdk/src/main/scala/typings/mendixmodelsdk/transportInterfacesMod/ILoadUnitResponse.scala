package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadUnitResponse extends js.Object {
  var eventId: Double = js.native
  var unit: IAbstractUnitJson = js.native
}

object ILoadUnitResponse {
  @scala.inline
  def apply(eventId: Double, unit: IAbstractUnitJson): ILoadUnitResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUnitResponse]
  }
  @scala.inline
  implicit class ILoadUnitResponseOps[Self <: ILoadUnitResponse] (val x: Self) extends AnyVal {
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
    def setUnit(value: IAbstractUnitJson): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
  
}

