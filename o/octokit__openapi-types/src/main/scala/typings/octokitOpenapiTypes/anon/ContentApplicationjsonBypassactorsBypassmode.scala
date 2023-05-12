package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBypassactorsBypassmode extends StObject {
  
  var content: ApplicationjsonBypassactorsBypassmode
}
object ContentApplicationjsonBypassactorsBypassmode {
  
  inline def apply(content: ApplicationjsonBypassactorsBypassmode): ContentApplicationjsonBypassactorsBypassmode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBypassactorsBypassmode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBypassactorsBypassmode] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBypassactorsBypassmode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
