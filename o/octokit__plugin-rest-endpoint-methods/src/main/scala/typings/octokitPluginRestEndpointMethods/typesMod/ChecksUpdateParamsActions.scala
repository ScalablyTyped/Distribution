package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsActions extends js.Object {
  /**
    * A short explanation of what this action would do. The maximum size is 40 characters.
    */
  var description: String
  /**
    * A reference for the action on the integrator's system. The maximum size is 20 characters.
    */
  var identifier: String
  /**
    * The text to be displayed on a button in the web UI. The maximum size is 20 characters.
    */
  var label: String
}

object ChecksUpdateParamsActions {
  @scala.inline
  def apply(description: String, identifier: String, label: String): ChecksUpdateParamsActions = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksUpdateParamsActions]
  }
}

