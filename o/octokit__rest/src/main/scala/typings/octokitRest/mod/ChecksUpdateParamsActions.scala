package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsActions extends js.Object {
  var description: String
  var identifier: String
  var label: String
}

object ChecksUpdateParamsActions {
  @scala.inline
  def apply(description: String, identifier: String, label: String): ChecksUpdateParamsActions = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksUpdateParamsActions]
  }
}

