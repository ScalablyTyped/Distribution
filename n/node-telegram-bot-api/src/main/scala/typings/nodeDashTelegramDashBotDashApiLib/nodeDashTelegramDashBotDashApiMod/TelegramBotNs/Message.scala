package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Message extends js.Object {
  var audio: js.UndefOr[Audio] = js.undefined
  var author_signature: js.UndefOr[java.lang.String] = js.undefined
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var channel_chat_created: js.UndefOr[scala.Boolean] = js.undefined
  var chat: Chat
  var contact: js.UndefOr[Contact] = js.undefined
  var date: scala.Double
  var delete_chat_photo: js.UndefOr[scala.Boolean] = js.undefined
  var document: js.UndefOr[Document] = js.undefined
  var edit_date: js.UndefOr[scala.Double] = js.undefined
  var entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  var forward_date: js.UndefOr[scala.Double] = js.undefined
  var forward_from: js.UndefOr[User] = js.undefined
  var forward_from_chat: js.UndefOr[Chat] = js.undefined
  var forward_from_message_id: js.UndefOr[scala.Double] = js.undefined
  var forward_signature: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[User] = js.undefined
  var game: js.UndefOr[Game] = js.undefined
  var group_chat_created: js.UndefOr[scala.Boolean] = js.undefined
  var invoice: js.UndefOr[Invoice] = js.undefined
  var left_chat_member: js.UndefOr[User] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var message_id: scala.Double
  var migrate_from_chat_id: js.UndefOr[scala.Double] = js.undefined
  var migrate_to_chat_id: js.UndefOr[scala.Double] = js.undefined
  var new_chat_members: js.UndefOr[js.Array[User]] = js.undefined
  var new_chat_photo: js.UndefOr[js.Array[PhotoSize]] = js.undefined
  var new_chat_title: js.UndefOr[java.lang.String] = js.undefined
  var photo: js.UndefOr[js.Array[PhotoSize]] = js.undefined
  var pinned_message: js.UndefOr[Message] = js.undefined
  var reply_to_message: js.UndefOr[Message] = js.undefined
  var sticker: js.UndefOr[Sticker] = js.undefined
  var successful_payment: js.UndefOr[SuccessfulPayment] = js.undefined
  var supergroup_chat_created: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var venue: js.UndefOr[Venue] = js.undefined
  var video: js.UndefOr[Video] = js.undefined
  var video_note: js.UndefOr[VideoNote] = js.undefined
  var voice: js.UndefOr[Voice] = js.undefined
}

