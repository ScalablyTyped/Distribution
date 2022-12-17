package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDeployment extends StObject {
  
  var content: ApplicationjsonDeployment
}
object ContentApplicationjsonDeployment {
  
  inline def apply(content: ApplicationjsonDeployment): ContentApplicationjsonDeployment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDeployment]
  }
  
  extension [Self <: ContentApplicationjsonDeployment](x: Self) {
    
    inline def setContent(value: ApplicationjsonDeployment): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
