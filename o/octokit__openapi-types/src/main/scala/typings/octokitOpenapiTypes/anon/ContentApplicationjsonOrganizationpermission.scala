package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOrganizationpermission extends StObject {
  
  var content: ApplicationjsonOrganizationpermission
}
object ContentApplicationjsonOrganizationpermission {
  
  inline def apply(content: ApplicationjsonOrganizationpermission): ContentApplicationjsonOrganizationpermission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOrganizationpermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonOrganizationpermission] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonOrganizationpermission): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
