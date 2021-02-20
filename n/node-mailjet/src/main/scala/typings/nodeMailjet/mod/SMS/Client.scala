package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends StObject {
  
  def get(action: String): GetResource = js.native
  
  def post(action: String): PostResource = js.native
}
object Client {
  
  @scala.inline
  def apply(get: String => GetResource, post: String => PostResource): Client = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), post = js.Any.fromFunction1(post))
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: String => GetResource): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPost(value: String => PostResource): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
  }
}
