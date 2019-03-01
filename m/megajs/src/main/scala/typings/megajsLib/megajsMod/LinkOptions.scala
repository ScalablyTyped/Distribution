package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOptions extends js.Object {
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var noKey: js.UndefOr[scala.Boolean] = js.undefined
}

object LinkOptions {
  @scala.inline
  def apply(key: java.lang.String | nodeLib.Buffer = null, noKey: js.UndefOr[scala.Boolean] = js.undefined): LinkOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noKey)) __obj.updateDynamic("noKey")(noKey)
    __obj.asInstanceOf[LinkOptions]
  }
}

