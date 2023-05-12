package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlPullrequestSelf extends StObject {
  
  /** Link */
  var html: HrefString
  
  /** Link */
  var pull_request: HrefString
  
  /** Link */
  var self: HrefString
}
object HtmlPullrequestSelf {
  
  inline def apply(html: HrefString, pull_request: HrefString, self: HrefString): HtmlPullrequestSelf = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlPullrequestSelf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlPullrequestSelf] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: HrefString): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setPull_request(value: HrefString): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: HrefString): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
