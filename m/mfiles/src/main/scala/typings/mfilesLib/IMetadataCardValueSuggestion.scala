package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardValueSuggestion extends js.Object {
  val IsNewValue: scala.Boolean
  val Name: java.lang.String
  val Value: js.Any
}

object IMetadataCardValueSuggestion {
  @scala.inline
  def apply(IsNewValue: scala.Boolean, Name: java.lang.String, Value: js.Any): IMetadataCardValueSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsNewValue")(IsNewValue)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[IMetadataCardValueSuggestion]
  }
}

