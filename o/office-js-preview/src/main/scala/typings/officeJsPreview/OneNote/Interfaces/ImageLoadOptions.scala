package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Image. An Image can be a direct child of a PageContent object or a Paragraph object.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait ImageLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the description of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var description: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the height of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the hyperlink of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the Image object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the data obtained by OCR (Optical Character Recognition) of this Image, such as OCR text and language.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrData: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the PageContent object that contains the Image. Throws if the Image is not a direct child of a PageContent. This object defines the position of the Image on the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageContent: js.UndefOr[PageContentLoadOptions] = js.native
  /**
    *
    * Gets the Paragraph object that contains the Image. Throws if the Image is not a direct child of a Paragraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.native
  /**
    *
    * Gets or sets the width of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.native
}

object ImageLoadOptions {
  @scala.inline
  def apply(): ImageLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageLoadOptions]
  }
  @scala.inline
  implicit class ImageLoadOptionsOps[Self <: ImageLoadOptions] (val x: Self) extends AnyVal {
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
    def setDescription(value: Boolean): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHeight(value: Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHyperlink(value: Boolean): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOcrData(value: Boolean): Self = this.set("ocrData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOcrData: Self = this.set("ocrData", js.undefined)
    @scala.inline
    def setPageContent(value: PageContentLoadOptions): Self = this.set("pageContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageContent: Self = this.set("pageContent", js.undefined)
    @scala.inline
    def setParagraph(value: ParagraphLoadOptions): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

