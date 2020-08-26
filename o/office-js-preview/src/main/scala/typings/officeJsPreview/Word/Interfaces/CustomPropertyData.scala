package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.DocumentPropertyType
import typings.officeJsPreview.officeJsPreviewStrings.Boolean
import typings.officeJsPreview.officeJsPreviewStrings.Date
import typings.officeJsPreview.officeJsPreviewStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `customProperty.toJSON()`. */
@js.native
trait CustomPropertyData extends js.Object {
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var key: js.UndefOr[String] = js.native
  /**
    *
    * Gets the value type of the custom property. Possible values are: String, Number, Date, Boolean. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    DocumentPropertyType | typings.officeJsPreview.officeJsPreviewStrings.String | Number | Date | Boolean
  ] = js.native
  /**
    *
    * Gets or sets the value of the custom property. Note that even though Word for the web and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
    *
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[js.Any] = js.native
}

object CustomPropertyData {
  @scala.inline
  def apply(): CustomPropertyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyData]
  }
  @scala.inline
  implicit class CustomPropertyDataOps[Self <: CustomPropertyData] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setType(
      value: DocumentPropertyType | typings.officeJsPreview.officeJsPreviewStrings.String | Number | Date | Boolean
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

