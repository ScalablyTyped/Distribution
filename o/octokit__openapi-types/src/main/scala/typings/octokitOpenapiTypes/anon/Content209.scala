package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content209 extends StObject {
  
  var content: `209`
  
  var headers: Link
}
object Content209 {
  
  inline def apply(content: `209`, headers: Link): Content209 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content209]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content209] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `209`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
