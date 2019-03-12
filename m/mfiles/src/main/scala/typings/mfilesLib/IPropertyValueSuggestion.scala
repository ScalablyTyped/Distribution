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
    Clone: () => IPropertyValueSuggestion,
    IsFact: scala.Boolean,
    Quality: scala.Double,
    TypedValue: ITypedValue
  ): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsFact = IsFact, Quality = Quality, TypedValue = TypedValue)
  
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
}

