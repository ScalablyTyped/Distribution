package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDiscussioncategoryname extends StObject {
  
  var content: ApplicationjsonDiscussioncategoryname
}
object ContentApplicationjsonDiscussioncategoryname {
  
  inline def apply(content: ApplicationjsonDiscussioncategoryname): ContentApplicationjsonDiscussioncategoryname = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDiscussioncategoryname]
  }
  
  extension [Self <: ContentApplicationjsonDiscussioncategoryname](x: Self) {
    
    inline def setContent(value: ApplicationjsonDiscussioncategoryname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
