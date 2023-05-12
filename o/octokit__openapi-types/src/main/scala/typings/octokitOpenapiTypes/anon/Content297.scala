package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content297 extends StObject {
  
  var content: `297`
  
  var headers: Location
}
object Content297 {
  
  inline def apply(content: `297`, headers: Location): Content297 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content297]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content297] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `297`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
