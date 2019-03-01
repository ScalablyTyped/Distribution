package typings
package passportDashHttpLib.passportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestStrategyOptions extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var domain: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var opaque: js.UndefOr[java.lang.String] = js.undefined
  var qop: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
}

object DigestStrategyOptions {
  @scala.inline
  def apply(
    algorithm: java.lang.String = null,
    domain: java.lang.String | js.Array[java.lang.String] = null,
    opaque: java.lang.String = null,
    qop: java.lang.String | js.Array[java.lang.String] = null,
    realm: java.lang.String = null
  ): DigestStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (opaque != null) __obj.updateDynamic("opaque")(opaque)
    if (qop != null) __obj.updateDynamic("qop")(qop.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm)
    __obj.asInstanceOf[DigestStrategyOptions]
  }
}

