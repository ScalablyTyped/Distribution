package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBypassactors extends StObject {
  
  var content: ApplicationjsonBypassactors
}
object ContentApplicationjsonBypassactors {
  
  inline def apply(content: ApplicationjsonBypassactors): ContentApplicationjsonBypassactors = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBypassactors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBypassactors] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBypassactors): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
