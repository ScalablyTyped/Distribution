package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "image.toJSON()". */
trait ImageData extends js.Object {
  /**
    *
    * Returns the format for the image. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var format: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.PictureFormat | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.UNKNOWN | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BMP | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.JPEG | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.GIF | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PNG | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SVG
  ] = js.undefined
  /**
    *
    * Represents the shape identifier for the image object. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

