package typings.officeJs.OneNote.Interfaces

import typings.officeJs.OneNote.ImageOcrData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "image.toJSON()". */
@js.native
trait ImageData extends js.Object {
  /**
    *
    * Gets or sets the description of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var description: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the height of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the hyperlink of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: js.UndefOr[String] = js.native
  /**
    *
    * Gets the ID of the Image object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the data obtained by OCR (Optical Character Recognition) of this Image, such as OCR text and language.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrData: js.UndefOr[ImageOcrData] = js.native
  /**
    *
    * Gets or sets the width of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var width: js.UndefOr[Double] = js.native
}

object ImageData {
  @scala.inline
  def apply(): ImageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageData]
  }
  @scala.inline
  implicit class ImageDataOps[Self <: ImageData] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOcrData(value: ImageOcrData): Self = this.set("ocrData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOcrData: Self = this.set("ocrData", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

