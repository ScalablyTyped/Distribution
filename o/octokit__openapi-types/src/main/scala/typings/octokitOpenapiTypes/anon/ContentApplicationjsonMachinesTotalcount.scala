package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMachinesTotalcount extends StObject {
  
  var content: ApplicationjsonMachinesTotalcount
}
object ContentApplicationjsonMachinesTotalcount {
  
  inline def apply(content: ApplicationjsonMachinesTotalcount): ContentApplicationjsonMachinesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMachinesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonMachinesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonMachinesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
