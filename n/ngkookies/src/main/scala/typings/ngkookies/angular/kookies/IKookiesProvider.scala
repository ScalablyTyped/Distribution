package typings.ngkookies.angular.kookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKookiesProvider extends js.Object {
  var config: Config
  var defaults: Options
  def setConfig(config: Config): Unit
  def setDefaults(options: Options): Unit
}

object IKookiesProvider {
  @scala.inline
  def apply(config: Config, defaults: Options, setConfig: Config => Unit, setDefaults: Options => Unit): IKookiesProvider = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], setConfig = js.Any.fromFunction1(setConfig), setDefaults = js.Any.fromFunction1(setDefaults))
  
    __obj.asInstanceOf[IKookiesProvider]
  }
}

