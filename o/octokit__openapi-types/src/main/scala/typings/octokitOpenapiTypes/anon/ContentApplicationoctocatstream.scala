package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationoctocatstream extends StObject {
  
  var content: Applicationoctocatstream
}
object ContentApplicationoctocatstream {
  
  inline def apply(content: Applicationoctocatstream): ContentApplicationoctocatstream = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationoctocatstream]
  }
  
  extension [Self <: ContentApplicationoctocatstream](x: Self) {
    
    inline def setContent(value: Applicationoctocatstream): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
