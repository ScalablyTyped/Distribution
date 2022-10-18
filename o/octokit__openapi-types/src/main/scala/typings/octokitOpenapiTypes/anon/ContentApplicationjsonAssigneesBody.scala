package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAssigneesBody extends StObject {
  
  var content: ApplicationjsonAssigneesBody
}
object ContentApplicationjsonAssigneesBody {
  
  inline def apply(content: ApplicationjsonAssigneesBody): ContentApplicationjsonAssigneesBody = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAssigneesBody]
  }
  
  extension [Self <: ContentApplicationjsonAssigneesBody](x: Self) {
    
    inline def setContent(value: ApplicationjsonAssigneesBody): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
