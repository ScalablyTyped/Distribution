package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonImporturl extends StObject {
  
  var content: ApplicationjsonImporturl
}
object ContentApplicationjsonImporturl {
  
  inline def apply(content: ApplicationjsonImporturl): ContentApplicationjsonImporturl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonImporturl]
  }
  
  extension [Self <: ContentApplicationjsonImporturl](x: Self) {
    
    inline def setContent(value: ApplicationjsonImporturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
