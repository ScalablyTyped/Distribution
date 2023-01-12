package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content111 extends StObject {
  
  var content: `111`
}
object Content111 {
  
  inline def apply(content: `111`): Content111 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content111]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content111] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `111`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
