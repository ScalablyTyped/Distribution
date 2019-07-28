package typings.polished.libTypesLinearGradientConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientConfiguration extends js.Object {
  var colorStops: js.Array[String]
  var fallback: js.UndefOr[String] = js.undefined
  var toDirection: js.UndefOr[String] = js.undefined
}

object LinearGradientConfiguration {
  @scala.inline
  def apply(colorStops: js.Array[String], fallback: String = null, toDirection: String = null): LinearGradientConfiguration = {
    val __obj = js.Dynamic.literal(colorStops = colorStops)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (toDirection != null) __obj.updateDynamic("toDirection")(toDirection)
    __obj.asInstanceOf[LinearGradientConfiguration]
  }
}

