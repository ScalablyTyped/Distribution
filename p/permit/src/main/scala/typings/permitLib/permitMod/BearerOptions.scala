package typings
package permitLib.permitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BearerOptions extends PermitOptions {
  var basic: js.UndefOr[java.lang.String] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object BearerOptions {
  @scala.inline
  def apply(
    basic: java.lang.String = null,
    header: java.lang.String = null,
    proxy: java.lang.String = null,
    query: java.lang.String = null,
    realm: java.lang.String = null,
    scheme: java.lang.String = null
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

