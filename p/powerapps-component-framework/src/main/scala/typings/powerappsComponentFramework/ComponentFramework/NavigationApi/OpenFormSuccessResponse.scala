package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import typings.powerappsComponentFramework.ComponentFramework.EntityReference
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
    val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenFormSuccessResponse]
  }
}

