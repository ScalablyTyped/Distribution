package typings.atOnfleetNodeDashOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var actions: js.Array[_]
  var events: js.Array[_]
  var failureNotes: String
  var failureReason: String
  var firstLocation: js.Array[_]
  var lastLocation: js.Array[_]
  var time: Double | Null
  var unavailableAttachments: js.Array[_]
}

object Anon_Actions {
  @scala.inline
  def apply(
    actions: js.Array[_],
    events: js.Array[_],
    failureNotes: String,
    failureReason: String,
    firstLocation: js.Array[_],
    lastLocation: js.Array[_],
    unavailableAttachments: js.Array[_],
    time: Int | Double = null
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal(actions = actions, events = events, failureNotes = failureNotes, failureReason = failureReason, firstLocation = firstLocation, lastLocation = lastLocation, unavailableAttachments = unavailableAttachments)
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Actions]
  }
}

