package typings
package ngkookiesLib.angularNs.kookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKookiesProvider extends js.Object {
  var config: Config
  var defaults: Options
  def setConfig(config: Config): scala.Unit
  def setDefaults(options: Options): scala.Unit
}

object IKookiesProvider {
  @scala.inline
  def apply(
    config: Config,
    defaults: Options,
    setConfig: js.Function1[Config, scala.Unit],
    setDefaults: js.Function1[Options, scala.Unit]
  ): IKookiesProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("defaults")(defaults)
    __obj.updateDynamic("setConfig")(setConfig)
    __obj.updateDynamic("setDefaults")(setDefaults)
    __obj.asInstanceOf[IKookiesProvider]
  }
}

