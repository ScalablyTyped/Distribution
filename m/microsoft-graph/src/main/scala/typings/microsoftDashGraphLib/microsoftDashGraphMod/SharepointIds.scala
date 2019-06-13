package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharepointIds extends js.Object {
  /** The unique identifier (guid) for the item's list in SharePoint. */
  var listId: js.UndefOr[java.lang.String] = js.undefined
  /** An integer identifier for the item within the containing list. */
  var listItemId: js.UndefOr[java.lang.String] = js.undefined
  /** The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site. */
  var listItemUniqueId: js.UndefOr[java.lang.String] = js.undefined
  /** The unique identifier (guid) for the item's site collection (SPSite). */
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  /** The SharePoint URL for the site that contains the item. */
  var siteUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The unique identifier (guid) for the item's site (SPWeb). */
  var webId: js.UndefOr[java.lang.String] = js.undefined
}

object SharepointIds {
  @scala.inline
  def apply(
    listId: java.lang.String = null,
    listItemId: java.lang.String = null,
    listItemUniqueId: java.lang.String = null,
    siteId: java.lang.String = null,
    siteUrl: java.lang.String = null,
    webId: java.lang.String = null
  ): SharepointIds = {
    val __obj = js.Dynamic.literal()
    if (listId != null) __obj.updateDynamic("listId")(listId)
    if (listItemId != null) __obj.updateDynamic("listItemId")(listItemId)
    if (listItemUniqueId != null) __obj.updateDynamic("listItemUniqueId")(listItemUniqueId)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (siteUrl != null) __obj.updateDynamic("siteUrl")(siteUrl)
    if (webId != null) __obj.updateDynamic("webId")(webId)
    __obj.asInstanceOf[SharepointIds]
  }
}

