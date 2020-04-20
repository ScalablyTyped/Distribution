package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleConfiguration extends js.Object {
  /**
    * Path to OpenSSL binaries
    */
  var pathOpenSSL: String
}

object ModuleConfiguration {
  @scala.inline
  def apply(pathOpenSSL: String): ModuleConfiguration = {
    val __obj = js.Dynamic.literal(pathOpenSSL = pathOpenSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleConfiguration]
  }
}

