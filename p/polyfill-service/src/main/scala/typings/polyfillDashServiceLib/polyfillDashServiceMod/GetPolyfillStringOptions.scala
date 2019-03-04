package typings
package polyfillDashServiceLib.polyfillDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolyfillStringOptions extends GetPolyfillsOptions {
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  var unknown: js.UndefOr[Unknown] = js.undefined
}

object GetPolyfillStringOptions {
  @scala.inline
  def apply(
    uaString: java.lang.String,
    excludes: js.Array[java.lang.String] = null,
    features: Features = null,
    minify: js.UndefOr[scala.Boolean] = js.undefined,
    unknown: Unknown = null
  ): GetPolyfillStringOptions = {
    val __obj = js.Dynamic.literal(uaString = uaString)
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (features != null) __obj.updateDynamic("features")(features)
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[GetPolyfillStringOptions]
  }
}

