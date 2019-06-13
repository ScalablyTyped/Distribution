package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOperation extends Entity {
  /** Type of action this operation is going to perform. The actionName should be concise and limited to as few words as possible. */
  var actionName: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the resource operation. The description is used in mouse-over text for the operation when shown in the Azure Portal. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the Resource this operation is performed on. */
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceOperation {
  @scala.inline
  def apply(
    actionName: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    resourceName: java.lang.String = null
  ): ResourceOperation = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[ResourceOperation]
  }
}

