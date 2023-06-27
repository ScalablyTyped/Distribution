package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content171 extends StObject {
  
  var content: `171`
  
  var headers: Link
}
object Content171 {
  
  inline def apply(content: `171`, headers: Link): Content171 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content171]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content171] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `171`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
