package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides diagnostic information to an Outlook add-in.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
  */
trait Diagnostics extends js.Object {
  /**
    * Gets a string that represents the current view of Outlook Web App.
    *
    * The returned string can be one of the following values: OneColumn, TwoColumns, or ThreeColumns.
    *
    * If the host application is not Outlook Web App, then accessing this property results in undefined.
    *
    * Outlook Web App has three views that correspond to the width of the screen and the window, and the number of columns that can be displayed:
    *
    * - OneColumn, which is displayed when the screen is narrow. Outlook Web App uses this single-column layout on the entire screen of a 
    * smartphone.
    *
    * - TwoColumns, which is displayed when the screen is wider. Outlook Web App uses this view on most tablets.
    *
    * - ThreeColumns, which is displayed when the screen is wide. For example, Outlook Web App uses this view in a full screen window on a 
    * desktop computer.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var OWAView: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.OWAView | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OneColumn | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoColumns | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeColumns
  /**
    * Gets a string that represents the name of the host application.
    *
    * A string that can be one of the following values: Outlook, Mac Outlook, OutlookIOS, or OutlookWebApp.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var hostName: java.lang.String
  /**
    * Gets a string that represents the version of either the host application or the Exchange Server.
    *
    * If the mail add-in is running on the Outlook desktop client or Outlook for iOS, the hostVersion property returns the version of the host 
    * application, Outlook. In Outlook Web App, the property returns the version of the Exchange Server. An example is the string 15.0.468.0.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * <table>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
    *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
    * </table>
    */
  var hostVersion: java.lang.String
}

object Diagnostics {
  @scala.inline
  def apply(
    OWAView: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.OWAView | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.OneColumn | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TwoColumns | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeColumns,
    hostName: java.lang.String,
    hostVersion: java.lang.String
  ): Diagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("OWAView")(OWAView.asInstanceOf[js.Any])
    __obj.updateDynamic("hostName")(hostName)
    __obj.updateDynamic("hostVersion")(hostVersion)
    __obj.asInstanceOf[Diagnostics]
  }
}

