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
    val __obj = js.Dynamic.literal(config = config, defaults = defaults, setConfig = setConfig, setDefaults = setDefaults)
  
    __obj.asInstanceOf[IKookiesProvider]
  }
}

