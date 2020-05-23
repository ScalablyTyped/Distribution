package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.PictureFormat
import typings.officeJsPreview.officeJsPreviewStrings.BMP
import typings.officeJsPreview.officeJsPreviewStrings.GIF
import typings.officeJsPreview.officeJsPreviewStrings.JPEG
import typings.officeJsPreview.officeJsPreviewStrings.PNG
import typings.officeJsPreview.officeJsPreviewStrings.SVG
import typings.officeJsPreview.officeJsPreviewStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `image.toJSON()`. */
trait ImageData extends js.Object {
  /**
    *
    * Returns the format of the image.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG] = js.undefined
  /**
    *
    * Specifies the shape identifier for the image object.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
}

object ImageData {
  @scala.inline
  def apply(format: PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG = null, id: String = null): ImageData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageData]
  }
}

