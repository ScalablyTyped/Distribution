package typings.oauthShim.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken
  extends /* key */ StringDictionary[js.Any] {
  var access_token: js.UndefOr[String] = js.undefined
}

object Accesstoken {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, access_token: String = null): Accesstoken = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}

