package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValueSuggestion extends js.Object {
  val IsFact: Boolean
  val Quality: Double
  val TypedValue: ITypedValue
  def Clone(): IPropertyValueSuggestion
}

object IPropertyValueSuggestion {
  @scala.inline
  def apply(Clone: () => IPropertyValueSuggestion, IsFact: Boolean, Quality: Double, TypedValue: ITypedValue): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsFact = IsFact.asInstanceOf[js.Any], Quality = Quality.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
}

