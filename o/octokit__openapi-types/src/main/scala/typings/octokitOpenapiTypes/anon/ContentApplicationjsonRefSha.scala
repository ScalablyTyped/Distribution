package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRefSha extends StObject {
  
  var content: ApplicationjsonRefSha
}
object ContentApplicationjsonRefSha {
  
  inline def apply(content: ApplicationjsonRefSha): ContentApplicationjsonRefSha = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRefSha]
  }
  
  extension [Self <: ContentApplicationjsonRefSha](x: Self) {
    
    inline def setContent(value: ApplicationjsonRefSha): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
