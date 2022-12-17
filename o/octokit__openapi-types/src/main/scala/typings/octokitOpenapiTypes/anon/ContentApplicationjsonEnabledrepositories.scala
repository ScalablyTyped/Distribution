package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnabledrepositories extends StObject {
  
  var content: ApplicationjsonEnabledrepositories
}
object ContentApplicationjsonEnabledrepositories {
  
  inline def apply(content: ApplicationjsonEnabledrepositories): ContentApplicationjsonEnabledrepositories = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnabledrepositories]
  }
  
  extension [Self <: ContentApplicationjsonEnabledrepositories](x: Self) {
    
    inline def setContent(value: ApplicationjsonEnabledrepositories): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
