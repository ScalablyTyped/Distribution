package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadUnitResponse extends js.Object {
  var eventId: scala.Double
  var unit: IAbstractUnitJson
}

object ILoadUnitResponse {
  @scala.inline
  def apply(eventId: scala.Double, unit: IAbstractUnitJson): ILoadUnitResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId, unit = unit)
  
    __obj.asInstanceOf[ILoadUnitResponse]
  }
}

