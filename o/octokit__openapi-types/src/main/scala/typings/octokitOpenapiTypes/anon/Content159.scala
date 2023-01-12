package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content159 extends StObject {
  
  var content: `159`
  
  var headers: Location
}
object Content159 {
  
  inline def apply(content: `159`, headers: Location): Content159 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content159]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content159] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `159`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
