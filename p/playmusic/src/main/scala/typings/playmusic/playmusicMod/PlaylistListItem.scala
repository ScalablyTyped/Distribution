package typings.playmusic.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistListItem extends js.Object {
  var accessControlled: js.UndefOr[Boolean] = js.undefined
  var creationTimestamp: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedTimestamp: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ownerName: js.UndefOr[String] = js.undefined
  var ownerProfilePhotoUrl: js.UndefOr[String] = js.undefined
  var recentTimestamp: js.UndefOr[String] = js.undefined
  var shareToken: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PlaylistListItem {
  @scala.inline
  def apply(
    accessControlled: js.UndefOr[Boolean] = js.undefined,
    creationTimestamp: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedTimestamp: String = null,
    name: String = null,
    ownerName: String = null,
    ownerProfilePhotoUrl: String = null,
    recentTimestamp: String = null,
    shareToken: String = null,
    `type`: String = null
  ): PlaylistListItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessControlled)) __obj.updateDynamic("accessControlled")(accessControlled.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedTimestamp != null) __obj.updateDynamic("lastModifiedTimestamp")(lastModifiedTimestamp.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerName != null) __obj.updateDynamic("ownerName")(ownerName.asInstanceOf[js.Any])
    if (ownerProfilePhotoUrl != null) __obj.updateDynamic("ownerProfilePhotoUrl")(ownerProfilePhotoUrl.asInstanceOf[js.Any])
    if (recentTimestamp != null) __obj.updateDynamic("recentTimestamp")(recentTimestamp.asInstanceOf[js.Any])
    if (shareToken != null) __obj.updateDynamic("shareToken")(shareToken.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistListItem]
  }
}

