package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content204 extends StObject {
  
  var content: `204`
}
object Content204 {
  
  inline def apply(content: `204`): Content204 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content204]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content204] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `204`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
