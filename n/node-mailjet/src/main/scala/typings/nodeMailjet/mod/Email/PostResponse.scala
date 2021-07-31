package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostResponse extends StObject {
  
  val body: PostResponseData
}
object PostResponse {
  
  @scala.inline
  def apply(body: PostResponseData): PostResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostResponse]
  }
  
  @scala.inline
  implicit class PostResponseMutableBuilder[Self <: PostResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: PostResponseData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
