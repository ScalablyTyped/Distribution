package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content383 extends StObject {
  
  var content: `383`
  
  var headers: Link
}
object Content383 {
  
  inline def apply(content: `383`, headers: Link): Content383 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content383]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content383] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `383`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
