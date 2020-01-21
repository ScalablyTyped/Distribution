package typings.openidClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey
  extends /* key */ StringDictionary[js.Any] {
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, x5tNumbersignS256: String = null): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (x5tNumbersignS256 != null) __obj.updateDynamic("x5t#S256")(x5tNumbersignS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

