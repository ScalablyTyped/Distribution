package typings.oauthDashShim

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var path: js.UndefOr[String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, path: String = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Key]
  }
}

