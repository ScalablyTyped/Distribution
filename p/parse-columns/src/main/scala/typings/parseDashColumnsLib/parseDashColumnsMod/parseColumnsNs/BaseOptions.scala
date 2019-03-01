package typings
package parseDashColumnsLib.parseDashColumnsMod.parseColumnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(headers: js.Array[java.lang.String] = null, separator: java.lang.String = null): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[BaseOptions]
  }
}

