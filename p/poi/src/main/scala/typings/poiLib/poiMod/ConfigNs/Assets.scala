package typings
package poiLib.poiMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assets extends js.Object {
  var inlineImageMaxSize: js.UndefOr[scala.Double] = js.undefined
}

object Assets {
  @scala.inline
  def apply(inlineImageMaxSize: scala.Int | scala.Double = null): Assets = {
    val __obj = js.Dynamic.literal()
    if (inlineImageMaxSize != null) __obj.updateDynamic("inlineImageMaxSize")(inlineImageMaxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
}

