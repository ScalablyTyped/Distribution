package typings.postmark

import typings.postmark.filteringParametersMod.FilteringParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageFilteringParametersMod {
  
  @js.native
  sealed trait InboundMessageStatus extends StObject
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "InboundMessageStatus")
  @js.native
  object InboundMessageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InboundMessageStatus with String] = js.native
    
    @js.native
    sealed trait Blocked extends InboundMessageStatus
    /* "blocked" */ val Blocked: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Blocked with String = js.native
    
    @js.native
    sealed trait Failed extends InboundMessageStatus
    /* "failed" */ val Failed: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Failed with String = js.native
    
    @js.native
    sealed trait Processed extends InboundMessageStatus
    /* "processed" */ val Processed: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Processed with String = js.native
    
    @js.native
    sealed trait Queued extends InboundMessageStatus
    /* "queued" */ val Queued: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Queued with String = js.native
    
    @js.native
    sealed trait Scheduled extends InboundMessageStatus
    /* "scheduled" */ val Scheduled: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Scheduled with String = js.native
    
    @js.native
    sealed trait Sent extends InboundMessageStatus
    /* "sent" */ val Sent: typings.postmark.messageFilteringParametersMod.InboundMessageStatus.Sent with String = js.native
  }
  
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "InboundMessagesFilteringParameters")
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
  
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "OutboundMessageClicksFilteringParameters")
  @js.native
  class OutboundMessageClicksFilteringParameters protected () extends OutboundMessageTrackingFilteringParameters {
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
      city: js.UndefOr[String],
      messageStream: js.UndefOr[String]
    ) = this()
  }
  
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "OutboundMessageOpensFilteringParameters")
  @js.native
  class OutboundMessageOpensFilteringParameters protected () extends OutboundMessageTrackingFilteringParameters {
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
      city: js.UndefOr[String],
      messageStream: js.UndefOr[String]
    ) = this()
  }
  
  @js.native
  sealed trait OutboundMessageStatus extends StObject
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "OutboundMessageStatus")
  @js.native
  object OutboundMessageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OutboundMessageStatus with String] = js.native
    
    @js.native
    sealed trait Processed extends OutboundMessageStatus
    /* "processed" */ val Processed: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Processed with String = js.native
    
    @js.native
    sealed trait Queued extends OutboundMessageStatus
    /* "queued" */ val Queued: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Queued with String = js.native
    
    @js.native
    sealed trait Sent extends OutboundMessageStatus
    /* "sent" */ val Sent: typings.postmark.messageFilteringParametersMod.OutboundMessageStatus.Sent with String = js.native
  }
  
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "OutboundMessageTrackingFilteringParameters")
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
      city: js.UndefOr[String],
      messageStream: js.UndefOr[String]
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
  
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "OutboundMessagesFilteringParameters")
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
      subject: js.UndefOr[String],
      messageStream: js.UndefOr[String]
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
}
