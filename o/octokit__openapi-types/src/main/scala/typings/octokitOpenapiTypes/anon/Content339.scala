package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content339 extends StObject {
  
  var content: `339`
  
  var headers: Link
}
object Content339 {
  
  inline def apply(content: `339`, headers: Link): Content339 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content339]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content339] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `339`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
