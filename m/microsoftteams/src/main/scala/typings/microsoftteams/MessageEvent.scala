package typings.microsoftteams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  var originalEvent: MessageEvent
}

object MessageEvent {
  @scala.inline
  def apply(originalEvent: MessageEvent): MessageEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
}

