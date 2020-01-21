package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemReference extends js.Object {
  // Unique identifier of the drive instance that contains the item. Read-only.
  var driveId: js.UndefOr[String] = js.undefined
  // Identifies the type of drive. See [drive][] resource for values.
  var driveType: js.UndefOr[String] = js.undefined
  // Unique identifier of the item in the drive. Read-only.
  var id: js.UndefOr[String] = js.undefined
  // The name of the item being referenced. Read-only.
  var name: js.UndefOr[String] = js.undefined
  // Path that can be used to navigate to the item. Read-only.
  var path: js.UndefOr[String] = js.undefined
  // A unique identifier for a shared resource that can be accessed via the [Shares][] API.
  var shareId: js.UndefOr[String] = js.undefined
  // Returns identifiers useful for SharePoint REST compatibility. Read-only.
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  var siteId: js.UndefOr[String] = js.undefined
}

object ItemReference {
  @scala.inline
  def apply(
    driveId: String = null,
    driveType: String = null,
    id: String = null,
    name: String = null,
    path: String = null,
    shareId: String = null,
    sharepointIds: SharepointIds = null,
    siteId: String = null
  ): ItemReference = {
    val __obj = js.Dynamic.literal()
    if (driveId != null) __obj.updateDynamic("driveId")(driveId.asInstanceOf[js.Any])
    if (driveType != null) __obj.updateDynamic("driveType")(driveType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (shareId != null) __obj.updateDynamic("shareId")(shareId.asInstanceOf[js.Any])
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds.asInstanceOf[js.Any])
    if (siteId != null) __obj.updateDynamic("siteId")(siteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemReference]
  }
}

