package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDispatchEventParams extends js.Object {
  /**
    * **Required:** A custom webhook event name.
    */
  var event_type: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposCreateDispatchEventParams {
  @scala.inline
  def apply(owner: String, repo: String, event_type: String = null): ReposCreateDispatchEventParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (event_type != null) __obj.updateDynamic("event_type")(event_type)
    __obj.asInstanceOf[ReposCreateDispatchEventParams]
  }
}

