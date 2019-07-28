package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharepointIds extends js.Object {
  // The unique identifier (guid) for the item's list in SharePoint.
  var listId: js.UndefOr[String] = js.undefined
  // An integer identifier for the item within the containing list.
  var listItemId: js.UndefOr[String] = js.undefined
  // The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
  var listItemUniqueId: js.UndefOr[String] = js.undefined
  // The unique identifier (guid) for the item's site collection (SPSite).
  var siteId: js.UndefOr[String] = js.undefined
  // The SharePoint URL for the site that contains the item.
  var siteUrl: js.UndefOr[String] = js.undefined
  // The unique identifier (guid) for the item's site (SPWeb).
  var webId: js.UndefOr[String] = js.undefined
}

object SharepointIds {
  @scala.inline
  def apply(
    listId: String = null,
    listItemId: String = null,
    listItemUniqueId: String = null,
    siteId: String = null,
    siteUrl: String = null,
    webId: String = null
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

