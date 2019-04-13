package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chat extends js.Object {
  var all_members_are_administrators: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var first_name: js.UndefOr[java.lang.String] = js.undefined
  var id: scala.Double
  var invite_link: js.UndefOr[java.lang.String] = js.undefined
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  var photo: js.UndefOr[ChatPhoto] = js.undefined
  var pinned_message: js.UndefOr[Message] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: ChatType
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Chat {
  @scala.inline
  def apply(
    id: scala.Double,
    `type`: ChatType,
    all_members_are_administrators: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    first_name: java.lang.String = null,
    invite_link: java.lang.String = null,
    last_name: java.lang.String = null,
    photo: ChatPhoto = null,
    pinned_message: Message = null,
    title: java.lang.String = null,
    username: java.lang.String = null
  ): Chat = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(all_members_are_administrators)) __obj.updateDynamic("all_members_are_administrators")(all_members_are_administrators)
    if (description != null) __obj.updateDynamic("description")(description)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (invite_link != null) __obj.updateDynamic("invite_link")(invite_link)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (pinned_message != null) __obj.updateDynamic("pinned_message")(pinned_message)
    if (title != null) __obj.updateDynamic("title")(title)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Chat]
  }
}

