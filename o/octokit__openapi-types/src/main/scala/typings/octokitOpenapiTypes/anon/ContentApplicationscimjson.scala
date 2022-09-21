package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationscimjson extends StObject {
  
  var content: Applicationscimjson
}
object ContentApplicationscimjson {
  
  inline def apply(content: Applicationscimjson): ContentApplicationscimjson = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationscimjson]
  }
  
  extension [Self <: ContentApplicationscimjson](x: Self) {
    
    inline def setContent(value: Applicationscimjson): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
