package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardValueSuggestion extends js.Object {
  val IsNewValue: Boolean = js.native
  val Name: String = js.native
  val Value: js.Any = js.native
}

object IMetadataCardValueSuggestion {
  @scala.inline
  def apply(IsNewValue: Boolean, Name: String, Value: js.Any): IMetadataCardValueSuggestion = {
    val __obj = js.Dynamic.literal(IsNewValue = IsNewValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardValueSuggestion]
  }
  @scala.inline
  implicit class IMetadataCardValueSuggestionOps[Self <: IMetadataCardValueSuggestion] (val x: Self) extends AnyVal {
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
    def setIsNewValue(value: Boolean): Self = this.set("IsNewValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

