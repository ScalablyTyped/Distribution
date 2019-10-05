package typings.officeDashJsDashPreview.Excel.Interfaces

import typings.officeDashJsDashPreview.Excel.PictureFormat
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BMP
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.GIF
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.JPEG
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PNG
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.SVG
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `image.toJSON()`. */
trait ImageData extends js.Object {
  /**
    *
    * Returns the format of the image. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[PictureFormat | UNKNOWN | BMP | JPEG | GIF | PNG | SVG] = js.undefined
  /**
    *
    * Represents the shape identifier for the image object. Read-only.
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
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ImageData]
  }
}

