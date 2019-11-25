package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailboxSettings extends js.Object {
  // Folder ID of an archive folder for the user.
  var archiveFolder: js.UndefOr[String] = js.undefined
  // Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user.
  var automaticRepliesSetting: js.UndefOr[AutomaticRepliesSetting] = js.undefined
  // The date format for the user's mailbox.
  var dateFormat: js.UndefOr[String] = js.undefined
  // The locale information for the user, including the preferred language and country/region.
  var language: js.UndefOr[LocaleInfo] = js.undefined
  // The time format for the user's mailbox.
  var timeFormat: js.UndefOr[String] = js.undefined
  // The default time zone for the user's mailbox.
  var timeZone: js.UndefOr[String] = js.undefined
  // The days of the week and hours in a specific time zone that the user works.
  var workingHours: js.UndefOr[WorkingHours] = js.undefined
}

object MailboxSettings {
  @scala.inline
  def apply(
    archiveFolder: String = null,
    automaticRepliesSetting: AutomaticRepliesSetting = null,
    dateFormat: String = null,
    language: LocaleInfo = null,
    timeFormat: String = null,
    timeZone: String = null,
    workingHours: WorkingHours = null
  ): MailboxSettings = {
    val __obj = js.Dynamic.literal()
    if (archiveFolder != null) __obj.updateDynamic("archiveFolder")(archiveFolder.asInstanceOf[js.Any])
    if (automaticRepliesSetting != null) __obj.updateDynamic("automaticRepliesSetting")(automaticRepliesSetting.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (workingHours != null) __obj.updateDynamic("workingHours")(workingHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailboxSettings]
  }
}

