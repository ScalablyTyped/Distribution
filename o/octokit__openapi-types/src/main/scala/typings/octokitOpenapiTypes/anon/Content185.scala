package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content185 extends StObject {
  
  var content: `185`
  
  var headers: Link
}
object Content185 {
  
  inline def apply(content: `185`, headers: Link): Content185 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content185]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content185] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `185`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
