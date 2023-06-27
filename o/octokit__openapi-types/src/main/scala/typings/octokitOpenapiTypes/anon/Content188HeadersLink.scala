package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content188HeadersLink extends StObject {
  
  var content: `188`
  
  var headers: Link
}
object Content188HeadersLink {
  
  inline def apply(content: `188`, headers: Link): Content188HeadersLink = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content188HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content188HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `188`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
