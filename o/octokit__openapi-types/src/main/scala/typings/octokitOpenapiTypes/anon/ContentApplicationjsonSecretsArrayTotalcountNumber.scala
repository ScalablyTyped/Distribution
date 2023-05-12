package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSecretsArrayTotalcountNumber extends StObject {
  
  var content: ApplicationjsonSecretsArrayTotalcountNumber
  
  var headers: Link
}
object ContentApplicationjsonSecretsArrayTotalcountNumber {
  
  inline def apply(content: ApplicationjsonSecretsArrayTotalcountNumber, headers: Link): ContentApplicationjsonSecretsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSecretsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSecretsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSecretsArrayTotalcountNumber): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
