package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternedRecurrence extends js.Object {
  // The frequency of an event.
  var pattern: js.UndefOr[RecurrencePattern] = js.undefined
  // The duration of an event.
  var range: js.UndefOr[RecurrenceRange] = js.undefined
}

object PatternedRecurrence {
  @scala.inline
  def apply(pattern: RecurrencePattern = null, range: RecurrenceRange = null): PatternedRecurrence = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PatternedRecurrence]
  }
}

