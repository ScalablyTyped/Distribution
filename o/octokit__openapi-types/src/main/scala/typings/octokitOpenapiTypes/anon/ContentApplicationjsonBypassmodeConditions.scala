package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBypassmodeConditions extends StObject {
  
  var content: ApplicationjsonBypassmodeConditions
}
object ContentApplicationjsonBypassmodeConditions {
  
  inline def apply(content: ApplicationjsonBypassmodeConditions): ContentApplicationjsonBypassmodeConditions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBypassmodeConditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBypassmodeConditions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBypassmodeConditions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
