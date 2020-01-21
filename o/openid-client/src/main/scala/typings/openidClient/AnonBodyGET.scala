package typings.openidClient

import typings.openidClient.openidClientStrings.GET
import typings.openidClient.openidClientStrings.POST
import typings.openidClient.openidClientStrings.body
import typings.openidClient.openidClientStrings.header
import typings.openidClient.openidClientStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyGET extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var tokenType: js.UndefOr[String] = js.undefined
  var verb: js.UndefOr[GET | POST] = js.undefined
  var via: js.UndefOr[header | body | query] = js.undefined
}

object AnonBodyGET {
  @scala.inline
  def apply(
    headers: js.Object = null,
    tokenType: String = null,
    verb: GET | POST = null,
    via: header | body | query = null
  ): AnonBodyGET = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyGET]
  }
}

