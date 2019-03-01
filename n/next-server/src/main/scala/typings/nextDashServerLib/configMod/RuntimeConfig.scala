package typings
package nextDashServerLib.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeConfig extends js.Object {
  var publicRuntimeConfig: js.UndefOr[js.Any] = js.undefined
  var serverRuntimeConfig: js.Any
}

object RuntimeConfig {
  @scala.inline
  def apply(serverRuntimeConfig: js.Any, publicRuntimeConfig: js.Any = null): RuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serverRuntimeConfig")(serverRuntimeConfig)
    if (publicRuntimeConfig != null) __obj.updateDynamic("publicRuntimeConfig")(publicRuntimeConfig)
    __obj.asInstanceOf[RuntimeConfig]
  }
}

