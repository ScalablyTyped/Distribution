package typings.passportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestStrategyOptions extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var domain: js.UndefOr[String | js.Array[String]] = js.undefined
  var opaque: js.UndefOr[String] = js.undefined
  var qop: js.UndefOr[String | js.Array[String]] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
}

object DigestStrategyOptions {
  @scala.inline
  def apply(
    algorithm: String = null,
    domain: String | js.Array[String] = null,
    opaque: String = null,
    qop: String | js.Array[String] = null,
    realm: String = null
  ): DigestStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (opaque != null) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    if (qop != null) __obj.updateDynamic("qop")(qop.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestStrategyOptions]
  }
}

