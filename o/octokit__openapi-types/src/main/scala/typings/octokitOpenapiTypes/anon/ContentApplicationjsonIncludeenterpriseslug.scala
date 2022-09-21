package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIncludeenterpriseslug extends StObject {
  
  var content: ApplicationjsonIncludeenterpriseslug
}
object ContentApplicationjsonIncludeenterpriseslug {
  
  inline def apply(content: ApplicationjsonIncludeenterpriseslug): ContentApplicationjsonIncludeenterpriseslug = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIncludeenterpriseslug]
  }
  
  extension [Self <: ContentApplicationjsonIncludeenterpriseslug](x: Self) {
    
    inline def setContent(value: ApplicationjsonIncludeenterpriseslug): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
