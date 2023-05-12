package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIntegrationid extends StObject {
  
  var content: ApplicationjsonIntegrationid
}
object ContentApplicationjsonIntegrationid {
  
  inline def apply(content: ApplicationjsonIntegrationid): ContentApplicationjsonIntegrationid = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIntegrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIntegrationid] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIntegrationid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
