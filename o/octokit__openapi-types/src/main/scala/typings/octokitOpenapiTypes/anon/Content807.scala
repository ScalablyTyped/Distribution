package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content807 extends StObject {
  
  var content: `807`
  
  var headers: LinkString
}
object Content807 {
  
  inline def apply(content: `807`, headers: LinkString): Content807 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content807]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content807] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `807`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
