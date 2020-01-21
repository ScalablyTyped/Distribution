package typings.mendixmodelsdk.imodeleventMod

import typings.mendixmodelsdk.deltasDeltasMod.Delta
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
    val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelEvent]
  }
}

