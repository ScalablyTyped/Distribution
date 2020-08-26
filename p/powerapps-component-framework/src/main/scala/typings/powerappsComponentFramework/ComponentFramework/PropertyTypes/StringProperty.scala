package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.StringMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type starts from SingleLine
  */
@js.native
trait StringProperty extends Property {
  @JSName("attributes")
  var attributes_StringProperty: js.UndefOr[StringMetadata] = js.native
  @JSName("raw")
  var raw_StringProperty: String | Null = js.native
}

object StringProperty {
  @scala.inline
  def apply(error: Boolean, errorMessage: String, `type`: String): StringProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringProperty]
  }
  @scala.inline
  implicit class StringPropertyOps[Self <: StringProperty] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringMetadata): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawNull: Self = this.set("raw", null)
  }
  
}

