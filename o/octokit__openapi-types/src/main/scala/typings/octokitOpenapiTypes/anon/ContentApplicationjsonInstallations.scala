package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInstallations extends StObject {
  
  var content: ApplicationjsonInstallations
  
  var headers: Link
}
object ContentApplicationjsonInstallations {
  
  inline def apply(content: ApplicationjsonInstallations, headers: Link): ContentApplicationjsonInstallations = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInstallations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonInstallations] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonInstallations): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
