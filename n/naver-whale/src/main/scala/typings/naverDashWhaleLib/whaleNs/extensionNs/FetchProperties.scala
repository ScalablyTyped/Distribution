package typings
package naverDashWhaleLib.whaleNs.extensionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchProperties extends js.Object {
  /** Optional. The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab', 'notification', 'popup'.  */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. The window to restrict the search to. If omitted, returns all views.  */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object FetchProperties {
  @scala.inline
  def apply(`type`: java.lang.String = null, windowId: scala.Int | scala.Double = null): FetchProperties = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProperties]
  }
}

