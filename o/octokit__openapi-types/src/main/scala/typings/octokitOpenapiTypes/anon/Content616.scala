package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content616 extends StObject {
  
  var content: `616`
  
  var headers: LinkString
}
object Content616 {
  
  inline def apply(content: `616`, headers: LinkString): Content616 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content616]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content616] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `616`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
