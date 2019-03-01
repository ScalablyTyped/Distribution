package typings
package permitLib.permitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermitOptions extends js.Object {
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var scheme: js.UndefOr[java.lang.String] = js.undefined
}

object PermitOptions {
  @scala.inline
  def apply(proxy: java.lang.String = null, realm: java.lang.String = null, scheme: java.lang.String = null): PermitOptions = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme)
    __obj.asInstanceOf[PermitOptions]
  }
}

