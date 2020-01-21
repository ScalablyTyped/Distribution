package typings.permit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermitOptions extends js.Object {
  var proxy: js.UndefOr[String] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var scheme: js.UndefOr[String] = js.undefined
}

object PermitOptions {
  @scala.inline
  def apply(proxy: String = null, realm: String = null, scheme: String = null): PermitOptions = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermitOptions]
  }
}

