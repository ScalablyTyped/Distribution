package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContributorsurl extends StObject {
  
  var content: ApplicationjsonContributorsurl
}
object ContentApplicationjsonContributorsurl {
  
  inline def apply(content: ApplicationjsonContributorsurl): ContentApplicationjsonContributorsurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContributorsurl]
  }
  
  extension [Self <: ContentApplicationjsonContributorsurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonContributorsurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
