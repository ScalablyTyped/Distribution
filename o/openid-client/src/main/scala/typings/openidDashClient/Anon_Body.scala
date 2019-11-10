package typings.openidDashClient

import typings.openidDashClient.openidDashClientStrings.GET
import typings.openidDashClient.openidDashClientStrings.POST
import typings.openidDashClient.openidDashClientStrings.body
import typings.openidDashClient.openidDashClientStrings.header
import typings.openidDashClient.openidDashClientStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var tokenType: js.UndefOr[String] = js.undefined
  var verb: js.UndefOr[GET | POST] = js.undefined
  var via: js.UndefOr[header | body | query] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(tokenType: String = null, verb: GET | POST = null, via: header | body | query = null): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType)
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

