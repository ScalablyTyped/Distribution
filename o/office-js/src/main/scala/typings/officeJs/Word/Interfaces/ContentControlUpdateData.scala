package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.ContentControlAppearance
import typings.officeJs.officeJsStrings.BoundingBox
import typings.officeJs.officeJsStrings.Hidden
import typings.officeJs.officeJsStrings.Tags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ContentControl object, for use in `contentControl.set({ ... })`. */
@js.native
trait ContentControlUpdateData extends js.Object {
  /**
    *
    * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
    *
    * [Api set: WordApi 1.1]
    */
  var appearance: js.UndefOr[ContentControlAppearance | BoundingBox | Tags | Hidden] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotDelete: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the user can edit the contents of the content control.
    *
    * [Api set: WordApi 1.1]
    */
  var cannotEdit: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: js.UndefOr[String] = js.native
  /**
    *
    * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontUpdateData] = js.native
  /**
    *
    * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
    *
    * [Api set: WordApi 1.1]
    */
  var placeholderText: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
    *
    * [Api set: WordApi 1.1]
    */
  var removeWhenEdited: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.native
  /**
    *
    * Gets or sets a tag to identify a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var tag: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the title for a content control.
    *
    * [Api set: WordApi 1.1]
    */
  var title: js.UndefOr[String] = js.native
}

object ContentControlUpdateData {
  @scala.inline
  def apply(): ContentControlUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlUpdateData]
  }
  @scala.inline
  implicit class ContentControlUpdateDataOps[Self <: ContentControlUpdateData] (val x: Self) extends AnyVal {
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
    def setAppearance(value: ContentControlAppearance | BoundingBox | Tags | Hidden): Self = this.set("appearance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppearance: Self = this.set("appearance", js.undefined)
    @scala.inline
    def setCannotDelete(value: Boolean): Self = this.set("cannotDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannotDelete: Self = this.set("cannotDelete", js.undefined)
    @scala.inline
    def setCannotEdit(value: Boolean): Self = this.set("cannotEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCannotEdit: Self = this.set("cannotEdit", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFont(value: FontUpdateData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setPlaceholderText(value: String): Self = this.set("placeholderText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderText: Self = this.set("placeholderText", js.undefined)
    @scala.inline
    def setRemoveWhenEdited(value: Boolean): Self = this.set("removeWhenEdited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveWhenEdited: Self = this.set("removeWhenEdited", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

