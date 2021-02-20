package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pullrequest extends StObject {
  
  var html: HrefString = js.native
  
  var pull_request: HrefString = js.native
}
object Pullrequest {
  
  @scala.inline
  def apply(html: HrefString, pull_request: HrefString): Pullrequest = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], pull_request = pull_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pullrequest]
  }
  
  @scala.inline
  implicit class PullrequestMutableBuilder[Self <: Pullrequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: HrefString): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_request(value: HrefString): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
  }
}
