package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRepositories extends StObject {
  
  var content: ApplicationjsonRepositories
}
object ContentApplicationjsonRepositories {
  
  inline def apply(content: ApplicationjsonRepositories): ContentApplicationjsonRepositories = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRepositories] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRepositories): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
