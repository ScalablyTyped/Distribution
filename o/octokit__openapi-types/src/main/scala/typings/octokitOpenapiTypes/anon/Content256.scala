package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content256 extends StObject {
  
  var content: `256`
}
object Content256 {
  
  inline def apply(content: `256`): Content256 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content256]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content256] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `256`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
