package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfiguration extends js.Object {
  var config: js.Object
  var name: String
}

object ServiceConfiguration {
  @scala.inline
  def apply(config: js.Object, name: String): ServiceConfiguration = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfiguration]
  }
}

