package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonInstallationsTotalcount extends StObject {
  
  var content: ApplicationjsonInstallationsTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonInstallationsTotalcount {
  
  inline def apply(content: ApplicationjsonInstallationsTotalcount, headers: LinkString): ContentApplicationjsonInstallationsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonInstallationsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonInstallationsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonInstallationsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
