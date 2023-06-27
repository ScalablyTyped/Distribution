package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content681 extends StObject {
  
  var content: `681`
  
  var headers: LinkString
}
object Content681 {
  
  inline def apply(content: `681`, headers: LinkString): Content681 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content681]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content681] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `681`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
