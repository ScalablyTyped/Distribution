package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonProductionenvironment extends StObject {
  
  var content: ApplicationjsonProductionenvironment
}
object ContentApplicationjsonProductionenvironment {
  
  inline def apply(content: ApplicationjsonProductionenvironment): ContentApplicationjsonProductionenvironment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonProductionenvironment]
  }
  
  extension [Self <: ContentApplicationjsonProductionenvironment](x: Self) {
    
    inline def setContent(value: ApplicationjsonProductionenvironment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
