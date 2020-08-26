package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternedRecurrence extends js.Object {
  // The frequency of an event.
  var pattern: js.UndefOr[RecurrencePattern] = js.native
  // The duration of an event.
  var range: js.UndefOr[RecurrenceRange] = js.native
}

object PatternedRecurrence {
  @scala.inline
  def apply(): PatternedRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternedRecurrence]
  }
  @scala.inline
  implicit class PatternedRecurrenceOps[Self <: PatternedRecurrence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPattern(value: RecurrencePattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setRange(value: RecurrenceRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

