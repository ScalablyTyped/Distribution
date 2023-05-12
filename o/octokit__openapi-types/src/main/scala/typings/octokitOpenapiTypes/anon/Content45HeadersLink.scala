package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content45HeadersLink extends StObject {
  
  var content: `45`
  
  var headers: Link
}
object Content45HeadersLink {
  
  inline def apply(content: `45`, headers: Link): Content45HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content45HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content45HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `45`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
