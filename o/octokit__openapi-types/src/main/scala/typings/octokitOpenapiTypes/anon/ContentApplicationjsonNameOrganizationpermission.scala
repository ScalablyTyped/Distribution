package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNameOrganizationpermission extends StObject {
  
  var content: ApplicationjsonNameOrganizationpermission
}
object ContentApplicationjsonNameOrganizationpermission {
  
  inline def apply(content: ApplicationjsonNameOrganizationpermission): ContentApplicationjsonNameOrganizationpermission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNameOrganizationpermission]
  }
  
  extension [Self <: ContentApplicationjsonNameOrganizationpermission](x: Self) {
    
    inline def setContent(value: ApplicationjsonNameOrganizationpermission): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
