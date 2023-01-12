package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content3 extends StObject {
  
  var content: `3`
}
object Content3 {
  
  inline def apply(content: `3`): Content3 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content3] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `3`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
