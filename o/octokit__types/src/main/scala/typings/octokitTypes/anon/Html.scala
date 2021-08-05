package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html extends StObject {
  
  var html: HrefString
  
  var pull_request: HrefString
  
  var self: HrefString
}
object Html {
  
  inline def apply(html: HrefString, pull_request: HrefString, self: HrefString): Html = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
  
  extension [Self <: Html](x: Self) {
    
    inline def setHtml(value: HrefString): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setPull_request(value: HrefString): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: HrefString): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
