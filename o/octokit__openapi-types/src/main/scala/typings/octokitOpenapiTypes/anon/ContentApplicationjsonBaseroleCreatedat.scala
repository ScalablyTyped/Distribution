package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBaseroleCreatedat extends StObject {
  
  var content: ApplicationjsonBaseroleCreatedat
}
object ContentApplicationjsonBaseroleCreatedat {
  
  inline def apply(content: ApplicationjsonBaseroleCreatedat): ContentApplicationjsonBaseroleCreatedat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBaseroleCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonBaseroleCreatedat] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonBaseroleCreatedat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
