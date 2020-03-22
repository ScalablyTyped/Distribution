package typings.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventId extends js.Object {
  var eventId: Double
  var problems: js.Array[_]
}

object AnonEventId {
  @scala.inline
  def apply(eventId: Double, problems: js.Array[_]): AnonEventId = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], problems = problems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventId]
  }
}

