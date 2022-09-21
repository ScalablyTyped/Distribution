package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOrganizations extends StObject {
  
  var content: ApplicationjsonOrganizations
}
object ContentApplicationjsonOrganizations {
  
  inline def apply(content: ApplicationjsonOrganizations): ContentApplicationjsonOrganizations = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOrganizations]
  }
  
  extension [Self <: ContentApplicationjsonOrganizations](x: Self) {
    
    inline def setContent(value: ApplicationjsonOrganizations): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
