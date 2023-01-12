package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAuthorassociationBody extends StObject {
  
  var content: ApplicationjsonAuthorassociationBody
}
object ContentApplicationjsonAuthorassociationBody {
  
  inline def apply(content: ApplicationjsonAuthorassociationBody): ContentApplicationjsonAuthorassociationBody = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAuthorassociationBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAuthorassociationBody] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAuthorassociationBody): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
