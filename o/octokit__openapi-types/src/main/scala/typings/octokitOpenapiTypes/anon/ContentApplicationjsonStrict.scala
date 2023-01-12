package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonStrict extends StObject {
  
  var content: ApplicationjsonStrict
}
object ContentApplicationjsonStrict {
  
  inline def apply(content: ApplicationjsonStrict): ContentApplicationjsonStrict = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonStrict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonStrict] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonStrict): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
