package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent
  extends /* propName */ StringDictionary[js.Any] {
  var event: Event_
}

object AnonEvent {
  @scala.inline
  def apply(event: Event_, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonEvent]
  }
}

