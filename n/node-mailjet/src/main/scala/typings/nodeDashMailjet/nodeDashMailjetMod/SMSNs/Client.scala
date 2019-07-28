package typings.nodeDashMailjet.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  def get(action: String): GetResource
  def post(action: String): PostResource
}

object Client {
  @scala.inline
  def apply(get: String => GetResource, post: String => PostResource): Client = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), post = js.Any.fromFunction1(post))
  
    __obj.asInstanceOf[Client]
  }
}

