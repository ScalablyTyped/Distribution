package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content279 extends StObject {
  
  var content: `279`
  
  var headers: Location
}
object Content279 {
  
  inline def apply(content: `279`, headers: Location): Content279 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content279]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content279] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `279`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
