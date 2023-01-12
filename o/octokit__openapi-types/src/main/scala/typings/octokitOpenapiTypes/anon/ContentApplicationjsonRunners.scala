package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunners extends StObject {
  
  var content: ApplicationjsonRunners
}
object ContentApplicationjsonRunners {
  
  inline def apply(content: ApplicationjsonRunners): ContentApplicationjsonRunners = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunners]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRunners] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRunners): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
