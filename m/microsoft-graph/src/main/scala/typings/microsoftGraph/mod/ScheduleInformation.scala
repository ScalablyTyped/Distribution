package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleInformation extends js.Object {
  /**
    * Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots.
    * Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working
    * elsewhere.
    */
  var availabilityView: js.UndefOr[String] = js.undefined
  // Error information from attempting to get the availability of the user, distribution list, or resource.
  var error: js.UndefOr[FreeBusyError] = js.undefined
  // An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
  var scheduleId: js.UndefOr[String] = js.undefined
  // Contains the items that describe the availability of the user or resource.
  var scheduleItems: js.UndefOr[js.Array[ScheduleItem]] = js.undefined
  /**
    * The days of the week and hours in a specific time zone that the user works. These are set as part of the user's
    * mailboxSettings.
    */
  var workingHours: js.UndefOr[WorkingHours] = js.undefined
}

object ScheduleInformation {
  @scala.inline
  def apply(
    availabilityView: String = null,
    error: FreeBusyError = null,
    scheduleId: String = null,
    scheduleItems: js.Array[ScheduleItem] = null,
    workingHours: WorkingHours = null
  ): ScheduleInformation = {
    val __obj = js.Dynamic.literal()
    if (availabilityView != null) __obj.updateDynamic("availabilityView")(availabilityView.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (scheduleId != null) __obj.updateDynamic("scheduleId")(scheduleId.asInstanceOf[js.Any])
    if (scheduleItems != null) __obj.updateDynamic("scheduleItems")(scheduleItems.asInstanceOf[js.Any])
    if (workingHours != null) __obj.updateDynamic("workingHours")(workingHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleInformation]
  }
}

