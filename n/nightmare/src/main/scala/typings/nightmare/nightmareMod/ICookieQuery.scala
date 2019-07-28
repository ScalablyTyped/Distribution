package typings.nightmare.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookieQuery extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ICookieQuery {
  @scala.inline
  def apply(
    domain: String = null,
    name: String = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): ICookieQuery = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ICookieQuery]
  }
}

