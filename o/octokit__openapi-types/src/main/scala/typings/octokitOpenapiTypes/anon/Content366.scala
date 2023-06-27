package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content366 extends StObject {
  
  var content: `366`
  
  var headers: Location
}
object Content366 {
  
  inline def apply(content: `366`, headers: Location): Content366 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content366]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content366] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `366`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
