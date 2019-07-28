package typings.officeDashJsDashPreview.OfficeNs

import typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.OWAView
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.OneColumn
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ThreeColumns
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TwoColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides diagnostic information to an Outlook add-in.
  *
  * [Api set: Mailbox 1.0]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait Diagnostics extends js.Object {
  /**
    * Gets a string that represents the current view of Outlook on the web.
    *
    * The returned string can be one of the following values: OneColumn, TwoColumns, or ThreeColumns.
    *
    * If the host application is not Outlook on the web, then accessing this property results in undefined.
    *
    * Outlook on the web has three views that correspond to the width of the screen and the window, and the number of columns that can be displayed:
    *
    * - OneColumn, which is displayed when the screen is narrow. Outlook on the web uses this single-column layout on the entire screen of a 
    * smartphone.
    *
    * - TwoColumns, which is displayed when the screen is wider. Outlook on the web uses this view on most tablets.
    *
    * - ThreeColumns, which is displayed when the screen is wide. For example, Outlook on the web uses this view in a full screen window on a 
    * desktop computer.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var OWAView: typings.officeDashJsDashPreview.OfficeNs.MailboxEnumsNs.OWAView | OneColumn | TwoColumns | ThreeColumns
  /**
    * Gets a string that represents the name of the host application.
    *
    * A string that can be one of the following values: Outlook, Mac Outlook, OutlookIOS, or OutlookWebApp.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var hostName: String
  /**
    * Gets a string that represents the version of either the host application or the Exchange Server.
    *
    * If the mail add-in is running in Outlook client on the desktop or iOS, the hostVersion property returns the version of the host 
    * application, Outlook. In Outlook on the web, the property returns the version of the Exchange Server. An example is the string 15.0.468.0.
    *
    * [Api set: Mailbox 1.0]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var hostVersion: String
}

object Diagnostics {
  @scala.inline
  def apply(OWAView: OWAView | OneColumn | TwoColumns | ThreeColumns, hostName: String, hostVersion: String): Diagnostics = {
    val __obj = js.Dynamic.literal(OWAView = OWAView.asInstanceOf[js.Any], hostName = hostName, hostVersion = hostVersion)
  
    __obj.asInstanceOf[Diagnostics]
  }
}

