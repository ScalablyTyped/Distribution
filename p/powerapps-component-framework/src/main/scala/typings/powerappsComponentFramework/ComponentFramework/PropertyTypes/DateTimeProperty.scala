package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.DateTimeMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type starts from DateTime
  */
@js.native
trait DateTimeProperty extends Property {
  @JSName("attributes")
  var attributes_DateTimeProperty: js.UndefOr[DateTimeMetadata] = js.native
  @JSName("raw")
  var raw_DateTimeProperty: Date | Null = js.native
}

object DateTimeProperty {
  @scala.inline
  def apply(error: Boolean, errorMessage: String, `type`: String): DateTimeProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeProperty]
  }
  @scala.inline
  implicit class DateTimePropertyOps[Self <: DateTimeProperty] (val x: Self) extends AnyVal {
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
    def setAttributes(value: DateTimeMetadata): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setRaw(value: Date): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawNull: Self = this.set("raw", null)
  }
  
}

