package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content54 extends StObject {
  
  var content: `54`
  
  var headers: Link
}
object Content54 {
  
  inline def apply(content: `54`, headers: Link): Content54 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content54]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content54] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `54`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
