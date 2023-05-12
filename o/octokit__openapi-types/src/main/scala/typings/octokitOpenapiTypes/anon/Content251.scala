package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content251 extends StObject {
  
  var content: `251`
  
  var headers: Location
}
object Content251 {
  
  inline def apply(content: `251`, headers: Location): Content251 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content251]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content251] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `251`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
