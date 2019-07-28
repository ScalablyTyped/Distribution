package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppListItem extends js.Object {
  // The application or bundle identifier of the application
  var appId: js.UndefOr[String] = js.undefined
  // The Store URL of the application
  var appStoreUrl: js.UndefOr[String] = js.undefined
  // The application name
  var name: js.UndefOr[String] = js.undefined
  // The publisher of the application
  var publisher: js.UndefOr[String] = js.undefined
}

object AppListItem {
  @scala.inline
  def apply(appId: String = null, appStoreUrl: String = null, name: String = null, publisher: String = null): AppListItem = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (appStoreUrl != null) __obj.updateDynamic("appStoreUrl")(appStoreUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    __obj.asInstanceOf[AppListItem]
  }
}

