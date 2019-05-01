package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "image.toJSON()". */
trait ImageData extends js.Object {
  /**
    *
    * Returns the format of the image. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[
    officeDashJsLib.ExcelNs.PictureFormat | officeDashJsLib.officeDashJsLibStrings.UNKNOWN | officeDashJsLib.officeDashJsLibStrings.BMP | officeDashJsLib.officeDashJsLibStrings.JPEG | officeDashJsLib.officeDashJsLibStrings.GIF | officeDashJsLib.officeDashJsLibStrings.PNG | officeDashJsLib.officeDashJsLibStrings.SVG
  ] = js.undefined
  /**
    *
    * Represents the shape identifier for the image object. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object ImageData {
  @scala.inline
  def apply(
    format: officeDashJsLib.ExcelNs.PictureFormat | officeDashJsLib.officeDashJsLibStrings.UNKNOWN | officeDashJsLib.officeDashJsLibStrings.BMP | officeDashJsLib.officeDashJsLibStrings.JPEG | officeDashJsLib.officeDashJsLibStrings.GIF | officeDashJsLib.officeDashJsLibStrings.PNG | officeDashJsLib.officeDashJsLibStrings.SVG = null,
    id: java.lang.String = null
  ): ImageData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ImageData]
  }
}

