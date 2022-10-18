package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonLabelName extends StObject {
  
  var content: ApplicationjsonLabelName
}
object ContentApplicationjsonLabelName {
  
  inline def apply(content: ApplicationjsonLabelName): ContentApplicationjsonLabelName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonLabelName]
  }
  
  extension [Self <: ContentApplicationjsonLabelName](x: Self) {
    
    inline def setContent(value: ApplicationjsonLabelName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
