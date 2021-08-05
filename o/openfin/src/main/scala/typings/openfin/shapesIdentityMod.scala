package typings.openfin

import typings.openfin.entityTypeMod.EntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapesIdentityMod {
  
  trait ClientIdentity
    extends StObject
       with Identity {
    
    var endpointId: js.UndefOr[String] = js.undefined
  }
  object ClientIdentity {
    
    inline def apply(uuid: String): ClientIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientIdentity]
    }
    
    extension [Self <: ClientIdentity](x: Self) {
      
      inline def setEndpointId(value: String): Self = StObject.set(x, "endpointId", value.asInstanceOf[js.Any])
      
      inline def setEndpointIdUndefined: Self = StObject.set(x, "endpointId", js.undefined)
    }
  }
  
  trait Identity extends StObject {
    
    var entityType: js.UndefOr[EntityType] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var parentFrame: js.UndefOr[String] = js.undefined
    
    var runtimeUuid: js.UndefOr[String] = js.undefined
    
    var uuid: String
  }
  object Identity {
    
    inline def apply(uuid: String): Identity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    extension [Self <: Identity](x: Self) {
      
      inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentFrame(value: String): Self = StObject.set(x, "parentFrame", value.asInstanceOf[js.Any])
      
      inline def setParentFrameUndefined: Self = StObject.set(x, "parentFrame", js.undefined)
      
      inline def setRuntimeUuid(value: String): Self = StObject.set(x, "runtimeUuid", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUuidUndefined: Self = StObject.set(x, "runtimeUuid", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProviderIdentity
    extends StObject
       with Identity {
    
    var channelId: js.UndefOr[String] = js.undefined
    
    var channelName: js.UndefOr[String] = js.undefined
    
    var isExternal: js.UndefOr[Boolean] = js.undefined
  }
  object ProviderIdentity {
    
    inline def apply(uuid: String): ProviderIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderIdentity]
    }
    
    extension [Self <: ProviderIdentity](x: Self) {
      
      inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      inline def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
      
      inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      inline def setIsExternal(value: Boolean): Self = StObject.set(x, "isExternal", value.asInstanceOf[js.Any])
      
      inline def setIsExternalUndefined: Self = StObject.set(x, "isExternal", js.undefined)
    }
  }
  
  trait ResourceFetchIdentity
    extends StObject
       with Identity {
    
    var resourceFetch: js.UndefOr[Boolean] = js.undefined
  }
  object ResourceFetchIdentity {
    
    inline def apply(uuid: String): ResourceFetchIdentity = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceFetchIdentity]
    }
    
    extension [Self <: ResourceFetchIdentity](x: Self) {
      
      inline def setResourceFetch(value: Boolean): Self = StObject.set(x, "resourceFetch", value.asInstanceOf[js.Any])
      
      inline def setResourceFetchUndefined: Self = StObject.set(x, "resourceFetch", js.undefined)
    }
  }
}
