package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content618 extends StObject {
  
  var content: `618`
  
  var headers: LinkString
}
object Content618 {
  
  inline def apply(content: `618`, headers: LinkString): Content618 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content618]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content618] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `618`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
