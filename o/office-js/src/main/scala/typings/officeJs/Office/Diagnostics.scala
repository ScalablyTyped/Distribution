package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.OWAView
import typings.officeJs.officeJsStrings.OneColumn
import typings.officeJs.officeJsStrings.ThreeColumns
import typings.officeJs.officeJsStrings.TwoColumns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides diagnostic information to an Outlook add-in.
  *
  * @remarks
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * Starting with Mailbox requirement set 1.5, you can also use the 
  * {@link https://learn.microsoft.com/javascript/api/office/office.context?view=outlook-js-1.5&preserve-view=true#office-office-context-diagnostics-member | Office.context.diagnostics}
  * property to get similar information.
  */
trait Diagnostics extends StObject {
  
  /**
    * Gets a string that represents the current view of Outlook on the web.
    *
    * The returned string can be one of the following values: `OneColumn`, `TwoColumns`, or `ThreeColumns`.
    *
    * If the application is not Outlook on the web, then accessing this property results in undefined.
    *
    * Outlook on the web has three views that correspond to the width of the screen and the window, and the number of columns that can be displayed:
    *
    * - `OneColumn`, which is displayed when the screen is narrow. Outlook on the web uses this single-column layout on the entire screen of a
    * smartphone.
    *
    * - `TwoColumns`, which is displayed when the screen is wider. Outlook on the web uses this view on most tablets.
    *
    * - `ThreeColumns`, which is displayed when the screen is wide. For example, Outlook on the web uses this view in a full screen window on a
    * desktop computer.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var OWAView: typings.officeJs.Office.MailboxEnums.OWAView | OneColumn | TwoColumns | ThreeColumns
  
  /**
    * Gets a string that represents the name of the Office application.
    *
    * A string that can be one of the following values: `Outlook`, `OutlookWebApp`, `OutlookIOS`, or `OutlookAndroid`.
    *
    * **Note**: The `Outlook` value is returned for Outlook on desktop clients (i.e., Windows and Mac).
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var hostName: String
  
  /**
    * Gets a string that represents the version of either the Office application or the Exchange Server (e.g., "15.0.468.0").
    *
    * If the mail add-in is running in Outlook on a desktop or mobile client, the `hostVersion` property returns the version of the
    * application, Outlook. In Outlook on the web, the property returns the version of the Exchange Server.
    *
    * @remarks
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: **read item**
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
    */
  var hostVersion: String
}
object Diagnostics {
  
  inline def apply(OWAView: OWAView | OneColumn | TwoColumns | ThreeColumns, hostName: String, hostVersion: String): Diagnostics = {
    val __obj = js.Dynamic.literal(OWAView = OWAView.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], hostVersion = hostVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Diagnostics] (val x: Self) extends AnyVal {
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHostVersion(value: String): Self = StObject.set(x, "hostVersion", value.asInstanceOf[js.Any])
    
    inline def setOWAView(value: OWAView | OneColumn | TwoColumns | ThreeColumns): Self = StObject.set(x, "OWAView", value.asInstanceOf[js.Any])
  }
}
