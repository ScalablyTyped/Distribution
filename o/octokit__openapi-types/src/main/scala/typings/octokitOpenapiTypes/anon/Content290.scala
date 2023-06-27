package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content290 extends StObject {
  
  var content: `290`
  
  var headers: Location
}
object Content290 {
  
  inline def apply(content: `290`, headers: Location): Content290 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content290]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content290] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `290`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
