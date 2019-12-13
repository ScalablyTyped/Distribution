package typings.openidDashClient

import typings.openidDashClient.openidDashClientStrings.GET
import typings.openidDashClient.openidDashClientStrings.POST
import typings.openidDashClient.openidDashClientStrings.body
import typings.openidDashClient.openidDashClientStrings.header
import typings.openidDashClient.openidDashClientStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyGET extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
  var tokenType: js.UndefOr[String] = js.undefined
  var verb: js.UndefOr[GET | POST] = js.undefined
  var via: js.UndefOr[header | body | query] = js.undefined
}

object Anon_BodyGET {
  @scala.inline
  def apply(
    headers: js.Object = null,
    tokenType: String = null,
    verb: GET | POST = null,
    via: header | body | query = null
  ): Anon_BodyGET = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyGET]
  }
}

