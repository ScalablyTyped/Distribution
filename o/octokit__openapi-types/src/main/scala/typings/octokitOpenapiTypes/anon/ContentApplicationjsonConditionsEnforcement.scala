package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonConditionsEnforcement extends StObject {
  
  var content: ApplicationjsonConditionsEnforcement
}
object ContentApplicationjsonConditionsEnforcement {
  
  inline def apply(content: ApplicationjsonConditionsEnforcement): ContentApplicationjsonConditionsEnforcement = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonConditionsEnforcement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonConditionsEnforcement] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonConditionsEnforcement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
