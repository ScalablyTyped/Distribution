package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreditsCveid extends StObject {
  
  var content: ApplicationjsonCreditsCveid
}
object ContentApplicationjsonCreditsCveid {
  
  inline def apply(content: ApplicationjsonCreditsCveid): ContentApplicationjsonCreditsCveid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreditsCveid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCreditsCveid] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCreditsCveid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
