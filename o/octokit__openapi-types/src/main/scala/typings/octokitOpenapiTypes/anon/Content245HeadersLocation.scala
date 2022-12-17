package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content245HeadersLocation extends StObject {
  
  var content: `245`
  
  var headers: Location
}
object Content245HeadersLocation {
  
  inline def apply(content: `245`, headers: Location): Content245HeadersLocation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content245HeadersLocation]
  }
  
  extension [Self <: Content245HeadersLocation](x: Self) {
    
    inline def setContent(value: `245`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
