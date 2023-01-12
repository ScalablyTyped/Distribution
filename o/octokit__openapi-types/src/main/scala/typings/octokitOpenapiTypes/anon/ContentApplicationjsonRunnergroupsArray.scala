package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRunnergroupsArray extends StObject {
  
  var content: ApplicationjsonRunnergroupsArray
}
object ContentApplicationjsonRunnergroupsArray {
  
  inline def apply(content: ApplicationjsonRunnergroupsArray): ContentApplicationjsonRunnergroupsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRunnergroupsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonRunnergroupsArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonRunnergroupsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
