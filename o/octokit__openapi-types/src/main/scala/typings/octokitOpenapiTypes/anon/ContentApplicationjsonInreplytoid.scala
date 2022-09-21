package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInreplytoid extends StObject {
  
  var content: ApplicationjsonInreplytoid
}
object ContentApplicationjsonInreplytoid {
  
  inline def apply(content: ApplicationjsonInreplytoid): ContentApplicationjsonInreplytoid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInreplytoid]
  }
  
  extension [Self <: ContentApplicationjsonInreplytoid](x: Self) {
    
    inline def setContent(value: ApplicationjsonInreplytoid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
