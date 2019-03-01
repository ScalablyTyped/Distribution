package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardMultiValue extends js.Object {
  val ID: java.lang.String
  val IsMultiValue: scala.Boolean
  val State: js.Any
  val ValueParts: js.Any
}

object IMetadataCardMultiValue {
  @scala.inline
  def apply(ID: java.lang.String, IsMultiValue: scala.Boolean, State: js.Any, ValueParts: js.Any): IMetadataCardMultiValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("IsMultiValue")(IsMultiValue)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("ValueParts")(ValueParts)
    __obj.asInstanceOf[IMetadataCardMultiValue]
  }
}

