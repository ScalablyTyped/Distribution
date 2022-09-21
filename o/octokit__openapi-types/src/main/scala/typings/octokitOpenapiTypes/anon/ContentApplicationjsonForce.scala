package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonForce extends StObject {
  
  var content: ApplicationjsonForce
}
object ContentApplicationjsonForce {
  
  inline def apply(content: ApplicationjsonForce): ContentApplicationjsonForce = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonForce]
  }
  
  extension [Self <: ContentApplicationjsonForce](x: Self) {
    
    inline def setContent(value: ApplicationjsonForce): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
