package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSecretsArray extends StObject {
  
  var content: ApplicationjsonSecretsArray
}
object ContentApplicationjsonSecretsArray {
  
  inline def apply(content: ApplicationjsonSecretsArray): ContentApplicationjsonSecretsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSecretsArray]
  }
  
  extension [Self <: ContentApplicationjsonSecretsArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonSecretsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
