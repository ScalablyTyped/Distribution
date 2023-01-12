package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonHeadcommit extends StObject {
  
  var content: ApplicationjsonHeadcommit
}
object ContentApplicationjsonHeadcommit {
  
  inline def apply(content: ApplicationjsonHeadcommit): ContentApplicationjsonHeadcommit = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonHeadcommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonHeadcommit] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonHeadcommit): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
