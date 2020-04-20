package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsEnabled extends js.Object {
  var isEnabled: Boolean
  var rootTagName: String
}

object AnonIsEnabled {
  @scala.inline
  def apply(isEnabled: Boolean, rootTagName: String): AnonIsEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], rootTagName = rootTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsEnabled]
  }
}

