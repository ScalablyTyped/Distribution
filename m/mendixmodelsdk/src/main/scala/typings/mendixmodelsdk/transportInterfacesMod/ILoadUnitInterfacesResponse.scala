package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadUnitInterfacesResponse extends js.Object {
  var eventId: Double = js.native
  var units: js.Array[IAbstractUnitJson] = js.native
}

object ILoadUnitInterfacesResponse {
  @scala.inline
  def apply(eventId: Double, units: js.Array[IAbstractUnitJson]): ILoadUnitInterfacesResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUnitInterfacesResponse]
  }
  @scala.inline
  implicit class ILoadUnitInterfacesResponseOps[Self <: ILoadUnitInterfacesResponse] (val x: Self) extends AnyVal {
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
    def setUnitsVarargs(value: IAbstractUnitJson*): Self = this.set("units", js.Array(value :_*))
    @scala.inline
    def setUnits(value: js.Array[IAbstractUnitJson]): Self = this.set("units", value.asInstanceOf[js.Any])
  }
  
}

