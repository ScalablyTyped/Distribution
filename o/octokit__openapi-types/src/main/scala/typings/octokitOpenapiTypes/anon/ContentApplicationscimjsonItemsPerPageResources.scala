package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationscimjsonItemsPerPageResources extends StObject {
  
  var content: ApplicationscimjsonItemsPerPageResources
}
object ContentApplicationscimjsonItemsPerPageResources {
  
  inline def apply(content: ApplicationscimjsonItemsPerPageResources): ContentApplicationscimjsonItemsPerPageResources = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationscimjsonItemsPerPageResources]
  }
  
  extension [Self <: ContentApplicationscimjsonItemsPerPageResources](x: Self) {
    
    inline def setContent(value: ApplicationscimjsonItemsPerPageResources): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
