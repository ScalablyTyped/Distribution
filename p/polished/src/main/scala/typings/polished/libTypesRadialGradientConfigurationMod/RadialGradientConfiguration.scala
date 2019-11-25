package typings.polished.libTypesRadialGradientConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientConfiguration extends js.Object {
  var colorStops: js.Array[String]
  var extent: js.UndefOr[String] = js.undefined
  var fallback: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
}

object RadialGradientConfiguration {
  @scala.inline
  def apply(
    colorStops: js.Array[String],
    extent: String = null,
    fallback: String = null,
    position: String = null,
    shape: String = null
  ): RadialGradientConfiguration = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradientConfiguration]
  }
}

