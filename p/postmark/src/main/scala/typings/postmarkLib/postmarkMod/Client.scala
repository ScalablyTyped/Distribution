package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Client")
@js.native
class Client protected () extends js.Object {
  def this(serverKey: java.lang.String) = this()
  def this(serverKey: java.lang.String, options: stdLib.Partial[Options]) = this()
  def activateBounce(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def activateBounce(id: scala.Double, callback: PostmarkCallback[ActivatedBounceResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("activateBounce")
  def activateBounce_Promise(id: scala.Double): js.Promise[ActivatedBounceResult] = js.native
  def batch(message: js.Array[PostmarkMessage]): js.Promise[js.Array[SendStatus]] = js.native
  def batch(message: js.Array[PostmarkMessage], callback: PostmarkCallback[js.Array[SendStatus]]): js.UndefOr[scala.Nothing] = js.native
  def bypassBlockedInboundMessage(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def bypassBlockedInboundMessage(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("bypassBlockedInboundMessage")
  def bypassBlockedInboundMessage_Promise(id: scala.Double): js.Promise[GenericResult] = js.native
  def createTemplate(template: stdLib.Partial[Template]): js.UndefOr[scala.Nothing] = js.native
  def createTemplate(template: stdLib.Partial[Template], callback: PostmarkCallback[TemplateBase]): js.UndefOr[scala.Nothing] = js.native
  @JSName("createTemplate")
  def createTemplate_Promise(template: stdLib.Partial[Template]): js.Promise[TemplateBase] = js.native
  def deleteTemplate(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def deleteTemplate(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("deleteTemplate")
  def deleteTemplate_Promise(id: scala.Double): js.Promise[GenericResult] = js.native
  def editServer(server: stdLib.Partial[Server]): js.UndefOr[scala.Nothing] = js.native
  def editServer(server: stdLib.Partial[Server], callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editServer")
  def editServer_Promise(server: stdLib.Partial[Server]): js.Promise[Server] = js.native
  def editTemplate(template: stdLib.Partial[Template]): js.UndefOr[scala.Nothing] = js.native
  def editTemplate(template: stdLib.Partial[Template], callback: PostmarkCallback[TemplateBase]): js.UndefOr[scala.Nothing] = js.native
  @JSName("editTemplate")
  def editTemplate_Promise(template: stdLib.Partial[Template]): js.Promise[TemplateBase] = js.native
  def getBounce(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getBounce(id: scala.Double, callback: PostmarkCallback[Bounce]): js.UndefOr[scala.Nothing] = js.native
  def getBounceDump(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getBounceDump(id: scala.Double, callback: PostmarkCallback[BounceDump]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getBounceDump")
  def getBounceDump_Promise(id: scala.Double): js.Promise[BounceDump] = js.native
  def getBounceTags(): js.UndefOr[scala.Nothing] = js.native
  def getBounceTags(callback: PostmarkCallback[js.Array[java.lang.String]]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getBounceTags")
  def getBounceTags_Promise(): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("getBounce")
  def getBounce_Promise(id: scala.Double): js.Promise[Bounce] = js.native
  def getBounces(filter: BounceFilter): js.UndefOr[scala.Nothing] = js.native
  def getBounces(filter: BounceFilter, callback: PostmarkCallback[BouncesResult]): js.UndefOr[scala.Nothing] = js.native
  // bounces
  @JSName("getBounces")
  def getBounces_Promise(filter: BounceFilter): js.Promise[BouncesResult] = js.native
  // stats
  def getDeliveryStatistics(): js.Promise[DeliveryStats] = js.native
  def getDeliveryStatistics(callback: PostmarkCallback[DeliveryStats]): js.UndefOr[scala.Nothing] = js.native
  def getInboundMessageDetails(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getInboundMessageDetails(id: scala.Double, callback: PostmarkCallback[InboundMessage]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getInboundMessageDetails")
  def getInboundMessageDetails_Promise(id: scala.Double): js.Promise[InboundMessage] = js.native
  def getInboundMessages(filter: InboundMessageFilter): js.UndefOr[scala.Nothing] = js.native
  def getInboundMessages(filter: InboundMessageFilter, callback: PostmarkCallback[InboundMessagesResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getInboundMessages")
  def getInboundMessages_Promise(filter: InboundMessageFilter): js.Promise[InboundMessagesResult] = js.native
  def getMessageOpens(filter: OpenMessageFilter): js.UndefOr[scala.Nothing] = js.native
  def getMessageOpens(filter: OpenMessageFilter, callback: PostmarkCallback[MessageOpensResult]): js.UndefOr[scala.Nothing] = js.native
  def getMessageOpensForSingleMessage(id: scala.Double, filter: Filter): js.UndefOr[scala.Nothing] = js.native
  def getMessageOpensForSingleMessage(id: scala.Double, filter: Filter, callback: PostmarkCallback[MessageOpensResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getMessageOpensForSingleMessage")
  def getMessageOpensForSingleMessage_Promise(id: scala.Double, filter: Filter): js.Promise[MessageOpensResult] = js.native
  @JSName("getMessageOpens")
  def getMessageOpens_Promise(filter: OpenMessageFilter): js.Promise[MessageOpensResult] = js.native
  def getOuboundOverview(filter: BaseFilter): js.UndefOr[scala.Nothing] = js.native
  def getOuboundOverview(filter: BaseFilter, callback: PostmarkCallback[OutboundOverview]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getOuboundOverview")
  def getOuboundOverview_Promise(filter: BaseFilter): js.Promise[OutboundOverview] = js.native
  def getOutboundMessageDetails(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getOutboundMessageDetails(id: scala.Double, callback: PostmarkCallback[OutboundMessage]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getOutboundMessageDetails")
  def getOutboundMessageDetails_Promise(id: scala.Double): js.Promise[OutboundMessage] = js.native
  def getOutboundMessages(filter: OutboundMessageFilter): js.UndefOr[scala.Nothing] = js.native
  def getOutboundMessages(filter: OutboundMessageFilter, callback: PostmarkCallback[OutboundMessagesResult]): js.UndefOr[scala.Nothing] = js.native
  // message info
  @JSName("getOutboundMessages")
  def getOutboundMessages_Promise(filter: OutboundMessageFilter): js.Promise[OutboundMessagesResult] = js.native
  def getServer(): js.UndefOr[scala.Nothing] = js.native
  def getServer(callback: PostmarkCallback[Server]): js.UndefOr[scala.Nothing] = js.native
  // server
  @JSName("getServer")
  def getServer_Promise(): js.Promise[Server] = js.native
  def getTemplate(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getTemplate(id: scala.Double, callback: PostmarkCallback[Template]): js.UndefOr[scala.Nothing] = js.native
  // templates
  @JSName("getTemplate")
  def getTemplate_Promise(id: scala.Double): js.Promise[Template] = js.native
  def getTemplates(filter: Filter): js.UndefOr[scala.Nothing] = js.native
  def getTemplates(filter: Filter, callback: PostmarkCallback[TemplatesResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("getTemplates")
  def getTemplates_Promise(filter: Filter): js.Promise[TemplatesResult] = js.native
  def retryInboundHookForMessage(id: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def retryInboundHookForMessage(id: scala.Double, callback: PostmarkCallback[GenericResult]): js.UndefOr[scala.Nothing] = js.native
  @JSName("retryInboundHookForMessage")
  def retryInboundHookForMessage_Promise(id: scala.Double): js.Promise[GenericResult] = js.native
  def send(message: PostmarkMessage): js.Promise[SendStatus] = js.native
  def send(message: PostmarkMessage, callback: PostmarkCallback[SendStatus]): js.UndefOr[scala.Nothing] = js.native
  def sendEmail(message: PostmarkMessage): js.Promise[SendStatus] = js.native
  def sendEmail(message: PostmarkMessage, callback: PostmarkCallback[SendStatus]): js.UndefOr[scala.Nothing] = js.native
  def sendEmailBatch(message: js.Array[PostmarkMessage]): js.Promise[js.Array[SendStatus]] = js.native
  def sendEmailBatch(message: js.Array[PostmarkMessage], callback: PostmarkCallback[js.Array[SendStatus]]): js.UndefOr[scala.Nothing] = js.native
  def sendEmailWithTemplate(message: PostmarkMessageWithTemplate): js.Promise[SendStatus] = js.native
  def sendEmailWithTemplate(message: PostmarkMessageWithTemplate, callback: PostmarkCallback[SendStatus]): js.UndefOr[scala.Nothing] = js.native
  def validateTemplate[T /* <: js.Object */](templateObject: TemplateValidator[T]): js.UndefOr[scala.Nothing] = js.native
  def validateTemplate[T /* <: js.Object */](templateObject: TemplateValidator[T], callback: PostmarkCallback[TemplateValidationResult[T]]): js.UndefOr[scala.Nothing] = js.native
  @JSName("validateTemplate")
  def validateTemplate_TObjectPromise[T /* <: js.Object */](templateObject: TemplateValidator[T]): js.Promise[TemplateValidationResult[T]] = js.native
}

