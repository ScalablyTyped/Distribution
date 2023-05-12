package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content45 extends StObject {
  
  var content: `45`
  
  var headers: `25`
}
object Content45 {
  
  inline def apply(content: `45`, headers: `25`): Content45 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content45]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content45] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `45`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `25`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
