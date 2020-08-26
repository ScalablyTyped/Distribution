package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for context.parameters.[property_key]
  */
@js.native
trait Property extends js.Object {
  var attributes: js.UndefOr[Metadata] = js.native
  var error: Boolean = js.native
  var errorMessage: String = js.native
  var formatted: js.UndefOr[String] = js.native
  var raw: js.Any = js.native
  var security: js.UndefOr[SecurityValues] = js.native
  var `type`: String = js.native
}

object Property {
  @scala.inline
  def apply(error: Boolean, errorMessage: String, raw: js.Any, `type`: String): Property = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  @scala.inline
  implicit class PropertyOps[Self <: Property] (val x: Self) extends AnyVal {
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
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: Metadata): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatted: Self = this.set("formatted", js.undefined)
    @scala.inline
    def setSecurity(value: SecurityValues): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurity: Self = this.set("security", js.undefined)
  }
  
}

