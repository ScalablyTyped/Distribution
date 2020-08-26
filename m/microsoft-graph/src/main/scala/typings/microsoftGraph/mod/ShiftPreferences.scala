package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShiftPreferences extends ChangeTrackedEntity {
  // Availability of the user to be scheduled for work and its recurrence pattern.
  var availability: js.UndefOr[js.Array[ShiftAvailability]] = js.native
}

object ShiftPreferences {
  @scala.inline
  def apply(): ShiftPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftPreferences]
  }
  @scala.inline
  implicit class ShiftPreferencesOps[Self <: ShiftPreferences] (val x: Self) extends AnyVal {
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
    def setAvailabilityVarargs(value: ShiftAvailability*): Self = this.set("availability", js.Array(value :_*))
    @scala.inline
    def setAvailability(value: js.Array[ShiftAvailability]): Self = this.set("availability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
  }
  
}

