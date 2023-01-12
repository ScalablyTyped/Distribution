package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAssignees extends StObject {
  
  var content: ApplicationjsonAssignees
}
object ContentApplicationjsonAssignees {
  
  inline def apply(content: ApplicationjsonAssignees): ContentApplicationjsonAssignees = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAssignees]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAssignees] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAssignees): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
