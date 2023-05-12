package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMakelatest extends StObject {
  
  var content: ApplicationjsonMakelatest
}
object ContentApplicationjsonMakelatest {
  
  inline def apply(content: ApplicationjsonMakelatest): ContentApplicationjsonMakelatest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMakelatest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonMakelatest] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMakelatest): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
