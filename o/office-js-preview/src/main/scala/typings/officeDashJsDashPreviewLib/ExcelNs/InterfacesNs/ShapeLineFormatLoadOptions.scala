package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the line formatting for the shape object. For picture and geometric shape, line formatting represents the border of shape object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ShapeLineFormatLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the line color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the line style of the shape. Returns null when line is not visible or has mixed line dash style property (e.g. group type of shape). See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var dashStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the line style of the shape object. Returns null when line is not visible or has mixed line visible property (e.g. group type of shape). See Excel.ShapeLineStyle for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the degree of transparency of the specified line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has mixed line transparency property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var transparency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether the line formatting of a shape element is visible. Returns null when the shape has mixed line visible property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents weight of the line, in points. Returns null when the line is not visible or has mixed line weight property (e.g. group type of shape).
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var weight: js.UndefOr[scala.Boolean] = js.undefined
}

object ShapeLineFormatLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    dashStyle: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.UndefOr[scala.Boolean] = js.undefined,
    transparency: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    weight: js.UndefOr[scala.Boolean] = js.undefined
  ): ShapeLineFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(dashStyle)) __obj.updateDynamic("dashStyle")(dashStyle)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[ShapeLineFormatLoadOptions]
  }
}

