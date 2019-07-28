package typings.oauthDashShim

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accesstoken
  extends /* key */ StringDictionary[js.Any] {
  var access_token: js.UndefOr[String] = js.undefined
}

object Anon_Accesstoken {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, access_token: String = null): Anon_Accesstoken = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    __obj.asInstanceOf[Anon_Accesstoken]
  }
}

