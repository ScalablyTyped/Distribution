package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TelegramBot
  extends nodeLib.eventsMod.EventEmitter {
  /**
       * @deprecated since version 0.30.0
       */
  def answerCallbackQuery(): js.Promise[scala.Boolean] = js.native
  def answerCallbackQuery(callbackQueryId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def answerCallbackQuery(
    callbackQueryId: java.lang.String,
    options: stdLib.Partial[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.AnswerCallbackQueryOptions
    ]
  ): js.Promise[scala.Boolean] = js.native
  /**
       * @deprecated since version 0.30.0
       */
  def answerCallbackQuery(
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.AnswerCallbackQueryOptions
  ): js.Promise[scala.Boolean] = js.native
  def answerInlineQuery(
    inlineQueryId: java.lang.String,
    results: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InlineQueryResult
    ]
  ): js.Promise[scala.Boolean] = js.native
  def answerInlineQuery(
    inlineQueryId: java.lang.String,
    results: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InlineQueryResult
    ],
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.AnswerInlineQueryOptions
  ): js.Promise[scala.Boolean] = js.native
  def answerPreCheckoutQuery(preCheckoutQueryId: java.lang.String, ok: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def answerPreCheckoutQuery(
    preCheckoutQueryId: java.lang.String,
    ok: scala.Boolean,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.AnswerPreCheckoutQueryOptions
  ): js.Promise[scala.Boolean] = js.native
  def answerShippingQuery(shippingQueryId: java.lang.String, ok: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def answerShippingQuery(
    shippingQueryId: java.lang.String,
    ok: scala.Boolean,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.AnswerShippingQueryOptions
  ): js.Promise[scala.Boolean] = js.native
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
  def editMessageCaption(caption: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def editMessageCaption(
    caption: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.EditMessageCaptionOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def editMessageLiveLocation(latitude: scala.Double, longitude: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def editMessageLiveLocation(
    latitude: scala.Double,
    longitude: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.EditMessageLiveLocationOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def editMessageReplyMarkup(
    replyMarkup: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InlineKeyboardMarkup
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def editMessageReplyMarkup(
    replyMarkup: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InlineKeyboardMarkup,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.EditMessageReplyMarkupOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def editMessageText(text: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def editMessageText(
    text: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.EditMessageTextOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def exportChatInviteLink(chatId: java.lang.String): js.Promise[java.lang.String] = js.native
  def exportChatInviteLink(chatId: scala.Double): js.Promise[java.lang.String] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: java.lang.String, messageId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: java.lang.String,
    messageId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: java.lang.String, messageId: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: java.lang.String,
    messageId: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: scala.Double, messageId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: scala.Double,
    messageId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(chatId: java.lang.String, fromChatId: scala.Double, messageId: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: java.lang.String,
    fromChatId: scala.Double,
    messageId: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: java.lang.String, messageId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: java.lang.String,
    messageId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: java.lang.String, messageId: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: java.lang.String,
    messageId: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: scala.Double, messageId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: scala.Double,
    messageId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(chatId: scala.Double, fromChatId: scala.Double, messageId: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def forwardMessage(
    chatId: scala.Double,
    fromChatId: scala.Double,
    messageId: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ForwardMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def getChat(chatId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Chat
  ] = js.native
  def getChat(chatId: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Chat
  ] = js.native
  def getChatAdministrators(chatId: java.lang.String): js.Promise[
    js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ChatMember
    ]
  ] = js.native
  def getChatAdministrators(chatId: scala.Double): js.Promise[
    js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ChatMember
    ]
  ] = js.native
  def getChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ChatMember
  ] = js.native
  def getChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ChatMember
  ] = js.native
  def getChatMembersCount(chatId: java.lang.String): js.Promise[scala.Double] = js.native
  def getChatMembersCount(chatId: scala.Double): js.Promise[scala.Double] = js.native
  def getFile(fileId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.File
  ] = js.native
  def getFileLink(fileId: java.lang.String): js.Promise[java.lang.String] = js.native
  def getFileStream(fileId: java.lang.String): nodeLib.streamMod.Readable = js.native
  def getGameHighScores(userId: java.lang.String): js.Promise[
    js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.GameHighScore
    ]
  ] = js.native
  def getGameHighScores(
    userId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.GetGameHighScoresOptions
  ): js.Promise[
    js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.GameHighScore
    ]
  ] = js.native
  def getMe(): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.User
  ] = js.native
  def getUpdates(): js.Promise[
    js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Update
    ]
  ] = js.native
  def getUpdates(
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.GetUpdatesOptions
  ): js.Promise[
    js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Update
    ]
  ] = js.native
  def getUserProfilePhotos(userId: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.UserProfilePhotos
  ] = js.native
  def getUserProfilePhotos(
    userId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.GetUserProfilePhotosOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.UserProfilePhotos
  ] = js.native
  def getUserProfilePhotos(userId: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.UserProfilePhotos
  ] = js.native
  def getUserProfilePhotos(
    userId: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.GetUserProfilePhotosOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.UserProfilePhotos
  ] = js.native
  def getWebHookInfo(): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.WebhookInfo
  ] = js.native
  def hasOpenWebHook(): scala.Boolean = js.native
  def isPolling(): scala.Boolean = js.native
  def kickChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def leaveChat(chatId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def leaveChat(chatId: scala.Double): js.Promise[scala.Boolean] = js.native
  def onReplyToMessage(
    chatId: java.lang.String,
    messageId: java.lang.String,
    callback: js.Function1[
      /* msg */ nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message, 
      scala.Unit
    ]
  ): scala.Double = js.native
  def onReplyToMessage(
    chatId: java.lang.String,
    messageId: scala.Double,
    callback: js.Function1[
      /* msg */ nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message, 
      scala.Unit
    ]
  ): scala.Double = js.native
  def onReplyToMessage(
    chatId: scala.Double,
    messageId: java.lang.String,
    callback: js.Function1[
      /* msg */ nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message, 
      scala.Unit
    ]
  ): scala.Double = js.native
  def onReplyToMessage(
    chatId: scala.Double,
    messageId: scala.Double,
    callback: js.Function1[
      /* msg */ nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message, 
      scala.Unit
    ]
  ): scala.Double = js.native
  def onText(
    regexp: stdLib.RegExp,
    callback: js.Function2[
      /* msg */ nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message, 
      /* match */ stdLib.RegExpExecArray | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def openWebHook(): js.Promise[_] = js.native
  def pinChatMessage(chatId: java.lang.String, messageId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def pinChatMessage(chatId: scala.Double, messageId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def processUpdate(update: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Update): scala.Unit = js.native
  def promoteChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def promoteChatMember(
    chatId: java.lang.String,
    userId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.PromoteChatMemberOptions
  ): js.Promise[scala.Boolean] = js.native
  def promoteChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def promoteChatMember(
    chatId: scala.Double,
    userId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.PromoteChatMemberOptions
  ): js.Promise[scala.Boolean] = js.native
  def removeReplyListener(replyListenerId: scala.Double): nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ReplyListener = js.native
  def removeTextListener(regexp: stdLib.RegExp): nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.TextListener | scala.Null = js.native
  def restrictChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def restrictChatMember(
    chatId: java.lang.String,
    userId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.RestrictChatMemberOptions
  ): js.Promise[scala.Boolean] = js.native
  def restrictChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def restrictChatMember(
    chatId: scala.Double,
    userId: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.RestrictChatMemberOptions
  ): js.Promise[scala.Boolean] = js.native
  def sendAudio(chatId: java.lang.String, audio: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(
    chatId: java.lang.String,
    audio: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendAudioOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(chatId: java.lang.String, audio: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(
    chatId: java.lang.String,
    audio: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendAudioOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(chatId: java.lang.String, audio: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(
    chatId: java.lang.String,
    audio: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendAudioOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(chatId: scala.Double, audio: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(
    chatId: scala.Double,
    audio: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendAudioOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(chatId: scala.Double, audio: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(
    chatId: scala.Double,
    audio: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendAudioOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(chatId: scala.Double, audio: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendAudio(
    chatId: scala.Double,
    audio: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendAudioOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendChatAction(
    chatId: java.lang.String,
    action: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ChatAction
  ): js.Promise[scala.Boolean] = js.native
  def sendChatAction(
    chatId: scala.Double,
    action: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.ChatAction
  ): js.Promise[scala.Boolean] = js.native
  def sendContact(chatId: java.lang.String, phoneNumber: java.lang.String, firstName: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendContact(
    chatId: java.lang.String,
    phoneNumber: java.lang.String,
    firstName: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendContactOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendContact(chatId: scala.Double, phoneNumber: java.lang.String, firstName: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendContact(
    chatId: scala.Double,
    phoneNumber: java.lang.String,
    firstName: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendContactOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(chatId: java.lang.String, doc: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: java.lang.String,
    doc: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: java.lang.String,
    doc: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(chatId: java.lang.String, doc: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: java.lang.String,
    doc: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: java.lang.String,
    doc: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(chatId: java.lang.String, doc: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: java.lang.String,
    doc: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: java.lang.String,
    doc: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(chatId: scala.Double, doc: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: scala.Double,
    doc: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: scala.Double,
    doc: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(chatId: scala.Double, doc: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: scala.Double,
    doc: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: scala.Double,
    doc: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(chatId: scala.Double, doc: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: scala.Double,
    doc: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendDocument(
    chatId: scala.Double,
    doc: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendDocumentOptions,
    fileOpts: js.Any
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendGame(chatId: java.lang.String, gameShortName: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendGame(
    chatId: java.lang.String,
    gameShortName: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendGameOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendGame(chatId: scala.Double, gameShortName: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendGame(
    chatId: scala.Double,
    gameShortName: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendGameOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendInvoice(
    chatId: java.lang.String,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.LabeledPrice
    ]
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendInvoice(
    chatId: java.lang.String,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.LabeledPrice
    ],
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendInvoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendInvoice(
    chatId: scala.Double,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.LabeledPrice
    ]
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendInvoice(
    chatId: scala.Double,
    title: java.lang.String,
    description: java.lang.String,
    payload: java.lang.String,
    providerToken: java.lang.String,
    startParameter: java.lang.String,
    currency: java.lang.String,
    prices: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.LabeledPrice
    ],
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendInvoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendLocation(chatId: java.lang.String, latitude: scala.Double, longitude: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendLocation(
    chatId: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendLocationOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendLocation(chatId: scala.Double, latitude: scala.Double, longitude: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendLocation(
    chatId: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendLocationOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMediaGroup(
    chatId: java.lang.String,
    media: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InputMedia
    ]
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMediaGroup(
    chatId: java.lang.String,
    media: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InputMedia
    ],
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendMediaGroupOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMediaGroup(
    chatId: scala.Double,
    media: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InputMedia
    ]
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMediaGroup(
    chatId: scala.Double,
    media: js.Array[
      nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.InputMedia
    ],
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendMediaGroupOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMessage(chatId: java.lang.String, text: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMessage(
    chatId: java.lang.String,
    text: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMessage(chatId: scala.Double, text: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendMessage(
    chatId: scala.Double,
    text: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendMessageOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(chatId: java.lang.String, photo: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(
    chatId: java.lang.String,
    photo: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendPhotoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(chatId: java.lang.String, photo: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(
    chatId: java.lang.String,
    photo: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendPhotoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(chatId: java.lang.String, photo: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(
    chatId: java.lang.String,
    photo: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendPhotoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(chatId: scala.Double, photo: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(
    chatId: scala.Double,
    photo: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendPhotoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(chatId: scala.Double, photo: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(
    chatId: scala.Double,
    photo: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendPhotoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(chatId: scala.Double, photo: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendPhoto(
    chatId: scala.Double,
    photo: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendPhotoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(chatId: java.lang.String, sticker: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(
    chatId: java.lang.String,
    sticker: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendStickerOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(chatId: java.lang.String, sticker: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(
    chatId: java.lang.String,
    sticker: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendStickerOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(chatId: java.lang.String, sticker: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(
    chatId: java.lang.String,
    sticker: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendStickerOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(chatId: scala.Double, sticker: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(
    chatId: scala.Double,
    sticker: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendStickerOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(chatId: scala.Double, sticker: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(
    chatId: scala.Double,
    sticker: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendStickerOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(chatId: scala.Double, sticker: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendSticker(
    chatId: scala.Double,
    sticker: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendStickerOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVenue(
    chatId: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVenue(
    chatId: java.lang.String,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVenueOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVenue(
    chatId: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVenue(
    chatId: scala.Double,
    latitude: scala.Double,
    longitude: scala.Double,
    title: java.lang.String,
    address: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVenueOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(chatId: java.lang.String, video: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(
    chatId: java.lang.String,
    video: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(chatId: java.lang.String, video: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(
    chatId: java.lang.String,
    video: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(chatId: java.lang.String, video: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(
    chatId: java.lang.String,
    video: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(chatId: scala.Double, video: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(
    chatId: scala.Double,
    video: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(chatId: scala.Double, video: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(
    chatId: scala.Double,
    video: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(chatId: scala.Double, video: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideo(
    chatId: scala.Double,
    video: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(
    chatId: java.lang.String,
    videoNote: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoNoteOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(
    chatId: java.lang.String,
    videoNote: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoNoteOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(chatId: java.lang.String, videoNote: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(
    chatId: java.lang.String,
    videoNote: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoNoteOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(
    chatId: scala.Double,
    videoNote: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoNoteOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(
    chatId: scala.Double,
    videoNote: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoNoteOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(chatId: scala.Double, videoNote: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVideoNote(
    chatId: scala.Double,
    videoNote: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVideoNoteOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(chatId: java.lang.String, voice: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(
    chatId: java.lang.String,
    voice: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(chatId: java.lang.String, voice: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(
    chatId: java.lang.String,
    voice: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(chatId: java.lang.String, voice: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(
    chatId: java.lang.String,
    voice: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(chatId: scala.Double, voice: java.lang.String): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(
    chatId: scala.Double,
    voice: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(chatId: scala.Double, voice: nodeLib.Buffer): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(
    chatId: scala.Double,
    voice: nodeLib.Buffer,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(chatId: scala.Double, voice: nodeLib.streamMod.Stream): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
  def sendVoice(
    chatId: scala.Double,
    voice: nodeLib.streamMod.Stream,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SendVoiceOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message
  ] = js.native
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
  def setGameScore(userId: java.lang.String, score: scala.Double): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def setGameScore(
    userId: java.lang.String,
    score: scala.Double,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SetGameScoreOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def setWebHook(url: java.lang.String): js.Promise[_] = js.native
  def setWebHook(
    url: java.lang.String,
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.SetWebHookOptions
  ): js.Promise[_] = js.native
  def startPolling(): js.Promise[_] = js.native
  def startPolling(
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.StartPollingOptions
  ): js.Promise[_] = js.native
  def stopMessageLiveLocation(): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def stopMessageLiveLocation(
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.StopMessageLiveLocationOptions
  ): js.Promise[
    nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.Message | scala.Boolean
  ] = js.native
  def stopPolling(): js.Promise[_] = js.native
  def stopPolling(
    options: nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs.StopPollingOptions
  ): js.Promise[_] = js.native
  def unbanChatMember(chatId: java.lang.String, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def unbanChatMember(chatId: scala.Double, userId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def unpinChatMessage(chatId: java.lang.String): js.Promise[scala.Boolean] = js.native
  def unpinChatMessage(chatId: scala.Double): js.Promise[scala.Boolean] = js.native
}

