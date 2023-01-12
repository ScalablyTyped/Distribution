package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBasetree extends StObject {
  
  var content: ApplicationjsonBasetree
}
object ContentApplicationjsonBasetree {
  
  inline def apply(content: ApplicationjsonBasetree): ContentApplicationjsonBasetree = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBasetree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBasetree] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBasetree): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
