package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSinglefile extends StObject {
  
  var content: ApplicationjsonSinglefile
}
object ContentApplicationjsonSinglefile {
  
  inline def apply(content: ApplicationjsonSinglefile): ContentApplicationjsonSinglefile = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSinglefile]
  }
  
  extension [Self <: ContentApplicationjsonSinglefile](x: Self) {
    
    inline def setContent(value: ApplicationjsonSinglefile): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
