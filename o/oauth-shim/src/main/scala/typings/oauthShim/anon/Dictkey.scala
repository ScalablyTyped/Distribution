package typings.oauthShim.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var path: js.UndefOr[String] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, path: String = null): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

