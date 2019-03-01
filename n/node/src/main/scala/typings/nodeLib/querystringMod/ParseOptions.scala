package typings
package nodeLib.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var decodeURIComponent: js.UndefOr[js.Function] = js.undefined
  var maxKeys: js.UndefOr[scala.Double] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(decodeURIComponent: js.Function = null, maxKeys: scala.Int | scala.Double = null): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (decodeURIComponent != null) __obj.updateDynamic("decodeURIComponent")(decodeURIComponent)
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

