package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content317 extends StObject {
  
  var content: `317`
  
  var headers: Link
}
object Content317 {
  
  inline def apply(content: `317`, headers: Link): Content317 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content317]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content317] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `317`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
