package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.NumberMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None|FP|Decimal
  */
@js.native
trait NumberProperty extends Property {
  @JSName("attributes")
  var attributes_NumberProperty: js.UndefOr[NumberMetadata] = js.native
  @JSName("raw")
  var raw_NumberProperty: Double | Null = js.native
}

object NumberProperty {
  @scala.inline
  def apply(error: Boolean, errorMessage: String, `type`: String): NumberProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberProperty]
  }
  @scala.inline
  implicit class NumberPropertyOps[Self <: NumberProperty] (val x: Self) extends AnyVal {
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
    def setAttributes(value: NumberMetadata): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setRaw(value: Double): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawNull: Self = this.set("raw", null)
  }
  
}

