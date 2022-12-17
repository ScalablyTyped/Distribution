package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOrganizationOrganizationurl extends StObject {
  
  var content: ApplicationjsonOrganizationOrganizationurl
}
object ContentApplicationjsonOrganizationOrganizationurl {
  
  inline def apply(content: ApplicationjsonOrganizationOrganizationurl): ContentApplicationjsonOrganizationOrganizationurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOrganizationOrganizationurl]
  }
  
  extension [Self <: ContentApplicationjsonOrganizationOrganizationurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonOrganizationOrganizationurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
