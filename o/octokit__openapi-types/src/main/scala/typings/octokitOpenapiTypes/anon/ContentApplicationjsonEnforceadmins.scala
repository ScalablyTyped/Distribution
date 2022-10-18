package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnforceadmins extends StObject {
  
  var content: ApplicationjsonEnforceadmins
}
object ContentApplicationjsonEnforceadmins {
  
  inline def apply(content: ApplicationjsonEnforceadmins): ContentApplicationjsonEnforceadmins = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnforceadmins]
  }
  
  extension [Self <: ContentApplicationjsonEnforceadmins](x: Self) {
    
    inline def setContent(value: ApplicationjsonEnforceadmins): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
