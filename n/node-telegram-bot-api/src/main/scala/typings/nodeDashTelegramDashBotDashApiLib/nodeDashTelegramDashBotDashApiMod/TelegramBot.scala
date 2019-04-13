package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelegramBot
  extends nodeLib.eventsMod.EventEmitter {
  def addListener(
    event: MessageType,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_callback_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query,
    listener: js.Function1[/* query */ CallbackQuery, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_chosen_inline_result(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result,
    listener: js.Function1[/* result */ ChosenInlineResult, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_edited_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_edited_channel_post_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_edited_channel_post_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_edited_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_edited_message_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_edited_message_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_inline_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query,
    listener: js.Function1[/* query */ InlineQuery, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_polling_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_pre_checkout_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query,
    listener: js.Function1[/* query */ PreCheckoutQuery, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_shipping_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query,
    listener: js.Function1[/* query */ ShippingQuery, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_webhook_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  /**
    * @deprecated since version 0.30.0
    */
  def answerCallbackQuery(): js.Promise[scala.Boolean] = js.native
  def answerCallbackQuery(callbackQueryId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def answerCallbackQuery(callbackQueryId: java.lang.String, options: stdLib.Partial[AnswerCallbackQueryOptions]): js.Promise[scala.Boolean] = js.native
  def answerCallbackQuery(options: AnswerCallbackQueryOptions): js.Promise[scala.Boolean] = js.native
  def answerInlineQuery(inlineQueryId: java.lang.String, results: js.Array[InlineQueryResult]): js.Promise[scala.Boolean] = js.native
  def answerInlineQuery(
    inlineQueryId: java.lang.String,
    results: js.Array[InlineQueryResult],
    options: AnswerInlineQueryOptions
  ): js.Promise[scala.Boolean] = js.native
  def answerPreCheckoutQuery(preCheckoutQueryId: java.lang.String, ok: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def answerPreCheckoutQuery(preCheckoutQueryId: java.lang.String, ok: scala.Boolean, options: AnswerPreCheckoutQueryOptions): js.Promise[scala.Boolean] = js.native
  def answerShippingQuery(shippingQueryId: java.lang.String, ok: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def answerShippingQuery(shippingQueryId: java.lang.String, ok: scala.Boolean, options: AnswerShippingQueryOptions): js.Promise[scala.Boolean] = js.native
  def closeWebHook(): js.Promise[_] = js.native
  def deleteChatPhoto(chatId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def deleteChatPhoto(chatId: scala.Double): js.Promise[scala.Boolean] = js.native
  def deleteChatStickerSet(chatId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def deleteChatStickerSet(chatId: scala.Double): js.Promise[scala.Boolean] = js.native
  def deleteMessage(chatId: java.lang.String, messageId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def deleteMessage(chatId: java.lang.String, messageId: java.lang.String, options: js.Any): js.Promise[scala.Boolean] = js.native
  def deleteMessage(chatId: scala.Double, messageId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def deleteMessage(chatId: scala.Double, messageId: java.lang.String, options: js.Any): js.Promise[scala.Boolean] = js.native
  def deleteWebHook(): js.Promise[scala.Boolean] = js.native
  def downloadFile(fileId: java.lang.String, downloadDir: java.lang.String): js.Promise[java.lang.String] = js.native
  def editMessageCaption(caption: java.lang.String): js.Promise[Message | scala.Boolean] = js.native
  def editMessageCaption(caption: java.lang.String, options: EditMessageCaptionOptions): js.Promise[Message | scala.Boolean] = js.native
  def editMessageLiveLocation(latitude: scala.Double, longitude: scala.Double): js.Promise[Message | scala.Boolean] = js.native
  def editMessageLiveLocation(latitude: scala.Double, longitude: scala.Double, options: EditMessageLiveLocationOptions): js.Promise[Message | scala.Boolean] = js.native
  def editMessageReplyMarkup(replyMarkup: InlineKeyboardMarkup): js.Promise[Message | scala.Boolean] = js.native
  def editMessageReplyMarkup(replyMarkup: InlineKeyboardMarkup, options: EditMessageReplyMarkupOptions): js.Promise[Message | scala.Boolean] = js.native
  def editMessageText(text: java.lang.String): js.Promise[Message | scala.Boolean] = js.native
  def editMessageText(text: java.lang.String, options: EditMessageTextOptions): js.Promise[Message | scala.Boolean] = js.native
  def exportChatInviteLink(chatId: java.lang.String): js.Promise[java.lang.String] = js.native
  def exportChatInviteLink(chatId: scala.Double): js.Promise[java.lang.String] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: java.lang.String, messageId: java.lang.String): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: java.lang.String,
    messageId: java.lang.String,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: java.lang.String, messageId: scala.Double): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: java.lang.String,
    messageId: scala.Double,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: scala.Double, messageId: java.lang.String): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: scala.Double,
    messageId: java.lang.String,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: scala.Double, messageId: scala.Double): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: scala.Double,
    messageId: scala.Double,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: java.lang.String, messageId: java.lang.String): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: java.lang.String,
    messageId: java.lang.String,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: java.lang.String, messageId: scala.Double): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: java.lang.String,
    messageId: scala.Double,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: scala.Double, messageId: java.lang.String): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: scala.Double,
    messageId: java.lang.String,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: scala.Double, messageId: scala.Double): js.Promise[Message] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: scala.Double,
    messageId: scala.Double,
    options: ForwardMessageOptions
  ): js.Promise[Message] = js.native
  def getChat(chatId: java.lang.String): js.Promise[Chat] = js.native
  def getChat(chatId: scala.Double): js.Promise[Chat] = js.native
  def getChatAdministrators(chatId: java.lang.String): js.Promise[js.Array[ChatMember]] = js.native
  def getChatAdministrators(chatId: scala.Double): js.Promise[js.Array[ChatMember]] = js.native
  def getChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[ChatMember] = js.native
  def getChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[ChatMember] = js.native
  def getChatMembersCount(chatId: java.lang.String): js.Promise[scala.Double] = js.native
  def getChatMembersCount(chatId: scala.Double): js.Promise[scala.Double] = js.native
  def getFile(fileId: java.lang.String): js.Promise[File] = js.native
  def getFileLink(fileId: java.lang.String): js.Promise[java.lang.String] = js.native
  def getFileStream(fileId: java.lang.String): nodeLib.streamMod.Readable = js.native
  def getGameHighScores(userId: java.lang.String): js.Promise[js.Array[GameHighScore]] = js.native
  def getGameHighScores(userId: java.lang.String, options: GetGameHighScoresOptions): js.Promise[js.Array[GameHighScore]] = js.native
  def getMe(): js.Promise[User] = js.native
  def getUpdates(): js.Promise[js.Array[Update]] = js.native
  def getUpdates(options: GetUpdatesOptions): js.Promise[js.Array[Update]] = js.native
  def getUserProfilePhotos(userId: java.lang.String): js.Promise[UserProfilePhotos] = js.native
  def getUserProfilePhotos(userId: java.lang.String, options: GetUserProfilePhotosOptions): js.Promise[UserProfilePhotos] = js.native
  def getUserProfilePhotos(userId: scala.Double): js.Promise[UserProfilePhotos] = js.native
  def getUserProfilePhotos(userId: scala.Double, options: GetUserProfilePhotosOptions): js.Promise[UserProfilePhotos] = js.native
  def getWebHookInfo(): js.Promise[WebhookInfo] = js.native
  def hasOpenWebHook(): scala.Boolean = js.native
  def isPolling(): scala.Boolean = js.native
  def kickChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def leaveChat(chatId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def leaveChat(chatId: scala.Double): js.Promise[scala.Boolean] = js.native
  def listenerCount(
    event: MessageType | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error
  ): scala.Double = js.native
  def listeners(
    event: MessageType | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error
  ): js.Array[js.Function2[/* data */ _, /* metadata */ js.UndefOr[Metadata], scala.Unit]] = js.native
  def off(
    event: MessageType,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callback_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query,
    listener: js.Function1[/* query */ CallbackQuery, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_chosen_inline_result(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result,
    listener: js.Function1[/* result */ ChosenInlineResult, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_edited_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_edited_channel_post_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_edited_channel_post_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_edited_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_edited_message_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_edited_message_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_inline_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query,
    listener: js.Function1[/* query */ InlineQuery, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_polling_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_pre_checkout_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query,
    listener: js.Function1[/* query */ PreCheckoutQuery, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_shipping_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query,
    listener: js.Function1[/* query */ ShippingQuery, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_webhook_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  def on(
    event: MessageType,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  def onReplyToMessage(
    chatId: java.lang.String,
    messageId: java.lang.String,
    callback: js.Function1[/* msg */ Message, scala.Unit]
  ): scala.Double = js.native
  def onReplyToMessage(
    chatId: java.lang.String,
    messageId: scala.Double,
    callback: js.Function1[/* msg */ Message, scala.Unit]
  ): scala.Double = js.native
  def onReplyToMessage(
    chatId: scala.Double,
    messageId: java.lang.String,
    callback: js.Function1[/* msg */ Message, scala.Unit]
  ): scala.Double = js.native
  def onReplyToMessage(
    chatId: scala.Double,
    messageId: scala.Double,
    callback: js.Function1[/* msg */ Message, scala.Unit]
  ): scala.Double = js.native
  def onText(
    regexp: stdLib.RegExp,
    callback: js.Function2[/* msg */ Message, /* match */ stdLib.RegExpExecArray | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_callback_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query,
    listener: js.Function1[/* query */ CallbackQuery, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_chosen_inline_result(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result,
    listener: js.Function1[/* result */ ChosenInlineResult, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_edited_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_edited_channel_post_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_edited_channel_post_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_edited_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_edited_message_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_edited_message_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_inline_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query,
    listener: js.Function1[/* query */ InlineQuery, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_polling_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pre_checkout_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query,
    listener: js.Function1[/* query */ PreCheckoutQuery, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_shipping_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query,
    listener: js.Function1[/* query */ ShippingQuery, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_webhook_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  def once(
    event: MessageType,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callback_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query,
    listener: js.Function1[/* query */ CallbackQuery, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_chosen_inline_result(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result,
    listener: js.Function1[/* result */ ChosenInlineResult, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_edited_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_edited_channel_post_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_edited_channel_post_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_edited_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_edited_message_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_edited_message_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_inline_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query,
    listener: js.Function1[/* query */ InlineQuery, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_polling_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_pre_checkout_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query,
    listener: js.Function1[/* query */ PreCheckoutQuery, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_shipping_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query,
    listener: js.Function1[/* query */ ShippingQuery, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_webhook_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  def openWebHook(): js.Promise[_] = js.native
  def pinChatMessage(chatId: java.lang.String, messageId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def pinChatMessage(chatId: scala.Double, messageId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def prependListener(
    event: MessageType,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_callback_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query,
    listener: js.Function1[/* query */ CallbackQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_chosen_inline_result(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result,
    listener: js.Function1[/* result */ ChosenInlineResult, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_edited_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_edited_channel_post_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_edited_channel_post_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_edited_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_edited_message_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_edited_message_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_inline_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query,
    listener: js.Function1[/* query */ InlineQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_polling_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_pre_checkout_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query,
    listener: js.Function1[/* query */ PreCheckoutQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_shipping_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query,
    listener: js.Function1[/* query */ ShippingQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_webhook_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  def prependOnceListener(
    event: MessageType,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_callback_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query,
    listener: js.Function1[/* query */ CallbackQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_chosen_inline_result(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result,
    listener: js.Function1[/* result */ ChosenInlineResult, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_edited_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_edited_channel_post_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_edited_channel_post_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_edited_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_edited_message_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_edited_message_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_inline_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query,
    listener: js.Function1[/* query */ InlineQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_polling_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pre_checkout_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query,
    listener: js.Function1[/* query */ PreCheckoutQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_shipping_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query,
    listener: js.Function1[/* query */ ShippingQuery, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_webhook_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  def processUpdate(update: Update): scala.Unit = js.native
  def promoteChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def promoteChatMember(chatId: java.lang.String, userId: java.lang.String, options: PromoteChatMemberOptions): js.Promise[scala.Boolean] = js.native
  def promoteChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def promoteChatMember(chatId: scala.Double, userId: java.lang.String, options: PromoteChatMemberOptions): js.Promise[scala.Boolean] = js.native
  def rawListeners(
    event: MessageType | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error
  ): js.Array[js.Function2[/* data */ _, /* metadata */ js.UndefOr[Metadata], scala.Unit]] = js.native
  def removeAllListeners(
    event: MessageType | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error | nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error
  ): this.type = js.native
  def removeListener(
    event: MessageType,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_callback_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.callback_query,
    listener: js.Function1[/* query */ CallbackQuery, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_chosen_inline_result(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.chosen_inline_result,
    listener: js.Function1[/* result */ ChosenInlineResult, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_edited_channel_post(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_edited_channel_post_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_edited_channel_post_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_channel_post_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_edited_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_edited_message_caption(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_caption,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_edited_message_text(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.edited_message_text,
    listener: js.Function1[/* message */ Message, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_inline_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.inline_query,
    listener: js.Function1[/* query */ InlineQuery, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.message,
    listener: js.Function2[/* message */ Message, /* metadata */ Metadata, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_polling_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.polling_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_pre_checkout_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.pre_checkout_query,
    listener: js.Function1[/* query */ PreCheckoutQuery, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_shipping_query(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.shipping_query,
    listener: js.Function1[/* query */ ShippingQuery, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_webhook_error(
    event: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiLibStrings.webhook_error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  def removeReplyListener(replyListenerId: scala.Double): ReplyListener = js.native
  def removeTextListener(regexp: stdLib.RegExp): TextListener | scala.Null = js.native
  def restrictChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def restrictChatMember(chatId: java.lang.String, userId: java.lang.String, options: RestrictChatMemberOptions): js.Promise[scala.Boolean] = js.native
  def restrictChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def restrictChatMember(chatId: scala.Double, userId: java.lang.String, options: RestrictChatMemberOptions): js.Promise[scala.Boolean] = js.native
  def sendAudio(chatId: java.lang.String, audio: java.lang.String): js.Promise[Message] = js.native
  def sendAudio(chatId: java.lang.String, audio: java.lang.String, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: java.lang.String, audio: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendAudio(chatId: java.lang.String, audio: nodeLib.Buffer, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: java.lang.String, audio: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendAudio(chatId: java.lang.String, audio: nodeLib.streamMod.Stream, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: scala.Double, audio: java.lang.String): js.Promise[Message] = js.native
  def sendAudio(chatId: scala.Double, audio: java.lang.String, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: scala.Double, audio: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendAudio(chatId: scala.Double, audio: nodeLib.Buffer, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: scala.Double, audio: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendAudio(chatId: scala.Double, audio: nodeLib.streamMod.Stream, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendChatAction(chatId: java.lang.String, action: ChatAction): js.Promise[scala.Boolean] = js.native
  def sendChatAction(chatId: scala.Double, action: ChatAction): js.Promise[scala.Boolean] = js.native
  def sendContact(chatId: java.lang.String, phoneNumber: java.lang.String, firstName: java.lang.String): js.Promise[Message] = js.native
  def sendContact(
    chatId: java.lang.String,
    phoneNumber: java.lang.String,
    firstName: java.lang.String,
    options: SendContactOptions
  ): js.Promise[Message] = js.native
  def sendContact(chatId: scala.Double, phoneNumber: java.lang.String, firstName: java.lang.String): js.Promise[Message] = js.native
  def sendContact(
    chatId: scala.Double,
    phoneNumber: java.lang.String,
    firstName: java.lang.String,
    options: SendContactOptions
  ): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: java.lang.String): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: java.lang.String, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: java.lang.String, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: nodeLib.Buffer, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: nodeLib.Buffer, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendDocument(chatId: java.lang.String, doc: nodeLib.streamMod.Stream, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(
    chatId: java.lang.String,
    doc: nodeLib.streamMod.Stream,
    options: SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: java.lang.String): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: java.lang.String, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: java.lang.String, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: nodeLib.Buffer, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: nodeLib.Buffer, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendDocument(chatId: scala.Double, doc: nodeLib.streamMod.Stream, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(
    chatId: scala.Double,
    doc: nodeLib.streamMod.Stream,
    options: SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[Message] = js.native
  def sendGame(chatId: java.lang.String, gameShortName: java.lang.String): js.Promise[Message] = js.native
  def sendGame(chatId: java.lang.String, gameShortName: java.lang.String, options: SendGameOptions): js.Promise[Message] = js.native
  def sendGame(chatId: scala.Double, gameShortName: java.lang.String): js.Promise[Message] = js.native
  def sendGame(chatId: scala.Double, gameShortName: java.lang.String, options: SendGameOptions): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: java.lang.String,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[LabeledPrice]
  ): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: java.lang.String,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[LabeledPrice],
    options: SendInvoiceOptions
  ): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: scala.Double,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[LabeledPrice]
  ): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: scala.Double,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[LabeledPrice],
    options: SendInvoiceOptions
  ): js.Promise[Message] = js.native
  def sendLocation(chatId: java.lang.String, latitude: scala.Double, longitude: scala.Double): js.Promise[Message] = js.native
  def sendLocation(
    chatId: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    options: SendLocationOptions
  ): js.Promise[Message] = js.native
  def sendLocation(chatId: scala.Double, latitude: scala.Double, longitude: scala.Double): js.Promise[Message] = js.native
  def sendLocation(
    chatId: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    options: SendLocationOptions
  ): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: java.lang.String, media: js.Array[InputMedia]): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: java.lang.String, media: js.Array[InputMedia], options: SendMediaGroupOptions): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: scala.Double, media: js.Array[InputMedia]): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: scala.Double, media: js.Array[InputMedia], options: SendMediaGroupOptions): js.Promise[Message] = js.native
  def sendMessage(chatId: java.lang.String, text: java.lang.String): js.Promise[Message] = js.native
  def sendMessage(chatId: java.lang.String, text: java.lang.String, options: SendMessageOptions): js.Promise[Message] = js.native
  def sendMessage(chatId: scala.Double, text: java.lang.String): js.Promise[Message] = js.native
  def sendMessage(chatId: scala.Double, text: java.lang.String, options: SendMessageOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: java.lang.String, photo: java.lang.String): js.Promise[Message] = js.native
  def sendPhoto(chatId: java.lang.String, photo: java.lang.String, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: java.lang.String, photo: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendPhoto(chatId: java.lang.String, photo: nodeLib.Buffer, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: java.lang.String, photo: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendPhoto(chatId: java.lang.String, photo: nodeLib.streamMod.Stream, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: scala.Double, photo: java.lang.String): js.Promise[Message] = js.native
  def sendPhoto(chatId: scala.Double, photo: java.lang.String, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: scala.Double, photo: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendPhoto(chatId: scala.Double, photo: nodeLib.Buffer, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: scala.Double, photo: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendPhoto(chatId: scala.Double, photo: nodeLib.streamMod.Stream, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: java.lang.String, sticker: java.lang.String): js.Promise[Message] = js.native
  def sendSticker(chatId: java.lang.String, sticker: java.lang.String, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: java.lang.String, sticker: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendSticker(chatId: java.lang.String, sticker: nodeLib.Buffer, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: java.lang.String, sticker: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendSticker(chatId: java.lang.String, sticker: nodeLib.streamMod.Stream, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: scala.Double, sticker: java.lang.String): js.Promise[Message] = js.native
  def sendSticker(chatId: scala.Double, sticker: java.lang.String, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: scala.Double, sticker: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendSticker(chatId: scala.Double, sticker: nodeLib.Buffer, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: scala.Double, sticker: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendSticker(chatId: scala.Double, sticker: nodeLib.streamMod.Stream, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendVenue(
    chatId: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String
  ): js.Promise[Message] = js.native
  def sendVenue(
    chatId: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String,
    options: SendVenueOptions
  ): js.Promise[Message] = js.native
  def sendVenue(
    chatId: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String
  ): js.Promise[Message] = js.native
  def sendVenue(
    chatId: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String,
    options: SendVenueOptions
  ): js.Promise[Message] = js.native
  def sendVideo(chatId: java.lang.String, video: java.lang.String): js.Promise[Message] = js.native
  def sendVideo(chatId: java.lang.String, video: java.lang.String, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: java.lang.String, video: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendVideo(chatId: java.lang.String, video: nodeLib.Buffer, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: java.lang.String, video: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendVideo(chatId: java.lang.String, video: nodeLib.streamMod.Stream, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: scala.Double, video: java.lang.String): js.Promise[Message] = js.native
  def sendVideo(chatId: scala.Double, video: java.lang.String, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: scala.Double, video: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendVideo(chatId: scala.Double, video: nodeLib.Buffer, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: scala.Double, video: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendVideo(chatId: scala.Double, video: nodeLib.streamMod.Stream, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: java.lang.String): js.Promise[Message] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: java.lang.String, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: nodeLib.Buffer, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: nodeLib.streamMod.Stream, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: java.lang.String): js.Promise[Message] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: java.lang.String, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: nodeLib.Buffer, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: nodeLib.streamMod.Stream, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: java.lang.String, voice: java.lang.String): js.Promise[Message] = js.native
  def sendVoice(chatId: java.lang.String, voice: java.lang.String, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: java.lang.String, voice: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendVoice(chatId: java.lang.String, voice: nodeLib.Buffer, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: java.lang.String, voice: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendVoice(chatId: java.lang.String, voice: nodeLib.streamMod.Stream, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: scala.Double, voice: java.lang.String): js.Promise[Message] = js.native
  def sendVoice(chatId: scala.Double, voice: java.lang.String, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: scala.Double, voice: nodeLib.Buffer): js.Promise[Message] = js.native
  def sendVoice(chatId: scala.Double, voice: nodeLib.Buffer, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: scala.Double, voice: nodeLib.streamMod.Stream): js.Promise[Message] = js.native
  def sendVoice(chatId: scala.Double, voice: nodeLib.streamMod.Stream, options: SendVoiceOptions): js.Promise[Message] = js.native
  def setChatDescription(chatId: java.lang.String, description: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setChatDescription(chatId: scala.Double, description: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setChatPhoto(chatId: java.lang.String, photo: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setChatPhoto(chatId: java.lang.String, photo: nodeLib.Buffer): js.Promise[scala.Boolean] = js.native
  def setChatPhoto(chatId: java.lang.String, photo: nodeLib.streamMod.Stream): js.Promise[scala.Boolean] = js.native
  def setChatPhoto(chatId: scala.Double, photo: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setChatPhoto(chatId: scala.Double, photo: nodeLib.Buffer): js.Promise[scala.Boolean] = js.native
  def setChatPhoto(chatId: scala.Double, photo: nodeLib.streamMod.Stream): js.Promise[scala.Boolean] = js.native
  def setChatStickerSet(chatId: java.lang.String, stickerSetName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setChatStickerSet(chatId: scala.Double, stickerSetName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setChatTitle(chatId: java.lang.String, title: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setChatTitle(chatId: scala.Double, title: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setGameScore(userId: java.lang.String, score: scala.Double): js.Promise[Message | scala.Boolean] = js.native
  def setGameScore(userId: java.lang.String, score: scala.Double, options: SetGameScoreOptions): js.Promise[Message | scala.Boolean] = js.native
  def setWebHook(url: java.lang.String): js.Promise[_] = js.native
  def setWebHook(url: java.lang.String, options: SetWebHookOptions): js.Promise[_] = js.native
  def startPolling(): js.Promise[_] = js.native
  def startPolling(options: StartPollingOptions): js.Promise[_] = js.native
  def stopMessageLiveLocation(): js.Promise[Message | scala.Boolean] = js.native
  def stopMessageLiveLocation(options: StopMessageLiveLocationOptions): js.Promise[Message | scala.Boolean] = js.native
  def stopPolling(): js.Promise[_] = js.native
  def stopPolling(options: StopPollingOptions): js.Promise[_] = js.native
  def unbanChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def unbanChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def unpinChatMessage(chatId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def unpinChatMessage(chatId: scala.Double): js.Promise[scala.Boolean] = js.native
}

