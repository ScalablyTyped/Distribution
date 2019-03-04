package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MousePositionOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var coordinateFormat: js.UndefOr[openlayersLib.openlayersMod.CoordinateFormatType] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var render: js.UndefOr[js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _]] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var undefinedHTML: js.UndefOr[java.lang.String] = js.undefined
}

object MousePositionOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    className: java.lang.String = null,
    coordinateFormat: openlayersLib.openlayersMod.CoordinateFormatType = null,
    render: js.Function1[/* event */ openlayersLib.openlayersMod.MapEvent, _] = null,
    target: stdLib.Element = null,
    undefinedHTML: java.lang.String = null
  ): MousePositionOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (coordinateFormat != null) __obj.updateDynamic("coordinateFormat")(coordinateFormat)
    if (render != null) __obj.updateDynamic("render")(render)
    if (target != null) __obj.updateDynamic("target")(target)
    if (undefinedHTML != null) __obj.updateDynamic("undefinedHTML")(undefinedHTML)
    __obj.asInstanceOf[MousePositionOptions]
  }
}

