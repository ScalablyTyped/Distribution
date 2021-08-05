package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceReference extends StObject {
  
  // The item's unique identifier.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A string value that can be used to classify the item, such as 'microsoft.graph.driveItem'
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A URL leading to the referenced item.
  var webUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object ResourceReference {
  
  inline def apply(): ResourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceReference]
  }
  
  extension [Self <: ResourceReference](x: Self) {
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWebUrl(value: NullableOption[String]): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlNull: Self = StObject.set(x, "webUrl", null)
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
