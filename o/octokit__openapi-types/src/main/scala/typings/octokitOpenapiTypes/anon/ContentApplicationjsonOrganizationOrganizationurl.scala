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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonOrganizationOrganizationurl] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonOrganizationOrganizationurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
