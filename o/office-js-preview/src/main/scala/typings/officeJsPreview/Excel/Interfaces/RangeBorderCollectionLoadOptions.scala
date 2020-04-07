package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the border objects that make up the range border.
  *
  * [Api set: ExcelApi 1.1]
  */
trait RangeBorderCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Returns or sets a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[Boolean] = js.undefined
}

object RangeBorderCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    sideIndex: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    tintAndShade: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Boolean] = js.undefined
  ): RangeBorderCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(sideIndex)) __obj.updateDynamic("sideIndex")(sideIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tintAndShade)) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeBorderCollectionLoadOptions]
  }
}

