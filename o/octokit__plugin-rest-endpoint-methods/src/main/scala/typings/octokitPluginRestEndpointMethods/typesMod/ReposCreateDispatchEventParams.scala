package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateDispatchEventParams extends js.Object {
  /**
    * JSON payload with extra information about the webhook event that your action or worklow may use.
    */
  var client_payload: js.UndefOr[ReposCreateDispatchEventParamsClientPayload] = js.undefined
  /**
    * **Required:** A custom webhook event name.
    */
  var event_type: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object ReposCreateDispatchEventParams {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    client_payload: ReposCreateDispatchEventParamsClientPayload = null,
    event_type: String = null
  ): ReposCreateDispatchEventParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (client_payload != null) __obj.updateDynamic("client_payload")(client_payload.asInstanceOf[js.Any])
    if (event_type != null) __obj.updateDynamic("event_type")(event_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateDispatchEventParams]
  }
}

