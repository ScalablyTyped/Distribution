package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTfvcproject extends StObject {
  
  var content: ApplicationjsonTfvcproject
}
object ContentApplicationjsonTfvcproject {
  
  inline def apply(content: ApplicationjsonTfvcproject): ContentApplicationjsonTfvcproject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTfvcproject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTfvcproject] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTfvcproject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
