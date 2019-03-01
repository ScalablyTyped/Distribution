package typings
package nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var customPath: js.UndefOr[java.lang.String] = js.undefined
  var withFallback: js.UndefOr[scala.Boolean] = js.undefined
}

object Option {
  @scala.inline
  def apply(customPath: java.lang.String = null, withFallback: js.UndefOr[scala.Boolean] = js.undefined): Option = {
    val __obj = js.Dynamic.literal()
    if (customPath != null) __obj.updateDynamic("customPath")(customPath)
    if (!js.isUndefined(withFallback)) __obj.updateDynamic("withFallback")(withFallback)
    __obj.asInstanceOf[Option]
  }
}

