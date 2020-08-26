package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Option Item Metadata
  */
@js.native
trait OptionMetadata extends js.Object {
  var Color: String = js.native
  var Label: String = js.native
  var Value: Double = js.native
}

object OptionMetadata {
  @scala.inline
  def apply(Color: String, Label: String, Value: Double): OptionMetadata = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionMetadata]
  }
  @scala.inline
  implicit class OptionMetadataOps[Self <: OptionMetadata] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

