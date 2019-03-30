package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InspectedWindow extends js.Object {
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  val inspectedWindowNs: Anon_CallbackEval
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  val networkNs: Anon_CallbackGetHAR
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  val panelsNs: Anon_CallbackCreate
}

object Anon_InspectedWindow {
  @scala.inline
  def apply(
    inspectedWindowNs: Anon_CallbackEval,
    networkNs: Anon_CallbackGetHAR,
    panelsNs: Anon_CallbackCreate
  ): Anon_InspectedWindow = {
    val __obj = js.Dynamic.literal(inspectedWindowNs = inspectedWindowNs, networkNs = networkNs, panelsNs = panelsNs)
  
    __obj.asInstanceOf[Anon_InspectedWindow]
  }
}

