package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content619 extends StObject {
  
  var content: `619`
  
  var headers: LinkString
}
object Content619 {
  
  inline def apply(content: `619`, headers: LinkString): Content619 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content619]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content619] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `619`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
