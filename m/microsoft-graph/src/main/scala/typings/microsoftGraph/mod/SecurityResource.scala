package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityResource extends StObject {
  
  // Name of the resource that is related to current alert. Required.
  var resource: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents type of security resources related to an alert. Possible values are: attacked, related.
  var resourceType: js.UndefOr[NullableOption[SecurityResourceType]] = js.undefined
}
object SecurityResource {
  
  inline def apply(): SecurityResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityResource]
  }
  
  extension [Self <: SecurityResource](x: Self) {
    
    inline def setResource(value: NullableOption[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceType(value: NullableOption[SecurityResourceType]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
