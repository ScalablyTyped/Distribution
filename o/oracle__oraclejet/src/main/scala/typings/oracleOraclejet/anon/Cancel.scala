package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var currentText: js.UndefOr[String] = js.undefined
  var dateRestriction: js.UndefOr[Hint] = js.undefined
  var dateTimeRange: js.UndefOr[MessageDetail] = js.undefined
  var done: js.UndefOr[String] = js.undefined
  var nextText: js.UndefOr[String] = js.undefined
  var prevText: js.UndefOr[String] = js.undefined
  var regexp: js.UndefOr[MessageSummary] = js.undefined
  var required: js.UndefOr[Hint] = js.undefined
  var tooltipCalendar: js.UndefOr[String] = js.undefined
  var tooltipCalendarDisabled: js.UndefOr[String] = js.undefined
  var tooltipCalendarTime: js.UndefOr[String] = js.undefined
  var tooltipCalendarTimeDisabled: js.UndefOr[String] = js.undefined
  var weekHeader: js.UndefOr[String] = js.undefined
}

object Cancel {
  @scala.inline
  def apply(
    cancel: String = null,
    currentText: String = null,
    dateRestriction: Hint = null,
    dateTimeRange: MessageDetail = null,
    done: String = null,
    nextText: String = null,
    prevText: String = null,
    regexp: MessageSummary = null,
    required: Hint = null,
    tooltipCalendar: String = null,
    tooltipCalendarDisabled: String = null,
    tooltipCalendarTime: String = null,
    tooltipCalendarTimeDisabled: String = null,
    weekHeader: String = null
  ): Cancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (currentText != null) __obj.updateDynamic("currentText")(currentText.asInstanceOf[js.Any])
    if (dateRestriction != null) __obj.updateDynamic("dateRestriction")(dateRestriction.asInstanceOf[js.Any])
    if (dateTimeRange != null) __obj.updateDynamic("dateTimeRange")(dateTimeRange.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (tooltipCalendar != null) __obj.updateDynamic("tooltipCalendar")(tooltipCalendar.asInstanceOf[js.Any])
    if (tooltipCalendarDisabled != null) __obj.updateDynamic("tooltipCalendarDisabled")(tooltipCalendarDisabled.asInstanceOf[js.Any])
    if (tooltipCalendarTime != null) __obj.updateDynamic("tooltipCalendarTime")(tooltipCalendarTime.asInstanceOf[js.Any])
    if (tooltipCalendarTimeDisabled != null) __obj.updateDynamic("tooltipCalendarTimeDisabled")(tooltipCalendarTimeDisabled.asInstanceOf[js.Any])
    if (weekHeader != null) __obj.updateDynamic("weekHeader")(weekHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

