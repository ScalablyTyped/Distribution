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

