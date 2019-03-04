package typings
package polyfillDashServiceLib.polyfillDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolyfillsOptions extends js.Object {
  var excludes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var features: js.UndefOr[Features] = js.undefined
  var uaString: java.lang.String
}

object GetPolyfillsOptions {
  @scala.inline
  def apply(uaString: java.lang.String, excludes: js.Array[java.lang.String] = null, features: Features = null): GetPolyfillsOptions = {
    val __obj = js.Dynamic.literal(uaString = uaString)
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (features != null) __obj.updateDynamic("features")(features)
    __obj.asInstanceOf[GetPolyfillsOptions]
  }
}

