package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a RichText object in a Paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait RichTextLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the RichText object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * The language id of the text. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the Paragraph object that contains the RichText object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.native
  /**
    *
    * Gets the text content of the RichText object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.native
}

object RichTextLoadOptions {
  @scala.inline
  def apply(): RichTextLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichTextLoadOptions]
  }
  @scala.inline
  implicit class RichTextLoadOptionsOps[Self <: RichTextLoadOptions] (val x: Self) extends AnyVal {
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
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLanguageId(value: Boolean): Self = this.set("languageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageId: Self = this.set("languageId", js.undefined)
    @scala.inline
    def setParagraph(value: ParagraphLoadOptions): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    @scala.inline
    def setText(value: Boolean): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

