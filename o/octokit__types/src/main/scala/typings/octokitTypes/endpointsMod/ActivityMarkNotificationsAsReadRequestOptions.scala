package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PUT
import typings.octokitTypes.octokitTypesStrings.Slashnotifications
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkNotificationsAsReadRequestOptions extends js.Object {
  var headers: RequestHeaders
  var method: PUT
  var request: RequestRequestOptions
  var url: Slashnotifications
}

object ActivityMarkNotificationsAsReadRequestOptions {
  @scala.inline
  def apply(headers: RequestHeaders, method: PUT, request: RequestRequestOptions, url: Slashnotifications): ActivityMarkNotificationsAsReadRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadRequestOptions]
  }
}

