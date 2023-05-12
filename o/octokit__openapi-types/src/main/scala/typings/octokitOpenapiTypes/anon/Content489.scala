package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content489 extends StObject {
  
  var content: `489`
  
  var headers: LinkString
}
object Content489 {
  
  inline def apply(content: `489`, headers: LinkString): Content489 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content489]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content489] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `489`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
