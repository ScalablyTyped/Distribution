package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoadUnitResponse extends js.Object {
  var eventId: Double
  var unit: IAbstractUnitJson
}

object ILoadUnitResponse {
  @scala.inline
  def apply(eventId: Double, unit: IAbstractUnitJson): ILoadUnitResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILoadUnitResponse]
  }
}

