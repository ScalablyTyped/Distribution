package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonChecksuites extends StObject {
  
  var content: ApplicationjsonChecksuites
}
object ContentApplicationjsonChecksuites {
  
  inline def apply(content: ApplicationjsonChecksuites): ContentApplicationjsonChecksuites = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonChecksuites]
  }
  
  extension [Self <: ContentApplicationjsonChecksuites](x: Self) {
    
    inline def setContent(value: ApplicationjsonChecksuites): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
