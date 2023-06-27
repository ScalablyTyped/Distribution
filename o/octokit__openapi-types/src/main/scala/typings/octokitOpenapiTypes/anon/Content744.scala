package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content744 extends StObject {
  
  var content: `744`
  
  var headers: LinkString
}
object Content744 {
  
  inline def apply(content: `744`, headers: LinkString): Content744 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content744]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content744] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `744`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
