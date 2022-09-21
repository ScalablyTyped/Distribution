package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationscimjsonActiveDisplayName extends StObject {
  
  var content: ApplicationscimjsonActiveDisplayName
}
object ContentApplicationscimjsonActiveDisplayName {
  
  inline def apply(content: ApplicationscimjsonActiveDisplayName): ContentApplicationscimjsonActiveDisplayName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationscimjsonActiveDisplayName]
  }
  
  extension [Self <: ContentApplicationscimjsonActiveDisplayName](x: Self) {
    
    inline def setContent(value: ApplicationscimjsonActiveDisplayName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
