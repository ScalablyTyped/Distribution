package typings.postmark

import typings.postmark.distClientModelsBouncesBounceMod.Bounce
import typings.postmark.distClientModelsBouncesBounceMod.BounceActivationResponse
import typings.postmark.distClientModelsBouncesBounceMod.BounceDump
import typings.postmark.distClientModelsBouncesBounceMod.Bounces
import typings.postmark.distClientModelsBouncesBounceMod.DeliveryStatistics
import typings.postmark.distClientModelsClientCallbackMod.Callback
import typings.postmark.distClientModelsClientDefaultResponseMod.DefaultResponse
import typings.postmark.distClientModelsMessageMessageMod.MessageSendingResponse
import typings.postmark.distClientModelsMessagesInboundMessageMod.InboundMessageDetails
import typings.postmark.distClientModelsMessagesInboundMessageMod.InboundMessages
import typings.postmark.distClientModelsMessagesOutboundMessageClickMod.OutboundMessageClicks
import typings.postmark.distClientModelsMessagesOutboundMessageMod.OutboundMessageDetails
import typings.postmark.distClientModelsMessagesOutboundMessageMod.OutboundMessageDump
import typings.postmark.distClientModelsMessagesOutboundMessageMod.OutboundMessages
import typings.postmark.distClientModelsMessagesOutboundMessageOpenMod.OutboundMessageOpens
import typings.postmark.distClientModelsMod.BounceFilteringParameters
import typings.postmark.distClientModelsMod.ClientOptions.Configuration
import typings.postmark.distClientModelsMod.CreateInboundRuleRequest
import typings.postmark.distClientModelsMod.CreateTagTriggerRequest
import typings.postmark.distClientModelsMod.CreateTemplateRequest
import typings.postmark.distClientModelsMod.FilteringParameters
import typings.postmark.distClientModelsMod.InboundMessagesFilteringParameters
import typings.postmark.distClientModelsMod.Message
import typings.postmark.distClientModelsMod.OutboundMessageClicksFilteringParameters
import typings.postmark.distClientModelsMod.OutboundMessageOpensFilteringParameters
import typings.postmark.distClientModelsMod.OutboundMessagesFilteringParameters
import typings.postmark.distClientModelsMod.StatisticsFilteringParameters
import typings.postmark.distClientModelsMod.TagTriggerFilteringParameters
import typings.postmark.distClientModelsMod.TemplateFilteringParameters
import typings.postmark.distClientModelsMod.TemplateValidationOptions
import typings.postmark.distClientModelsMod.TemplatedMessage
import typings.postmark.distClientModelsMod.UpdateServerRequest
import typings.postmark.distClientModelsMod.UpdateTagTriggerRequest
import typings.postmark.distClientModelsMod.UpdateTemplateRequest
import typings.postmark.distClientModelsServerServerMod.Server
import typings.postmark.distClientModelsStatsStatsMod.BounceCounts
import typings.postmark.distClientModelsStatsStatsMod.BrowserUsageCounts
import typings.postmark.distClientModelsStatsStatsMod.ClickCounts
import typings.postmark.distClientModelsStatsStatsMod.ClickLocationCounts
import typings.postmark.distClientModelsStatsStatsMod.ClickPlaformUsageCounts
import typings.postmark.distClientModelsStatsStatsMod.EmailClientUsageCounts
import typings.postmark.distClientModelsStatsStatsMod.EmailPlaformUsageCounts
import typings.postmark.distClientModelsStatsStatsMod.EmailReadTimesCounts
import typings.postmark.distClientModelsStatsStatsMod.OpenCounts
import typings.postmark.distClientModelsStatsStatsMod.OutboundStatistics
import typings.postmark.distClientModelsStatsStatsMod.SentCounts
import typings.postmark.distClientModelsStatsStatsMod.SpamCounts
import typings.postmark.distClientModelsStatsStatsMod.TrackedEmailCounts
import typings.postmark.distClientModelsTemplatesTemplateMod.Template
import typings.postmark.distClientModelsTemplatesTemplateMod.TemplateValidation
import typings.postmark.distClientModelsTemplatesTemplateMod.Templates
import typings.postmark.distClientModelsTriggersInboundRuleMod.InboundRule
import typings.postmark.distClientModelsTriggersInboundRuleMod.InboundRules
import typings.postmark.distClientModelsTriggersTagMod.TagTrigger
import typings.postmark.distClientModelsTriggersTagMod.TagTriggers
import typings.postmark.distClientServerClientMod.ServerClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/ServerClient", JSImport.Namespace)
@js.native
object distClientServerClientMod extends js.Object {
  @js.native
  trait ServerClient
    extends typings.postmark.distClientBaseClientMod.default {
    /**
      * Activate email address that was deactivated due to a Bounce.
      *
      * @param id - The ID of the Bounce for which you wish to activate the associated email.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def activateBounce(id: Double): js.Promise[BounceActivationResponse] = js.native
    def activateBounce(id: Double, callback: Callback[BounceActivationResponse]): js.Promise[BounceActivationResponse] = js.native
    /**
      * Cause an Inbound Message to bypass filtering rules defined on this Client's associated Server.
      *
      * @param messageId - The ID of the Inbound Message for which you wish to bypass the filtering rules.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def bypassBlockedInboundMessage(messageId: String): js.Promise[DefaultResponse] = js.native
    def bypassBlockedInboundMessage(messageId: String, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    /**
      * Create an Inbound Rule Trigger.
      *
      * @param options - Configuration options to be used when creating this Trigger.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createInboundRuleTrigger(options: CreateInboundRuleRequest): js.Promise[InboundRule] = js.native
    def createInboundRuleTrigger(options: CreateInboundRuleRequest, callback: Callback[InboundRule]): js.Promise[InboundRule] = js.native
    /**
      * Create a new Tag Trigger.
      *
      * @param options - Configuration options to be used to create the trigger.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createTagTrigger(options: CreateTagTriggerRequest): js.Promise[TagTrigger] = js.native
    def createTagTrigger(options: CreateTagTriggerRequest, callback: Callback[TagTrigger]): js.Promise[TagTrigger] = js.native
    /**
      * Create a new template on the associated server.
      *
      * @param options - Configuration options to be used to create the Template.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def createTemplate(options: CreateTemplateRequest): js.Promise[Template] = js.native
    def createTemplate(options: CreateTemplateRequest, callback: Callback[Template]): js.Promise[Template] = js.native
    /**
      * Delete an Inbound Rule Trigger.
      *
      * @param id - The ID of the Inbound Rule Trigger you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteInboundRuleTrigger(id: Double): js.Promise[DefaultResponse] = js.native
    def deleteInboundRuleTrigger(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    /**
      * Delete an existing Tag Trigger.
      *
      * @param id - The ID of the Tag Trigger you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteTagTrigger(id: Double): js.Promise[DefaultResponse] = js.native
    def deleteTagTrigger(id: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    def deleteTemplate(idOrAlias: String): js.Promise[DefaultResponse] = js.native
    def deleteTemplate(idOrAlias: String, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    /**
      * Delete a template associated with this server.
      *
      * @param idOrAlias - ID or template alias you wish to delete.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def deleteTemplate(idOrAlias: Double): js.Promise[DefaultResponse] = js.native
    def deleteTemplate(idOrAlias: Double, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    /**
      * Modify the Server associated with this Client.
      *
      * @param options - The options you wish to modify.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editServer(options: UpdateServerRequest): js.Promise[Server] = js.native
    def editServer(options: UpdateServerRequest, callback: Callback[Server]): js.Promise[Server] = js.native
    /**
      * Modify an existing Tag Trigger.
      *
      * @param id - The ID of the Tag Trigger you wish to modify.
      * @param options - Tag trigger options
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editTagTrigger(id: Double, options: UpdateTagTriggerRequest): js.Promise[TagTrigger] = js.native
    def editTagTrigger(id: Double, options: UpdateTagTriggerRequest, callback: Callback[TagTrigger]): js.Promise[TagTrigger] = js.native
    def editTemplate(idOrAlias: String, options: UpdateTemplateRequest): js.Promise[Template] = js.native
    def editTemplate(idOrAlias: String, options: UpdateTemplateRequest, callback: Callback[Template]): js.Promise[Template] = js.native
    /**
      * Update a template on the associated server.
      *
      * @param idOrAlias - Id or alias of the template you wish to update.
      * @param options - Template options you wish to update.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def editTemplate(idOrAlias: Double, options: UpdateTemplateRequest): js.Promise[Template] = js.native
    def editTemplate(idOrAlias: Double, options: UpdateTemplateRequest, callback: Callback[Template]): js.Promise[Template] = js.native
    /**
      * Get details for a specific Bounce.
      *
      * @param id - The ID of the Bounce you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounce(id: Double): js.Promise[Bounce] = js.native
    def getBounce(id: Double, callback: Callback[Bounce]): js.Promise[Bounce] = js.native
    /**
      * Get statistiscs on emails that bounced after being sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounceCounts(): js.Promise[BounceCounts] = js.native
    def getBounceCounts(filter: StatisticsFilteringParameters): js.Promise[BounceCounts] = js.native
    def getBounceCounts(filter: StatisticsFilteringParameters, callback: Callback[BounceCounts]): js.Promise[BounceCounts] = js.native
    /**
      * Get a Bounce Dump for a specific Bounce.
      *
      * @param id - The ID of the Bounce for which you wish to retrieve Bounce Dump.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounceDump(id: Double): js.Promise[BounceDump] = js.native
    def getBounceDump(id: Double, callback: Callback[BounceDump]): js.Promise[BounceDump] = js.native
    /**
      * Get an array of tags associated with bounces.
      *
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounceTags(): js.Promise[js.Array[String]] = js.native
    def getBounceTags(callback: Callback[js.Array[String]]): js.Promise[js.Array[String]] = js.native
    /**
      * Get a batch of bounces.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getBounces(): js.Promise[Bounces] = js.native
    def getBounces(filter: BounceFilteringParameters): js.Promise[Bounces] = js.native
    def getBounces(filter: BounceFilteringParameters, callback: Callback[Bounces]): js.Promise[Bounces] = js.native
    /**
      * Get browser family statistics for tracked links for messages sent from the Server associated with this Client.
      * @param filter Optional filtering parameters.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickBrowserUsage(): js.Promise[BrowserUsageCounts] = js.native
    def getClickBrowserUsage(filter: StatisticsFilteringParameters): js.Promise[BrowserUsageCounts] = js.native
    def getClickBrowserUsage(filter: StatisticsFilteringParameters, callback: Callback[BrowserUsageCounts]): js.Promise[BrowserUsageCounts] = js.native
    /**
      * Get total clicks statistics for tracked links for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickCounts(): js.Promise[ClickCounts] = js.native
    def getClickCounts(filter: StatisticsFilteringParameters): js.Promise[ClickCounts] = js.native
    def getClickCounts(filter: StatisticsFilteringParameters, callback: Callback[ClickCounts]): js.Promise[ClickCounts] = js.native
    /**
      * Get click location (in HTML or Text body of the email) statistics for tracked links for messages sent
      * from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickLocation(): js.Promise[ClickLocationCounts] = js.native
    def getClickLocation(filter: StatisticsFilteringParameters): js.Promise[ClickLocationCounts] = js.native
    def getClickLocation(filter: StatisticsFilteringParameters, callback: Callback[ClickLocationCounts]): js.Promise[ClickLocationCounts] = js.native
    /**
      * Get browser platform statistics for tracked links for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getClickPlatformUsage(): js.Promise[ClickPlaformUsageCounts] = js.native
    def getClickPlatformUsage(filter: StatisticsFilteringParameters): js.Promise[ClickPlaformUsageCounts] = js.native
    def getClickPlatformUsage(filter: StatisticsFilteringParameters, callback: Callback[ClickPlaformUsageCounts]): js.Promise[ClickPlaformUsageCounts] = js.native
    /**
      * Get bounce statistic information for the associated Server.
      *
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getDeliveryStatistics(): js.Promise[DeliveryStatistics] = js.native
    def getDeliveryStatistics(callback: Callback[DeliveryStatistics]): js.Promise[DeliveryStatistics] = js.native
    /**
      * Get statistics on which Email Clients were used to open messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenClientUsage(): js.Promise[EmailClientUsageCounts] = js.native
    def getEmailOpenClientUsage(filter: StatisticsFilteringParameters): js.Promise[EmailClientUsageCounts] = js.native
    def getEmailOpenClientUsage(filter: StatisticsFilteringParameters, callback: Callback[EmailClientUsageCounts]): js.Promise[EmailClientUsageCounts] = js.native
    /**
      * Get Open statistics for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenCounts(): js.Promise[OpenCounts] = js.native
    def getEmailOpenCounts(filter: StatisticsFilteringParameters): js.Promise[OpenCounts] = js.native
    def getEmailOpenCounts(filter: StatisticsFilteringParameters, callback: Callback[OpenCounts]): js.Promise[OpenCounts] = js.native
    /**
      * Get Email Client Platform statistics for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenPlatformUsage(): js.Promise[EmailPlaformUsageCounts] = js.native
    def getEmailOpenPlatformUsage(filter: StatisticsFilteringParameters): js.Promise[EmailPlaformUsageCounts] = js.native
    def getEmailOpenPlatformUsage(filter: StatisticsFilteringParameters, callback: Callback[EmailPlaformUsageCounts]): js.Promise[EmailPlaformUsageCounts] = js.native
    /**
      * Get Read Time statistics for messages sent from the Server associated with this Client.
      * @param filter Optional filtering parameters.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getEmailOpenReadTimes(): js.Promise[EmailReadTimesCounts] = js.native
    def getEmailOpenReadTimes(filter: StatisticsFilteringParameters): js.Promise[EmailReadTimesCounts] = js.native
    def getEmailOpenReadTimes(filter: StatisticsFilteringParameters, callback: Callback[EmailReadTimesCounts]): js.Promise[EmailReadTimesCounts] = js.native
    /**
      * Get details for a specific Inbound Message.
      *
      * @param messageId - The ID of the Inbound Message you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getInboundMessageDetails(messageId: String): js.Promise[InboundMessageDetails] = js.native
    def getInboundMessageDetails(messageId: String, callback: Callback[InboundMessageDetails]): js.Promise[InboundMessageDetails] = js.native
    /**
      * Get a batch of Inbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getInboundMessages(): js.Promise[InboundMessages] = js.native
    def getInboundMessages(filter: InboundMessagesFilteringParameters): js.Promise[InboundMessages] = js.native
    def getInboundMessages(filter: InboundMessagesFilteringParameters, callback: Callback[InboundMessages]): js.Promise[InboundMessages] = js.native
    /**
      * Get a list of Inbound Rule Triggers.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getInboundRuleTriggers(): js.Promise[InboundRules] = js.native
    def getInboundRuleTriggers(filter: FilteringParameters): js.Promise[InboundRules] = js.native
    def getInboundRuleTriggers(filter: FilteringParameters, callback: Callback[InboundRules]): js.Promise[InboundRules] = js.native
    /**
      * Get the Clicks for Outbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageClicks(): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicks(filter: OutboundMessageClicksFilteringParameters): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicks(filter: OutboundMessageClicksFilteringParameters, callback: Callback[OutboundMessageClicks]): js.Promise[OutboundMessageClicks] = js.native
    /**
      * Get Click information for a single Outbound Message.
      *
      * @param messageId - The MessageID for which clicks should be retrieved.
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageClicksForSingleMessage(messageId: String): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicksForSingleMessage(messageId: String, filter: OutboundMessageClicksFilteringParameters): js.Promise[OutboundMessageClicks] = js.native
    def getMessageClicksForSingleMessage(
      messageId: String,
      filter: OutboundMessageClicksFilteringParameters,
      callback: Callback[OutboundMessageClicks]
    ): js.Promise[OutboundMessageClicks] = js.native
    /**
      * Get the Opens for Outbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageOpens(): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpens(filter: OutboundMessageOpensFilteringParameters): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpens(filter: OutboundMessageOpensFilteringParameters, callback: Callback[OutboundMessageOpens]): js.Promise[OutboundMessageOpens] = js.native
    /**
      * Get details of Opens for specific Outbound Message.
      *
      * @param messageId - Message ID of the message for which you wish to retrieve Opens.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getMessageOpensForSingleMessage(messageId: String): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpensForSingleMessage(messageId: String, filter: OutboundMessageOpensFilteringParameters): js.Promise[OutboundMessageOpens] = js.native
    def getMessageOpensForSingleMessage(
      messageId: String,
      filter: OutboundMessageOpensFilteringParameters,
      callback: Callback[OutboundMessageOpens]
    ): js.Promise[OutboundMessageOpens] = js.native
    /**
      * Get details for a specific Outbound Message.
      *
      * @param messageId - The ID of the OutboundMessage you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundMessageDetails(messageId: String): js.Promise[OutboundMessageDetails] = js.native
    def getOutboundMessageDetails(messageId: String, callback: Callback[OutboundMessageDetails]): js.Promise[OutboundMessageDetails] = js.native
    /**
      * Get details for a specific Outbound Message.
      *
      * @param messageId - The ID of the OutboundMessage you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundMessageDump(messageId: String): js.Promise[OutboundMessageDump] = js.native
    def getOutboundMessageDump(messageId: String, callback: Callback[OutboundMessageDump]): js.Promise[OutboundMessageDump] = js.native
    /**
      * Get a batch of Outbound Messages.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundMessages(): js.Promise[OutboundMessages] = js.native
    def getOutboundMessages(filter: OutboundMessagesFilteringParameters): js.Promise[OutboundMessages] = js.native
    def getOutboundMessages(filter: OutboundMessagesFilteringParameters, callback: Callback[OutboundMessages]): js.Promise[OutboundMessages] = js.native
    /**
      * Get overview statistics on Outbound Messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getOutboundOverview(): js.Promise[OutboundStatistics] = js.native
    def getOutboundOverview(filter: StatisticsFilteringParameters): js.Promise[OutboundStatistics] = js.native
    def getOutboundOverview(filter: StatisticsFilteringParameters, callback: Callback[OutboundStatistics]): js.Promise[OutboundStatistics] = js.native
    /**
      * Get statistics on email sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getSentCounts(): js.Promise[SentCounts] = js.native
    def getSentCounts(filter: StatisticsFilteringParameters): js.Promise[SentCounts] = js.native
    def getSentCounts(filter: StatisticsFilteringParameters, callback: Callback[SentCounts]): js.Promise[SentCounts] = js.native
    /**
      * Get the information for the Server associated with this Client.
      *
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getServer(): js.Promise[Server] = js.native
    def getServer(callback: Callback[Server]): js.Promise[Server] = js.native
    /**
      * Get SPAM complaint statistics for email sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getSpamComplaintsCounts(): js.Promise[SpamCounts] = js.native
    def getSpamComplaintsCounts(filter: StatisticsFilteringParameters): js.Promise[SpamCounts] = js.native
    def getSpamComplaintsCounts(filter: StatisticsFilteringParameters, callback: Callback[SpamCounts]): js.Promise[SpamCounts] = js.native
    /**
      * Get a specific Tag Trigger.
      *
      * @param id - The ID of the Tag Trigger you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTagTrigger(id: Double): js.Promise[TagTrigger] = js.native
    def getTagTrigger(id: Double, callback: Callback[TagTrigger]): js.Promise[TagTrigger] = js.native
    /**
      * Get a list of Tag Trigger.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTagTriggers(): js.Promise[TagTriggers] = js.native
    def getTagTriggers(filter: TagTriggerFilteringParameters): js.Promise[TagTriggers] = js.native
    def getTagTriggers(filter: TagTriggerFilteringParameters, callback: Callback[TagTriggers]): js.Promise[TagTriggers] = js.native
    def getTemplate(idOrAlias: String): js.Promise[Template] = js.native
    def getTemplate(idOrAlias: String, callback: Callback[Template]): js.Promise[Template] = js.native
    /**
      * Get the a specific template associated with this server.
      *
      * @param idOrAlias - ID or alias for the template you wish to retrieve.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTemplate(idOrAlias: Double): js.Promise[Template] = js.native
    def getTemplate(idOrAlias: Double, callback: Callback[Template]): js.Promise[Template] = js.native
    /**
      * Get the list of templates associated with this server.
      *
      * @param filter - Optional filtering options.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTemplates(): js.Promise[Templates] = js.native
    def getTemplates(filter: TemplateFilteringParameters): js.Promise[Templates] = js.native
    def getTemplates(filter: TemplateFilteringParameters, callback: Callback[Templates]): js.Promise[Templates] = js.native
    /**
      * Get email tracking statistics for messages sent from the Server associated with this Client.
      *
      * @param filter - Optional filtering parameters.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def getTrackedEmailCounts(): js.Promise[TrackedEmailCounts] = js.native
    def getTrackedEmailCounts(filter: StatisticsFilteringParameters): js.Promise[TrackedEmailCounts] = js.native
    def getTrackedEmailCounts(filter: StatisticsFilteringParameters, callback: Callback[TrackedEmailCounts]): js.Promise[TrackedEmailCounts] = js.native
    /**
      * Request that Postmark retry POSTing to the Inbound Hook for the specified message.
      *
      * @param messageId - The ID of the Inbound Message for which you wish to retry the inbound hook.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def retryInboundHookForMessage(messageId: String): js.Promise[DefaultResponse] = js.native
    def retryInboundHookForMessage(messageId: String, callback: Callback[DefaultResponse]): js.Promise[DefaultResponse] = js.native
    /** Send a single email message.
      *
      * @param email - Email message to send.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmail(email: Message): js.Promise[MessageSendingResponse] = js.native
    def sendEmail(email: Message, callback: Callback[MessageSendingResponse]): js.Promise[MessageSendingResponse] = js.native
    /**
      * Send a batch of email messages.
      *
      * @param emails - An array of messages to send.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmailBatch(emails: js.Array[Message]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    def sendEmailBatch(emails: js.Array[Message], callback: Callback[js.Array[MessageSendingResponse]]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    /**
      * Send a batch of template email messages.
      *
      * @param templates - An array of templated messages you wish to send using this Client.
      * @param callback - If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmailBatchWithTemplates(templates: js.Array[TemplatedMessage]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    def sendEmailBatchWithTemplates(templates: js.Array[TemplatedMessage], callback: Callback[js.Array[MessageSendingResponse]]): js.Promise[js.Array[MessageSendingResponse]] = js.native
    /**
      * Send a message using a template.
      *
      * @param template - Message you wish to send.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def sendEmailWithTemplate(template: TemplatedMessage): js.Promise[MessageSendingResponse] = js.native
    def sendEmailWithTemplate(template: TemplatedMessage, callback: Callback[MessageSendingResponse]): js.Promise[MessageSendingResponse] = js.native
    /**
      * Validate template markup to verify that it will be parsed. Also provides a recommended template
      * model to be used when sending using the specified template content.
      *
      * @param options - The template content you wish to validate.
      * @param callback If the callback is provided, it will be passed to the resulting promise as a continuation.
      * @returns A promise that will complete when the API responds (or an error occurs).
      */
    def validateTemplate(options: TemplateValidationOptions): js.Promise[TemplateValidation] = js.native
    def validateTemplate(options: TemplateValidationOptions, callback: Callback[TemplateValidation]): js.Promise[TemplateValidation] = js.native
  }
  
  @js.native
  class default protected () extends ServerClient {
    /**
      * Create a client.
      *
      * @param serverToken - The token for the server that you wish to interact with.
      * @param configOptions - Options to customize the behavior of the this client.
      */
    def this(serverToken: String) = this()
    def this(serverToken: String, configOptions: Configuration) = this()
  }
  
}

