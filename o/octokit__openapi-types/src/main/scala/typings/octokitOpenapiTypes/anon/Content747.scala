package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content747 extends StObject {
  
  var content: `747`
  
  var headers: LinkString
}
object Content747 {
  
  inline def apply(content: `747`, headers: LinkString): Content747 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content747]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content747] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `747`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
