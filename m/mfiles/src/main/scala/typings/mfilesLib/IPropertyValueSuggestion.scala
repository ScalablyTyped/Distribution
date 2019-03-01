package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueSuggestion extends js.Object {
  val IsFact: scala.Boolean
  val Quality: scala.Double
  val TypedValue: ITypedValue
  def Clone(): IPropertyValueSuggestion
}

object IPropertyValueSuggestion {
  @scala.inline
  def apply(
    Clone: js.Function0[IPropertyValueSuggestion],
    IsFact: scala.Boolean,
    Quality: scala.Double,
    TypedValue: ITypedValue
  ): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("IsFact")(IsFact)
    __obj.updateDynamic("Quality")(Quality)
    __obj.updateDynamic("TypedValue")(TypedValue)
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
}

