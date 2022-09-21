package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNewowner extends StObject {
  
  var content: ApplicationjsonNewowner
}
object ContentApplicationjsonNewowner {
  
  inline def apply(content: ApplicationjsonNewowner): ContentApplicationjsonNewowner = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNewowner]
  }
  
  extension [Self <: ContentApplicationjsonNewowner](x: Self) {
    
    inline def setContent(value: ApplicationjsonNewowner): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
