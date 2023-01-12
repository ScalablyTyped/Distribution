package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content11 extends StObject {
  
  var content: `11`
}
object Content11 {
  
  inline def apply(content: `11`): Content11 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content11]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content11] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `11`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
