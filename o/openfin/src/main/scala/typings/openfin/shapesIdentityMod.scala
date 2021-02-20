package typings.openfin

import typings.openfin.entityTypeMod.EntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapesIdentityMod {
  
  @js.native
  trait ClientIdentity extends Identity {
    
    var endpointId: js.UndefOr[String] = js.native
  }
  object ClientIdentity {
    
    @scala.inline
    def apply(uuid: String): ClientIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientIdentity]
    }
    
    @scala.inline
    implicit class ClientIdentityMutableBuilder[Self <: ClientIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
    }
  }
  
  @js.native
  trait Identity extends StObject {
    
    var entityType: js.UndefOr[EntityType] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var parentFrame: js.UndefOr[String] = js.native
    
    var runtimeUuid: js.UndefOr[String] = js.native
    
    var uuid: String = js.native
  }
  object Identity {
    
    @scala.inline
    def apply(uuid: String): Identity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentFrame(value: String): Self = StObject.set(x, "parentFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentFrameUndefined: Self = StObject.set(x, "parentFrame", js.undefined)
      
      @scala.inline
      def setRuntimeUuid(value: String): Self = StObject.set(x, "runtimeUuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeUuidUndefined: Self = StObject.set(x, "runtimeUuid", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProviderIdentity extends Identity {
    
    var channelId: js.UndefOr[String] = js.native
    
    var channelName: js.UndefOr[String] = js.native
    
    var isExternal: js.UndefOr[Boolean] = js.native
  }
  object ProviderIdentity {
    
    @scala.inline
    def apply(uuid: String): ProviderIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderIdentity]
    }
    
    @scala.inline
    implicit class ProviderIdentityMutableBuilder[Self <: ProviderIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
    }
  }
  
  @js.native
  trait ResourceFetchIdentity extends Identity {
    
    var resourceFetch: js.UndefOr[Boolean] = js.native
  }
  object ResourceFetchIdentity {
    
    @scala.inline
    def apply(uuid: String): ResourceFetchIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceFetchIdentity]
    }
    
    @scala.inline
    implicit class ResourceFetchIdentityMutableBuilder[Self <: ResourceFetchIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceFetch(value: Boolean): Self = StObject.set(x, "resourceFetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceFetchUndefined: Self = StObject.set(x, "resourceFetch", js.undefined)
    }
  }
}
