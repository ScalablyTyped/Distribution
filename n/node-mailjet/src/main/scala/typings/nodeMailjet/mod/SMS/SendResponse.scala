package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendResponse extends StObject {
  
  val body: PostResponseData = js.native
  
  val url: String = js.native
}
object SendResponse {
  
  @scala.inline
  def apply(body: PostResponseData, url: String): SendResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendResponse]
  }
  
  @scala.inline
  implicit class SendResponseMutableBuilder[Self <: SendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: PostResponseData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
