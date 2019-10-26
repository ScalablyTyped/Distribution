package typings.mendixmodelsdk.distSdkInternalModelDashEventsModelDashEventMod

import typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelEvent extends js.Object {
  var deltas: js.Array[Delta]
  var id: Double
  var `type`: String
}

object IModelEvent {
  @scala.inline
  def apply(deltas: js.Array[Delta], id: Double, `type`: String): IModelEvent = {
    val __obj = js.Dynamic.literal(deltas = deltas, id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IModelEvent]
  }
}

