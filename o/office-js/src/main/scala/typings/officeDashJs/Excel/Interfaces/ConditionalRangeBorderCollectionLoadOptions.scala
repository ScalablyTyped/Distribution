package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the border objects that make up range border.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeBorderCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Constant value that indicates the specific side of the border. See Excel.ConditionalRangeBorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var sideIndex: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: js.UndefOr[Boolean] = js.undefined
}

object ConditionalRangeBorderCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    color: js.UndefOr[Boolean] = js.undefined,
    sideIndex: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined
  ): ConditionalRangeBorderCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(sideIndex)) __obj.updateDynamic("sideIndex")(sideIndex)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ConditionalRangeBorderCollectionLoadOptions]
  }
}

