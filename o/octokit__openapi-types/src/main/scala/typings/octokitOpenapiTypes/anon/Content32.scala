package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content32 extends StObject {
  
  var content: `32`
}
object Content32 {
  
  inline def apply(content: `32`): Content32 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content32]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content32] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `32`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
