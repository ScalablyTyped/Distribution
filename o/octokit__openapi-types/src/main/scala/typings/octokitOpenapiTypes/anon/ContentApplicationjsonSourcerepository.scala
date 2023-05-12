package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSourcerepository extends StObject {
  
  var content: ApplicationjsonSourcerepository
}
object ContentApplicationjsonSourcerepository {
  
  inline def apply(content: ApplicationjsonSourcerepository): ContentApplicationjsonSourcerepository = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSourcerepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonSourcerepository] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonSourcerepository): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
