package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content320 extends StObject {
  
  var content: `320`
  
  var headers: Location
}
object Content320 {
  
  inline def apply(content: `320`, headers: Location): Content320 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content320]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content320] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `320`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
