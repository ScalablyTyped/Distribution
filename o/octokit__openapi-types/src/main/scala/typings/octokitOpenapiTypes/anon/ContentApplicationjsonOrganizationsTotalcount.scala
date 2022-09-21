package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOrganizationsTotalcount extends StObject {
  
  var content: ApplicationjsonOrganizationsTotalcount
}
object ContentApplicationjsonOrganizationsTotalcount {
  
  inline def apply(content: ApplicationjsonOrganizationsTotalcount): ContentApplicationjsonOrganizationsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOrganizationsTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonOrganizationsTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonOrganizationsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
