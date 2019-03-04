package typings
package polishedLib.libTypesRadialGradientConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientConfiguration extends js.Object {
  var colorStops: js.Array[java.lang.String]
  var extent: js.UndefOr[java.lang.String] = js.undefined
  var fallback: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
}

object RadialGradientConfiguration {
  @scala.inline
  def apply(
    colorStops: js.Array[java.lang.String],
    extent: java.lang.String = null,
    fallback: java.lang.String = null,
    position: java.lang.String = null,
    shape: java.lang.String = null
  ): RadialGradientConfiguration = {
    val __obj = js.Dynamic.literal(colorStops = colorStops)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (position != null) __obj.updateDynamic("position")(position)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[RadialGradientConfiguration]
  }
}

