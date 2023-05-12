package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBypassactorsConditions extends StObject {
  
  var content: ApplicationjsonBypassactorsConditions
}
object ContentApplicationjsonBypassactorsConditions {
  
  inline def apply(content: ApplicationjsonBypassactorsConditions): ContentApplicationjsonBypassactorsConditions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBypassactorsConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBypassactorsConditions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBypassactorsConditions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
