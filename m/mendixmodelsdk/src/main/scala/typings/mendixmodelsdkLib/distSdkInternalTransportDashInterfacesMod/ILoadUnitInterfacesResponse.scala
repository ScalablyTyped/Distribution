package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadUnitInterfacesResponse extends js.Object {
  var eventId: scala.Double
  var units: js.Array[IAbstractUnitJson]
}

object ILoadUnitInterfacesResponse {
  @scala.inline
  def apply(eventId: scala.Double, units: js.Array[IAbstractUnitJson]): ILoadUnitInterfacesResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId, units = units)
  
    __obj.asInstanceOf[ILoadUnitInterfacesResponse]
  }
}

