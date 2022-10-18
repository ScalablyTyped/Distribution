package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonConclusion extends StObject {
  
  var content: ApplicationjsonConclusion
}
object ContentApplicationjsonConclusion {
  
  inline def apply(content: ApplicationjsonConclusion): ContentApplicationjsonConclusion = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonConclusion]
  }
  
  extension [Self <: ContentApplicationjsonConclusion](x: Self) {
    
    inline def setContent(value: ApplicationjsonConclusion): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
