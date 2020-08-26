package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyValueSuggestion extends js.Object {
  val IsFact: Boolean = js.native
  val Quality: Double = js.native
  val TypedValue: ITypedValue = js.native
  def Clone(): IPropertyValueSuggestion = js.native
}

object IPropertyValueSuggestion {
  @scala.inline
  def apply(Clone: () => IPropertyValueSuggestion, IsFact: Boolean, Quality: Double, TypedValue: ITypedValue): IPropertyValueSuggestion = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IsFact = IsFact.asInstanceOf[js.Any], Quality = Quality.asInstanceOf[js.Any], TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValueSuggestion]
  }
  @scala.inline
  implicit class IPropertyValueSuggestionOps[Self <: IPropertyValueSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IPropertyValueSuggestion): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFact(value: Boolean): Self = this.set("IsFact", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: Double): Self = this.set("Quality", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypedValue(value: ITypedValue): Self = this.set("TypedValue", value.asInstanceOf[js.Any])
  }
  
}

