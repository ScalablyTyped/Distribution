package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAssigneeAssignees extends StObject {
  
  var content: ApplicationjsonAssigneeAssignees
}
object ContentApplicationjsonAssigneeAssignees {
  
  inline def apply(content: ApplicationjsonAssigneeAssignees): ContentApplicationjsonAssigneeAssignees = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAssigneeAssignees]
  }
  
  extension [Self <: ContentApplicationjsonAssigneeAssignees](x: Self) {
    
    inline def setContent(value: ApplicationjsonAssigneeAssignees): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
