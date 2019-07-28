package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The object returned when a save is successful for open form.
		 */
trait OpenFormSuccessResponse extends js.Object {
  var savedEntityReference: js.Array[EntityReference]
}

object OpenFormSuccessResponse {
  @scala.inline
  def apply(savedEntityReference: js.Array[EntityReference]): OpenFormSuccessResponse = {
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference)
  
    __obj.asInstanceOf[OpenFormSuccessResponse]
  }
}

