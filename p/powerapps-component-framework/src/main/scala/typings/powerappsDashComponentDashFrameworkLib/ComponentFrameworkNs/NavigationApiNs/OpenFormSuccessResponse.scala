package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The object returned when a save is successful for open form.
		 */
trait OpenFormSuccessResponse extends js.Object {
  var savedEntityReference: js.Array[powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference]
}

object OpenFormSuccessResponse {
  @scala.inline
  def apply(
    savedEntityReference: js.Array[powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference]
  ): OpenFormSuccessResponse = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference)
  
    __obj.asInstanceOf[OpenFormSuccessResponse]
  }
}

