package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonApplicationscimjson extends StObject {
  
  var content: ApplicationjsonApplicationscimjson
}
object ContentApplicationjsonApplicationscimjson {
  
  inline def apply(content: ApplicationjsonApplicationscimjson): ContentApplicationjsonApplicationscimjson = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonApplicationscimjson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonApplicationscimjson] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonApplicationscimjson): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
