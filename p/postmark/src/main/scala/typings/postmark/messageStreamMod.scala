package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageStreamMod {
  
  @JSImport("postmark/dist/client/models/streams/MessageStream", "CreateMessageStreamRequest")
  @js.native
  class CreateMessageStreamRequest protected () extends StObject {
    def this(id: String, name: String, messageStreamType: String) = this()
    def this(id: String, name: String, messageStreamType: String, description: String) = this()
    
    var Description: js.UndefOr[String] = js.native
    
    var ID: String = js.native
    
    var MessageStreamType: String = js.native
    
    var Name: String = js.native
  }
  
  @JSImport("postmark/dist/client/models/streams/MessageStream", "UpdateMessageStreamRequest")
  @js.native
  class UpdateMessageStreamRequest () extends StObject {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], description: String) = this()
    def this(name: String, description: String) = this()
    
    var Description: js.UndefOr[String] = js.native
    
    var Name: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait MessageStream extends StObject {
    
    var ArchivedAt: js.UndefOr[String] = js.native
    
    var CreatedAt: String = js.native
    
    var Description: String = js.native
    
    var ExpectedPurgeDate: js.UndefOr[String] = js.native
    
    var ID: String = js.native
    
    var MessageStreamType: String = js.native
    
    var Name: String = js.native
    
    var ServerID: Double = js.native
    
    var SubscriptionManagementConfiguration: typings.postmark.messageStreamMod.SubscriptionManagementConfiguration = js.native
    
    var UpdatedAt: js.UndefOr[String] = js.native
  }
  object MessageStream {
    
    @scala.inline
    def apply(
      CreatedAt: String,
      Description: String,
      ID: String,
      MessageStreamType: String,
      Name: String,
      ServerID: Double,
      SubscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ): MessageStream = {
      val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MessageStreamType = MessageStreamType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any], SubscriptionManagementConfiguration = SubscriptionManagementConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageStream]
    }
    
    @scala.inline
    implicit class MessageStreamMutableBuilder[Self <: MessageStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchivedAt(value: String): Self = StObject.set(x, "ArchivedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchivedAtUndefined: Self = StObject.set(x, "ArchivedAt", js.undefined)
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedPurgeDate(value: String): Self = StObject.set(x, "ExpectedPurgeDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedPurgeDateUndefined: Self = StObject.set(x, "ExpectedPurgeDate", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStreamType(value: String): Self = StObject.set(x, "MessageStreamType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerID(value: Double): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionManagementConfiguration(value: SubscriptionManagementConfiguration): Self = StObject.set(x, "SubscriptionManagementConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    }
  }
  
  @js.native
  trait MessageStreamArchiveResponse extends StObject {
    
    var ExpectedPurgeDate: String = js.native
    
    var ID: Double = js.native
    
    var ServerID: Double = js.native
  }
  object MessageStreamArchiveResponse {
    
    @scala.inline
    def apply(ExpectedPurgeDate: String, ID: Double, ServerID: Double): MessageStreamArchiveResponse = {
      val __obj = js.Dynamic.literal(ExpectedPurgeDate = ExpectedPurgeDate.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageStreamArchiveResponse]
    }
    
    @scala.inline
    implicit class MessageStreamArchiveResponseMutableBuilder[Self <: MessageStreamArchiveResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpectedPurgeDate(value: String): Self = StObject.set(x, "ExpectedPurgeDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerID(value: Double): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageStreamUnarchiveResponse extends StObject {
    
    var ArchivedAt: js.UndefOr[Null] = js.native
    
    var CreatedAt: String = js.native
    
    var Description: String = js.native
    
    var ExpectedPurgeDate: js.UndefOr[String] = js.native
    
    var ID: String = js.native
    
    var MessageStreamType: String = js.native
    
    var Name: String = js.native
    
    var ServerID: Double = js.native
    
    var SubscriptionManagementConfiguration: typings.postmark.messageStreamMod.SubscriptionManagementConfiguration = js.native
    
    var UpdatedAt: js.UndefOr[String] = js.native
  }
  object MessageStreamUnarchiveResponse {
    
    @scala.inline
    def apply(
      CreatedAt: String,
      Description: String,
      ID: String,
      MessageStreamType: String,
      Name: String,
      ServerID: Double,
      SubscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ): MessageStreamUnarchiveResponse = {
      val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], MessageStreamType = MessageStreamType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any], SubscriptionManagementConfiguration = SubscriptionManagementConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageStreamUnarchiveResponse]
    }
    
    @scala.inline
    implicit class MessageStreamUnarchiveResponseMutableBuilder[Self <: MessageStreamUnarchiveResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedPurgeDate(value: String): Self = StObject.set(x, "ExpectedPurgeDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedPurgeDateUndefined: Self = StObject.set(x, "ExpectedPurgeDate", js.undefined)
      
      @scala.inline
      def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStreamType(value: String): Self = StObject.set(x, "MessageStreamType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerID(value: Double): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionManagementConfiguration(value: SubscriptionManagementConfiguration): Self = StObject.set(x, "SubscriptionManagementConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    }
  }
  
  @js.native
  trait MessageStreams extends StObject {
    
    var MessageStreams: js.Array[MessageStream] = js.native
    
    var TotalCount: Double = js.native
  }
  object MessageStreams {
    
    @scala.inline
    def apply(MessageStreams: js.Array[MessageStream], TotalCount: Double): MessageStreams = {
      val __obj = js.Dynamic.literal(MessageStreams = MessageStreams.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageStreams]
    }
    
    @scala.inline
    implicit class MessageStreamsMutableBuilder[Self <: MessageStreams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageStreams(value: js.Array[MessageStream]): Self = StObject.set(x, "MessageStreams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStreamsVarargs(value: MessageStream*): Self = StObject.set(x, "MessageStreams", js.Array(value :_*))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscriptionManagementConfiguration extends StObject {
    
    var UnsubscribeHandlingType: String = js.native
  }
  object SubscriptionManagementConfiguration {
    
    @scala.inline
    def apply(UnsubscribeHandlingType: String): SubscriptionManagementConfiguration = {
      val __obj = js.Dynamic.literal(UnsubscribeHandlingType = UnsubscribeHandlingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionManagementConfiguration]
    }
    
    @scala.inline
    implicit class SubscriptionManagementConfigurationMutableBuilder[Self <: SubscriptionManagementConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribeHandlingType(value: String): Self = StObject.set(x, "UnsubscribeHandlingType", value.asInstanceOf[js.Any])
    }
  }
}
