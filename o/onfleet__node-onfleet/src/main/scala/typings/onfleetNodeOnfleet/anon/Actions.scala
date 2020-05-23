package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Actions extends js.Object {
  var actions: js.Array[_]
  var events: js.Array[_]
  var failureNotes: String
  var failureReason: String
  var firstLocation: js.Array[_]
  var lastLocation: js.Array[_]
  var time: Double | Null
  var unavailableAttachments: js.Array[_]
}

object Actions {
  @scala.inline
  def apply(
    actions: js.Array[_],
    events: js.Array[_],
    failureNotes: String,
    failureReason: String,
    firstLocation: js.Array[_],
    lastLocation: js.Array[_],
    unavailableAttachments: js.Array[_],
    time: Double = null.asInstanceOf[Double]
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], failureNotes = failureNotes.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], firstLocation = firstLocation.asInstanceOf[js.Any], lastLocation = lastLocation.asInstanceOf[js.Any], unavailableAttachments = unavailableAttachments.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
}

