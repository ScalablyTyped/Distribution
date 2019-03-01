package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistListItem extends js.Object {
  var accessControlled: js.UndefOr[scala.Boolean] = js.undefined
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var ownerName: js.UndefOr[java.lang.String] = js.undefined
  var ownerProfilePhotoUrl: js.UndefOr[java.lang.String] = js.undefined
  var recentTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var shareToken: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistListItem {
  @scala.inline
  def apply(
    accessControlled: js.UndefOr[scala.Boolean] = js.undefined,
    creationTimestamp: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedTimestamp: java.lang.String = null,
    name: java.lang.String = null,
    ownerName: java.lang.String = null,
    ownerProfilePhotoUrl: java.lang.String = null,
    recentTimestamp: java.lang.String = null,
    shareToken: java.lang.String = null,
    `type`: java.lang.String = null
  ): PlaylistListItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessControlled)) __obj.updateDynamic("accessControlled")(accessControlled)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedTimestamp != null) __obj.updateDynamic("lastModifiedTimestamp")(lastModifiedTimestamp)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerName != null) __obj.updateDynamic("ownerName")(ownerName)
    if (ownerProfilePhotoUrl != null) __obj.updateDynamic("ownerProfilePhotoUrl")(ownerProfilePhotoUrl)
    if (recentTimestamp != null) __obj.updateDynamic("recentTimestamp")(recentTimestamp)
    if (shareToken != null) __obj.updateDynamic("shareToken")(shareToken)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlaylistListItem]
  }
}

