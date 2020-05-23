package typings.officeJs.Excel

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
  var horizontalFitToPages: js.UndefOr[Double] = js.undefined
  /**
    *
    * Print page scale value can be between 10 and 400. This value can be null if fit to page tall or wide is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    *
    * Number of pages to fit vertically. This value can be null if percentage scale is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalFitToPages: js.UndefOr[Double] = js.undefined
}

object PageLayoutZoomOptions {
  @scala.inline
  def apply(
    horizontalFitToPages: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    verticalFitToPages: js.UndefOr[Double] = js.undefined
  ): PageLayoutZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontalFitToPages)) __obj.updateDynamic("horizontalFitToPages")(horizontalFitToPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalFitToPages)) __obj.updateDynamic("verticalFitToPages")(verticalFitToPages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLayoutZoomOptions]
  }
}

