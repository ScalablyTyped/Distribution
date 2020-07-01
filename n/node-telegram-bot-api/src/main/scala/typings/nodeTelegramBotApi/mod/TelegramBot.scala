package typings.nodeTelegramBotApi.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.nodeTelegramBotApi.anon.PartialAnswerCallbackQuer
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.callback_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel_post
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.chosen_inline_result
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_channel_post
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_channel_post_caption
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_channel_post_text
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_message
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_message_caption
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_message_text
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.error
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.inline_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.message
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.polling_error
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.pre_checkout_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.shipping_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.webhook_error
import typings.std.Error
import typings.std.RegExp
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelegramBot extends EventEmitter {
  def addListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_channelpost(event: channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_editedchannelpost(event: edited_channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_editedchannelpostcaption(event: edited_channel_post_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_editedchannelposttext(event: edited_channel_post_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_editedmessage(event: edited_message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_editedmessagecaption(event: edited_message_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_editedmessagetext(event: edited_message_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pollingerror(event: polling_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_webhookerror(event: webhook_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  /**
    * @deprecated since version 0.30.0
    */
  def answerCallbackQuery(): js.Promise[Boolean] = js.native
  def answerCallbackQuery(callbackQueryId: String): js.Promise[Boolean] = js.native
  def answerCallbackQuery(callbackQueryId: String, options: PartialAnswerCallbackQuer): js.Promise[Boolean] = js.native
  def answerCallbackQuery(options: AnswerCallbackQueryOptions): js.Promise[Boolean] = js.native
  def answerInlineQuery(inlineQueryId: String, results: js.Array[InlineQueryResult]): js.Promise[Boolean] = js.native
  def answerInlineQuery(inlineQueryId: String, results: js.Array[InlineQueryResult], options: AnswerInlineQueryOptions): js.Promise[Boolean] = js.native
  def answerPreCheckoutQuery(preCheckoutQueryId: String, ok: Boolean): js.Promise[Boolean] = js.native
  def answerPreCheckoutQuery(preCheckoutQueryId: String, ok: Boolean, options: AnswerPreCheckoutQueryOptions): js.Promise[Boolean] = js.native
  def answerShippingQuery(shippingQueryId: String, ok: Boolean): js.Promise[Boolean] = js.native
  def answerShippingQuery(shippingQueryId: String, ok: Boolean, options: AnswerShippingQueryOptions): js.Promise[Boolean] = js.native
  def closeWebHook(): js.Promise[_] = js.native
  def deleteChatPhoto(chatId: String): js.Promise[Boolean] = js.native
  def deleteChatPhoto(chatId: Double): js.Promise[Boolean] = js.native
  def deleteChatStickerSet(chatId: String): js.Promise[Boolean] = js.native
  def deleteChatStickerSet(chatId: Double): js.Promise[Boolean] = js.native
  def deleteMessage(chatId: String, messageId: String): js.Promise[Boolean] = js.native
  def deleteMessage(chatId: String, messageId: String, options: js.Any): js.Promise[Boolean] = js.native
  def deleteMessage(chatId: Double, messageId: String): js.Promise[Boolean] = js.native
  def deleteMessage(chatId: Double, messageId: String, options: js.Any): js.Promise[Boolean] = js.native
  def deleteWebHook(): js.Promise[Boolean] = js.native
  def downloadFile(fileId: String, downloadDir: String): js.Promise[String] = js.native
  def editMessageCaption(caption: String): js.Promise[Message | Boolean] = js.native
  def editMessageCaption(caption: String, options: EditMessageCaptionOptions): js.Promise[Message | Boolean] = js.native
  def editMessageLiveLocation(latitude: Double, longitude: Double): js.Promise[Message | Boolean] = js.native
  def editMessageLiveLocation(latitude: Double, longitude: Double, options: EditMessageLiveLocationOptions): js.Promise[Message | Boolean] = js.native
  def editMessageReplyMarkup(replyMarkup: InlineKeyboardMarkup): js.Promise[Message | Boolean] = js.native
  def editMessageReplyMarkup(replyMarkup: InlineKeyboardMarkup, options: EditMessageReplyMarkupOptions): js.Promise[Message | Boolean] = js.native
  def editMessageText(text: String): js.Promise[Message | Boolean] = js.native
  def editMessageText(text: String, options: EditMessageTextOptions): js.Promise[Message | Boolean] = js.native
  def exportChatInviteLink(chatId: String): js.Promise[String] = js.native
  def exportChatInviteLink(chatId: Double): js.Promise[String] = js.native
  def forwardMessage(chatId: String, fromChatId: String, messageId: String): js.Promise[Message] = js.native
  def forwardMessage(chatId: String, fromChatId: String, messageId: String, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def forwardMessage(chatId: String, fromChatId: String, messageId: Double): js.Promise[Message] = js.native
  def forwardMessage(chatId: String, fromChatId: String, messageId: Double, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def forwardMessage(chatId: String, fromChatId: Double, messageId: String): js.Promise[Message] = js.native
  def forwardMessage(chatId: String, fromChatId: Double, messageId: String, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def forwardMessage(chatId: String, fromChatId: Double, messageId: Double): js.Promise[Message] = js.native
  def forwardMessage(chatId: String, fromChatId: Double, messageId: Double, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: String, messageId: String): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: String, messageId: String, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: String, messageId: Double): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: String, messageId: Double, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: Double, messageId: String): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: Double, messageId: String, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: Double, messageId: Double): js.Promise[Message] = js.native
  def forwardMessage(chatId: Double, fromChatId: Double, messageId: Double, options: ForwardMessageOptions): js.Promise[Message] = js.native
  def getChat(chatId: String): js.Promise[Chat] = js.native
  def getChat(chatId: Double): js.Promise[Chat] = js.native
  def getChatAdministrators(chatId: String): js.Promise[js.Array[ChatMember]] = js.native
  def getChatAdministrators(chatId: Double): js.Promise[js.Array[ChatMember]] = js.native
  def getChatMember(chatId: String, userId: String): js.Promise[ChatMember] = js.native
  def getChatMember(chatId: Double, userId: String): js.Promise[ChatMember] = js.native
  def getChatMembersCount(chatId: String): js.Promise[Double] = js.native
  def getChatMembersCount(chatId: Double): js.Promise[Double] = js.native
  def getFile(fileId: String): js.Promise[File] = js.native
  def getFileLink(fileId: String): js.Promise[String] = js.native
  def getFileStream(fileId: String): Readable = js.native
  def getGameHighScores(userId: String): js.Promise[js.Array[GameHighScore]] = js.native
  def getGameHighScores(userId: String, options: GetGameHighScoresOptions): js.Promise[js.Array[GameHighScore]] = js.native
  def getMe(): js.Promise[User] = js.native
  def getMyCommands(): js.Promise[js.Array[BotCommand]] = js.native
  def getUpdates(): js.Promise[js.Array[Update]] = js.native
  def getUpdates(options: GetUpdatesOptions): js.Promise[js.Array[Update]] = js.native
  def getUserProfilePhotos(userId: String): js.Promise[UserProfilePhotos] = js.native
  def getUserProfilePhotos(userId: String, options: GetUserProfilePhotosOptions): js.Promise[UserProfilePhotos] = js.native
  def getUserProfilePhotos(userId: Double): js.Promise[UserProfilePhotos] = js.native
  def getUserProfilePhotos(userId: Double, options: GetUserProfilePhotosOptions): js.Promise[UserProfilePhotos] = js.native
  def getWebHookInfo(): js.Promise[WebhookInfo] = js.native
  def hasOpenWebHook(): Boolean = js.native
  def isPolling(): Boolean = js.native
  def kickChatMember(chatId: String, userId: String): js.Promise[Boolean] = js.native
  def kickChatMember(chatId: Double, userId: String): js.Promise[Boolean] = js.native
  def leaveChat(chatId: String): js.Promise[Boolean] = js.native
  def leaveChat(chatId: Double): js.Promise[Boolean] = js.native
  def listenerCount(
    event: MessageType | message | callback_query | inline_query | chosen_inline_result | channel_post | edited_message | edited_message_text | edited_message_caption | edited_channel_post | edited_channel_post_text | edited_channel_post_caption | shipping_query | pre_checkout_query | polling_error | webhook_error | error
  ): Double = js.native
  def listeners(
    event: MessageType | message | callback_query | inline_query | chosen_inline_result | channel_post | edited_message | edited_message_text | edited_message_caption | edited_channel_post | edited_channel_post_text | edited_channel_post_caption | shipping_query | pre_checkout_query | polling_error | webhook_error | error
  ): js.Array[js.Function2[/* data */ _, /* metadata */ js.UndefOr[Metadata], Unit]] = js.native
  def off(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("off")
  def off_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("off")
  def off_channelpost(event: channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("off")
  def off_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("off")
  def off_editedchannelpost(event: edited_channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("off")
  def off_editedchannelpostcaption(event: edited_channel_post_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("off")
  def off_editedchannelposttext(event: edited_channel_post_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("off")
  def off_editedmessage(event: edited_message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("off")
  def off_editedmessagecaption(event: edited_message_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("off")
  def off_editedmessagetext(event: edited_message_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("off")
  def off_pollingerror(event: polling_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("off")
  def off_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  @JSName("off")
  def off_webhookerror(event: webhook_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  def on(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  def onReplyToMessage(chatId: String, messageId: String, callback: js.Function1[/* msg */ Message, Unit]): Double = js.native
  def onReplyToMessage(chatId: String, messageId: Double, callback: js.Function1[/* msg */ Message, Unit]): Double = js.native
  def onReplyToMessage(chatId: Double, messageId: String, callback: js.Function1[/* msg */ Message, Unit]): Double = js.native
  def onReplyToMessage(chatId: Double, messageId: Double, callback: js.Function1[/* msg */ Message, Unit]): Double = js.native
  def onText(
    regexp: RegExp,
    callback: js.Function2[/* msg */ Message, /* match */ RegExpExecArray | Null, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("on")
  def on_channelpost(event: channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("on")
  def on_editedchannelpost(event: edited_channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_editedchannelpostcaption(event: edited_channel_post_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_editedchannelposttext(event: edited_channel_post_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_editedmessage(event: edited_message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_editedmessagecaption(event: edited_message_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_editedmessagetext(event: edited_message_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("on")
  def on_pollingerror(event: polling_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("on")
  def on_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  @JSName("on")
  def on_webhookerror(event: webhook_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  def once(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("once")
  def once_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("once")
  def once_channelpost(event: channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("once")
  def once_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("once")
  def once_editedchannelpost(event: edited_channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("once")
  def once_editedchannelpostcaption(event: edited_channel_post_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("once")
  def once_editedchannelposttext(event: edited_channel_post_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("once")
  def once_editedmessage(event: edited_message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("once")
  def once_editedmessagecaption(event: edited_message_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("once")
  def once_editedmessagetext(event: edited_message_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("once")
  def once_pollingerror(event: polling_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("once")
  def once_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  @JSName("once")
  def once_webhookerror(event: webhook_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  def openWebHook(): js.Promise[_] = js.native
  def pinChatMessage(chatId: String, messageId: String): js.Promise[Boolean] = js.native
  def pinChatMessage(chatId: Double, messageId: String): js.Promise[Boolean] = js.native
  def prependListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_channelpost(event: channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_editedchannelpost(event: edited_channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_editedchannelpostcaption(event: edited_channel_post_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_editedchannelposttext(event: edited_channel_post_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_editedmessage(event: edited_message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_editedmessagecaption(event: edited_message_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_editedmessagetext(event: edited_message_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pollingerror(event: polling_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_webhookerror(event: webhook_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  def prependOnceListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_channelpost(event: channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_editedchannelpost(event: edited_channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_editedchannelpostcaption(event: edited_channel_post_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_editedchannelposttext(event: edited_channel_post_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_editedmessage(event: edited_message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_editedmessagecaption(event: edited_message_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_editedmessagetext(event: edited_message_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pollingerror(event: polling_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_webhookerror(event: webhook_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  def processUpdate(update: Update): Unit = js.native
  def promoteChatMember(chatId: String, userId: String): js.Promise[Boolean] = js.native
  def promoteChatMember(chatId: String, userId: String, options: PromoteChatMemberOptions): js.Promise[Boolean] = js.native
  def promoteChatMember(chatId: Double, userId: String): js.Promise[Boolean] = js.native
  def promoteChatMember(chatId: Double, userId: String, options: PromoteChatMemberOptions): js.Promise[Boolean] = js.native
  def rawListeners(
    event: MessageType | message | callback_query | inline_query | chosen_inline_result | channel_post | edited_message | edited_message_text | edited_message_caption | edited_channel_post | edited_channel_post_text | edited_channel_post_caption | shipping_query | pre_checkout_query | polling_error | webhook_error | error
  ): js.Array[js.Function2[/* data */ _, /* metadata */ js.UndefOr[Metadata], Unit]] = js.native
  def removeAllListeners(
    event: MessageType | message | callback_query | inline_query | chosen_inline_result | channel_post | edited_message | edited_message_text | edited_message_caption | edited_channel_post | edited_channel_post_text | edited_channel_post_caption | shipping_query | pre_checkout_query | polling_error | webhook_error | error
  ): this.type = js.native
  def removeListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_channelpost(event: channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_editedchannelpost(event: edited_channel_post, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_editedchannelpostcaption(event: edited_channel_post_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_editedchannelposttext(event: edited_channel_post_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_editedmessage(event: edited_message, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_editedmessagecaption(event: edited_message_caption, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_editedmessagetext(event: edited_message_text, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pollingerror(event: polling_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_webhookerror(event: webhook_error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  def removeReplyListener(replyListenerId: Double): ReplyListener = js.native
  def removeTextListener(regexp: RegExp): TextListener | Null = js.native
  def restrictChatMember(chatId: String, userId: String): js.Promise[Boolean] = js.native
  def restrictChatMember(chatId: String, userId: String, options: RestrictChatMemberOptions): js.Promise[Boolean] = js.native
  def restrictChatMember(chatId: Double, userId: String): js.Promise[Boolean] = js.native
  def restrictChatMember(chatId: Double, userId: String, options: RestrictChatMemberOptions): js.Promise[Boolean] = js.native
  def sendAudio(chatId: String, audio: String): js.Promise[Message] = js.native
  def sendAudio(chatId: String, audio: String, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: String, audio: Buffer): js.Promise[Message] = js.native
  def sendAudio(chatId: String, audio: Buffer, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: String, audio: Stream): js.Promise[Message] = js.native
  def sendAudio(chatId: String, audio: Stream, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: Double, audio: String): js.Promise[Message] = js.native
  def sendAudio(chatId: Double, audio: String, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: Double, audio: Buffer): js.Promise[Message] = js.native
  def sendAudio(chatId: Double, audio: Buffer, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: Double, audio: Stream): js.Promise[Message] = js.native
  def sendAudio(chatId: Double, audio: Stream, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendChatAction(chatId: String, action: ChatAction): js.Promise[Boolean] = js.native
  def sendChatAction(chatId: Double, action: ChatAction): js.Promise[Boolean] = js.native
  def sendContact(chatId: String, phoneNumber: String, firstName: String): js.Promise[Message] = js.native
  def sendContact(chatId: String, phoneNumber: String, firstName: String, options: SendContactOptions): js.Promise[Message] = js.native
  def sendContact(chatId: Double, phoneNumber: String, firstName: String): js.Promise[Message] = js.native
  def sendContact(chatId: Double, phoneNumber: String, firstName: String, options: SendContactOptions): js.Promise[Message] = js.native
  def sendDice(chatId: String): js.Promise[Message] = js.native
  def sendDice(chatId: String, options: SendDiceOptions): js.Promise[Message] = js.native
  def sendDice(chatId: Double): js.Promise[Message] = js.native
  def sendDice(chatId: Double, options: SendDiceOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: String): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: String, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: String, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: Buffer): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: Buffer, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: Buffer, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: Stream): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: Stream, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: String, doc: Stream, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: String): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: String, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: String, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: Buffer): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: Buffer, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: Buffer, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: Stream): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: Stream, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: Double, doc: Stream, options: SendDocumentOptions, fileOpts: js.Any): js.Promise[Message] = js.native
  def sendGame(chatId: String, gameShortName: String): js.Promise[Message] = js.native
  def sendGame(chatId: String, gameShortName: String, options: SendGameOptions): js.Promise[Message] = js.native
  def sendGame(chatId: Double, gameShortName: String): js.Promise[Message] = js.native
  def sendGame(chatId: Double, gameShortName: String, options: SendGameOptions): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: String,
    title: String,
    description: String,
    payload: String,
    providerToken: String,
    startParameter: String,
    currency: String,
    prices: js.Array[LabeledPrice]
  ): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: String,
    title: String,
    description: String,
    payload: String,
    providerToken: String,
    startParameter: String,
    currency: String,
    prices: js.Array[LabeledPrice],
    options: SendInvoiceOptions
  ): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: Double,
    title: String,
    description: String,
    payload: String,
    providerToken: String,
    startParameter: String,
    currency: String,
    prices: js.Array[LabeledPrice]
  ): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: Double,
    title: String,
    description: String,
    payload: String,
    providerToken: String,
    startParameter: String,
    currency: String,
    prices: js.Array[LabeledPrice],
    options: SendInvoiceOptions
  ): js.Promise[Message] = js.native
  def sendLocation(chatId: String, latitude: Double, longitude: Double): js.Promise[Message] = js.native
  def sendLocation(chatId: String, latitude: Double, longitude: Double, options: SendLocationOptions): js.Promise[Message] = js.native
  def sendLocation(chatId: Double, latitude: Double, longitude: Double): js.Promise[Message] = js.native
  def sendLocation(chatId: Double, latitude: Double, longitude: Double, options: SendLocationOptions): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: String, media: js.Array[InputMedia]): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: String, media: js.Array[InputMedia], options: SendMediaGroupOptions): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: Double, media: js.Array[InputMedia]): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: Double, media: js.Array[InputMedia], options: SendMediaGroupOptions): js.Promise[Message] = js.native
  def sendMessage(chatId: String, text: String): js.Promise[Message] = js.native
  def sendMessage(chatId: String, text: String, options: SendMessageOptions): js.Promise[Message] = js.native
  def sendMessage(chatId: Double, text: String): js.Promise[Message] = js.native
  def sendMessage(chatId: Double, text: String, options: SendMessageOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: String, photo: String): js.Promise[Message] = js.native
  def sendPhoto(chatId: String, photo: String, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: String, photo: Buffer): js.Promise[Message] = js.native
  def sendPhoto(chatId: String, photo: Buffer, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: String, photo: Stream): js.Promise[Message] = js.native
  def sendPhoto(chatId: String, photo: Stream, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: Double, photo: String): js.Promise[Message] = js.native
  def sendPhoto(chatId: Double, photo: String, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: Double, photo: Buffer): js.Promise[Message] = js.native
  def sendPhoto(chatId: Double, photo: Buffer, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: Double, photo: Stream): js.Promise[Message] = js.native
  def sendPhoto(chatId: Double, photo: Stream, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: String, sticker: String): js.Promise[Message] = js.native
  def sendSticker(chatId: String, sticker: String, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: String, sticker: Buffer): js.Promise[Message] = js.native
  def sendSticker(chatId: String, sticker: Buffer, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: String, sticker: Stream): js.Promise[Message] = js.native
  def sendSticker(chatId: String, sticker: Stream, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: Double, sticker: String): js.Promise[Message] = js.native
  def sendSticker(chatId: Double, sticker: String, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: Double, sticker: Buffer): js.Promise[Message] = js.native
  def sendSticker(chatId: Double, sticker: Buffer, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: Double, sticker: Stream): js.Promise[Message] = js.native
  def sendSticker(chatId: Double, sticker: Stream, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendVenue(chatId: String, latitude: Double, longitude: Double, title: String, address: String): js.Promise[Message] = js.native
  def sendVenue(
    chatId: String,
    latitude: Double,
    longitude: Double,
    title: String,
    address: String,
    options: SendVenueOptions
  ): js.Promise[Message] = js.native
  def sendVenue(chatId: Double, latitude: Double, longitude: Double, title: String, address: String): js.Promise[Message] = js.native
  def sendVenue(
    chatId: Double,
    latitude: Double,
    longitude: Double,
    title: String,
    address: String,
    options: SendVenueOptions
  ): js.Promise[Message] = js.native
  def sendVideo(chatId: String, video: String): js.Promise[Message] = js.native
  def sendVideo(chatId: String, video: String, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: String, video: Buffer): js.Promise[Message] = js.native
  def sendVideo(chatId: String, video: Buffer, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: String, video: Stream): js.Promise[Message] = js.native
  def sendVideo(chatId: String, video: Stream, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: Double, video: String): js.Promise[Message] = js.native
  def sendVideo(chatId: Double, video: String, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: Double, video: Buffer): js.Promise[Message] = js.native
  def sendVideo(chatId: Double, video: Buffer, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: Double, video: Stream): js.Promise[Message] = js.native
  def sendVideo(chatId: Double, video: Stream, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: String, videoNote: String): js.Promise[Message] = js.native
  def sendVideoNote(chatId: String, videoNote: String, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: String, videoNote: Buffer): js.Promise[Message] = js.native
  def sendVideoNote(chatId: String, videoNote: Buffer, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: String, videoNote: Stream): js.Promise[Message] = js.native
  def sendVideoNote(chatId: String, videoNote: Stream, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: Double, videoNote: String): js.Promise[Message] = js.native
  def sendVideoNote(chatId: Double, videoNote: String, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: Double, videoNote: Buffer): js.Promise[Message] = js.native
  def sendVideoNote(chatId: Double, videoNote: Buffer, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: Double, videoNote: Stream): js.Promise[Message] = js.native
  def sendVideoNote(chatId: Double, videoNote: Stream, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: String, voice: String): js.Promise[Message] = js.native
  def sendVoice(chatId: String, voice: String, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: String, voice: Buffer): js.Promise[Message] = js.native
  def sendVoice(chatId: String, voice: Buffer, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: String, voice: Stream): js.Promise[Message] = js.native
  def sendVoice(chatId: String, voice: Stream, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: Double, voice: String): js.Promise[Message] = js.native
  def sendVoice(chatId: Double, voice: String, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: Double, voice: Buffer): js.Promise[Message] = js.native
  def sendVoice(chatId: Double, voice: Buffer, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: Double, voice: Stream): js.Promise[Message] = js.native
  def sendVoice(chatId: Double, voice: Stream, options: SendVoiceOptions): js.Promise[Message] = js.native
  def setChatAdministratorCustomTitle(chatId: String, userId: String, customTitle: String): js.Promise[Boolean] = js.native
  def setChatAdministratorCustomTitle(chatId: Double, userId: String, customTitle: String): js.Promise[Boolean] = js.native
  def setChatDescription(chatId: String, description: String): js.Promise[Boolean] = js.native
  def setChatDescription(chatId: Double, description: String): js.Promise[Boolean] = js.native
  def setChatPermissions(chatId: String, chatPermissions: ChatPermissions): js.Promise[Boolean] = js.native
  def setChatPermissions(chatId: Double, chatPermissions: ChatPermissions): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: String, photo: String): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: String, photo: Buffer): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: String, photo: Stream): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: Double, photo: String): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: Double, photo: Buffer): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: Double, photo: Stream): js.Promise[Boolean] = js.native
  def setChatStickerSet(chatId: String, stickerSetName: String): js.Promise[Boolean] = js.native
  def setChatStickerSet(chatId: Double, stickerSetName: String): js.Promise[Boolean] = js.native
  def setChatTitle(chatId: String, title: String): js.Promise[Boolean] = js.native
  def setChatTitle(chatId: Double, title: String): js.Promise[Boolean] = js.native
  def setGameScore(userId: String, score: Double): js.Promise[Message | Boolean] = js.native
  def setGameScore(userId: String, score: Double, options: SetGameScoreOptions): js.Promise[Message | Boolean] = js.native
  def setMyCommands(commands: js.Array[BotCommand]): js.Promise[Boolean] = js.native
  def setWebHook(url: String): js.Promise[_] = js.native
  def setWebHook(url: String, options: SetWebHookOptions): js.Promise[_] = js.native
  def startPolling(): js.Promise[_] = js.native
  def startPolling(options: StartPollingOptions): js.Promise[_] = js.native
  def stopMessageLiveLocation(): js.Promise[Message | Boolean] = js.native
  def stopMessageLiveLocation(options: StopMessageLiveLocationOptions): js.Promise[Message | Boolean] = js.native
  def stopPolling(): js.Promise[_] = js.native
  def stopPolling(options: StopPollingOptions): js.Promise[_] = js.native
  def unbanChatMember(chatId: String, userId: String): js.Promise[Boolean] = js.native
  def unbanChatMember(chatId: Double, userId: String): js.Promise[Boolean] = js.native
  def unpinChatMessage(chatId: String): js.Promise[Boolean] = js.native
  def unpinChatMessage(chatId: Double): js.Promise[Boolean] = js.native
}

