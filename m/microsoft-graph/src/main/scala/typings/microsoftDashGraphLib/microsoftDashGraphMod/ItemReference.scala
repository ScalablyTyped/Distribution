package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemReference extends js.Object {
  /** Unique identifier of the drive instance that contains the item. Read-only. */
  var driveId: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the type of drive. See [drive][] resource for values. */
  var driveType: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier of the item in the drive. Read-only. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the item being referenced. Read-only. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Path that can be used to navigate to the item. Read-only. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** A unique identifier for a shared resource that can be accessed via the [Shares][] API. */
  var shareId: js.UndefOr[java.lang.String] = js.undefined
  /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  var siteId: js.UndefOr[java.lang.String] = js.undefined
}

object ItemReference {
  @scala.inline
  def apply(
    driveId: java.lang.String = null,
    driveType: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    shareId: java.lang.String = null,
    sharepointIds: SharepointIds = null,
    siteId: java.lang.String = null
  ): ItemReference = {
    val __obj = js.Dynamic.literal()
    if (driveId != null) __obj.updateDynamic("driveId")(driveId)
    if (driveType != null) __obj.updateDynamic("driveType")(driveType)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (shareId != null) __obj.updateDynamic("shareId")(shareId)
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    __obj.asInstanceOf[ItemReference]
  }
}

