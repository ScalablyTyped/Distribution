package typings.oauth2Implicit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthState
  extends /* key */ StringDictionary[js.Any] {
  var originalUrl: String
}

object AuthState {
  @scala.inline
  def apply(originalUrl: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AuthState = {
    val __obj = js.Dynamic.literal(originalUrl = originalUrl.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AuthState]
  }
}

