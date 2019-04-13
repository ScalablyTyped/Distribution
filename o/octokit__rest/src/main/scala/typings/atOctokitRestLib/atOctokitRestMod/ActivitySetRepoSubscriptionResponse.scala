package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySetRepoSubscriptionResponse extends js.Object {
  var created_at: java.lang.String
  var ignored: scala.Boolean
  var reason: scala.Null
  var repository_url: java.lang.String
  var subscribed: scala.Boolean
  var url: java.lang.String
}

object ActivitySetRepoSubscriptionResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    ignored: scala.Boolean,
    reason: scala.Null,
    repository_url: java.lang.String,
    subscribed: scala.Boolean,
    url: java.lang.String
  ): ActivitySetRepoSubscriptionResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, ignored = ignored, reason = reason, repository_url = repository_url, subscribed = subscribed, url = url)
  
    __obj.asInstanceOf[ActivitySetRepoSubscriptionResponse]
  }
}

