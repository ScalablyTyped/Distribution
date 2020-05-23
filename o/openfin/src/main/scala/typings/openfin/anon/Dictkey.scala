package typings.openfin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[String] {
  var email: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var twitter: js.UndefOr[String] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[String] = null,
    email: String = null,
    phone: String = null,
    twitter: String = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (twitter != null) __obj.updateDynamic("twitter")(twitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

