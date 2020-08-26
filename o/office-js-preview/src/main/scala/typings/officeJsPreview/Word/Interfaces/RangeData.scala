package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `range.toJSON()`. */
@js.native
trait RangeData extends js.Object {
  /**
    *
    * Gets the text format of the range. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.native
  /**
    *
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.3]
    */
  var hyperlink: js.UndefOr[String] = js.native
  /**
    *
    * Gets the collection of inline picture objects in the range. Read-only.
    *
    * [Api set: WordApi 1.2]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.native
  /**
    *
    * Checks whether the range length is zero. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var isEmpty: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.native
  /**
    *
    * Gets the text of the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.native
}

object RangeData {
  @scala.inline
  def apply(): RangeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeData]
  }
  @scala.inline
  implicit class RangeDataOps[Self <: RangeData] (val x: Self) extends AnyVal {
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
    def setFont(value: FontData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    @scala.inline
    def setInlinePicturesVarargs(value: InlinePictureData*): Self = this.set("inlinePictures", js.Array(value :_*))
    @scala.inline
    def setInlinePictures(value: js.Array[InlinePictureData]): Self = this.set("inlinePictures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlinePictures: Self = this.set("inlinePictures", js.undefined)
    @scala.inline
    def setIsEmpty(value: Boolean): Self = this.set("isEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEmpty: Self = this.set("isEmpty", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

