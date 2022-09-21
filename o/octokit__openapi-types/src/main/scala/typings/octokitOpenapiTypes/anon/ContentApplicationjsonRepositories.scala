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
  
  extension [Self <: ContentApplicationjsonRepositories](x: Self) {
    
    inline def setContent(value: ApplicationjsonRepositories): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
