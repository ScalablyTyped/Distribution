package typings.postmark

import typings.postmark.distClientModelsClientFilteringParametersMod.FilteringParameters
import typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus
import typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus
import typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageTrackingFilteringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", JSImport.Namespace)
@js.native
object distClientModelsMessagesMessageFilteringParametersMod extends js.Object {
  @js.native
  sealed trait InboundMessageStatus extends js.Object
  
  @js.native
  class InboundMessagesFilteringParameters protected () extends FilteringParameters {
    def this(
      count: js.UndefOr[Double],
      offset: js.UndefOr[Double],
      mailboxHash: js.UndefOr[String],
      recipient: js.UndefOr[String],
      fromEmail: js.UndefOr[String],
      tag: js.UndefOr[String],
      status: js.UndefOr[InboundMessageStatus],
      fromDate: js.UndefOr[String],
      toDate: js.UndefOr[String],
      subject: js.UndefOr[String]
    ) = this()
    var fromDate: js.UndefOr[String] = js.native
    var fromEmail: js.UndefOr[String] = js.native
    var mailboxHash: js.UndefOr[String] = js.native
    var recipient: js.UndefOr[String] = js.native
    var status: js.UndefOr[InboundMessageStatus] = js.native
    var subject: js.UndefOr[String] = js.native
    var tag: js.UndefOr[String] = js.native
    var toDate: js.UndefOr[String] = js.native
  }
  
  @js.native
  class OutboundMessageClicksFilteringParameters () extends OutboundMessageTrackingFilteringParameters
  
  @js.native
  class OutboundMessageOpensFilteringParameters () extends OutboundMessageTrackingFilteringParameters
  
  @js.native
  sealed trait OutboundMessageStatus extends js.Object
  
  @js.native
  class OutboundMessageTrackingFilteringParameters protected () extends FilteringParameters {
    def this(
      count: js.UndefOr[Double],
      offset: js.UndefOr[Double],
      recipient: js.UndefOr[String],
      tag: js.UndefOr[String],
      client_name: js.UndefOr[String],
      client_company: js.UndefOr[String],
      client_family: js.UndefOr[String],
      os_name: js.UndefOr[String],
      os_family: js.UndefOr[String],
      os_company: js.UndefOr[String],
      platform: js.UndefOr[String],
      country: js.UndefOr[String],
      region: js.UndefOr[String],
      city: js.UndefOr[String]
    ) = this()
    var city: js.UndefOr[String] = js.native
    var client_company: js.UndefOr[String] = js.native
    var client_family: js.UndefOr[String] = js.native
    var client_name: js.UndefOr[String] = js.native
    var country: js.UndefOr[String] = js.native
    var messageStream: js.UndefOr[String] = js.native
    var os_company: js.UndefOr[String] = js.native
    var os_family: js.UndefOr[String] = js.native
    var os_name: js.UndefOr[String] = js.native
    var platform: js.UndefOr[String] = js.native
    var recipient: js.UndefOr[String] = js.native
    var region: js.UndefOr[String] = js.native
    var tag: js.UndefOr[String] = js.native
  }
  
  @js.native
  class OutboundMessagesFilteringParameters protected () extends FilteringParameters {
    def this(
      count: js.UndefOr[Double],
      offset: js.UndefOr[Double],
      recipient: js.UndefOr[String],
      fromEmail: js.UndefOr[String],
      tag: js.UndefOr[String],
      status: js.UndefOr[OutboundMessageStatus],
      fromDate: js.UndefOr[String],
      toDate: js.UndefOr[String],
      subject: js.UndefOr[String]
    ) = this()
    var fromDate: js.UndefOr[String] = js.native
    var fromEmail: js.UndefOr[String] = js.native
    var messageStream: js.UndefOr[String] = js.native
    var recipient: js.UndefOr[String] = js.native
    var status: js.UndefOr[OutboundMessageStatus] = js.native
    var subject: js.UndefOr[String] = js.native
    var tag: js.UndefOr[String] = js.native
    var toDate: js.UndefOr[String] = js.native
  }
  
  @js.native
  object InboundMessageStatus extends js.Object {
    @js.native
    sealed trait Blocked extends InboundMessageStatus
    
    @js.native
    sealed trait Failed extends InboundMessageStatus
    
    @js.native
    sealed trait Processed extends InboundMessageStatus
    
    @js.native
    sealed trait Queued extends InboundMessageStatus
    
    @js.native
    sealed trait Scheduled extends InboundMessageStatus
    
    @js.native
    sealed trait Sent extends InboundMessageStatus
    
    /* "blocked" */ val Blocked: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Blocked with String = js.native
    /* "failed" */ val Failed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Failed with String = js.native
    /* "processed" */ val Processed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Processed with String = js.native
    /* "queued" */ val Queued: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Queued with String = js.native
    /* "scheduled" */ val Scheduled: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Scheduled with String = js.native
    /* "sent" */ val Sent: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Sent with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InboundMessageStatus with String] = js.native
  }
  
  @js.native
  object OutboundMessageStatus extends js.Object {
    @js.native
    sealed trait Processed extends OutboundMessageStatus
    
    @js.native
    sealed trait Queued extends OutboundMessageStatus
    
    @js.native
    sealed trait Sent extends OutboundMessageStatus
    
    /* "processed" */ val Processed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Processed with String = js.native
    /* "queued" */ val Queued: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Queued with String = js.native
    /* "sent" */ val Sent: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Sent with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OutboundMessageStatus with String] = js.native
  }
  
}

