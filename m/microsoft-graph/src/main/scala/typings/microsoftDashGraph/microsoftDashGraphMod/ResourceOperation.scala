package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOperation extends Entity {
  /**
    * Type of action this operation is going to perform. The actionName should be concise and limited to as few words as
    * possible.
    */
  var actionName: js.UndefOr[String] = js.undefined
  /**
    * Description of the resource operation. The description is used in mouse-over text for the operation when shown in the
    * Azure Portal.
    */
  var description: js.UndefOr[String] = js.undefined
  // Name of the Resource this operation is performed on.
  var resourceName: js.UndefOr[String] = js.undefined
}

object ResourceOperation {
  @scala.inline
  def apply(
    actionName: String = null,
    description: String = null,
    id: String = null,
    resourceName: String = null
  ): ResourceOperation = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOperation]
  }
}

