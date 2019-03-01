package typings
package microsoftteamsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  var originalEvent: MessageEvent
}

object MessageEvent {
  @scala.inline
  def apply(originalEvent: MessageEvent): MessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[MessageEvent]
  }
}

