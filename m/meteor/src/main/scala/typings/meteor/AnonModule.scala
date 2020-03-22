package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModule extends js.Object {
  var module: js.Any
  var version: String
}

object AnonModule {
  @scala.inline
  def apply(module: js.Any, version: String): AnonModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonModule]
  }
}

