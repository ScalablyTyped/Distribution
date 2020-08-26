package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.FloatingNumberMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is FP
  */
@js.native
trait FloatingNumberProperty extends NumberProperty {
  @JSName("attributes")
  var attributes_FloatingNumberProperty: js.UndefOr[FloatingNumberMetadata] = js.native
}

object FloatingNumberProperty {
  @scala.inline
  def apply(error: Boolean, errorMessage: String, `type`: String): FloatingNumberProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingNumberProperty]
  }
  @scala.inline
  implicit class FloatingNumberPropertyOps[Self <: FloatingNumberProperty] (val x: Self) extends AnyVal {
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
    def setAttributes(value: FloatingNumberMetadata): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
  
}

