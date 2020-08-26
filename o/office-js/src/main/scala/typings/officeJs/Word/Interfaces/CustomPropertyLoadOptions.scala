package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom property.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait CustomPropertyLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var key: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the value type of the custom property. Possible values are: String, Number, Date, Boolean. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the value of the custom property. Note that even though Word for the web and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[Boolean] = js.native
}

object CustomPropertyLoadOptions {
  @scala.inline
  def apply(): CustomPropertyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyLoadOptions]
  }
  @scala.inline
  implicit class CustomPropertyLoadOptionsOps[Self <: CustomPropertyLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setKey(value: Boolean): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

