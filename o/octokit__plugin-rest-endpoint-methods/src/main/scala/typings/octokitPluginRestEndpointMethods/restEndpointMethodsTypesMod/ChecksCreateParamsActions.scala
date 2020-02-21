package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParamsActions extends js.Object {
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

object ChecksCreateParamsActions {
  @scala.inline
  def apply(description: String, identifier: String, label: String): ChecksCreateParamsActions = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksCreateParamsActions]
  }
}

