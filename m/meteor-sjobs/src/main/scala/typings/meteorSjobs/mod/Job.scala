package typings.meteorSjobs.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  var _id: js.UndefOr[String] = js.undefined
  var arguments: js.Array[_]
  var created: Date
  var data: js.Any
  var due: Date
  var history: js.Array[HistoryItem]
  var name: String
  var priority: Double
  var serverId: String
  var state: JobState
}

object Job {
  @scala.inline
  def apply(
    arguments: js.Array[_],
    created: Date,
    data: js.Any,
    due: Date,
    history: js.Array[HistoryItem],
    name: String,
    priority: Double,
    serverId: String,
    state: JobState,
    _id: String = null
  ): Job = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], due = due.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

