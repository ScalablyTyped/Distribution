package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content255 extends StObject {
  
  var content: `255`
}
object Content255 {
  
  inline def apply(content: `255`): Content255 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content255]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content255] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `255`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
