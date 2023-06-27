package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content156 extends StObject {
  
  var content: `156`
  
  var headers: Link
}
object Content156 {
  
  inline def apply(content: `156`, headers: Link): Content156 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content156]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content156] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `156`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
