package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseItem extends Entity {
  // Identity of the user, device, or application which created the item. Read-only.
  var createdBy: js.UndefOr[IdentitySet] = js.undefined
  // Identity of the user who created the item. Read-only.
  var createdByUser: js.UndefOr[User] = js.undefined
  // Date and time of item creation. Read-only.
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Provides a user-visible description of the item. Optional.
  var description: js.UndefOr[java.lang.String] = js.undefined
  // ETag for the item. Read-only.
  var eTag: js.UndefOr[java.lang.String] = js.undefined
  // Identity of the user, device, and application which last modified the item. Read-only.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  // Identity of the user who last modified the item. Read-only.
  var lastModifiedByUser: js.UndefOr[User] = js.undefined
  // Date and time the item was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The name of the item. Read-write.
  var name: js.UndefOr[java.lang.String] = js.undefined
  // Parent information, if the item has a parent. Read-write.
  var parentReference: js.UndefOr[ItemReference] = js.undefined
  // URL that displays the resource in the browser. Read-only.
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object BaseItem {
  @scala.inline
  def apply(
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    eTag: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: java.lang.String = null,
    name: java.lang.String = null,
    parentReference: ItemReference = null,
    webUrl: java.lang.String = null
  ): BaseItem = {
    val __obj = js.Dynamic.literal()
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (eTag != null) __obj.updateDynamic("eTag")(eTag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[BaseItem]
  }
}

