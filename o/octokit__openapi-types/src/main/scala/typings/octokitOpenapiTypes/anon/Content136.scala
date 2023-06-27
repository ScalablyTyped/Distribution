package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content136 extends StObject {
  
  var content: `136`
  
  var headers: Link
}
object Content136 {
  
  inline def apply(content: `136`, headers: Link): Content136 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content136]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content136] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `136`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
