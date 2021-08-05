package typings.msportalfxMock

import typings.msportalfxMock.html5Mod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armResourceMod {
  
  trait Resource
    extends StObject
       with ResourceBase {
    
    /**
      * Resource group ID.
      */
    var resourceGroup: String
    
    /**
      * Resource self link URI.
      */
    var selfLinkUri: String
  }
  object Resource {
    
    inline def apply(
      id: String,
      kind: String,
      location: String,
      name: String,
      resourceGroup: String,
      selfLinkUri: String,
      tags: StringMap[String],
      `type`: String
    ): Resource = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceGroup = resourceGroup.asInstanceOf[js.Any], selfLinkUri = selfLinkUri.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setResourceGroup(value: String): Self = StObject.set(x, "resourceGroup", value.asInstanceOf[js.Any])
      
      inline def setSelfLinkUri(value: String): Self = StObject.set(x, "selfLinkUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceBase extends StObject {
    
    /**
      * Resource id.
      */
    var id: String
    
    /**
      * Resource kind.
      */
    var kind: String
    
    /**
      * Resource location.
      */
    var location: String
    
    /**
      * Resource name.
      */
    var name: String
    
    /**
      * Resource tags.
      */
    var tags: StringMap[String]
    
    /**
      * Resource type.
      */
    var `type`: String
  }
  object ResourceBase {
    
    inline def apply(id: String, kind: String, location: String, name: String, tags: StringMap[String], `type`: String): ResourceBase = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceBase]
    }
    
    extension [Self <: ResourceBase](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringMap[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
