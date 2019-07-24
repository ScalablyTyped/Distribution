package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppListItem extends js.Object {
  // The application or bundle identifier of the application
  var appId: js.UndefOr[java.lang.String] = js.undefined
  // The Store URL of the application
  var appStoreUrl: js.UndefOr[java.lang.String] = js.undefined
  // The application name
  var name: js.UndefOr[java.lang.String] = js.undefined
  // The publisher of the application
  var publisher: js.UndefOr[java.lang.String] = js.undefined
}

object AppListItem {
  @scala.inline
  def apply(
    appId: java.lang.String = null,
    appStoreUrl: java.lang.String = null,
    name: java.lang.String = null,
    publisher: java.lang.String = null
  ): AppListItem = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (appStoreUrl != null) __obj.updateDynamic("appStoreUrl")(appStoreUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    __obj.asInstanceOf[AppListItem]
  }
}

