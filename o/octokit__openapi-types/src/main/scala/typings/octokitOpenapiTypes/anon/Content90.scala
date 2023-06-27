package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content90 extends StObject {
  
  var content: `90`
  
  var headers: Link
}
object Content90 {
  
  inline def apply(content: `90`, headers: Link): Content90 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content90]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content90] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `90`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
