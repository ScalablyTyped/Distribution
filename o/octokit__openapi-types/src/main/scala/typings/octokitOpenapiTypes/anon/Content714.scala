package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content714 extends StObject {
  
  var content: `714`
  
  var headers: LinkString
}
object Content714 {
  
  inline def apply(content: `714`, headers: LinkString): Content714 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content714]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content714] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `714`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
