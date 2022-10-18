package typings.postmark

import typings.postmark.distClientModelsClientFilteringParametersMod.FilteringParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsMessagesMessageFilteringParametersMod {
  
  @js.native
  sealed trait InboundMessageStatus extends StObject
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "InboundMessageStatus")
  @js.native
  object InboundMessageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InboundMessageStatus & String] = js.native
    
    @js.native
    sealed trait Blocked
      extends StObject
         with InboundMessageStatus
    /* "blocked" */ val Blocked: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Blocked & String = js.native
    
    @js.native
    sealed trait Failed
      extends StObject
         with InboundMessageStatus
    /* "failed" */ val Failed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Failed & String = js.native
    
    @js.native
    sealed trait Processed
      extends StObject
         with InboundMessageStatus
    /* "processed" */ val Processed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Processed & String = js.native
    
    @js.native
    sealed trait Queued
      extends StObject
         with InboundMessageStatus
    /* "queued" */ val Queued: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Queued & String = js.native
    
    @js.native
    sealed trait Scheduled
      extends StObject
         with InboundMessageStatus
    /* "scheduled" */ val Scheduled: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Scheduled & String = js.native
    
    @js.native
    sealed trait Sent
      extends StObject
         with InboundMessageStatus
    /* "sent" */ val Sent: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.InboundMessageStatus.Sent & String = js.native
  }
  
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "InboundMessagesFilteringParameters")
  @js.native
  open class InboundMessagesFilteringParameters protected () extends FilteringParameters {
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
  open class OutboundMessageClicksFilteringParameters protected () extends OutboundMessageTrackingFilteringParameters {
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
  open class OutboundMessageOpensFilteringParameters protected () extends OutboundMessageTrackingFilteringParameters {
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
    def apply(value: String): js.UndefOr[OutboundMessageStatus & String] = js.native
    
    @js.native
    sealed trait Processed
      extends StObject
         with OutboundMessageStatus
    /* "processed" */ val Processed: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Processed & String = js.native
    
    @js.native
    sealed trait Queued
      extends StObject
         with OutboundMessageStatus
    /* "queued" */ val Queued: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Queued & String = js.native
    
    @js.native
    sealed trait Sent
      extends StObject
         with OutboundMessageStatus
    /* "sent" */ val Sent: typings.postmark.distClientModelsMessagesMessageFilteringParametersMod.OutboundMessageStatus.Sent & String = js.native
  }
  
  @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "OutboundMessageTrackingFilteringParameters")
  @js.native
  open class OutboundMessageTrackingFilteringParameters protected () extends FilteringParameters {
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - scala.Any because Already inherited
  - js.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Object because Already inherited
  - js.Any because Already inherited
  - org.scalablytyped.runtime.StObject because Already inherited
  - js.Object because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSImport("postmark/dist/client/models/messages/MessageFilteringParameters", "OutboundMessagesFilteringParameters")
  @js.native
  open class OutboundMessagesFilteringParameters protected () extends FilteringParameters {
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
