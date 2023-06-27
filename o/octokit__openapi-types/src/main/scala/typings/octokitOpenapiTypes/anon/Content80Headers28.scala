package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content80Headers28 extends StObject {
  
  var content: `80`
  
  var headers: `28`
}
object Content80Headers28 {
  
  inline def apply(content: `80`, headers: `28`): Content80Headers28 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content80Headers28]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content80Headers28] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `80`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `28`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
