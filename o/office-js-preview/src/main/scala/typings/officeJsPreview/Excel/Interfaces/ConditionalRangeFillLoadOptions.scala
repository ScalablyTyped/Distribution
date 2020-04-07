package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the background of a conditional range object.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalRangeFillLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representing the color of the fill, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[Boolean] = js.undefined
}

object ConditionalRangeFillLoadOptions {
  @scala.inline
  def apply($all: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[Boolean] = js.undefined): ConditionalRangeFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRangeFillLoadOptions]
  }
}

