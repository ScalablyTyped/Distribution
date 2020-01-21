package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTargetdefaults extends js.Object {
  var target_defaults: AnonCflags
  var variables: AnonClang
}

object AnonTargetdefaults {
  @scala.inline
  def apply(target_defaults: AnonCflags, variables: AnonClang): AnonTargetdefaults = {
    val __obj = js.Dynamic.literal(target_defaults = target_defaults.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTargetdefaults]
  }
}

