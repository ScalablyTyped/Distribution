package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Created extends StObject {
  
  /**
    * Format: date-time
    * @example 2019-01-24T22:45:36.000Z
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2019-01-24T22:45:36.000Z
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/scim/v2/organizations/myorg-123abc55141bfd8f/Users/c42772b5-2029-11e9-8543-9264a97dec8d
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** @example User */
  var resourceType: js.UndefOr[String] = js.undefined
}
object Created {
  
  inline def apply(): Created = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Created]
  }
  
  extension [Self <: Created](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
