package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDefaultbranch extends StObject {
  
  var content: ApplicationjsonDefaultbranch
}
object ContentApplicationjsonDefaultbranch {
  
  inline def apply(content: ApplicationjsonDefaultbranch): ContentApplicationjsonDefaultbranch = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDefaultbranch]
  }
  
  extension [Self <: ContentApplicationjsonDefaultbranch](x: Self) {
    
    inline def setContent(value: ApplicationjsonDefaultbranch): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
