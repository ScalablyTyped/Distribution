package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalseatsconsumed extends StObject {
  
  var content: ApplicationjsonTotalseatsconsumed
}
object ContentApplicationjsonTotalseatsconsumed {
  
  inline def apply(content: ApplicationjsonTotalseatsconsumed): ContentApplicationjsonTotalseatsconsumed = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalseatsconsumed]
  }
  
  extension [Self <: ContentApplicationjsonTotalseatsconsumed](x: Self) {
    
    inline def setContent(value: ApplicationjsonTotalseatsconsumed): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
