package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var androidId: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var masterToken: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    androidId: java.lang.String = null,
    email: java.lang.String = null,
    masterToken: java.lang.String = null,
    password: java.lang.String = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (androidId != null) __obj.updateDynamic("androidId")(androidId)
    if (email != null) __obj.updateDynamic("email")(email)
    if (masterToken != null) __obj.updateDynamic("masterToken")(masterToken)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[InitOptions]
  }
}

