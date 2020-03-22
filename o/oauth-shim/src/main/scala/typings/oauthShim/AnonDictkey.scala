package typings.oauthShim

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey
  extends /* key */ StringDictionary[js.Any] {
  var path: js.UndefOr[String] = js.undefined
}

object AnonDictkey {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, path: String = null): AnonDictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictkey]
  }
}

