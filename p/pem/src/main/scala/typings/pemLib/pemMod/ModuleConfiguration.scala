package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleConfiguration extends js.Object {
  /**
    * Path to OpenSSL binaries
    */
  var pathOpenSSL: java.lang.String
}

object ModuleConfiguration {
  @scala.inline
  def apply(pathOpenSSL: java.lang.String): ModuleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pathOpenSSL")(pathOpenSSL)
    __obj.asInstanceOf[ModuleConfiguration]
  }
}

