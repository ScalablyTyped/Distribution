package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content382HeadersLink extends StObject {
  
  var content: `382`
  
  var headers: Link
}
object Content382HeadersLink {
  
  inline def apply(content: `382`, headers: Link): Content382HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content382HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content382HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `382`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
