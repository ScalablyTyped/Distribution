package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content29 extends StObject {
  
  var content: `29`
  
  var headers: `28`
}
object Content29 {
  
  inline def apply(content: `29`, headers: `28`): Content29 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content29]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content29] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `29`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `28`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
