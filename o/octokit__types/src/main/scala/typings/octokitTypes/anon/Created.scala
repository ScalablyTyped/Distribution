package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  var created: String
  
  var lastModified: String
  
  var location: String
  
  var resourceType: String
}
object Created {
  
  inline def apply(created: String, lastModified: String, location: String, resourceType: String): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  
  extension [Self <: Created](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
