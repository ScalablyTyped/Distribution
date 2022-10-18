package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLastreadatRead extends StObject {
  
  var content: ApplicationjsonLastreadatRead
}
object ContentApplicationjsonLastreadatRead {
  
  inline def apply(content: ApplicationjsonLastreadatRead): ContentApplicationjsonLastreadatRead = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLastreadatRead]
  }
  
  extension [Self <: ContentApplicationjsonLastreadatRead](x: Self) {
    
    inline def setContent(value: ApplicationjsonLastreadatRead): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
