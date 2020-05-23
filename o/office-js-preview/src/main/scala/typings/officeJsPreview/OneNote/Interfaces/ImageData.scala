package typings.officeJsPreview.OneNote.Interfaces

import typings.officeJsPreview.OneNote.ImageOcrData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "image.toJSON()". */
trait ImageData extends js.Object {
  /**
    *
    * Gets or sets the description of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the height of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets or sets the hyperlink of the Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the ID of the Image object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the data obtained by OCR (Optical Character Recognition) of this Image, such as OCR text and language.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrData: js.UndefOr[ImageOcrData] = js.undefined
  /**
    *
    * Gets or sets the width of the Image layout.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ImageData {
  @scala.inline
  def apply(
    description: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hyperlink: String = null,
    id: String = null,
    ocrData: ImageOcrData = null,
    width: js.UndefOr[Double] = js.undefined
  ): ImageData = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ocrData != null) __obj.updateDynamic("ocrData")(ocrData.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
}

