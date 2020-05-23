package typings.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X5tS256
  extends /* key */ StringDictionary[js.Any] {
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}

object X5tS256 {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, x5tNumbersignS256: String = null): X5tS256 = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (x5tNumbersignS256 != null) __obj.updateDynamic("x5t#S256")(x5tNumbersignS256.asInstanceOf[js.Any])
    __obj.asInstanceOf[X5tS256]
  }
}

