package typings
package nightmareLib.nightmareMod.NightmareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookieQuery extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var session: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ICookieQuery {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
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

