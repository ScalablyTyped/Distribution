package typings.mendixmodelsdk.imodeleventMod

import typings.mendixmodelsdk.deltasDeltasMod.Delta
import typings.mendixmodelsdk.mendixmodelsdkStrings.deltas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeltaEvent extends IModelEvent {
  var deltas: js.Array[Delta]
  var id: Double
  var `type`: deltas
}

object IDeltaEvent {
  @scala.inline
  def apply(deltas: js.Array[Delta], id: Double, `type`: deltas): IDeltaEvent = {
    val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeltaEvent]
  }
}

