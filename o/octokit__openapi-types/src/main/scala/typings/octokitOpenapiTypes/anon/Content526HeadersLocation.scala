package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content526HeadersLocation extends StObject {
  
  var content: `526`
  
  var headers: Location
}
object Content526HeadersLocation {
  
  inline def apply(content: `526`, headers: Location): Content526HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content526HeadersLocation]
  }
  
  extension [Self <: Content526HeadersLocation](x: Self) {
    
    inline def setContent(value: `526`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
