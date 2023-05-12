package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunsrerequestable extends StObject {
  
  var content: ApplicationjsonRunsrerequestable
}
object ContentApplicationjsonRunsrerequestable {
  
  inline def apply(content: ApplicationjsonRunsrerequestable): ContentApplicationjsonRunsrerequestable = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunsrerequestable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRunsrerequestable] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRunsrerequestable): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
