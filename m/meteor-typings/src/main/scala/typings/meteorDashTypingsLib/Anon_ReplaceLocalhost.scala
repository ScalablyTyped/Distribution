package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReplaceLocalhost extends js.Object {
  var replaceLocalhost: js.UndefOr[scala.Boolean] = js.undefined
  var rootUrl: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ReplaceLocalhost {
  @scala.inline
  def apply(
    replaceLocalhost: js.UndefOr[scala.Boolean] = js.undefined,
    rootUrl: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ReplaceLocalhost = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replaceLocalhost)) __obj.updateDynamic("replaceLocalhost")(replaceLocalhost)
    if (rootUrl != null) __obj.updateDynamic("rootUrl")(rootUrl)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Anon_ReplaceLocalhost]
  }
}

