package typings.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolyfillStringOptions extends GetPolyfillsOptions {
  var minify: js.UndefOr[Boolean] = js.undefined
  var unknown: js.UndefOr[Unknown] = js.undefined
}

object GetPolyfillStringOptions {
  @scala.inline
  def apply(
    uaString: String,
    excludes: js.Array[String] = null,
    features: Features = null,
    minify: js.UndefOr[Boolean] = js.undefined,
    unknown: Unknown = null
  ): GetPolyfillStringOptions = {
    val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.get.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolyfillStringOptions]
  }
}

