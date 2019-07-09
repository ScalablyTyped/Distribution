package typings
package polishedLib.libTypesLinearGradientConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientConfiguration extends js.Object {
  var colorStops: js.Array[java.lang.String]
  var fallback: js.UndefOr[java.lang.String] = js.undefined
  var toDirection: js.UndefOr[java.lang.String] = js.undefined
}

object LinearGradientConfiguration {
  @scala.inline
  def apply(
    colorStops: js.Array[java.lang.String],
    fallback: java.lang.String = null,
    toDirection: java.lang.String = null
  ): LinearGradientConfiguration = {
    val __obj = js.Dynamic.literal(colorStops = colorStops)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (toDirection != null) __obj.updateDynamic("toDirection")(toDirection)
    __obj.asInstanceOf[LinearGradientConfiguration]
  }
}

