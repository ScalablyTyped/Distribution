package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTotalcountWorkflows extends StObject {
  
  var content: ApplicationjsonTotalcountWorkflows
}
object ContentApplicationjsonTotalcountWorkflows {
  
  inline def apply(content: ApplicationjsonTotalcountWorkflows): ContentApplicationjsonTotalcountWorkflows = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTotalcountWorkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTotalcountWorkflows] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTotalcountWorkflows): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
