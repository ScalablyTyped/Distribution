package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content476 extends StObject {
  
  var content: `476`
  
  var headers: Link
}
object Content476 {
  
  inline def apply(content: `476`, headers: Link): Content476 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content476]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content476] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `476`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
