package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOrganizationurl extends StObject {
  
  var content: ApplicationjsonOrganizationurl
}
object ContentApplicationjsonOrganizationurl {
  
  inline def apply(content: ApplicationjsonOrganizationurl): ContentApplicationjsonOrganizationurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOrganizationurl]
  }
  
  extension [Self <: ContentApplicationjsonOrganizationurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonOrganizationurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
