package typings.openidClient

import typings.node.Buffer
import typings.openidClient.openidClientStrings.DELETE
import typings.openidClient.openidClientStrings.GET
import typings.openidClient.openidClientStrings.HEAD
import typings.openidClient.openidClientStrings.OPTIONS
import typings.openidClient.openidClientStrings.POST
import typings.openidClient.openidClientStrings.PUT
import typings.openidClient.openidClientStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDELETE extends js.Object {
  var body: String | Buffer
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE] = js.undefined
  var tokenType: js.UndefOr[String] = js.undefined
}

object AnonBodyDELETE {
  @scala.inline
  def apply(
    body: String | Buffer,
    headers: js.Object = null,
    method: GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE = null,
    tokenType: String = null
  ): AnonBodyDELETE = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDELETE]
  }
}

