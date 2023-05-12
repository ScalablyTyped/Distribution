package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCustomdeploymentprotectionrules extends StObject {
  
  var content: ApplicationjsonCustomdeploymentprotectionrules
}
object ContentApplicationjsonCustomdeploymentprotectionrules {
  
  inline def apply(content: ApplicationjsonCustomdeploymentprotectionrules): ContentApplicationjsonCustomdeploymentprotectionrules = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCustomdeploymentprotectionrules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCustomdeploymentprotectionrules] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCustomdeploymentprotectionrules): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
