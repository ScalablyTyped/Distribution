package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the binding that raised the DataChanged event.
  */
@js.native
trait BindingDataChangedEventArgs extends js.Object {
  /**
    * Gets an {@link Office.Binding} object that represents the binding that raised the DataChanged event.
    */
  var binding: Binding = js.native
  /**
    * Gets an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType = js.native
}

object BindingDataChangedEventArgs {
  @scala.inline
  def apply(binding: Binding, `type`: EventType): BindingDataChangedEventArgs = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingDataChangedEventArgs]
  }
  @scala.inline
  implicit class BindingDataChangedEventArgsOps[Self <: BindingDataChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setBinding(value: Binding): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

