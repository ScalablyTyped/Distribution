package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content805 extends StObject {
  
  var content: `805`
  
  var headers: LinkString
}
object Content805 {
  
  inline def apply(content: `805`, headers: LinkString): Content805 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content805]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content805] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `805`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
