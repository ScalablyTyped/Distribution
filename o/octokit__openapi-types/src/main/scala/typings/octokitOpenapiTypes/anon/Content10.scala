package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content10 extends StObject {
  
  var content: `10`
}
object Content10 {
  
  inline def apply(content: `10`): Content10 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content10]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content10] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `10`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
