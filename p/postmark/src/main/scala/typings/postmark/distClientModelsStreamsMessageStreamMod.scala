package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsStreamsMessageStreamMod {
  
  @JSImport("postmark/dist/client/models/streams/MessageStream", "CreateMessageStreamRequest")
  @js.native
  open class CreateMessageStreamRequest protected () extends StObject {
    def this(id: String, name: String, messageStreamType: String) = this()
    def this(id: String, name: String, messageStreamType: String, description: String) = this()
    def this(
      id: String,
      name: String,
      messageStreamType: String,
      description: String,
      subscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ) = this()
    def this(
      id: String,
      name: String,
      messageStreamType: String,
      description: Unit,
      subscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ) = this()
    
    var Description: js.UndefOr[String] = js.native
    
    var ID: String = js.native
    
    var MessageStreamType: String = js.native
    
    var Name: String = js.native
    
    var SubscriptionManagementConfiguration: js.UndefOr[
        typings.postmark.distClientModelsStreamsMessageStreamMod.SubscriptionManagementConfiguration
      ] = js.native
  }
  
  @js.native
  sealed trait UnsubscribeHandlingTypes extends StObject
  @JSImport("postmark/dist/client/models/streams/MessageStream", "UnsubscribeHandlingTypes")
  @js.native
  object UnsubscribeHandlingTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnsubscribeHandlingTypes & String] = js.native
    
    @js.native
    sealed trait Custom
      extends StObject
         with UnsubscribeHandlingTypes
    /* "Custom" */ val Custom: typings.postmark.distClientModelsStreamsMessageStreamMod.UnsubscribeHandlingTypes.Custom & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with UnsubscribeHandlingTypes
    /* "None" */ val None: typings.postmark.distClientModelsStreamsMessageStreamMod.UnsubscribeHandlingTypes.None & String = js.native
    
    @js.native
    sealed trait Postmark
      extends StObject
         with UnsubscribeHandlingTypes
    /* "Postmark" */ val Postmark: typings.postmark.distClientModelsStreamsMessageStreamMod.UnsubscribeHandlingTypes.Postmark & String = js.native
  }
  
  @JSImport("postmark/dist/client/models/streams/MessageStream", "UpdateMessageStreamRequest")
  @js.native
  open class UpdateMessageStreamRequest () extends StObject {
    def this(name: String) = this()
    def this(name: String, description: String) = this()
    def this(name: Unit, description: String) = this()
    def this(
      name: String,
      description: String,
      subscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ) = this()
    def this(
      name: String,
      description: Unit,
      subscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ) = this()
    def this(
      name: Unit,
      description: String,
      subscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ) = this()
    def this(
      name: Unit,
      description: Unit,
      subscriptionManagementConfiguration: SubscriptionManagementConfiguration
    ) = this()
    
    var Description: js.UndefOr[String] = js.native
    
    var Name: js.UndefOr[String] = js.native
    
    var SubscriptionManagementConfiguration: js.UndefOr[
        typings.postmark.distClientModelsStreamsMessageStreamMod.SubscriptionManagementConfiguration
      ] = js.native
  }
  
  trait MessageStream extends StObject {
    
    var ArchivedAt: js.UndefOr[String] = js.undefined
    
    var CreatedAt: String
    
    var Description: String
    
    var ExpectedPurgeDate: js.UndefOr[String] = js.undefined
    
    var ID: String
    
    var MessageStreamType: String
    
    var Name: String
    
    var ServerID: Double
    
    var SubscriptionManagementConfiguration: typings.postmark.distClientModelsStreamsMessageStreamMod.SubscriptionManagementConfiguration
    
    var UpdatedAt: js.UndefOr[String] = js.undefined
  }
  object MessageStream {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: MessageStream] (val x: Self) extends AnyVal {
      
      inline def setArchivedAt(value: String): Self = StObject.set(x, "ArchivedAt", value.asInstanceOf[js.Any])
      
      inline def setArchivedAtUndefined: Self = StObject.set(x, "ArchivedAt", js.undefined)
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setExpectedPurgeDate(value: String): Self = StObject.set(x, "ExpectedPurgeDate", value.asInstanceOf[js.Any])
      
      inline def setExpectedPurgeDateUndefined: Self = StObject.set(x, "ExpectedPurgeDate", js.undefined)
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setMessageStreamType(value: String): Self = StObject.set(x, "MessageStreamType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setServerID(value: Double): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionManagementConfiguration(value: SubscriptionManagementConfiguration): Self = StObject.set(x, "SubscriptionManagementConfiguration", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    }
  }
  
  trait MessageStreamArchiveResponse extends StObject {
    
    var ExpectedPurgeDate: String
    
    var ID: Double
    
    var ServerID: Double
  }
  object MessageStreamArchiveResponse {
    
    inline def apply(ExpectedPurgeDate: String, ID: Double, ServerID: Double): MessageStreamArchiveResponse = {
      val __obj = js.Dynamic.literal(ExpectedPurgeDate = ExpectedPurgeDate.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], ServerID = ServerID.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageStreamArchiveResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageStreamArchiveResponse] (val x: Self) extends AnyVal {
      
      inline def setExpectedPurgeDate(value: String): Self = StObject.set(x, "ExpectedPurgeDate", value.asInstanceOf[js.Any])
      
      inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setServerID(value: Double): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageStreamUnarchiveResponse extends StObject {
    
    var ArchivedAt: js.UndefOr[Null] = js.undefined
    
    var CreatedAt: String
    
    var Description: String
    
    var ExpectedPurgeDate: js.UndefOr[String] = js.undefined
    
    var ID: String
    
    var MessageStreamType: String
    
    var Name: String
    
    var ServerID: Double
    
    var SubscriptionManagementConfiguration: typings.postmark.distClientModelsStreamsMessageStreamMod.SubscriptionManagementConfiguration
    
    var UpdatedAt: js.UndefOr[String] = js.undefined
  }
  object MessageStreamUnarchiveResponse {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: MessageStreamUnarchiveResponse] (val x: Self) extends AnyVal {
      
      inline def setCreatedAt(value: String): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setExpectedPurgeDate(value: String): Self = StObject.set(x, "ExpectedPurgeDate", value.asInstanceOf[js.Any])
      
      inline def setExpectedPurgeDateUndefined: Self = StObject.set(x, "ExpectedPurgeDate", js.undefined)
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setMessageStreamType(value: String): Self = StObject.set(x, "MessageStreamType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setServerID(value: Double): Self = StObject.set(x, "ServerID", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionManagementConfiguration(value: SubscriptionManagementConfiguration): Self = StObject.set(x, "SubscriptionManagementConfiguration", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAt(value: String): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
      
      inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
    }
  }
  
  trait MessageStreams extends StObject {
    
    var MessageStreams: js.Array[MessageStream]
    
    var TotalCount: Double
  }
  object MessageStreams {
    
    inline def apply(MessageStreams: js.Array[MessageStream], TotalCount: Double): MessageStreams = {
      val __obj = js.Dynamic.literal(MessageStreams = MessageStreams.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageStreams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageStreams] (val x: Self) extends AnyVal {
      
      inline def setMessageStreams(value: js.Array[MessageStream]): Self = StObject.set(x, "MessageStreams", value.asInstanceOf[js.Any])
      
      inline def setMessageStreamsVarargs(value: MessageStream*): Self = StObject.set(x, "MessageStreams", js.Array(value*))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionManagementConfiguration extends StObject {
    
    var UnsubscribeHandlingType: UnsubscribeHandlingTypes
  }
  object SubscriptionManagementConfiguration {
    
    inline def apply(UnsubscribeHandlingType: UnsubscribeHandlingTypes): SubscriptionManagementConfiguration = {
      val __obj = js.Dynamic.literal(UnsubscribeHandlingType = UnsubscribeHandlingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionManagementConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionManagementConfiguration] (val x: Self) extends AnyVal {
      
      inline def setUnsubscribeHandlingType(value: UnsubscribeHandlingTypes): Self = StObject.set(x, "UnsubscribeHandlingType", value.asInstanceOf[js.Any])
    }
  }
}
