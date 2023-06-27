package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content84 extends StObject {
  
  var content: `84`
  
  var headers: Link
}
object Content84 {
  
  inline def apply(content: `84`, headers: Link): Content84 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content84]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content84] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `84`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
