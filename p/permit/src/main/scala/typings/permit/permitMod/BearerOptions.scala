package typings.permit.permitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BearerOptions extends PermitOptions {
  var basic: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
}

object BearerOptions {
  @scala.inline
  def apply(
    basic: String = null,
    header: String = null,
    proxy: String = null,
    query: String = null,
    realm: String = null,
    scheme: String = null
  ): BearerOptions = {
    val __obj = js.Dynamic.literal()
    if (basic != null) __obj.updateDynamic("basic")(basic)
    if (header != null) __obj.updateDynamic("header")(header)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (query != null) __obj.updateDynamic("query")(query)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[BearerOptions]
  }
}

