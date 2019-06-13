package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailboxSettings extends js.Object {
  /** Folder ID of an archive folder for the user. */
  var archiveFolder: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration settings to automatically notify the sender of an incoming email with a message from the signed-in user. */
  var automaticRepliesSetting: js.UndefOr[AutomaticRepliesSetting] = js.undefined
  /** The locale information for the user, including the preferred language and country/region. */
  var language: js.UndefOr[LocaleInfo] = js.undefined
  /** The default time zone for the user's mailbox. */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  /** The days of the week and hours in a specific time zone that the user works. */
  var workingHours: js.UndefOr[WorkingHours] = js.undefined
}

object MailboxSettings {
  @scala.inline
  def apply(
    archiveFolder: java.lang.String = null,
    automaticRepliesSetting: AutomaticRepliesSetting = null,
    language: LocaleInfo = null,
    timeZone: java.lang.String = null,
    workingHours: WorkingHours = null
  ): MailboxSettings = {
    val __obj = js.Dynamic.literal()
    if (archiveFolder != null) __obj.updateDynamic("archiveFolder")(archiveFolder)
    if (automaticRepliesSetting != null) __obj.updateDynamic("automaticRepliesSetting")(automaticRepliesSetting)
    if (language != null) __obj.updateDynamic("language")(language)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (workingHours != null) __obj.updateDynamic("workingHours")(workingHours)
    __obj.asInstanceOf[MailboxSettings]
  }
}

