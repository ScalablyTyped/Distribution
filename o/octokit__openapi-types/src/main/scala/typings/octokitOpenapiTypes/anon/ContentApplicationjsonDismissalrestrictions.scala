package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDismissalrestrictions extends StObject {
  
  var content: ApplicationjsonDismissalrestrictions
}
object ContentApplicationjsonDismissalrestrictions {
  
  inline def apply(content: ApplicationjsonDismissalrestrictions): ContentApplicationjsonDismissalrestrictions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDismissalrestrictions]
  }
  
  extension [Self <: ContentApplicationjsonDismissalrestrictions](x: Self) {
    
    inline def setContent(value: ApplicationjsonDismissalrestrictions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
