package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content800 extends StObject {
  
  var content: `800`
  
  var headers: LinkString
}
object Content800 {
  
  inline def apply(content: `800`, headers: LinkString): Content800 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content800]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content800] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `800`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
