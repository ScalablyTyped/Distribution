package typings
package microDashCorsLib.microDashCorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxAge: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[java.lang.String] = null,
    allowMethods: js.Array[java.lang.String] = null,
    exposeHeaders: js.Array[java.lang.String] = null,
    maxAge: java.lang.String = null,
    origin: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders)
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods)
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[Options]
  }
}

