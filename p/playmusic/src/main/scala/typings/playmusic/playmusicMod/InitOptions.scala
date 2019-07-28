package typings.playmusic.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var androidId: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var masterToken: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    androidId: String = null,
    email: String = null,
    masterToken: String = null,
    password: String = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (androidId != null) __obj.updateDynamic("androidId")(androidId)
    if (email != null) __obj.updateDynamic("email")(email)
    if (masterToken != null) __obj.updateDynamic("masterToken")(masterToken)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[InitOptions]
  }
}

