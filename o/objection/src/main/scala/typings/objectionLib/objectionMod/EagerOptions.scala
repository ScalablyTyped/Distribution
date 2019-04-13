package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EagerOptions extends js.Object {
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var minimize: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object EagerOptions {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String] = null,
    minimize: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null
  ): EagerOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[EagerOptions]
  }
}

