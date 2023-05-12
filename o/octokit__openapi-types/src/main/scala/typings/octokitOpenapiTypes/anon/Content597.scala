package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content597 extends StObject {
  
  var content: `597`
  
  var headers: LinkString
}
object Content597 {
  
  inline def apply(content: `597`, headers: LinkString): Content597 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content597]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content597] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `597`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
