package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadUnitInterfacesResponse extends js.Object {
  var eventId: Double
  var units: js.Array[IAbstractUnitJson]
}

object ILoadUnitInterfacesResponse {
  @scala.inline
  def apply(eventId: Double, units: js.Array[IAbstractUnitJson]): ILoadUnitInterfacesResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUnitInterfacesResponse]
  }
}

