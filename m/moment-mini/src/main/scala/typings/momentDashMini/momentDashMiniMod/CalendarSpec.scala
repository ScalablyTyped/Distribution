package typings.momentDashMini.momentDashMiniMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarSpec
  extends // any additional properties might be used with moment.calendarFormat
/* x */ StringDictionary[CalendarSpecVal | Unit] {
  var lastDay: js.UndefOr[CalendarSpecVal] = js.undefined
  var lastWeek: js.UndefOr[CalendarSpecVal] = js.undefined
  var nextDay: js.UndefOr[CalendarSpecVal] = js.undefined
  var nextWeek: js.UndefOr[CalendarSpecVal] = js.undefined
  var sameDay: js.UndefOr[CalendarSpecVal] = js.undefined
  var sameElse: js.UndefOr[CalendarSpecVal] = js.undefined
}

object CalendarSpec {
  @scala.inline
  def apply(
    StringDictionary: // any additional properties might be used with moment.calendarFormat
  /* x */ StringDictionary[CalendarSpecVal | Unit] = null,
    lastDay: CalendarSpecVal = null,
    lastWeek: CalendarSpecVal = null,
    nextDay: CalendarSpecVal = null,
    nextWeek: CalendarSpecVal = null,
    sameDay: CalendarSpecVal = null,
    sameElse: CalendarSpecVal = null
  ): CalendarSpec = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (lastDay != null) __obj.updateDynamic("lastDay")(lastDay.asInstanceOf[js.Any])
    if (lastWeek != null) __obj.updateDynamic("lastWeek")(lastWeek.asInstanceOf[js.Any])
    if (nextDay != null) __obj.updateDynamic("nextDay")(nextDay.asInstanceOf[js.Any])
    if (nextWeek != null) __obj.updateDynamic("nextWeek")(nextWeek.asInstanceOf[js.Any])
    if (sameDay != null) __obj.updateDynamic("sameDay")(sameDay.asInstanceOf[js.Any])
    if (sameElse != null) __obj.updateDynamic("sameElse")(sameElse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarSpec]
  }
}

