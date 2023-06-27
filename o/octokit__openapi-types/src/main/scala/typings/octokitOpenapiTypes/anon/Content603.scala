package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content603 extends StObject {
  
  var content: `603`
  
  var headers: LinkString
}
object Content603 {
  
  inline def apply(content: `603`, headers: LinkString): Content603 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content603]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content603] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `603`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
