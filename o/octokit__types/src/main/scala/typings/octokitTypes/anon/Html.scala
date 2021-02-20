package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Html extends StObject {
  
  var html: HrefString = js.native
  
  var pull_request: HrefString = js.native
  
  var self: HrefString = js.native
}
object Html {
  
  @scala.inline
  def apply(html: HrefString, pull_request: HrefString, self: HrefString): Html = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
  
  @scala.inline
  implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: HrefString): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_request(value: HrefString): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: HrefString): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
