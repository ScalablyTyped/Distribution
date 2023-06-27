package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content108 extends StObject {
  
  var content: `108`
  
  var headers: Link
}
object Content108 {
  
  inline def apply(content: `108`, headers: Link): Content108 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content108]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content108] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `108`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
