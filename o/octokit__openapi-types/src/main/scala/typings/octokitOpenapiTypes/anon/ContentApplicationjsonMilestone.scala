package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonMilestone extends StObject {
  
  var content: ApplicationjsonMilestone
}
object ContentApplicationjsonMilestone {
  
  inline def apply(content: ApplicationjsonMilestone): ContentApplicationjsonMilestone = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonMilestone]
  }
  
  extension [Self <: ContentApplicationjsonMilestone](x: Self) {
    
    inline def setContent(value: ApplicationjsonMilestone): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
