package typings.mendixmodelsdk.anon

import typings.mendixmodelsdk.iworkingcopyeventMod.BuildResultStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventId extends js.Object {
  var eventId: Double
  var message: String
  var problems: js.Array[_]
  var status: BuildResultStatus
}

object EventId {
  @scala.inline
  def apply(eventId: Double, message: String, problems: js.Array[_], status: BuildResultStatus): EventId = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], problems = problems.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventId]
  }
}

