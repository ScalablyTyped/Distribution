package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonExcludeownerprojects extends StObject {
  
  var content: ApplicationjsonExcludeownerprojects
}
object ContentApplicationjsonExcludeownerprojects {
  
  inline def apply(content: ApplicationjsonExcludeownerprojects): ContentApplicationjsonExcludeownerprojects = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonExcludeownerprojects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonExcludeownerprojects] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonExcludeownerprojects): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
