package typings.postmark

import org.scalablytyped.runtime.TopLevel
import typings.postmark.filteringParametersMod.FilteringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", JSImport.Namespace)
@js.native
object messageFilteringParametersMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InboundMessageStatus with String] = js.native
    /* "blocked" */ @js.native
    object Blocked extends TopLevel[Blocked with String]
    
    /* "failed" */ @js.native
    object Failed extends TopLevel[Failed with String]
    
    /* "processed" */ @js.native
    object Processed extends TopLevel[Processed with String]
    
    /* "queued" */ @js.native
    object Queued extends TopLevel[Queued with String]
    
    /* "scheduled" */ @js.native
    object Scheduled extends TopLevel[Scheduled with String]
    
    /* "sent" */ @js.native
    object Sent extends TopLevel[Sent with String]
    
  }
  
  @js.native
  object OutboundMessageStatus extends js.Object {
    @js.native
    sealed trait Processed extends OutboundMessageStatus
    
    @js.native
    sealed trait Queued extends OutboundMessageStatus
    
    @js.native
    sealed trait Sent extends OutboundMessageStatus
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OutboundMessageStatus with String] = js.native
    /* "processed" */ @js.native
    object Processed extends TopLevel[Processed with String]
    
    /* "queued" */ @js.native
    object Queued extends TopLevel[Queued with String]
    
    /* "sent" */ @js.native
    object Sent extends TopLevel[Sent with String]
    
  }
  
}

