package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCompany extends StObject {
  
  var content: ApplicationjsonCompany
}
object ContentApplicationjsonCompany {
  
  inline def apply(content: ApplicationjsonCompany): ContentApplicationjsonCompany = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCompany]
  }
  
  extension [Self <: ContentApplicationjsonCompany](x: Self) {
    
    inline def setContent(value: ApplicationjsonCompany): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
