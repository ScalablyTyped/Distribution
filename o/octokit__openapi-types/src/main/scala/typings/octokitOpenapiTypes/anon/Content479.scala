package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content479 extends StObject {
  
  var content: `479`
  
  var headers: LinkString
}
object Content479 {
  
  inline def apply(content: `479`, headers: LinkString): Content479 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content479]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content479] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `479`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
