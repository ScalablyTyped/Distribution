package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content199 extends StObject {
  
  var content: `199`
  
  var headers: Location
}
object Content199 {
  
  inline def apply(content: `199`, headers: Location): Content199 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content199]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content199] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `199`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
