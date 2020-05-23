package typings.microCors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowCredentials: js.UndefOr[Boolean] = js.undefined
  var allowHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var allowMethods: js.UndefOr[js.Array[String]] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowCredentials: js.UndefOr[Boolean] = js.undefined,
    allowHeaders: js.Array[String] = null,
    allowMethods: js.Array[String] = null,
    exposeHeaders: js.Array[String] = null,
    maxAge: js.UndefOr[Double] = js.undefined,
    origin: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCredentials)) __obj.updateDynamic("allowCredentials")(allowCredentials.get.asInstanceOf[js.Any])
    if (allowHeaders != null) __obj.updateDynamic("allowHeaders")(allowHeaders.asInstanceOf[js.Any])
    if (allowMethods != null) __obj.updateDynamic("allowMethods")(allowMethods.asInstanceOf[js.Any])
    if (exposeHeaders != null) __obj.updateDynamic("exposeHeaders")(exposeHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

