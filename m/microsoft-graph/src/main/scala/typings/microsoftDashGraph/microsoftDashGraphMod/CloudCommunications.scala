package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudCommunications extends Entity {
  var calls: js.UndefOr[js.Array[Call]] = js.undefined
  var onlineMeetings: js.UndefOr[js.Array[OnlineMeeting]] = js.undefined
}

object CloudCommunications {
  @scala.inline
  def apply(calls: js.Array[Call] = null, id: String = null, onlineMeetings: js.Array[OnlineMeeting] = null): CloudCommunications = {
    val __obj = js.Dynamic.literal()
    if (calls != null) __obj.updateDynamic("calls")(calls)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onlineMeetings != null) __obj.updateDynamic("onlineMeetings")(onlineMeetings)
    __obj.asInstanceOf[CloudCommunications]
  }
}

