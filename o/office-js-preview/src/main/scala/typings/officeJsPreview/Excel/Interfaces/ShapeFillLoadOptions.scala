package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the fill formatting of a shape object.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ShapeFillLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.9]
    */
  var foregroundColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi 1.9]
    */
  var transparency: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the fill type of the shape. Read-only. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}

object ShapeFillLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    foregroundColor: js.UndefOr[Boolean] = js.undefined,
    transparency: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined
  ): ShapeFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(foregroundColor)) __obj.updateDynamic("foregroundColor")(foregroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeFillLoadOptions]
  }
}

