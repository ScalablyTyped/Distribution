package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  def get(action: java.lang.String): GetResource
  def post(action: java.lang.String): PostResource
}

object Client {
  @scala.inline
  def apply(get: java.lang.String => GetResource, post: java.lang.String => PostResource): Client = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), post = js.Any.fromFunction1(post))
  
    __obj.asInstanceOf[Client]
  }
}

