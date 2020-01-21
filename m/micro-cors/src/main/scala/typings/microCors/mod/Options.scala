package typings.microCors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var allowMethods: js.UndefOr[js.Array[String]] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var maxAge: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHeaders: js.Array[String] = null,
    allowMethods: js.Array[String] = null,
    exposeHeaders: js.Array[String] = null,
    maxAge: String = null,
    origin: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders.asInstanceOf[js.Any])
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

