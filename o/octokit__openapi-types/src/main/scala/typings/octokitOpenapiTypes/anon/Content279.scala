package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content279 extends StObject {
  
  var content: `279`
  
  var headers: `24`
}
object Content279 {
  
  inline def apply(content: `279`, headers: `24`): Content279 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content279]
  }
  
  extension [Self <: Content279](x: Self) {
    
    inline def setContent(value: `279`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `24`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
