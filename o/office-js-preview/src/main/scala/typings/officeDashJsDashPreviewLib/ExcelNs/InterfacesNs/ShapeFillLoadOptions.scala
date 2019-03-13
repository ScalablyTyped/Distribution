package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the fill formatting of a shape object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ShapeFillLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape fill foreground color in HTML color format, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var foregroundColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns null if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var transparency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the fill type of the shape. Read-only. See Excel.ShapeFillType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

object ShapeFillLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    foregroundColor: js.UndefOr[scala.Boolean] = js.undefined,
    transparency: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: js.UndefOr[scala.Boolean] = js.undefined
  ): ShapeFillLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(foregroundColor)) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ShapeFillLoadOptions]
  }
}

