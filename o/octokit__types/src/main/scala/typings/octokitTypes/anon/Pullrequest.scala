package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pullrequest extends StObject {
  
  var html: HrefString
  
  var pull_request: HrefString
}
object Pullrequest {
  
  inline def apply(html: HrefString, pull_request: HrefString): Pullrequest = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullrequest]
  }
  
  extension [Self <: Pullrequest](x: Self) {
    
    inline def setHtml(value: HrefString): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setPull_request(value: HrefString): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
  }
}
