package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNewname extends StObject {
  
  var content: ApplicationjsonNewname
}
object ContentApplicationjsonNewname {
  
  inline def apply(content: ApplicationjsonNewname): ContentApplicationjsonNewname = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNewname]
  }
  
  extension [Self <: ContentApplicationjsonNewname](x: Self) {
    
    inline def setContent(value: ApplicationjsonNewname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
