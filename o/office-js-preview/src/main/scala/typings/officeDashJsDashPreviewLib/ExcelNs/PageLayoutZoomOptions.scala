package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents page zoom properties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait PageLayoutZoomOptions extends js.Object {
  /**
    *
    * Number of pages to fit horizontally. This value can be null if percentage scale is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalFitToPages: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Print page scale value can be between 10 and 400. This value can be null if fit to page tall or wide is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Number of pages to fit vertically. This value can be null if percentage scale is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalFitToPages: js.UndefOr[scala.Double] = js.undefined
}

object PageLayoutZoomOptions {
  @scala.inline
  def apply(
    horizontalFitToPages: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    verticalFitToPages: scala.Int | scala.Double = null
  ): PageLayoutZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (horizontalFitToPages != null) __obj.updateDynamic("horizontalFitToPages")(horizontalFitToPages.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (verticalFitToPages != null) __obj.updateDynamic("verticalFitToPages")(verticalFitToPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLayoutZoomOptions]
  }
}

