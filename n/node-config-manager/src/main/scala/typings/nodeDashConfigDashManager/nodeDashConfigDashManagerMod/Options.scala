package typings.nodeDashConfigDashManager.nodeDashConfigDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var camelCase: Boolean
  var configDir: String
  var env: String
}

object Options {
  @scala.inline
  def apply(camelCase: Boolean, configDir: String, env: String): Options = {
    val __obj = js.Dynamic.literal(camelCase = camelCase.asInstanceOf[js.Any], configDir = configDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

