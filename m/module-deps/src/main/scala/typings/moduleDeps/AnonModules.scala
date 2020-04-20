package typings.moduleDeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModules extends js.Object {
  var modules: js.Any
}

object AnonModules {
  @scala.inline
  def apply(modules: js.Any): AnonModules = {
    val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModules]
  }
}

