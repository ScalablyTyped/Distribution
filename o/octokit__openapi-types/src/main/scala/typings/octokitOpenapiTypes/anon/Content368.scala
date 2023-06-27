package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content368 extends StObject {
  
  var content: `368`
  
  var headers: Link
}
object Content368 {
  
  inline def apply(content: `368`, headers: Link): Content368 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content368]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content368] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `368`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
