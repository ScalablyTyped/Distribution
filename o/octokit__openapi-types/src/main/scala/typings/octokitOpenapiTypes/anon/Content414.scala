package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content414 extends StObject {
  
  var content: `414`
  
  var headers: Link
}
object Content414 {
  
  inline def apply(content: `414`, headers: Link): Content414 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content414]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content414] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `414`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
