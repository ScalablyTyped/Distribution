package typings.naverDashWhale.whale.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchProperties extends js.Object {
  /** Optional. The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab', 'notification', 'popup'.  */
  var `type`: js.UndefOr[String] = js.undefined
  /** Optional. The window to restrict the search to. If omitted, returns all views.  */
  var windowId: js.UndefOr[Double] = js.undefined
}

object FetchProperties {
  @scala.inline
  def apply(`type`: String = null, windowId: Int | Double = null): FetchProperties = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchProperties]
  }
}

